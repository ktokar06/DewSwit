package com.foodelivery.dewswit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PricingController {
    @GetMapping("/Pricing") //При переходе вызывается некая функцыя внизу
    public String PRic(Model model) {
        model.addAttribute("Title", "Цены За упрощение Доставки");
        return "Pricing";
        // По шаблону home мы вызываем другой шаблон
    }
}