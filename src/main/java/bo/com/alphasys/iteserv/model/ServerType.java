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
@Table(name = "server_type")
public class ServerType {
    @Id
    @ColumnDefault("nextval('server_type_id_server_type_seq')")
    @Column(name = "id_server_type", nullable = false)
    private Integer id;

    @Column(name = "server_type", nullable = false, length = Integer.MAX_VALUE)
    private String serverType;

    @Column(name = "status", nullable = false)
    private Boolean status = false;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}