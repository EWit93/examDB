package at.eingenium.examdb.db;

import at.eingenium.examdb.exam.Exam;
import at.eingenium.examdb.exam.Subject;
import org.springframework.data.repository.CrudRepository;

public interface ExamRepo extends CrudRepository<Exam, Long> {
}
