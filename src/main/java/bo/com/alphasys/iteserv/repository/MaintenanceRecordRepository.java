package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.MaintenanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceRecordRepository extends JpaRepository<MaintenanceRecord, Integer> {
}