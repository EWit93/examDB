package at.eingenium.examdb.db;

import at.eingenium.examdb.exam.SchoolClass;
import at.eingenium.examdb.exam.Subject;
import org.springframework.data.repository.CrudRepository;

public interface ClassnameRepo extends CrudRepository<SchoolClass, String> {
}
