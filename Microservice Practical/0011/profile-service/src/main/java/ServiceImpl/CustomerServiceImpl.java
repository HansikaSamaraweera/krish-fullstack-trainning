package ServiceImpl;

import Repository.CustomerRepository;
import Service.CustomerService;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer fetchById(int profileId) {
        return customerRepository.fetchById(profileId);
    }

    @Override
    public List<Customer> fetchAllProfiles() {
        return customerRepository.fetchAllProfiles();
    }
}
