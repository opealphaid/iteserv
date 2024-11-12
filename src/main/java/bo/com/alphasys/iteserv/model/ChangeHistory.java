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
@Table(name = "change_history")
public class ChangeHistory {
    @Id
    @ColumnDefault("nextval('change_history_change_id_seq')")
    @Column(name = "change_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "server_id")
    private Server server;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "change_date")
    private Instant changeDate;

    @Column(name = "change_description", nullable = false, length = Integer.MAX_VALUE)
    private String changeDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "performed_by")
    private Responsible performedBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "change_type")
    private ChangeType changeType;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}