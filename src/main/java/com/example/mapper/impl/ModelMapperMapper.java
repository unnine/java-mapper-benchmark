package com.example.mapper.impl;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.mapper.MemberMapper;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ModelMapperMapper implements MemberMapper {

    private final ModelMapper mapper = new ModelMapper();

    @Override
    public MemberDto map(Member member) {
        return mapper.map(member, MemberDto.class);
    }

    @Override
    public List<MemberDto> map(List<Member> members) {
        List<MemberDto> result = new ArrayList<>(members.size());
        for (Member member : members) {
            result.add(map(member));
        }
        return result;
    }
}