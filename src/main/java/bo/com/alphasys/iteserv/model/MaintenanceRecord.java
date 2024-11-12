package bo.com.alphasys.iteserv.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "maintenance_records")
public class MaintenanceRecord {
    @Id
    @ColumnDefault("nextval('maintenance_records_maintenance_id_seq')")
    @Column(name = "maintenance_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "server_id")
    private Server server;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "maintenance_date")
    private Instant maintenanceDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maintenance_type")
    private MaintenanceType maintenanceType;

    @Column(name = "maintenance_description", length = Integer.MAX_VALUE)
    private String maintenanceDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performed_by")
    private User performedBy;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}