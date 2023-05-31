package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.mapper.impl.MapStructMapper;

public class MapStructMapperTest extends MemberMapperTest {

    private final BaseMapper<Member, MemberDto> mapper = MapStructMapper.MAPPER;

    @Override
    public BaseMapper<Member, MemberDto> mapper() {
        return mapper;
    }

    public static void main(String[] args) {
        run(MapStructMapperTest.class.getSimpleName());
    }

}