package com.example.rentcloudui.Controller;

import com.example.rentcloudui.config.AccessTocken;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.spi.http.HttpHandler;

@Controller
@EnableOAuth2Sso
public class UiController extends WebSecurityConfigurerAdapter {

    @Autowired
    RestTemplate restTemplate;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers().permitAll().anyRequest().authenticated();
    }

    @RequestMapping(value = "/")
    public String loadUI(){
        return "Home";
    }

    @RequestMapping(value = "/secure")
    public String loadSecureUI(Model model){

        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Authorization", AccessTocken.getAccessTocken());

        HttpEntity<Customer> customerHttpEntity = new HttpEntity<>(httpHeaders);

        try {
            ResponseEntity<Customer[]> customerEntity = restTemplate.exchange("http://localhost:8181/services/customers", HttpMethod.GET, customerHttpEntity, Customer[].class);
            model.addAttribute("customers", customerEntity.getBody());
            System.out.println(customerEntity.getBody().length + ">>>>>>>>");
        }catch (HttpStatusCodeException e){
            ResponseEntity responseEntity = ResponseEntity.status(e.getRawStatusCode()).header(String.valueOf(e.getResponseHeaders())) .body(e.getResponseBodyAsString());
            model.addAttribute("error",responseEntity);
        }
        return "secure";
    }
}
