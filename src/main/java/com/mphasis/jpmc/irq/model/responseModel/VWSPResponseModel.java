package com.mphasis.jpmc.irq.model.responseModel;

import lombok.Data;

/**
 * @author Febin Malik
 * @Mobile +91 9656668856
 * @Email codewithfebinmalik@gmail.com
 * @Youtube: https://www.youtube.com/channel/UCvHPMfc9V3l50D6S-gzngQw
 * @Git: https://github.com/code-with-malik
 */

@Data
public class VWSPResponseModel {
    private String stockSymbol;
    private double vwsp;

    public VWSPResponseModel(String stockSymbol, double vwsp) {
        this.stockSymbol = stockSymbol;
        this.vwsp = vwsp;
    }
}
