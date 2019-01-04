package appdev.org.testcicd;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivnessProbe {

    @RequestMapping("/api/test")
    public String livenessprobe(){
        return "api test ok";
    }

}
