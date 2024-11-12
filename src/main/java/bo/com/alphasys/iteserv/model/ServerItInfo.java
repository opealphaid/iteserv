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
@Table(name = "server_it_info")
public class ServerItInfo {
    @Id
    @ColumnDefault("nextval('server_it_info_id_server_it_info_seq')")
    @Column(name = "id_server_it_info", nullable = false)
    private Integer id;

    @Column(name = "hard_disk_number", nullable = false)
    private Integer hardDiskNumber;

    @Column(name = "punto_montaje", nullable = false, length = Integer.MAX_VALUE)
    private String puntoMontaje;

    @Column(name = "capacidad", nullable = false, length = Integer.MAX_VALUE)
    private String capacidad;

    @Column(name = "foi_code", nullable = false)
    private Integer foiCode;

    @Column(name = "status", nullable = false)
    private Boolean status = false;

    @Column(name = "created_at")
    private Instant createdAt;

}