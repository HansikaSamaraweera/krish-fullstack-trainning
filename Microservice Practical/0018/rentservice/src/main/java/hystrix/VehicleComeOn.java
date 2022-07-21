package hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;
import vehicle.Vehicle;

public class VehicleComeOn extends HystrixCommand<Vehicle> {

    RestTemplate restTemplate;
    int vehicleid;

    public VehicleComeOn(RestTemplate restTemplate, int vehicleid) {
        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.restTemplate = restTemplate;
        this.vehicleid = vehicleid;
    }

    @Override
    protected Vehicle run() throws Exception {
        return restTemplate.getForObject("http://vehicle:9191/services/vehicles/"+vehicleid,Vehicle.class);
    }
    @Override
    protected Vehicle getFallback(){
        System.out.println("hit fallback");
        return super.getFallback();
    }
}
