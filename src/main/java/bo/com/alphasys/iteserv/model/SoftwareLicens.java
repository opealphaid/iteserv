package bo.com.alphasys.iteserv.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "software_licenses")
public class SoftwareLicens {
    @Id
    @ColumnDefault("nextval('software_licenses_license_id_seq')")
    @Column(name = "license_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "server_id")
    private Server server;

    @Column(name = "software_name", nullable = false, length = 100)
    private String softwareName;

    @Column(name = "version", length = 50)
    private String version;

    @Column(name = "license_key", length = 100)
    private String licenseKey;

    @Column(name = "vendor", length = 100)
    private String vendor;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status")
    private LicencesStatus status;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}