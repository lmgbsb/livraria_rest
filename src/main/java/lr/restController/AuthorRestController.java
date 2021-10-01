package lr.restController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lr.dto.AuthorDTO;
import lr.model.Author;
import lr.service.AuthorService;

@RestController
@RequestMapping("/api/author")
public class AuthorRestController {

	
	private final AuthorService authorService;
	
	
	public AuthorRestController(AuthorService authorService) {
		this.authorService = authorService;
	}
	@PostMapping
	public void create(@RequestBody @Valid AuthorDTO authorDTO) {
		authorService.create(authorDTO);
	}@GetMapping
	public List<Author> list() {
		return authorService.list();
	}
}
