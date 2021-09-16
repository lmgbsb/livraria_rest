package lr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lr.model.Author;

public interface AuthorRepository extends JpaRepository <Author, Long> {

}
