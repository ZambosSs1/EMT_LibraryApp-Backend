package finki.ukim.mk.library.repository;

import finki.ukim.mk.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    Author findByNameOrSurname (String name, String surname);
}
