package application;

import domain.Shipment;

public interface CreateShipmentUseCase {
    Shipment createShipment(double weight, double length, double width, double height, String sender, String receiver);
}