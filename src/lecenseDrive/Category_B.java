package lecenseDrive ;

public class Category_B extends Driver implements Drived{
    public Category_B(String name, String drivesLicense, int stage) {
        super(name, drivesLicense, stage);
    }

    @Override
    public void startMove() {
        System.out.println("Я бомбила, вожу такси");
    }

    @Override
    public void stop() {
        System.out.println("Где скажещь там и стоп");
    }

    @Override
    public void refuel() {
        System.out.println("Заправляю бензин");
    }
}
