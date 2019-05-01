package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelController {

    @RequestMapping("/")
    public ModelAndView ListNBATeam(Model model){
        ModelAndView modelAndView = new ModelAndView("/welcome");
        return modelAndView;
    }
}
