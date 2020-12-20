package com.app.das.repository;
import com.app.das.model.Grad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface GradRepository extends JpaRepository<Grad, Long> {
    @Transactional
    Integer removeById(Long id);
//     boolean removeById(Long id);
}