package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.ChangeHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChangeHistoryRepository extends JpaRepository<ChangeHistory, Integer> {
}