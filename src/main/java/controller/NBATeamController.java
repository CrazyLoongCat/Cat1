package controller;

import com.crazyloong.cat.mapper.NBATeamMapper;
import com.crazyloong.cat.pojo.NBATeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;


@Controller
public class NBATeamController {

    @Autowired
    NBATeamMapper NBA;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/NBA")
    public ModelAndView ListNBATeam(Model model){
        List<NBATeam> team = NBA.findall();
        ModelAndView modelAndView = new ModelAndView("/NBA");
        modelAndView.addObject("NBA",team);
        return modelAndView;
    }
}
