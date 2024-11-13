package bo.com.alphasys.iteserv.service;
import bo.com.alphasys.iteserv.model.PhysicalLocation;
import bo.com.alphasys.iteserv.repository.PhysicalLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PhysicalLocationService {
    @Autowired
    private PhysicalLocationRepository physicalLocationRepository;

    public List<PhysicalLocation> getAllPhyisicalLocations() {
        return physicalLocationRepository.findAll();
    }

    public Optional<PhysicalLocation> getPhyisicalLocationById(int id) {
        return physicalLocationRepository.findById(id);
    }

    public PhysicalLocation savePhyisicalLocation(PhysicalLocation physicalLocation) {
        return physicalLocationRepository.save(physicalLocation);
    }

    public PhysicalLocation updatePhyisicalLocation(int id, PhysicalLocation physicalLocationDetails) {
        PhysicalLocation physicalLocation = physicalLocationRepository.findById(id).orElseThrow(() -> new RuntimeException("Ubicacion fisica no encontrada"));
        physicalLocation.setLocationName(physicalLocationDetails.getLocationName());
        physicalLocation.setAddress(physicalLocationDetails.getAddress());
        physicalLocation.setCity(physicalLocationDetails.getCity());
        physicalLocation.setCountry(physicalLocationDetails.getCountry());
        physicalLocation.setAdditionalDetails(physicalLocationDetails.getAdditionalDetails());
        return physicalLocationRepository.save(physicalLocation);
    }

    public void deletePhyisicalLocation(int id) {
        physicalLocationRepository.deleteById(id);
    }
}
