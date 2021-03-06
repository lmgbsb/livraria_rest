package lr.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lr.dto.AuthorDTO;
import lr.mapper.AuthorMapper;
import lr.model.Author;
import lr.repository.AuthorRepository;

@Service
public class AuthorService {

	
	private final AuthorRepository authorRepository;
	private final AuthorMapper mapper;
	
	
	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
		this.mapper = AuthorMapper.INSTANCE;
	}
	@Transactional
	public void create(AuthorDTO authorDTO) {
		Author author = mapper.toModel(authorDTO);
		authorRepository.save(author);
	}
	public List<Author> list() {
		return authorRepository.findAll();
	}
}
