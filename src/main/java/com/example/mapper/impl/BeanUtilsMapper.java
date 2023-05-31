package com.example.mapper.impl;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.mapper.MemberMapper;
import org.springframework.beans.BeanUtils;

public class BeanUtilsMapper implements MemberMapper {

    public MemberDto map(Member member) {
        MemberDto dto = new MemberDto();
        BeanUtils.copyProperties(member, dto);
        return dto;
    }
}