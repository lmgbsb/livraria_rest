package lr.dto;

import lombok.Data;

@Data
public class BookDTO {


	private Long id;
	private String title;
	private String releaseDate;
	private Long numberPages;
	private Long authorId;
}
