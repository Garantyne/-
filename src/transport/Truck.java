package transport;

public class Truck extends Auto implements Competings{
    private  String brand;
    private  String model;
    private double engingVolume;

    public Truck(String brand, String model, double engingVolume) {
        super(brand, model, engingVolume);
    }

    @Override
    public String Pitstop() {
        return "Грузовик едет на питстоп";
    }

    @Override
    public String bestTime() {
        return "лучшее время 10:11";
    }

    @Override
    public int maxSpeed() {
        return 180;
    }
}
