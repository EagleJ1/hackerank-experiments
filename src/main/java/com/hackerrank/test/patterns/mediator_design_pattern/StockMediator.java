package com.hackerrank.test.patterns.mediator_design_pattern;

import java.util.ArrayList;

/**
 * Created by jackalhan on 2/11/17.
 */
public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSellOffers;

    private int colleagueCodes = 0;

    public StockMediator() {
        colleagues = new ArrayList<Colleague>();
        stockBuyOffers = new ArrayList<StockOffer>();
        stockSellOffers = new ArrayList<StockOffer>();
    }

    @Override
    public void addColleague(Colleague newColleague) {
        colleagues.add(newColleague);
        colleagueCodes++;
        newColleague.setColleagueCode(colleagueCodes);
    }

    @Override
    public void saleOffer(String stock, int shares, int collCode) {
        boolean stockSold = false;
        for (StockOffer offer : stockBuyOffers) {
            if (offer.getStockSymbol().equals(stock) && offer.getStockShares() == shares) {
                System.out.println(shares + " shares of " + stock + " sold to colleague code " + offer.getColleagueCode());
                stockBuyOffers.remove(offer);
                stockSold = true;
            }

            if (stockSold) {
                break;
            }
        }

        if (!stockSold) {
            System.out.println(shares + " share of " + stock + " added to invetory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockSellOffers.add(newOffering);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int collCode) {
        boolean stockBought = false;
        for (StockOffer offer : stockSellOffers) {
            if (offer.getStockSymbol().equals(stock) && offer.getStockShares() == shares) {
                System.out.println(shares + " shares of " + stock + " bought to colleague code " + offer.getColleagueCode());
                stockSellOffers.remove(offer);
                stockBought = true;
            }

            if (stockBought) {
                break;
            }
        }

        if (!stockBought) {
            System.out.println(shares + " share of " + stock + " added to invetory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockBuyOffers.add(newOffering);
        }
    }

    public void getStockOfferings() {
        System.out.println("\nStock for Sale");
        for (StockOffer offer : stockSellOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }

        System.out.println("\nStock buy Offers");
        for (StockOffer offer : stockBuyOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }

    }
}
