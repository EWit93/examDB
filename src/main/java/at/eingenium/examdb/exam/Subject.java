package at.eingenium.examdb.exam;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="subject")
public class Subject {
    @Id
    @GeneratedValue
    @Column(name ="subject_id")
    private Long id;
    private String longname;
    private String shortname;
    @Column(nullable = false)
    private boolean written;
}
