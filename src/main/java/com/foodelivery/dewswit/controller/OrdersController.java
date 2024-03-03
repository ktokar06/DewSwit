package com.foodelivery.dewswit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OrdersController {
    @GetMapping("/Orders") //При переходе вызывается некая функцыя внизу
    public String Odr(Model model) {
        model.addAttribute("Title", "Список Доставки");
        return "Orders";
        // По шаблону home мы вызываем другой шаблон
    }
}