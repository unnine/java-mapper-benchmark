package com.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructMapper extends MemberMapper {
    MapStructMapper MAPPER = Mappers.getMapper(MapStructMapper.class);
}
