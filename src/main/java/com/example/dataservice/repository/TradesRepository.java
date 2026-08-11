package com.example.dataservice.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Map;

@Log4j2
@Repository
public class TradesRepository {

    private final JdbcTemplate jdbcTemplate;

    public TradesRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> findAll() {
        String sql = "SELECT * FROM pr2i001";
        log.info("SQL: {}", sql);
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> findAll(int input_ymd) {
        String sql = "SELECT * FROM pr2i001 WHERE input_ymd=?";
        log.info("SQL: {} params: [{}]", sql, input_ymd);
        return jdbcTemplate.queryForList(sql, input_ymd);
    }

    public List<Map<String, Object>> findAll(int input_ymd, String koyu_mei_cd) {
        String sql = "SELECT * FROM pr2i001 WHERE input_ymd=? and koyu_mei_cd=?";
        log.info("SQL: {} params: [{}, {}]", sql, input_ymd, koyu_mei_cd);
        return jdbcTemplate.queryForList(sql, input_ymd, koyu_mei_cd);
    }

}
