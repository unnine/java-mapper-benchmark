package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.mapper.impl.ManuallyMapper;

public class ManuallyMapperTest extends MemberMapperTest {

    private final BaseMapper<Member, MemberDto> mapper = new ManuallyMapper();

    @Override
    public BaseMapper<Member, MemberDto> mapper() {
        return mapper;
    }

    public static void main(String[] args) {
        run(ManuallyMapper.class.getSimpleName());
    }
}