package bo.com.alphasys.iteserv.service;
import bo.com.alphasys.iteserv.model.Role;
import bo.com.alphasys.iteserv.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<Role> getRoleById(int id) {
        return roleRepository.findById(id);
    }

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public Role updateRole(int id, Role roleDetails) {
        Role role = roleRepository.findById(id).orElseThrow(() -> new RuntimeException("Rol no encontrado"));
        role.setRoleName(roleDetails.getRoleName());
        role.setPermissions(roleDetails.getPermissions());
        role.setUpdatedAt(roleDetails.getUpdatedAt());
        return roleRepository.save(role);
    }
    public void deleteRole(int id) {
        roleRepository.deleteById(id);
    }

}
