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
@Table(name = "languages")
public class Language {
    @Id
    @ColumnDefault("nextval('languages_id_language_seq')")
    @Column(name = "id_language", nullable = false)
    private Integer id;

    @Column(name = "language", length = Integer.MAX_VALUE)
    private String language;

    @Column(name = "status")
    private Boolean status;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}