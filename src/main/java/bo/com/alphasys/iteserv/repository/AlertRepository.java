package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Integer> {
}