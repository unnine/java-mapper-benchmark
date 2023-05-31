package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.mapper.impl.ModelMapperMapper;

public class ModelMapperTest extends MemberMapperTest {

    private final BaseMapper<Member, MemberDto> mapper = new ModelMapperMapper();

    @Override
    public BaseMapper<Member, MemberDto> mapper() {
        return mapper;
    }

    public static void main(String[] args) {
        run(ModelMapperTest.class.getSimpleName());
    }

}