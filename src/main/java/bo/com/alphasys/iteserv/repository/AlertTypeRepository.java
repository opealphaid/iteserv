package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.AlertType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertTypeRepository extends JpaRepository<AlertType, Integer> {
}