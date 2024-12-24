package com.mailbinding.controller;

import com.mailbinding.model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {
    @GetMapping("")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("inputMail", new Mail() );
        return mav;
    }

    @PostMapping("/input")
    public ModelAndView inputMail(@ModelAttribute("inputMail") Mail mail) {
        ModelAndView mav = new ModelAndView("output");
        mav.addObject("outputMail", mail);
        return mav;
    }



}
