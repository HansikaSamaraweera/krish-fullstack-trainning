package Repository;

import model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {


    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
