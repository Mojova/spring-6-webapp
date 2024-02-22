package fi.hovukas.spring6webapp.repositories;

import fi.hovukas.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
