import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BrokerManager implements Producer{
    private Map<String, Double> price;

    private List<Broker> brokers;

    BrokerManager(){
        brokers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Broker broker) {
        brokers.add(broker);
    }

    @Override
    public void removeSubscriber(Broker broker) {
        brokers.remove(broker);
    }

    @Override
    public void informBrokers(){
        for(Broker broker: brokers) {
            broker.update(price);
        }
    }

    public void priceChanged(Map<String, Double> price){
        this.price = price;
        informBrokers();
    }
}
