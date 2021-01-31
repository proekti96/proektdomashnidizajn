package com.app.das.web.controller;
import com.app.das.model.Grad;
import com.app.das.model.Location;
import com.app.das.service.GradService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app.das.service.LocationService;
import java.util.List;
@Controller //Ovoj kontroler e povrzan so stranicata ATMS.
@RequestMapping("/atms")
public class AtmsController {
    private final LocationService locationService;
    private final GradService gradService;
    public AtmsController(LocationService locationService, GradService gradService) {
        this.locationService = locationService;
        this.gradService = gradService;
    }
    @GetMapping
    public String atmsEmptyPage (Model model) {
        List<Grad> gradovi = this.gradService.findAll();
        model.addAttribute("siteGradovi", gradovi);
        model.addAttribute("edenGrad", new Grad());
        return "atms";
    }
    @PostMapping
    public String gradAtmsPage(Grad grad,Model model) {
        List<Grad> gradovi = this.gradService.findAll();
        model.addAttribute("siteGradovi", gradovi);
        model.addAttribute("edenGrad", grad);
        List<Location> locations =  this.locationService.findAll();
        model.addAttribute("siteLokacii", locations);
        return "atms";
    }
}