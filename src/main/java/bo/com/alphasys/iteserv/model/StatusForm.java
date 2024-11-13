package bo.com.alphasys.iteserv.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "status_form")
public class StatusForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_status_form", nullable = false)
    private Integer id;

    @Column(name = "status_form", nullable = false, length = Integer.MAX_VALUE)
    private String statusForm;

    @Column(name = "status")
    private Boolean status;

}