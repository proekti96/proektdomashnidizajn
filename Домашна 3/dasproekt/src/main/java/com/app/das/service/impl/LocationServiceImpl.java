package com.app.das.service.impl;
import com.app.das.model.Location;
import com.app.das.repository.LocationRepository;
import com.app.das.model.exceptions.LocationNotFoundException;
import com.app.das.service.LocationService;
import com.app.das.service.GradService;
import com.app.das.model.Grad;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;
    private final GradService gradService;
    public LocationServiceImpl(LocationRepository locationRepository ,GradService gradService) {
        this.locationRepository = locationRepository;
        this.gradService = gradService;
    }
    @Override
    public List<Location> findAll() {
        return this.locationRepository.findAll();
    }
    @Override
    public Location findById(Long id) {
        return this.locationRepository.findById(id)
                .orElseThrow(() -> new LocationNotFoundException(id));
        //return this.locationRepository.getOne(id);
    }
    @Override
    public List<Location> findAllByGradId(Long gradId) {
        return this.locationRepository.findAllByGradId(gradId);

    }


//    @Override
//    public Location save(Location location, MultipartFile image) throws IOException {
//        return null;
//    }
    @Override
    public Location save(Location location, MultipartFile image) throws IOException {
        Grad grad = this.gradService.findById(location.getGrad().getId());
        location.setGrad(grad);
        if (image != null) {
            byte[] imageBytes = image.getBytes();
            String base64Image = String.format("data:%s;base64,%s", image.getContentType(), Base64.getEncoder().encodeToString(imageBytes));
            location.setBase64Image(base64Image);
        }
        return this.locationRepository.save(location);
    }
//    @Override
//    public Location update(Long id, Location location, MultipartFile image) throws IOException {
//        return null;
//    }
    @Override
    public Location update(Long id, Location location, MultipartFile image) throws IOException {
        Location updatedLocation = this.findById(id);
        Grad grad = this.gradService.findById(location.getGrad().getId());
        updatedLocation.setGrad(grad);
        updatedLocation.setName(location.getName());
        updatedLocation.setAddress(location.getAddress());
        updatedLocation.setDescription(location.getDescription());
        updatedLocation.setElevation(location.getElevation());
        updatedLocation.setWorktime(location.getWorktime());
        updatedLocation.setContact(location.getContact());
        updatedLocation.setRating(location.getRating());
        updatedLocation.setLatitude(location.getLatitude());
        updatedLocation.setLongitude(location.getLongitude());
        if (image != null) {
            byte[] imageBytes = image.getBytes();
            String base64Image = String.format("data:%s;base64,%s", image.getContentType(), Base64.getEncoder().encodeToString(imageBytes));
            updatedLocation.setBase64Image(base64Image);
        }
        return this.locationRepository.save(updatedLocation);
    }
    @Override
    public void deleteById(Long id) {
        this.locationRepository.deleteById(id);
    }
}