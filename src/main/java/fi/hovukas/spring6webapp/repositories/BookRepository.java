package fi.hovukas.spring6webapp.repositories;

import fi.hovukas.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
