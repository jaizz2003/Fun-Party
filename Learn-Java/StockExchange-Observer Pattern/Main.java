import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] argc) throws InterruptedException {
        Map<String, Double> stocks = new HashMap<>();
        stocks.put("TATAMOTORS", 857.80);
        stocks.put("ADANIGREEN", 1726.49);
        stocks.put("TCS", 1937.35);
        stocks.put("INFOSYS", 2557.53);

        BrokerManager brokerManager = new BrokerManager();
        StockExchange stockExchange = new StockExchange(stocks, brokerManager);
        Groww groww = new Groww(brokerManager);
        Zerodha zerodha = new Zerodha(brokerManager);

        Random random = new Random();

        for(int i=0;i<1;i++){
            stockExchange.updatePrice("TATAMOTORS",
                    random.nextDouble(5)+stocks.get("TATAMOTORS"));
            stockExchange.updatePrice("ADANIGREEN",
                    random.nextDouble(10)+stocks.get("ADANIGREEN"));
            stockExchange.updatePrice("TCS",
                    random.nextDouble(7)+stocks.get("TCS"));
            stockExchange.updatePrice("INFOSYS",
                    random.nextDouble(4)+stocks.get("INFOSYS"));

            sleep(1000);
        }

    }
}
