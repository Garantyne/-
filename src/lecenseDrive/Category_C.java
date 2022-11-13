package lecenseDrive;

public class Category_C extends Driver implements Drived{
    public Category_C(String name, String drivesLicense, int stage) {
        super(name, drivesLicense, stage);
    }

    @Override
    public void startMove() {
        System.out.println("Я водила категории С вожу грузовики");
    }

    @Override
    public void stop() {
        System.out.println("Начинаю в пункте А кончаю в В");
    }

    @Override
    public void refuel() {
        System.out.println("Лью 80 или соляру");
    }
}
