package com.example.rentservice.service;

import com.example.rentservice.model.DetailResponse;
import com.example.rentservice.model.Responce;
import com.example.rentservice.repository.RentRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import customer.Customer;
import hystrix.CommonHystrixCommand;
import hystrix.VehicleComeOn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rent.Rent;
import vehicle.Vehicle;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class Rentservice {

    @Autowired
    RentRepository rentRepository;

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    public Rent save(Rent customer) {
        return rentRepository.save(customer);
    }

    public Rent findById(int id) {
        Optional<Rent> rent = rentRepository.findById(id);

        if (rent.isPresent())
            return rent.get();
        else
            return new Rent();

    }

    public List<Rent> findAll() {
        return rentRepository.findAll();
    }

    @HystrixCommand (fallbackMethod = "findDetailResponsefallback")
    public DetailResponse findDetailResponse(int id) {

        Rent rent=findById(id);
        Customer customer=getCustomer(rent.getCustomerId());
         Vehicle vehicle= getVehicle(rent.getVehicleId());

        return new DetailResponse(rent,customer,vehicle);

    }
    public DetailResponse finDetailResponsefallback(int id){
        return new DetailResponse(new Rent(),new Customer(),new Vehicle());

    }

    private Customer getCustomer(int customerId){

        CommonHystrixCommand customerCommonHystrixCommand=new CommonHystrixCommand("default", ()->{
            return restTemplate.getForObject("http://customer:8080/services/customers/"+customerId,Customer.class);

        },()->{
            return new Customer();
        });
        Future<Customer> customerFuture = customerCommonHystrixCommand.queue();

        Customer customer=restTemplate.getForObject("http://customer:8080/services/customers/"+customerId,Customer.class);
        try {
            return customerFuture.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }

    private Vehicle getVehicle(int vehicleId){

        VehicleComeOn vehicleComeOn = new VehicleComeOn(restTemplate,vehicleId);
        return vehicleComeOn.execute();
        //return restTemplate.getForObject("http://vehicle:9191/services/vehicles/"+vehicleId,Vehicle.class);

    }
}
