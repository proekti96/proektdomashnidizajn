package com.app.das.web.rest;
import com.app.das.model.Grad;
import com.app.das.service.GradService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/gradovi")  //Ova e api
public class GradRestController {
    private final GradService gradService;
    public GradRestController(GradService gradService) {
        this.gradService = gradService;
    }
    @GetMapping
    public List<Grad> findAll() {
        return this.gradService.findAll();
    }
    @GetMapping("/{id}")
    public Grad findById(@PathVariable Long id) {
        return this.gradService.findById(id);
    }
    @PostMapping
    public Grad save( Grad grad) {
        return this.gradService.save(grad);
    }
    @PutMapping("/{id}")
    public Grad update(@PathVariable Long id, Grad grad) {
        return this.gradService.update(id, grad);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        this.gradService.deleteById(id);
    }
}