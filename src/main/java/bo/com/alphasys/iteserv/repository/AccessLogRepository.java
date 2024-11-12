package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.AccessLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessLogRepository extends JpaRepository<AccessLog, Integer> {
}