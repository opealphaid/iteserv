package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Integer> {
}