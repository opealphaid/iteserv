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
@Table(name = "alert_type")
public class AlertType {
    @Id
    @ColumnDefault("nextval('alert_type_id_alert_type_seq')")
    @Column(name = "id_alert_type", nullable = false)
    private Integer id;

    @Column(name = "alert_type", nullable = false, length = Integer.MAX_VALUE)
    private String alertType;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}