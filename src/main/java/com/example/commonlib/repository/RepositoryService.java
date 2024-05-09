package com.example.commonlib.repository;

import com.example.commonlib.dto.FilterRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface RepositoryService<E, I> {

    E save(E entity);

    Iterable<E> saveAll(Iterable<E> entities);

    Optional<E> findById(I id);

    void deleteById(I id);

    List<E> findList(FilterRequest filter);

    Page<E> findPage(FilterRequest filter, Pageable pageable);
}