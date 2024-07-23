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
public class OutputModel {
    private String stock;
    private double dividendYield;

    public OutputModel(String stock, double dividendYield) {
        this.stock = stock;
        this.dividendYield = dividendYield;
    }
}
