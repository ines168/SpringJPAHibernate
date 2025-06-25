package hr.java.vjezbe.hardwareapp.repository;

import hr.java.vjezbe.hardwareapp.domain.Hardware;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository
public interface SpringDataHardwareRepository extends JpaRepository<Hardware, Integer>, JpaSpecificationExecutor<Hardware> {
    List<Hardware> findByCode(String code);
}
