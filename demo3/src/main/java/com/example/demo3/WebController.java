package com.example.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/index1")
    public String index() {
        return "index1";
    }

    @RequestMapping(value = "/sitemap")
    public String siteMap123() {
        return "sitemap";
    }

}