package rent;

import customer.Customer;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rent")
@Data
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int customerId;
    int vehicleId;
    LocalDateTime rentFrom;
    LocalDateTime rentTill;
    int currentOdometer;
    String returnLocation;


}
