package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}