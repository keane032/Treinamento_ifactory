package author;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AuthorRepository extends CrudRepository<Author,Integer> {}
