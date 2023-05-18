package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.entity.CarEntity;
public interface CarRepository  extends  JpaRepository <CarEntity,Integer>{

} 
