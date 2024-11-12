package bo.com.alphasys.iteserv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "maintenance_type")
public class MaintenanceType {
    @Id
    @Column(name = "id_maintenance_type", nullable = false)
    private Integer id;

    @ColumnDefault("nextval('maintenance_type_maintenance_type_seq')")
    @Column(name = "maintenance_type", nullable = false, length = Integer.MAX_VALUE)
    private String maintenanceType;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}