package com.example.login.controller;

import com.example.login.model.Employee;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class LoginController {

    @GetMapping("/")
    public String showForm(Employee employee) {
        return "login-form";
    }

    @PostMapping("/login")
    public String checkEmployeeInfo(@Valid Employee employee, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "login-form";
        }

        if (!employee.getPassword().equals("password@123")) {
            return "redirect:/error";
        }

        return "redirect:/welcome";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        model.addAttribute("today", today.format(formatter));
        return "welcome";
    }
}