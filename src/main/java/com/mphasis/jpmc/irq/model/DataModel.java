package com.mphasis.jpmc.irq.model;

import lombok.Data;

/**
 * @author Febin Malik
 * @Mobile +91 9656668856
 * @Email codewithfebinmalik@gmail.com
 * @Youtube: https://www.youtube.com/channel/UCvHPMfc9V3l50D6S-gzngQw
 * @Git: https://github.com/code-with-malik
 */

@Data
public class DataModel {
    private String stockSymbol;
    private String type;
    private int lastDividend;
    private double fixedDividend;
    private int parValue;

    public DataModel(String stockSymbol, String type, int lastDividend, double fixedDividend, int parValue) {
        this.stockSymbol = stockSymbol;
        this.type = type;
        this.lastDividend = lastDividend;
        this.fixedDividend = fixedDividend;
        this.parValue = parValue;
    }
}
