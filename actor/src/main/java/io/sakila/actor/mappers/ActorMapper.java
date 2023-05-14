package io.sakila.actor.mappers;
import io.sakila.actor.dto.ActorDto;
import io.sakila.actor.domains.ActorModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ActorMapper {
    ActorMapper INSTANCE = Mappers.getMapper(ActorMapper.class);
    ActorModel convert(ActorDto actorDto);
}