package com.example.demo.repository;


import com.example.demo.model.RegionInformation;
import com.example.demo.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {


    Result findAllById(int id);
}
