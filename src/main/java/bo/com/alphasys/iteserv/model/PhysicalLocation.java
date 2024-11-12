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
@Table(name = "physical_locations")
public class PhysicalLocation {
    @Id
    @ColumnDefault("nextval('physical_locations_location_id_seq')")
    @Column(name = "location_id", nullable = false)
    private Integer id;

    @Column(name = "location_name", nullable = false, length = 100)
    private String locationName;

    @Column(name = "address")
    private String address;

    @Column(name = "city", length = 100)
    private String city;

    @Column(name = "country", length = 100)
    private String country;

    @Column(name = "additional_details", length = Integer.MAX_VALUE)
    private String additionalDetails;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}