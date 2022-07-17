package Controller;

import Service.CustomerService;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/service")
public class ProfilerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/profile",method = RequestMethod.POST )
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }



}
