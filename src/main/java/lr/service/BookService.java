package lr.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lr.dto.BookDTO;
import lr.mapper.BookMapper;
import lr.model.Book;
import lr.repository.BookRepository;

@Service
public class BookService {

	
	private final BookRepository bookRepository;
	private final BookMapper mapper;
	
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
		this.mapper = BookMapper.INSTANCE;
	}
	@Transactional
	public void create(@Valid BookDTO bookDTO) {
		Book book = mapper.toModel(bookDTO);
		bookRepository.save(book);
	}
	public List<Book> list() {
		List<Book> books = bookRepository.findAll();
		return books;
	}
}
