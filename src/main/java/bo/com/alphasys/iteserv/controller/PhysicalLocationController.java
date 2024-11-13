package bo.com.alphasys.iteserv.controller;
import bo.com.alphasys.iteserv.model.PhysicalLocation;
import bo.com.alphasys.iteserv.service.PhysicalLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/location")
public class PhysicalLocationController {
    @Autowired
    private PhysicalLocationService physicalLocationService;

    @GetMapping
    public List<PhysicalLocation> getAllPhysicalLocations() {
        return physicalLocationService.getAllPhyisicalLocations();
    }

    @GetMapping("/{id}")
    public Optional<PhysicalLocation> getPhysicalLocation(@PathVariable int id) {
        return physicalLocationService.getPhyisicalLocationById(id);
    }

    @PostMapping
    public PhysicalLocation createPhysicalLocation(@RequestBody PhysicalLocation physicalLocationDetails) {
        return physicalLocationService.savePhyisicalLocation(physicalLocationDetails);

    }

    @PutMapping("/{id}")
    public PhysicalLocation updatePhysicalLocation(@PathVariable int id, @RequestBody PhysicalLocation physicalLocationDetails) {
        return physicalLocationService.updatePhyisicalLocation(id, physicalLocationDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePhysicalLocation(@PathVariable int id) {
        physicalLocationService.deletePhyisicalLocation(id);
    }

}
