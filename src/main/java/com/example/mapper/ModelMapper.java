package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;

import java.util.List;

public class ModelMapper implements MemberMapper {

    @Override
    public MemberDto map(Member member) {
        return null;
    }

    @Override
    public List<MemberDto> map(List<Member> e) {
        return null;
    }
}
