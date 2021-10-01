package lr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lr.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository <Author, Long> {

}
