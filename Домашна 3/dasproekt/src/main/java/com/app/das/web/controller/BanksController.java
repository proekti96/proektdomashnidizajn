package com.app.das.web.controller;
import com.app.das.model.Grad;
import com.app.das.model.Location;
import com.app.das.service.GradService;
import com.app.das.service.LocationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/banks")
public class BanksController {

    private final LocationService locationService;
    private final GradService gradService;

    public BanksController(LocationService locationService, GradService gradService) {

        this.locationService = locationService;
        this.gradService = gradService;
    }

    @GetMapping
    public String banksPage (Model model) {
        List<Location> locations = this.locationService.findAll();
        List<Grad> gradovi = this.gradService.findAll();
        model.addAttribute("siteLokacii", locations);
        model.addAttribute("siteGradovi", gradovi);

        return "banks";
    }
}