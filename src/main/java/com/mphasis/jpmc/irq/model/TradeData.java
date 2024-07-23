package com.mphasis.jpmc.irq.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Febin Malik
 * @Mobile +91 9656668856
 * @Email codewithfebinmalik@gmail.com
 * @Youtube: https://www.youtube.com/channel/UCvHPMfc9V3l50D6S-gzngQw
 * @Git: https://github.com/code-with-malik
 */

@Component
@Data
public class TradeData {

    List<TradeModel> tradeData=new ArrayList<>();

    public void addTrade(TradeModel tradeModel){
        tradeData.add(tradeModel);
    }
}
