package com.example.dataservice.controller;

import com.example.dataservice.service.TradesService;

import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@RestController
@RequestMapping("/api/trades")
public class TradesController {

    private final TradesService tradesService;

    public TradesController(TradesService tradesService) {
        this.tradesService = tradesService;
    }

    @GetMapping
    public List<Map<String, Object>> getTrades(
        HttpServletRequest request) {

        log.info("{}", request.getRequestURI());
        return tradesService.getTrades();
    }

    @GetMapping(params = {"input_ymd"})
    public List<Map<String, Object>> getTradesInputYmd(
        HttpServletRequest request,
        @RequestParam int input_ymd) {

        log.info("{}?input_ymd={}", request.getRequestURI(), input_ymd);
        return tradesService.getTrades(input_ymd);
    }

    @GetMapping(params = {"input_ymd", "koyu_mei_cd"})
    public List<Map<String, Object>> getTradesInputYmdKoyu(
        HttpServletRequest request,
        @RequestParam int input_ymd,
        @RequestParam String koyu_mei_cd
    ) {
        log.info("{}?input_ymd={}&koyu_mei_cd={}", request.getRequestURI(), input_ymd, koyu_mei_cd);
        return tradesService.getTrades(input_ymd, koyu_mei_cd);
    }

}

