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
@Table(name = "system_operative")
public class SystemOperative {
    @Id
    @ColumnDefault("nextval('system_operative_id_system_operative_seq')")
    @Column(name = "id_system_operative", nullable = false)
    private Integer id;

    @Column(name = "system_operative", nullable = false, length = Integer.MAX_VALUE)
    private String systemOperative;

    @Column(name = "so_version", nullable = false, length = Integer.MAX_VALUE)
    private String soVersion;

    @Column(name = "architecture", length = Integer.MAX_VALUE)
    private String architecture;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}