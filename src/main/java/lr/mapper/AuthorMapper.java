package lr.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import lr.dto.AuthorDTO;
import lr.model.Author;

@Mapper
public interface AuthorMapper {

	
	public static AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);
	
	
	@Mapping(source = "birthDate", target = "birthDate", dateFormat = "dd/MM/yyyy")
	Author toModel(AuthorDTO dto);
}
