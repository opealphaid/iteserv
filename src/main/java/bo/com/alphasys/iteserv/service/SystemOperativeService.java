package bo.com.alphasys.iteserv.service;

import bo.com.alphasys.iteserv.model.SystemOperative;
import bo.com.alphasys.iteserv.repository.SystemOperativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SystemOperativeService {

    private final SystemOperativeRepository systemOperativeRepository;

    @Autowired
    public SystemOperativeService(SystemOperativeRepository systemOperativeRepository) {
        this.systemOperativeRepository = systemOperativeRepository;
    }

    public List<SystemOperative> getAllSystemOperatives() {
        return systemOperativeRepository.findAll();
    }

    public Optional<SystemOperative> getSystemOperativeById(Integer id) {
        return systemOperativeRepository.findById(id);
    }

    public SystemOperative createSystemOperative(SystemOperative systemOperative) {
        return systemOperativeRepository.save(systemOperative);
    }

    public SystemOperative updateSystemOperative(Integer id, SystemOperative updatedSystemOperative) {
        return systemOperativeRepository.findById(id)
                .map(existingSystemOperative -> {
                    existingSystemOperative.setSystemOperative(updatedSystemOperative.getSystemOperative());
                    existingSystemOperative.setSoVersion(updatedSystemOperative.getSoVersion());
                    existingSystemOperative.setArchitecture(updatedSystemOperative.getArchitecture());
                    existingSystemOperative.setUpdatedAt(updatedSystemOperative.getUpdatedAt());
                    return systemOperativeRepository.save(existingSystemOperative);
                }).orElseThrow(() -> new RuntimeException("SystemOperative not found with id " + id));
    }

    public void deleteSystemOperative(Integer id) {
        systemOperativeRepository.deleteById(id);
    }
}
