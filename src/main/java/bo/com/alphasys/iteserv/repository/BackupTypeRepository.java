package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.BackupType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BackupTypeRepository extends JpaRepository<BackupType, Integer> {
}