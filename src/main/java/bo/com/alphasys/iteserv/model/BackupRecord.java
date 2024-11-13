package bo.com.alphasys.iteserv.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.*;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "backup_records")
public class BackupRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "backup_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "server_id")
    private Server server;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "backup_date")
    private Instant backupDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "backup_type")
    private BackupType backupType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "backup_status")
    private BackupStatus backupStatus;

    @Column(name = "backup_description", length = Integer.MAX_VALUE)
    private String backupDescription;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;

}