package lr.service;

import org.springframework.stereotype.Service;

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
	public void saveAuthor(AuthorDTO authorDTO) {
		Author author = mapper.toModel(authorDTO);
		authorRepository.save(author);
	}
}
