package com.example.commonlib.service;

import com.example.commonlib.dto.FilterRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceInterface<D, I> {

    D create(D entity);

    Iterable<D> createAll(Iterable<D> dtos);

    D find(I id);

    D update(D dto);

    void delete(I id);

    List<D> findList(FilterRequest filter);

    Page<D> findPage(FilterRequest filter, Pageable pageable);

}
