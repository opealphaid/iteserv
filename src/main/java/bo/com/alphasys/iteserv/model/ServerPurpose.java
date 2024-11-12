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
@Table(name = "server_purpose")
public class ServerPurpose {
    @Id
    @ColumnDefault("nextval('server_purpose_id_server_purpose_seq')")
    @Column(name = "id_server_purpose", nullable = false)
    private Integer id;

    @Column(name = "server_pupose", nullable = false, length = Integer.MAX_VALUE)
    private String serverPupose;

    @Column(name = "status")
    private Boolean status;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}