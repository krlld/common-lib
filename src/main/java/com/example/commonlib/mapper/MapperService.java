package com.example.commonlib.mapper;

public interface MapperService<E, D> {

    E toEntity(D dto);

    D toDto(E entity);

}
