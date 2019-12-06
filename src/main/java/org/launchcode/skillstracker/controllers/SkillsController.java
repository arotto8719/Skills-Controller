package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    //Handles request at path /form
    @GetMapping("form")
    @ResponseBody
    public String Java {
        return "Java";
    }
    @GetMapping
    @ResponseBody
    public String skillsController() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'get' action = '/Name:'>" +
                        "<input type = 'text' name = 'My favorite language:, My second favorite language:, My third favorite language:' />" +
                        "<input type = 'submit' value = '1. Java, 2. JavasScript, 3. Python' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
