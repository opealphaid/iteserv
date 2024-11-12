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
@Table(name = "server_status")
public class ServerStatus {
    @Id
    @ColumnDefault("nextval('server_status_id_server_status_seq')")
    @Column(name = "id_server_status", nullable = false)
    private Integer id;

    @Column(name = "server_status", nullable = false, length = Integer.MAX_VALUE)
    private String serverStatus;

    @Column(name = "status")
    private Boolean status;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}