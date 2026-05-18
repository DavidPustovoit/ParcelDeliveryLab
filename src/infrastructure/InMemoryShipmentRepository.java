package infrastructure;

import application.ShipmentRepository;
import domain.Shipment;
import java.util.HashMap;
import java.util.Map;

public class InMemoryShipmentRepository implements ShipmentRepository {
    private final Map<String, Shipment> database = new HashMap<>();

    @Override
    public void save(Shipment shipment) {
        database.put(shipment.getTrackingId(), shipment);
        System.out.println("[БД] Збережено відправлення з трек-номером: " + shipment.getTrackingId());
    }
}