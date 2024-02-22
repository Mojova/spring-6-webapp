package fi.hovukas.spring6webapp.bootstrap;

import fi.hovukas.spring6webapp.domain.Author;
import fi.hovukas.spring6webapp.domain.Book;
import fi.hovukas.spring6webapp.domain.Publisher;
import fi.hovukas.spring6webapp.repositories.AuthorRepository;
import fi.hovukas.spring6webapp.repositories.BookRepository;
import fi.hovukas.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        ddd.setTitle("J2EE Development without EJB");
        ddd.setIsbn("4353454");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Addison-Wesley");
        publisher.setAddress("Street Road 1");
        publisher.setZip("02230");
        publisher.setCity("Springville");
        publisher.setState("Pennsylvania");

        Publisher addsionWesleySaved = publisherRepository.save(publisher);

        addsionWesleySaved.getBooks().add(dddSaved);
        addsionWesleySaved.getBooks().add(noEJBSaved);

        publisherRepository.save(addsionWesleySaved);


        System.out.println("In Bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());
    }
}
