package com.example.codegym.service.imp;

import com.example.codegym.model.City;
import com.example.codegym.model.Country;
import com.example.codegym.repository.ICityRepository;
import com.example.codegym.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService {
    @Autowired
    private ICityRepository iCityRepository;


    @Override
    public Page<City> findAll(Pageable pageable) {
        return iCityRepository.findAll(pageable);
    }

    @Override
    public Page<City> findAllByName(Pageable pageable, String name) {
        return iCityRepository.findAllByNameContaining(pageable, name);
    }

    @Override
    public Page<City> findAllByCountry(Pageable pageable, Country country) {
        return iCityRepository.findByCountry(pageable,country);
    }

    @Override
    public Iterable<City> findAll() {
        return iCityRepository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return iCityRepository.findById(id);
    }

    @Override
    public void save(City city) {
        iCityRepository.save(city);
    }

    @Override
    public void delete(Long id) {
        iCityRepository.deleteById(id);
    }



}
