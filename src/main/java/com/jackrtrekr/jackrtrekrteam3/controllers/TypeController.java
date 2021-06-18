package com.jackrtrekr.jackrtrekrteam3.controllers;


import com.jackrtrekr.jackrtrekrteam3.errorExceptions.TypeNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jackrtrekr.jackrtrekrteam3.models.Type;
import com.jackrtrekr.jackrtrekrteam3.repositories.TypeRepository;


import javax.annotation.Resource;


@Controller
public class TypeController {

    @Resource
    private TypeRepository typeRepo;

    @RequestMapping("/types")
    public String displayTypes(Model model) {
        model.addAttribute("typesModel", typeRepo.findAll());
        return "typesView";
    }

    @GetMapping("/types/{difficulty}")
    public String displaySingleType(@PathVariable String difficulty, Model model) throws TypeNotFoundException {
        if (typeRepo.findTypeByDifficulty(difficulty) == null) {
            throw new TypeNotFoundException();
        }
        model.addAttribute("typeModel", typeRepo.findTypeByDifficulty(difficulty));
        return "typeView";
    }

}
