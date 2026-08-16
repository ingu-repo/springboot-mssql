package com.example.dataservice.repository;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.extern.log4j.Log4j2;
import java.util.List;
import java.util.Map;

import com.example.dataservice.entity.Trade;

@Log4j2
@Repository
public class TradesRepository {

    private final JdbcTemplate jdbcTemplate;

    public TradesRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Trade> findAll() {
        String sql = "SELECT * FROM pr2i001";
        log.info("SQL: {}", sql);
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Trade.class));
    }

    public List<Trade> findAll(int input_ymd) {
        String sql = String.format("SELECT * FROM pr2i001 WHERE input_ymd=%d", input_ymd);
        log.info(sql);
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Trade.class));
    }

    public List<Trade> findAll(int input_ymd, String koyu_mei_cd) {
        String sql = String.format("SELECT * FROM pr2i001 WHERE input_ymd=%d and koyu_mei_cd='%s'"
            , input_ymd, koyu_mei_cd);
        
        log.info(sql);
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Trade.class));
    }

}
