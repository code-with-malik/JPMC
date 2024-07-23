package com.mphasis.jpmc.irq.resource;

import com.mphasis.jpmc.irq.model.TradeData;
import com.mphasis.jpmc.irq.model.TradeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Febin Malik
 * @Mobile +91 9656668856
 * @Email codewithfebinmalik@gmail.com
 * @Youtube: https://www.youtube.com/channel/UCvHPMfc9V3l50D6S-gzngQw
 * @Git: https://github.com/code-with-malik
 */

@Service
public class RecordTradeResources {
    @Autowired
    TradeData tradeData;
    public List<TradeModel> recordTrade(TradeModel tradeModel){
        tradeData.addTrade(tradeModel);
        return tradeData.getTradeData();
    }
}
