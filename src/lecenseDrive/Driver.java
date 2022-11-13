package lecenseDrive;

public class Driver < T extends Category_C & Drived> {
    String name;
    String drivesLicense;
    int stage;
    public void drive(T abs){

    }

    public Driver(String name, String drivesLicense, int stage) {
        this.name = name;
        this.drivesLicense = drivesLicense;
        this.stage = stage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrivesLicense() {
        return drivesLicense;
    }

    public void setDrivesLicense(String drivesLicense) {
        this.drivesLicense = drivesLicense;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return "Меня зовут " + name +
                " я водитель " + drivesLicense +
                " мой стаж " + stage;
    }
}
