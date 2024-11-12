package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.BackupStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BackupStatusRepository extends JpaRepository<BackupStatus, Integer> {
}