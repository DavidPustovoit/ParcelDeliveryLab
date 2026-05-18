package domain;

public class Parcel {
    private double weight;
    private double length;
    private double width;
    private double height;

    public Parcel(double weight, double length, double width, double height) {
        if (weight <= 0 || weight > 30) {
            throw new IllegalArgumentException("Вага посилки повинна бути більше 0 і не перевищувати 30 кг.");
        }
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Габарити посилки повинні бути більше нуля.");
        }
        if (length > 150 || width > 150 || height > 150) {
            throw new IllegalArgumentException("Жоден з габаритів не може перевищувати 150 см.");
        }

        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getWeight() { return weight; }
}