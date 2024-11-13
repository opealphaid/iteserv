package bo.com.alphasys.iteserv.service;
import bo.com.alphasys.iteserv.model.ServerType;
import bo.com.alphasys.iteserv.repository.ServerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class ServerTypeService {
    @Autowired
    private ServerTypeRepository serverTypeRepository;

    public List<ServerType> getAllServerType() {
        return serverTypeRepository.findAll();
    }

    public Optional<ServerType> getServerTypeById(int id) {
        return serverTypeRepository.findById(id);
    }

    public ServerType saveServerType(ServerType serverType) {

        return serverTypeRepository.save(serverType);
    }

    public ServerType updateServerType(int id, ServerType serverTypeDetails) {
        ServerType serverType = serverTypeRepository.findById(id).orElseThrow(() -> new RuntimeException("Tipo servicio no encontrado"));
        serverType.setServerType(serverTypeDetails.getServerType());
        serverType.setStatus(serverTypeDetails.getStatus());
        serverType.setUpdatedAt(serverTypeDetails.getUpdatedAt());
        return serverTypeRepository.save(serverType);
    }

    public void deleteServerType(int id) {

        serverTypeRepository.deleteById(id);
    }
}
