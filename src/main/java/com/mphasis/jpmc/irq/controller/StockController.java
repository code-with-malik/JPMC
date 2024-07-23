package com.mphasis.jpmc.irq.controller;

import com.mphasis.jpmc.irq.model.TradeModel;
import com.mphasis.jpmc.irq.model.responseModel.OutputModel;
import com.mphasis.jpmc.irq.model.responseModel.VWSPResponseModel;
import com.mphasis.jpmc.irq.resource.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Febin Malik
 * @Mobile +91 9656668856
 * @Email codewithfebinmalik@gmail.com
 * @Youtube: https://www.youtube.com/channel/UCvHPMfc9V3l50D6S-gzngQw
 * @Git: https://github.com/code-with-malik
 */


@RestController
public class StockController {



    @Autowired
    DividendYieldResources dividendYieldResources;
    @Autowired
    PERatioResources peRatioResources;
    @Autowired
    RecordTradeResources recordTradeResources;
    @Autowired
    VolumeWeightedStockPriceResources volumeWeightedStockPriceResources;
    @Autowired
    GBCEResources gbceResources;

    @GetMapping("/test")
    public String test(){
        return "success";
    }

    @GetMapping("/dividendYield/{price}")
    public List<OutputModel> calculateDividendYield(@PathVariable double price){
        return dividendYieldResources.calculateDividendYield(price);
    }

    @GetMapping("/peRatio/{price}")
    public List<OutputModel> calculatePERatio(@PathVariable double price){
        return peRatioResources.calculatePERatio(price);
    }

    @PostMapping("/recordTrade")
    public List<TradeModel> recordTrade(@RequestBody TradeModel tradeModel){
        return recordTradeResources.recordTrade(tradeModel);
    }

    @GetMapping("/volumeWeightedStockPrice/{stockSymbol}")
    public VWSPResponseModel calculatePERatio(@PathVariable String stockSymbol){
        return volumeWeightedStockPriceResources.calculateVWSP(stockSymbol);
    }

    @GetMapping("/calculateGBCE")
    public double calculateGBCE(){
        return gbceResources.calculateGBCE();
    }



}
