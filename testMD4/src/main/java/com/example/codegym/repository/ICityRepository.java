package com.example.codegym.repository;

import com.example.codegym.model.City;
import com.example.codegym.model.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends PagingAndSortingRepository<City,Long> {

    Page<City>findAllByNameContaining(Pageable pageable,String name);

    Page<City> findByCountry(Pageable pageable, Country country);
}
