package com.mphasis.jpmc.irq.model;

import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
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

@Component
@Data
public class IRQData implements CommandLineRunner {
    private List<DataModel> stockData=new ArrayList<>();


    @Override
    public void run(String... args) throws Exception {
        DataModel data=new DataModel("TEA","common",0,0,100);
        stockData.add(data);
        data=new DataModel("POP","common",8,0,100);
        stockData.add(data);
        data=new DataModel("ALE","common",23,0,60);
        stockData.add(data);
        data=new DataModel("GIN","preferred",8,2,100);
        stockData.add(data);
        data=new DataModel("JOE","common",13,2,250);
        stockData.add(data);
    }
}
