package lecenseDrive;

public class Category_D extends Driver implements Drived{
    public Category_D(String name, String drivesLicense, int stage) {
        super(name, drivesLicense, stage);
    }

    @Override
    public void startMove() {
        System.out.println("Я водитель автобуса");
    }

    @Override
    public void stop() {
        System.out.println("останавливаю на остановке");
    }

    @Override
    public void refuel() {
        System.out.println("Заливаю керосин");
    }
}
