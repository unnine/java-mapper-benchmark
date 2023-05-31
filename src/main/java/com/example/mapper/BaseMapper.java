package com.example.mapper;

import java.util.List;

public interface BaseMapper<E, D> {

    D map(E e);

    List<D> map(List<E> e);
}