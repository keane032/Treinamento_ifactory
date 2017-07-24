package pub;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PubReposytory extends CrudRepository<Pub, Integer>{}
