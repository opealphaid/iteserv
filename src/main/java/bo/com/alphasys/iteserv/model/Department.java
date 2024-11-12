package bo.com.alphasys.iteserv.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @ColumnDefault("nextval('departments_id_department_seq')")
    @Column(name = "id_department", nullable = false)
    private Integer id;

    @Column(name = "department", nullable = false, length = Integer.MAX_VALUE)
    private String department;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_boss", nullable = false)
    private User departmentBoss;

    @Column(name = "status", nullable = false)
    private Boolean status = false;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}