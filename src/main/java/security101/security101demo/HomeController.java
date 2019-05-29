package security101.security101demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "home";
    }

    @RequestMapping("/login")
    public String loginpage(){
        return "login";
    }
    @RequestMapping("/admin")
    public String adminpage(){
        return "admin";
    }
    @RequestMapping("/user")
    public String userpage(){
        return "user";
    }
}
