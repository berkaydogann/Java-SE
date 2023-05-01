package com.works.controllers;

import com.works.prop.Note;
import com.works.services.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteController {
    NoteService noteService = new NoteService();
    String message = "";
    int noteId = 0;
    @GetMapping("/notes")
    public String notes(Model model) {
        model.addAttribute("notes",noteService.notes());
        return "notes";
    }

    @PostMapping("/noteSave")
    public String noteSave(Note note) {
        int status = noteService.noteSave(note);
        return "redirect:/notes";
    }
    @GetMapping("/noteDelete/{noteId}")
    public String noteDelete(@PathVariable int noteId, Model model){
        int status = noteService.noteDelete(noteId);
        if (status > 0) {
            message = "Deleted data has been restored. -  " + noteId;
        } else {
            message = "Deleted data could not be restored. - " + noteId;
        }
        return "redirect:/notes";
    }
}
