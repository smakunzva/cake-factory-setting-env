package com.cakefactory.bakery.cakefactory.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
@RequestMapping
@Slf4j
public class MustacheController {

    @GetMapping
    public ModelAndView getTemplate(Model model) {
        model.addAttribute("shopName", "Cake Factory");
        return new ModelAndView("index", (Map<String, ?>) model);
    }
}
