package com.khavin.mvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/add")
    public String adder() { return "adder"; }

    @RequestMapping("/result")
    public ModelAndView result(HttpServletRequest request, HttpServletResponse response) {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));

        int c = a + b;
        ModelAndView mv = new ModelAndView();
        mv.addObject("c", c);
        mv.setViewName("result");

        return mv;
    }
}
