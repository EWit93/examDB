package at.eingenium.examdb.exam;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="classname")
public class SchoolClass {

    @Id
    @GeneratedValue
    @Column(name = "class_id")
    private Long id;
    @Column(name = "classname")
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "classname")
    private List<Student> studentList;

}
