package transport;

public class PassengerCar extends Auto implements Competings{
    private  String brand;
    private  String model;
    private double engingVolume;

    public PassengerCar(String brand, String model, double engingVolume) {
        super(brand, model, engingVolume);
    }

    @Override
    public String Pitstop() {
        return "авто едет на питстоп";
    }

    @Override
    public String bestTime() {
        return "лучшее время 5:51";
    }

    @Override
    public int maxSpeed() {
        return 220;
    }
}
