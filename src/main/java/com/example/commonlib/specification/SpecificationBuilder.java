package com.example.commonlib.specification;

import com.example.commonlib.dto.FilterRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;

public interface SpecificationBuilder<E> {

    Specification<E> build(@Nullable FilterRequest filterRequest);
}
