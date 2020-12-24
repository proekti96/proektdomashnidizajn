package com.app.das.repository;
import com.app.das.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    List<Location> findAllByGradId(Long gradId);
    //boolean existsByManufacturerId(Long manufacturerId);
}