package lr.dto;

import lombok.Data;

@Data
public class BookDTO {


	private String id;
	private String title;
	private String releaseDate;
	private String numberPages;
	private int authorId;
}
