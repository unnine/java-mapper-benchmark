package com.example.mapper.impl;

import com.example.dto.Member;
import com.example.dto.MemberDto;
import com.example.dto.Order;
import com.example.dto.OrderDto;
import com.example.mapper.MemberMapper;

import java.util.ArrayList;
import java.util.List;

public class ManuallyMapper implements MemberMapper {

    @Override
    public MemberDto map(Member member) {
        List<OrderDto> orders = new ArrayList<>(member.getOrders().size());
        for (Order order : member.getOrders()) {
            orders.add(OrderDto.from(order));
        }

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