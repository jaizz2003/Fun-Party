import java.util.ArrayList;
import java.util.List;

public interface Producer {
    void addSubscriber(Broker broker);
    void removeSubscriber(Broker broker);

    void informBrokers();
}
