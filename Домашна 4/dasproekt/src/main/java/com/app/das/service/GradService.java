package com.app.das.service;
import java.util.List;
import com.app.das.model.Grad;
public interface GradService {
    List<Grad> findAll();
    Grad findById(Long id);
    Grad save(Grad Grad);
    Grad update(Long id, Grad Grad);
    Integer deleteById(Long id);
}