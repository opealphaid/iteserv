package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.ServerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerStatusRepository extends JpaRepository<ServerStatus, Integer> {
}