package Assignment.student.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

    @Autowired

    StuService stuService;
    @RequestMapping(value = "/",method= RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/home",method= RequestMethod.GET)
    public String home(){
        return "home";
    }


}
