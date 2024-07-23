package com.mphasis.jpmc.irq.resource;

import com.mphasis.jpmc.irq.model.TradeData;
import com.mphasis.jpmc.irq.model.TradeModel;
import com.mphasis.jpmc.irq.model.responseModel.VWSPResponseModel;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Febin Malik
 * @Mobile +91 9656668856
 * @Email codewithfebinmalik@gmail.com
 * @Youtube: https://www.youtube.com/channel/UCvHPMfc9V3l50D6S-gzngQw
 * @Git: https://github.com/code-with-malik
 */

@Service
public class VolumeWeightedStockPriceResources {

    @Autowired
    TradeData tradeData;

    public VWSPResponseModel calculateVWSP(String stockSymbol) {
        List<TradeModel> data = tradeData.getTradeData();
        Date currDate = new Date();
        int minutesToSub = 10;
        Date newDate = DateUtils.setMinutes(currDate, minutesToSub);
        double tpq = data.stream().filter(x -> x.getTimeStamp().after(newDate) && x.getStockSymbol().equalsIgnoreCase(stockSymbol))
                .mapToDouble(y -> y.getPrice() * y.getQuantity()).sum();
        double quantity = data.stream().filter(x -> x.getTimeStamp().after(newDate) && x.getStockSymbol().equalsIgnoreCase(stockSymbol))
                .mapToDouble(y -> y.getQuantity()).sum();
        double vwsp=tpq/quantity;
        return new VWSPResponseModel(stockSymbol,vwsp);

    }
}
