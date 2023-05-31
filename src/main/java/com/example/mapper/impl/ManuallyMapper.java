package com.example.mapper.impl;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.mapper.MemberMapper;

import java.util.List;

public class ManuallyMapper implements MemberMapper {

    @Override
    public MemberDto map(Member member) {
        return MemberDto.from(member);
    }
}