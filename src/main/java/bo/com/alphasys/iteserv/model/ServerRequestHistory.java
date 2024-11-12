package bo.com.alphasys.iteserv.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "server_request_history")
public class ServerRequestHistory {
    @Id
    @ColumnDefault("nextval('server_request_history_id_seq')")
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_server_request", nullable = false)
    private ServerRequestForm idServerRequest;

    @Column(name = "action", nullable = false, length = Integer.MAX_VALUE)
    private String action;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "comments", length = Integer.MAX_VALUE)
    private String comments;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "action_date")
    private Instant actionDate;

}