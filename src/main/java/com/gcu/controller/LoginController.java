package com.gcu.controller;

import com.gcu.model.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/")
    public String display(Model model) {
        // Set model attributes
        model.addAttribute("title", "Login Form");
        model.addAttribute("loginModel", new LoginModel()); // Assuming LoginModel is a class with a default constructor

        // Return the view name
        return "login";
    }

    @PostMapping("/afterLogin")
    public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("title", "Login Form");
            return "login";
        }
        // Set model attributes
        model.addAttribute("title", "My Orders");
        Object orders = new Object();
        model.addAttribute("orders", orders);

        // Return the view name
        return "afterLogin";
    }
}