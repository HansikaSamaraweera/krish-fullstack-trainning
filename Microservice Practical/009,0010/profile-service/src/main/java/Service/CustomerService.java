package Service;


import model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer save(Customer customer);
}
