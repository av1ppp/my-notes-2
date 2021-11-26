package com.av1ppp.mynotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotesController {

    public NotesController() {
        System.out.println("Construct NotesController");
    }

    @GetMapping("/notes")
    public String notes(Model model) {
        model.addAttribute("title", "My Notes");
        return "notes";
    }

    @GetMapping("/notes/new")
    public String create(Model model) {
        model.addAttribute("title", "Create new note");
        return "new-note";
    }
}
