package at.eingenium.examdb.db;

import at.eingenium.examdb.exam.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepo extends CrudRepository<Subject, Long> {
}
