package com.travelguide.travelguide;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
    @GetMapping(value="/")
    public String index() {
        return "default/index";
    }
}
