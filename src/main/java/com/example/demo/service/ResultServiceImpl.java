package com.example.demo.service;

import com.example.demo.model.Result;
import com.example.demo.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService{

    @Autowired
    private ResultRepository resultRepository;

    @Override
    public void saveResult(Result result) {
        this.resultRepository.save(result);
    }
}
