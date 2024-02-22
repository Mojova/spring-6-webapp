package fi.hovukas.spring6webapp.services;

import fi.hovukas.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
