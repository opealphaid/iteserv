package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.ServerRequestHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRequestHistoryRepository extends JpaRepository<ServerRequestHistory, Integer> {
}