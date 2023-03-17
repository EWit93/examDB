package at.eingenium.examdb.db;

import at.eingenium.examdb.exam.Student;
import at.eingenium.examdb.exam.Subject;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {
}
