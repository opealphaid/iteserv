package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityLogRepository extends JpaRepository<ActivityLog, Integer> {
}