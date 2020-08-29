package slimou.spring.jokeapp.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import slimou.spring.jokeapp.jokeapp.services.JokeService;

/**
 * User: salim
 * Date: 29.08.2020 15:20
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/chucknorris")
    public String showJoke(Model model){
        model.addAttribute("joke", this.jokeService.getJoke());
        return "chucknorris";
    }
}
