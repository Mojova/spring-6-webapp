package fi.hovukas.spring6webapp.repositories;

import fi.hovukas.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}