package com.example.mapper.impl;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.dto.OrderDto;
import com.example.mapper.MemberMapper;

import java.util.List;

public class ManuallyMapper implements MemberMapper {

    @Override
    public MemberDto map(Member member) {
        List<OrderDto> orders = member.getOrders().stream()
                .map(OrderDto::from)
                .toList();

        MemberDto dto = new MemberDto();
        dto.setAddress(member.getAddress());
        dto.setAge(member.getAge());
        dto.setIntroduction(member.getIntroduction());
        dto.setName(member.getName());
        dto.setOrders(orders);
        dto.setPhone(member.getPhone());
        return dto;
    }
}