package com.foodelivery.dewswit.controller;

import com.foodelivery.dewswit.models.Orders;
import com.foodelivery.dewswit.rep.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ListOrdersController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/ListOrders") //При переходе вызывается некая функцыя внизу
    public String Odr(Model model) {
        model.addAttribute("Title", "Создание Заказов");
        Iterable<Orders> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "ListOrders";
        // По шаблону home мы вызываем другой шаблон
    }
}