import java.util.Map;

public class Groww implements Broker, Screen{

    private Map<String, Double> price;

    BrokerManager brokerManager;

    Groww(BrokerManager brokerManager){
        this.brokerManager = brokerManager;
        brokerManager.addSubscriber(this);
    }

    @Override
    public void update(Map<String, Double> price) {
        this.price = price;
        display();
    }

    @Override
    public void display(){

        System.out.println("Groww Price is:" + price);
    }

    public void subscribe(){
        brokerManager.addSubscriber(this);
    }

    public void unsubscribe(){
        brokerManager.removeSubscriber(this);
    }
}
