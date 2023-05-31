package com.example.mapper.impl;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.mapper.MemberMapper;
import org.modelmapper.ModelMapper;

public class ModelMapperImpl implements MemberMapper {

    private final ModelMapper mapper = new ModelMapper();

    @Override
    public MemberDto map(Member member) {
        return mapper.map(member, MemberDto.class);
    }
}