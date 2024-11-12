package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.PhysicalLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicalLocationRepository extends JpaRepository<PhysicalLocation, Integer> {
}