package bo.com.alphasys.iteserv.repository;

import bo.com.alphasys.iteserv.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}