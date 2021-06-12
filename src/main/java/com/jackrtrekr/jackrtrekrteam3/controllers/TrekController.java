package com.jackrtrekr.jackrtrekrteam3.controllers;

import com.jackrtrekr.jackrtrekrteam3.repositories.TrekRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.jackrtrekr.jackrtrekrteam3.models.Trek;


import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class TrekController {

    @Resource
    private TrekRepository trekRepo;

    @RequestMapping("/treks")
    public String displayTreks(Model model) {
        model.addAttribute("treksModel", trekRepo.findAll());
        return "treksView";
    }

    @RequestMapping("/treks/{name}")
    public String displaySingleTrek(@PathVariable String name, Model model) {
        Optional<Trek> retrievedTrek = trekRepo.findByName(name);
        Trek foundTrek = retrievedTrek.get();
        model.addAttribute("trekModel", foundTrek);
        return "trekView";
    }
}

