package transport;

public class Bus extends Auto implements Competings{
    public static final String[] COMPETING_HUENDING = new String[]{"Питстоп","10","150"};
    private  String brand;
    private  String model;
    private double engingVolume;

    public Bus(String brand, String model, double engingVolume) {
        super(brand, model, engingVolume);
    }

    @Override
    public String Pitstop() {
        return "Автобус едет на питстоп";
    }

    @Override
    public String bestTime() {
        return "его лучшее вермя 12:15";
    }

    @Override
    public int maxSpeed() {
        return 152;
    }
}
