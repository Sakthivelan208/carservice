package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.CarModel;
//import org.springframework.stereotype.Repository;
//@Repository
public interface CarRepo extends CrudRepository<CarModel, Integer> {
//List<CarModel> findByNameStartingWith(String prefix);
//List<CarModel> findByNameEndingWith(String suffix);
//List<CarModel> findByCountry(String country);
CarModel findByusername(String username);
}
