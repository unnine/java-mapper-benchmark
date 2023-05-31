package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;

import java.util.ArrayList;
import java.util.List;

public interface MemberMapper extends BaseMapper<Member, MemberDto> {

    @Override
    default List<MemberDto> map(List<Member> members) {
        List<MemberDto> result = new ArrayList<>(members.size());
        for (Member member : members) {
            result.add(map(member));
        }
        return result;
    }
}