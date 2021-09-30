package lr.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import lr.dto.BookDTO;
import lr.model.Book;

@Mapper
public interface BookMapper {

	
	public static BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
	
	
	@Mapping(source = "authorId", target = "author.id")
	Book toModel(BookDTO dto);
}
