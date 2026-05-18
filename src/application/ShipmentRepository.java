package application;

import domain.Shipment;

public interface ShipmentRepository {
    void save(Shipment shipment);
}