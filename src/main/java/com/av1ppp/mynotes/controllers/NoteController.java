package com.av1ppp.mynotes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoteController {

    @GetMapping("/notes")
    public String notes(Model model) {
        model.addAttribute("title", "My Notes");
        return "notes";
    }
}
