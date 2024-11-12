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
@Table(name = "backup_records")
public class BackupRecord {
    @Id
    @ColumnDefault("nextval('backup_records_backup_id_seq')")
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

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}