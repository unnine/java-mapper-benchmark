package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.mapper.impl.BeanUtilsMapper;

public class BeanUtilsMapperTest extends MemberMapperTest {

    private final BaseMapper<Member, MemberDto> mapper = new BeanUtilsMapper();

    @Override
    public BaseMapper<Member, MemberDto> mapper() {
        return mapper;
    }

    public static void main(String[] args) {
        run(BeanUtilsMapperTest.class.getSimpleName());
    }

}