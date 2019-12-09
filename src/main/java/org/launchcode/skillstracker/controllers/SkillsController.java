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
    public String titlePage() {
        return "<html>" + "<body>" +
        "<h1>Skills Tracker</h1>" +
        "<h2>Programming Languages</h2>" +
        "<ol>" +
            "<li>Java</li>" +
            "<li>JavaScript</li>" +
            "<li>Python</li>" +
        "</ol>";
    }

    @GetMapping("form")
    @ResponseBody()
    @RequestMapping displayForm(value = "form", method = {RequestMethod.GET, RequestMethod.POST})
    public String SkillsController() {
        return "<html>" + "<body>" + "<h1>" + name + "/li>"
             "<ol>" +
                 "<li> + favorite + </li>" +
                 "<li> + second + </li>" +
                 "<li> + last + </li>" +
             "</ol>" + "</body>" + "</html>";
    }
}
