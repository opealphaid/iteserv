package bo.com.alphasys.iteserv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "status_form")
public class StatusForm {
    @Id
    @ColumnDefault("nextval('status_form_id_status_form_seq')")
    @Column(name = "id_status_form", nullable = false)
    private Integer id;

    @Column(name = "status_form", nullable = false, length = Integer.MAX_VALUE)
    private String statusForm;

    @Column(name = "status")
    private Boolean status;

}