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
@Table(name = "change_type")
public class ChangeType {
    @Id
    @ColumnDefault("nextval('change_type_id_change_type_seq')")
    @Column(name = "id_change_type", nullable = false)
    private Integer id;

    @Column(name = "change_type", nullable = false, length = Integer.MAX_VALUE)
    private String changeType;

    @Column(name = "status")
    private Boolean status;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}