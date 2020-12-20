package com.app.das.service.impl;
import com.app.das.model.Grad;
import com.app.das.service.GradService;
import com.app.das.model.exceptions.GradNotFoundException;
import com.app.das.repository.LocationRepository;
import com.app.das.repository.GradRepository;
import org.springframework.stereotype.Service;
//import com.app.das.model.exceptions.ThereAreLocationWithThisGradException;
import java.util.List;
@Service
public class GradServiceImpl implements GradService {
    private final GradRepository GradRepository;
    private final LocationRepository LocationRepository;
    public GradServiceImpl(GradRepository GradRepository, LocationRepository LocationRepository) {
        this.GradRepository = GradRepository;
        this.LocationRepository = LocationRepository;
    }
    @Override
    public List<Grad> findAll() {
        return this.GradRepository.findAll();
    }
    @Override
    public Grad findById(Long id) {
        return this.GradRepository.findById(id)
                .orElseThrow(() -> new GradNotFoundException(id));
    }
    @Override
    public Grad save(Grad Grad) {
        return this.GradRepository.save(Grad);
    }
    @Override
    public Grad update(Long id, Grad Grad) {
        Grad updatedGrad = this.findById(id);
        updatedGrad.setName(Grad.getName());
        return this.GradRepository.save(updatedGrad);
    }
    @Override
    public Integer deleteById(Long id) {
        return this.GradRepository.removeById(id);
    }
/*    @Override
    public void deleteById(Long id) {
        Grad Grad = this.findById(id);
//        if (this.LocationRepository.existsByGradId(id)) {
//            throw new ThereAreLocationWithThisGradException(id);
//        }
        if (Grad.getLocations().size() > 0) {
            throw new ThereAreLocationWithThisGradException(id);
        }
        this.GradRepository.removeById(id);
    }*/
}