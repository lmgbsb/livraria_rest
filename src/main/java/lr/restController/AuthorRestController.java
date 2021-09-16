package lr.restController;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lr.dto.AuthorDTO;
import lr.service.AuthorService;

@RestController
@RequestMapping("/api/author")
public class AuthorRestController {

	
	private final AuthorService authorService;
	
	
	public AuthorRestController(AuthorService authorService) {
		this.authorService = authorService;
	}
	@PostMapping
	public void createAuthor(@RequestBody @Valid AuthorDTO authorDTO) {
		authorService.saveAuthor(authorDTO);
	}
}
