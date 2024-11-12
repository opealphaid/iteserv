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
@Table(name = "backup_status")
public class BackupStatus {
    @Id
    @ColumnDefault("nextval('backup_status_id_backup_status_seq')")
    @Column(name = "id_backup_status", nullable = false)
    private Integer id;

    @Column(name = "backup_status", nullable = false, length = Integer.MAX_VALUE)
    private String backupStatus;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}