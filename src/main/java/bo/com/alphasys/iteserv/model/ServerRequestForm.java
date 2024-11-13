package bo.com.alphasys.iteserv.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "server_request_form")
public class ServerRequestForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_server_request", nullable = false)
    private Integer id;

    @Column(name = "foi_code", nullable = false, length = Integer.MAX_VALUE)
    private String foiCode;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "server_type")
    private ServerType serverType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "server_use", nullable = false)
    private ServerPurpose serverUse;

    @Column(name = "time_up")
    private LocalDate timeUp;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "server_so", nullable = false)
    private SystemOperative serverSo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "so_language", nullable = false)
    private Language soLanguage;

    @Column(name = "server_ram", nullable = false, length = Integer.MAX_VALUE)
    private String serverRam;

    @Column(name = "hard_disk_units", nullable = false)
    private Integer hardDiskUnits;

    @Column(name = "hard_disk_size", nullable = false, length = Integer.MAX_VALUE)
    private String hardDiskSize;

    @Column(name = "server_cores", nullable = false, length = Integer.MAX_VALUE)
    private String serverCores;

    @Column(name = "network_card_units", nullable = false)
    private Integer networkCardUnits;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "backup_type", nullable = false)
    private BackupType backupType;

    @Column(name = "data_route", length = Integer.MAX_VALUE)
    private String dataRoute;

    @Column(name = "comments", nullable = false, length = Integer.MAX_VALUE)
    private String comments;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "requested_for", nullable = false)
    private User requestedFor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autorized_for")
    private User autorizedFor;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "status", nullable = false)
    private Boolean status = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asigned_to")
    private User asignedTo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_form")
    private StatusForm statusForm;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "supervisor_approved_at")
    private Instant supervisorApprovedAt;

    @Column(name = "it_approved_at")
    private Instant itApprovedAt;

    @Column(name = "supervisor_comments", length = Integer.MAX_VALUE)
    private String supervisorComments;

    @Column(name = "it_comments", length = Integer.MAX_VALUE)
    private String itComments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "server_it_info")
    private ServerItInfo serverItInfo;

}