package bo.com.alphasys.iteserv.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.*;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "servers")
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @CreationTimestamp
    @Column(name = "created_at")
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "server_ram", nullable = false, length = Integer.MAX_VALUE)
    private String serverRam;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "so_language", nullable = false)
    private Language soLanguage;

    @Column(name = "hard_disk_units", nullable = false)
    private Integer hardDiskUnits;

    @Column(name = "hard_disk_size", length = Integer.MAX_VALUE)
    private String hardDiskSize;

    @Column(name = "server_cores", nullable = false, length = Integer.MAX_VALUE)
    private String serverCores;

    @Column(name = "network_card_units", nullable = false)
    private Integer networkCardUnits;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "backup_type", nullable = false)
    private BackupType backupType;

    @Column(name = "data_backup_route", length = Integer.MAX_VALUE)
    private String dataBackupRoute;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_request")
    private ServerRequestForm codRequest;

}