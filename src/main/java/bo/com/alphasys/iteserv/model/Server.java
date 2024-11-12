package bo.com.alphasys.iteserv.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "servers")
public class Server {
    @Id
    @ColumnDefault("nextval('servers_server_id_seq')")
    @Column(name = "server_id", nullable = false)
    private Integer id;

    @Column(name = "ip_address", nullable = false, length = 50)
    private String ipAddress;

    @Column(name = "server_name", nullable = false, length = 100)
    private String serverName;

    @Column(name = "management", nullable = false, length = 100)
    private String management;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "purpose", nullable = false)
    private ServerPurpose purpose;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "responsible_id")
    private Responsible responsible;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "system_operative", nullable = false)
    private SystemOperative systemOperative;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private PhysicalLocation location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status")
    private ServerStatus status;

    @Column(name = "installation_date")
    private LocalDate installationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "server_type")
    private ServerType serverType;

    @Column(name = "manufacturer", length = 100)
    private String manufacturer;

    @Column(name = "model", length = 100)
    private String model;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}