package com.example.hobby;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String homePage(){

        return "home";
    }
    @RequestMapping("/games")
    public String gamePage(){

        return "games";
    }
    @RequestMapping("/movies")
    public String moviePage(){

        return "movies";
    }
    @RequestMapping("/music")
    public String musicPage(){

        return "music";
    }
    @RequestMapping("/sports")
    public String sportsPage(){

        return "sports";
    }

    @RequestMapping("/calendar")
    public String calendarPage(){

        return "calendar";
    }

    @RequestMapping("/contact")
    public String contactsPage(){

        return "contacts";
    }

}
