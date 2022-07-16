package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeeting(){
        return "Hello SpringBoot";
    }
    @RequestMapping(value = "/hello")
    public String greeeting2(){
        return "Hello SpringBoot";
    }
}
