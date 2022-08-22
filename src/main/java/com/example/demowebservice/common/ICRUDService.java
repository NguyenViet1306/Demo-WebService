package com.example.demowebservice.common;

import com.example.demowebservice.model.Product;

import java.util.List;
import java.util.Optional;

public interface ICRUDService<E> {

    E save(E e);

    void delete(Long id);

    Optional<E> findById(Long id);

    List<Product> findAll();

}
