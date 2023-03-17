package at.eingenium.examdb.exam;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "student_id")
    private Long id;
    private String firstname;
    private String lastname;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student")
    private List<Exam> examList;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classname")
    private SchoolClass schoolClass;
}
