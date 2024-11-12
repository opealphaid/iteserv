package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.BackupRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BackupRecordRepository extends JpaRepository<BackupRecord, Integer> {
}