package service;

import model.AuthUserDetails;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import repository.UserDetailsRepostory;

import java.util.Optional;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

@Autowired
    UserDetailsRepostory userDetailsRepostory;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser= userDetailsRepostory.findByName(username);

        optionalUser.orElseThrow(() -> new UsernameNotFoundException("username or password wrong"));
        UserDetails userDetails= new AuthUserDetails(optionalUser.get());

        new AccountStatusUserDetailsChecker().check(userDetails);
        return userDetails;
    }
}
