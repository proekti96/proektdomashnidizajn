package com.app.das.service;
import java.io.IOException;
import java.util.List;
import com.app.das.model.Location;
import org.springframework.web.multipart.MultipartFile;
public interface LocationService {
    List<Location> findAll();
    Location findById(Long id);
    List<Location> findAllByGradId(Long gradId);
    Location save(Location location, MultipartFile image) throws IOException;
    Location update(Long id, Location location, MultipartFile image) throws IOException;
    void deleteById(Long id);

}