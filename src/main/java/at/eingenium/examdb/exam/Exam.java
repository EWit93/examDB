package at.eingenium.examdb.exam;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="exam")
public class Exam {

    @Id
    @GeneratedValue
    @Column(name = "exam_id")
    private Long id;
    @Column(name ="dateofexam")
    private LocalDate date;
    private Integer duration;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student")
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject")
    private Subject subject;
}
