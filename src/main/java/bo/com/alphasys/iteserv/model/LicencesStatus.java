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
@Table(name = "licences_status")
public class LicencesStatus {
    @Id
    @ColumnDefault("nextval('licences_status_id_licences_status_seq')")
    @Column(name = "id_licences_status", nullable = false)
    private Integer id;

    @Column(name = "licence_status", nullable = false, length = Integer.MAX_VALUE)
    private String licenceStatus;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}