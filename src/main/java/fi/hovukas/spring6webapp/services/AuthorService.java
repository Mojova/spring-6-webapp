package fi.hovukas.spring6webapp.services;

import fi.hovukas.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
