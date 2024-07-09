import java.util.Map;
import java.util.Random;

import static java.lang.Thread.sleep;

public class StockExchange {
    Map<String, Double> stocks;
    BrokerManager brokerManager;

    StockExchange(Map<String, Double> stocks, BrokerManager brokerManager){
        this.stocks = stocks;
        this.brokerManager = brokerManager;
    }

    public void updatePrice(String stock, Double price){
        this.stocks.put(stock,price);
        brokerManager.priceChanged(this.stocks);
    }
}