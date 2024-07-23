package com.mphasis.jpmc.irq.resource;

import com.mphasis.jpmc.irq.model.TradeData;
import com.mphasis.jpmc.irq.model.TradeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Febin Malik
 * @Mobile +91 9656668856
 * @Email codewithfebinmalik@gmail.com
 * @Youtube: https://www.youtube.com/channel/UCvHPMfc9V3l50D6S-gzngQw
 * @Git: https://github.com/code-with-malik
 */

@Service
public class GBCEResources {
    @Autowired
    TradeData tradeData;
    public double calculateGBCE() {
        List<TradeModel> data = tradeData.getTradeData();
        AtomicReference<Double> sigmaPrice= new AtomicReference<>((double) 1);
        data.stream().forEach(y->{
            sigmaPrice.set(sigmaPrice.get() * y.getPrice());
        });

        double dres = Math.pow(sigmaPrice.get(), 1.0 / data.size());
        double ires = Math.round(dres);
        return ires;
    }
}
