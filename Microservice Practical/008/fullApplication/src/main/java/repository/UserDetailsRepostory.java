package repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepostory extends JpaRepository<User,Integer> {

    Optional<User> findByName(String name);
}
