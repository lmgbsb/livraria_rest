package lr.restController;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lr.model.Book;
import lr.service.BookService;

@RestController
@RequestMapping("/book")
public class BookRestController {
	
	
	private final BookService bookService;
	
	
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}
	@PostMapping
	public void createBook(@RequestBody @Valid Book book) {
		bookService.createBook(book);
	}

}
