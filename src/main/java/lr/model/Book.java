package lr.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Table(name="book")
@Entity
public class Book {

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=10)
	@Column(name="title")
	private String title;
	@PastOrPresent
	@Column(name="release_date")
	private LocalDate releaseDate;
	@Min(100)
	@Column(name="number_pages")
	private int numberPages;
}
