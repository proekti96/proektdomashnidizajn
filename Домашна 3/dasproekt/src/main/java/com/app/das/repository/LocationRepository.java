package com.app.das.repository;
import com.app.das.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    //boolean existsByManufacturerId(Long manufacturerId);
}