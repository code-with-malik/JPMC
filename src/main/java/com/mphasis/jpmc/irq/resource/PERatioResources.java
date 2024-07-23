package com.mphasis.jpmc.irq.resource;

import com.mphasis.jpmc.irq.model.DataModel;
import com.mphasis.jpmc.irq.model.IRQData;
import com.mphasis.jpmc.irq.model.responseModel.OutputModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Febin Malik
 * @Mobile +91 9656668856
 * @Email codewithfebinmalik@gmail.com
 * @Youtube: https://www.youtube.com/channel/UCvHPMfc9V3l50D6S-gzngQw
 * @Git: https://github.com/code-with-malik
 */

@Service
public class PERatioResources {
    @Autowired
    DividendYieldResources dividendYieldResources;

    public List<OutputModel> calculatePERatio(double price) {
        List<OutputModel> dividendYeilsList = dividendYieldResources.calculateDividendYield(price);
        List<OutputModel> peRatio=new ArrayList<>();
        dividendYeilsList.stream().forEach(dividendYiels->{
            double pe=price/dividendYiels.getDividendYield();
            peRatio.add(new OutputModel(dividendYiels.getStock(),pe));
        });
        return peRatio;
    }
}
