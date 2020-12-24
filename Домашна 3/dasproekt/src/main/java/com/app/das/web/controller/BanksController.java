package com.app.das.web.controller;
import com.app.das.model.Grad;
import com.app.das.model.Location;
import com.app.das.service.GradService;
import com.app.das.service.LocationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String banksEmptyPage (Model model) {
        List<Grad> gradovi = this.gradService.findAll();
        model.addAttribute("siteGradovi", gradovi);
        model.addAttribute("edenGrad", new Grad());
        return "banks";
    }
/*    @GetMapping("/results")
    public String banksResultsPage (Grad grad,Model model) {
        model.addAttribute("edenGrad", grad);
        List<Location> locations =  this.locationService.findAll();
        model.addAttribute("siteLokacii", locations);
        return "banks";
    }*/
    @PostMapping
    public String gradBanksPage(Grad grad,Model model) {
        List<Grad> gradovi = this.gradService.findAll();
        model.addAttribute("siteGradovi", gradovi);
        model.addAttribute("edenGrad", grad);
        List<Location> locations =  this.locationService.findAll();
        model.addAttribute("siteLokacii", locations);
        return "banks";
    }
}