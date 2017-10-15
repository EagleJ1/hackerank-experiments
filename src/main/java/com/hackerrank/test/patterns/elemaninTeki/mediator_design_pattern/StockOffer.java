package com.hackerrank.test.patterns.elemaninTeki.mediator_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class StockOffer {

    private int stockShares = 0;
    private String stockSymbol = "";
    private int colleagueCode = 0;

    public StockOffer(int numOfShares, String stock, int collCode) {
        stockShares = numOfShares;
        stockSymbol = stock;
        colleagueCode = collCode;
    }

    public int getStockShares() {
        return stockShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getColleagueCode() {
        return colleagueCode;
    }


}
