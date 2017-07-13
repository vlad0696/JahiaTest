package edu.ipps.jahiatest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Gramovich_V on 13.07.2017.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView main(){
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }

}
