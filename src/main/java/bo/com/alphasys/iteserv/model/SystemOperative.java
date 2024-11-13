package bo.com.alphasys.iteserv.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "system_operative")
public class SystemOperative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_system_operative", nullable = false)
    private Integer id;

    @Column(name = "system_operative", nullable = false, length = Integer.MAX_VALUE)
    private String systemOperative;

    @Column(name = "so_version", nullable = false, length = Integer.MAX_VALUE)
    private String soVersion;

    @Column(name = "architecture", length = Integer.MAX_VALUE)
    private String architecture;

    @Column(name = "status")
    private Boolean status;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;

}