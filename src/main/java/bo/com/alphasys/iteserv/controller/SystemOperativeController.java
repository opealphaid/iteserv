package bo.com.alphasys.iteserv.controller;

import bo.com.alphasys.iteserv.model.SystemOperative;
import bo.com.alphasys.iteserv.service.SystemOperativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/system-operatives")
public class SystemOperativeController {

    private final SystemOperativeService systemOperativeService;

    @Autowired
    public SystemOperativeController(SystemOperativeService systemOperativeService) {
        this.systemOperativeService = systemOperativeService;
    }

    @GetMapping
    public ResponseEntity<List<SystemOperative>> getAllSystemOperatives() {
        return new ResponseEntity<>(systemOperativeService.getAllSystemOperatives(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SystemOperative> getSystemOperativeById(@PathVariable Integer id) {
        return systemOperativeService.getSystemOperativeById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<SystemOperative> createSystemOperative(@RequestBody SystemOperative systemOperative) {
        return new ResponseEntity<>(systemOperativeService.createSystemOperative(systemOperative), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SystemOperative> updateSystemOperative(
            @PathVariable Integer id, @RequestBody SystemOperative updatedSystemOperative) {
        try {
            return new ResponseEntity<>(systemOperativeService.updateSystemOperative(id, updatedSystemOperative), HttpStatus.OK);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSystemOperative(@PathVariable Integer id) {
        systemOperativeService.deleteSystemOperative(id);
        return ResponseEntity.noContent().build();
    }
}
