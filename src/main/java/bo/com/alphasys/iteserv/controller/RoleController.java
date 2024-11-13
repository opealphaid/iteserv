package bo.com.alphasys.iteserv.controller;
import bo.com.alphasys.iteserv.model.Role;
import bo.com.alphasys.iteserv.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/{id}")
    public Optional<Role> getRoleById(@PathVariable int id) {
        return roleService.getRoleById(id);
    }

    @PostMapping
    public Role saveRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }

    @PutMapping("/{id}")
    public Role updateRole(@PathVariable int id, @RequestBody Role roleDetails) {
        return roleService.updateRole(id, roleDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable int id) {
        roleService.deleteRole(id);
    }
}
