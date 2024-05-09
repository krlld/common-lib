package com.example.commonlib.service;

import com.example.commonlib.dto.FilterRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceInterface<D, I> {

    D save(D entity);

    Iterable<D> saveAll(Iterable<D> dtos);

    D findById(I id);

    void deleteById(I id);

    List<D> findList(FilterRequest filter);

    Page<D> findPage(FilterRequest filter, Pageable pageable);

}
