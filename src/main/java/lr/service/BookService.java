package lr.service;


import java.util.List;

import org.springframework.stereotype.Service;

import lr.model.Book;
import lr.repository.BookRepository;

@Service
public class BookService {

	
	private final BookRepository bookRepository;
	
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	public void createBook(Book book) {
		bookRepository.save(book);
	}
	public List list() {
		List books = bookRepository.findAll();
		return books;
	}
}
