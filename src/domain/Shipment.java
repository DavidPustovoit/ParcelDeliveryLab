package domain;

import java.util.UUID;

public class Shipment {
    private String trackingId;
    private Parcel parcel;
    private String senderAddress;
    private String receiverAddress;
    private double deliveryCost;

    public Shipment(Parcel parcel, String senderAddress, String receiverAddress, double deliveryCost) {
        this.trackingId = UUID.randomUUID().toString();
        this.parcel = parcel;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.deliveryCost = deliveryCost;
    }

    public String getTrackingId() { return trackingId; }
    public double getDeliveryCost() { return deliveryCost; }

    @Override
    public String toString() {
        return "Відправлення [" + trackingId + "] з " + senderAddress + " до " + receiverAddress + ". Вартість: " + deliveryCost + " грн.";
    }
}