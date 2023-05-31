package com.example.mapper.impl;

import com.example.mapper.MemberMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructMapper extends MemberMapper {
    MapStructMapper MAPPER = Mappers.getMapper(MapStructMapper.class);
}