package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}