package bo.com.alphasys.iteserv.controller;
import bo.com.alphasys.iteserv.model.ServerType;
import bo.com.alphasys.iteserv.service.ServerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/servertype")
public class ServerTypeController {
    @Autowired
    private ServerTypeService serverTypeService;

    @GetMapping
    public List<ServerType> getAllServerTypes() {
        return serverTypeService.getAllServerType();
    }

    @GetMapping("/{id}")
    public Optional<ServerType> getServerTypeById(@PathVariable int id) {
        return serverTypeService.getServerTypeById(id);
    }

    @PostMapping
    public ServerType saveServerType(@RequestBody ServerType serverType) {
        return serverTypeService.saveServerType(serverType);
    }

    @PutMapping("/{id}")
    public ServerType updateServerType(@PathVariable int id, @RequestBody ServerType serverTypeDetails) {
        return serverTypeService.updateServerType(id, serverTypeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteServerType(@PathVariable int id) {
        serverTypeService.deleteServerType(id);
    }
}
