package com.mphasis.jpmc.irq.model;

import lombok.Data;

import java.util.Date;

/**
 * @author Febin Malik
 * @Mobile +91 9656668856
 * @Email codewithfebinmalik@gmail.com
 * @Youtube: https://www.youtube.com/channel/UCvHPMfc9V3l50D6S-gzngQw
 * @Git: https://github.com/code-with-malik
 */

@Data
public class TradeModel {

    private String stockSymbol;
    private int quantity;
    private double price;
    private String orderType;
    private Date timeStamp;

    public TradeModel(String stockSymbol, int quantity, double price, String orderType, Date timeStamp) {
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.price = price;
        this.orderType = orderType.toUpperCase();
        this.timeStamp = new java.util.Date();
    }
}
