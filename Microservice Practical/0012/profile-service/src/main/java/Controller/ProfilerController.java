package Controller;

import Service.CustomerService;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/service")
public class ProfilerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/profile",method = RequestMethod.POST )
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @RequestMapping(value = "/profile",method = RequestMethod.GET)
    public Customer fetch(@RequestParam int profileId){
        return customerService.fetchById(profileId);
    }
    @RequestMapping(value = "/profiles",method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_operator')")
    public List<Customer> fetch(){
        return customerService.fetchAllProfiles();
    }

}
