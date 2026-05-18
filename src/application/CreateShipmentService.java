package application;

import domain.Parcel;
import domain.Shipment;

public class CreateShipmentService implements CreateShipmentUseCase {

    private final ShipmentRepository repository;

    public CreateShipmentService(ShipmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Shipment createShipment(double weight, double length, double width, double height, String sender, String receiver) {
        Parcel parcel = new Parcel(weight, length, width, height);

        // Бізнес-логіка розрахунку вартості: базова ставка 50 грн + 15 грн за кожен кг
        double cost = 50.0 + (parcel.getWeight() * 15.0);

        Shipment shipment = new Shipment(parcel, sender, receiver, cost);

        repository.save(shipment);

        return shipment;
    }
}