package com.gustavo.protato.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/protato/login")
public class LoginController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "gustaov's protato begin!";
    }


}
