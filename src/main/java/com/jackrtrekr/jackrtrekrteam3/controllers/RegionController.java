package com.jackrtrekr.jackrtrekrteam3.controllers;

import com.jackrtrekr.jackrtrekrteam3.models.Region;
import com.jackrtrekr.jackrtrekrteam3.repositories.RegionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class RegionController {

    @Resource
    private RegionRepository regionRepo;

    @RequestMapping("/regions")
    public String displayRegions(Model model) {
        model.addAttribute("regionsModel", regionRepo.findAll());
        return "regionsView";
    }

    @GetMapping("/regions/{location}")
    public String displaySingleRegion(@PathVariable String location, Model model) {
        Optional<Region> retrievedRegion = regionRepo.findRegionByLocation(location);
        Region foundRegion = retrievedRegion.get();
        model.addAttribute("regionModel", foundRegion);
        return "regionView";
    }
}
