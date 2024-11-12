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
@Table(name = "alerts")
public class Alert {
    @Id
    @ColumnDefault("nextval('alerts_alert_id_seq')")
    @Column(name = "alert_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "server_id")
    private Server server;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "alert_date")
    private Instant alertDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_type")
    private AlertType alertType;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @ColumnDefault("false")
    @Column(name = "resolved")
    private Boolean resolved;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}