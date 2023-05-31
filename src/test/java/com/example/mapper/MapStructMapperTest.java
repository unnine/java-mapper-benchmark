package com.example.mapper;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.mapper.impl.MapStructMapper;

public class MapStructMapperTest extends MemberMapperTest {

    @Override
    public BaseMapper<Member, MemberDto> mapper() {
        return MapStructMapper.MAPPER;
    }

    public static void main(String[] args) {
        run(MapStructMapperTest.class.getSimpleName());
    }

}