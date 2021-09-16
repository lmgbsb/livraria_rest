package lr.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@Entity
@Table(name="author")
public class Author {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="birth_date")
	private LocalDate birthDate;
	@Column(name="mini_curriculum")
	private String miniCurriculum;
}
