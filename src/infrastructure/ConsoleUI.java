package infrastructure;

import application.CreateShipmentService;
import application.CreateShipmentUseCase;
import application.ShipmentRepository;
import domain.Shipment;
import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {
        // Налаштування залежностей
        ShipmentRepository repository = new InMemoryShipmentRepository();
        CreateShipmentUseCase useCase = new CreateShipmentService(repository);

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Система оформлення доставки посилки ---");
        try {
            System.out.print("Введіть вагу посилки в кг: ");
            double weight = Double.parseDouble(scanner.nextLine());

            System.out.print("Введіть довжину в см: ");
            double length = Double.parseDouble(scanner.nextLine());

            System.out.print("Введіть ширину в см: ");
            double width = Double.parseDouble(scanner.nextLine());

            System.out.print("Введіть висоту в см: ");
            double height = Double.parseDouble(scanner.nextLine());

            System.out.print("Адреса відправника: ");
            String sender = scanner.nextLine();

            System.out.print("Адреса одержувача: ");
            String receiver = scanner.nextLine();

            Shipment result = useCase.createShipment(weight, length, width, height, sender, receiver);
            System.out.println("\nУспіх! " + result.toString());

        } catch (IllegalArgumentException e) {
            System.out.println("\nПомилка бізнес-правил: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nТехнічна помилка вводу.");
        }
    }
}