package com.example.dataservice.entity;

import lombok.Data;

@Data
public class Trade {

    private String koyu_mei_cd;
    private int kaisu;
    private String goh;

    private int ac_no;
    private int input_ymd;
    private int ukew_ymd;
    private int gkmen;

    public Trade() {

    }
}
