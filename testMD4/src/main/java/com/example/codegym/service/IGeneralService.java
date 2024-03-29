package com.example.codegym.service;

import java.util.Optional;

public interface IGeneralService<T> {


    Iterable<T>findAll();

    Optional<T>findById(Long id);

    void save(T t);

    void  delete(Long id);
}
