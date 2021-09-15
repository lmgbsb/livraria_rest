package lr.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Getter;

@Getter
public class AuthorDTO {
	
	
	@NotBlank
	private String name;
	@NotBlank
	private String email;
	@NotBlank
	@Pattern(regexp="\\d{2}+\\/\\d{2}+\\/\\d{4}$", message = "Informe a data no formato dd/mm/aaaa")
	private String birthDate;
	private String miniCurriculum;
}
