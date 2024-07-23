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
public class DividendYieldResources {
    @Autowired
    IRQData irqData;

       public List<OutputModel> calculateDividendYield(double price){
       List<DataModel> data = irqData.getStockData();
       List<OutputModel> dividendYieldList=new ArrayList<>();
       data.stream().forEach(stock->{
           double dy=0;
           if (stock.getType().equalsIgnoreCase("common")){
               dy=stock.getLastDividend()/price;
           }else {
               dy=(stock.getFixedDividend()*stock.getParValue())/price;
           }
           dividendYieldList.add(new OutputModel(stock.getStockSymbol(),dy));
       });
       return dividendYieldList;
   }


}
