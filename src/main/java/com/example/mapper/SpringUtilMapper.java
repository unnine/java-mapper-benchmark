package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class SpringUtilMapper implements MemberMapper {

    public MemberDto map(Member member) {
        MemberDto dto = new MemberDto();
        BeanUtils.copyProperties(member, dto);
        return dto;
    }

    public List<MemberDto> map(List<Member> members) {
        List<MemberDto> result = new ArrayList<>(members.size());
        for (Member member : members) {
            result.add(map(member));
        }
        return result;
    }
}
