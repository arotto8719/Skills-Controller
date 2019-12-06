package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("form")
public class SkillsController {
    //Handles request at path "/java"
    @GetMapping("")
    @ResponseBody
    public String java() {
        return "Java";
    }
    // responds to "/javascript"
    @GetMapping("")
    @ResponseBody
    public String JavaScript() {
        return "JavaScript";
    }
    // responds to "/python"
    @GetMapping("")
    @ResponseBody
    public String Python() {
        return "Python";
    }
    @GetMapping
    @RequestMapping(value = "form", method = {RequestMethod.GET, RequestMethod.POST})
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
