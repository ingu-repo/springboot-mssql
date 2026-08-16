package com.example.dataservice.service;

import com.example.dataservice.repository.TradesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.example.dataservice.entity.Trade;

@Service
public class TradesService {

    private final TradesRepository tradesRepository;

    public TradesService(TradesRepository tradesRepository) {
        this.tradesRepository = tradesRepository;
    }

    public List<Trade> getTrades() {
        return tradesRepository.findAll();
    }

    public List<Trade> getTrades(int input_ymd) {
        return tradesRepository.findAll(input_ymd);
    }

    public List<Trade> getTrades(int input_ymd, String koyu_mei_cd) {
        return tradesRepository.findAll(input_ymd, koyu_mei_cd);
    }

}
