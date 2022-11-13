package transport;

import java.time.LocalDate;

abstract public class Auto {
    private String brand;
    private String model;
    private double engingVolume;

    public Auto(String brand, String model, double engingVolume) {
        if(brand == null){
            this.brand = "default";
        }else{
            this.brand = brand;
        }
        if(model == null){
            this.model = "defaault";
        }else{
            this.model = model;
        }
        if(engingVolume<1.5){
            this.engingVolume = 1.5;
        }else{
            this.engingVolume = engingVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null){
            this.brand = "default";
        }else{
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null){
            this.model = "defaault";
        }else{
            this.model = model;
        }
    }

    public double getEngingVolume() {
        return engingVolume;
    }

    public void setEngingVolume(double engingVolume) {
        if(engingVolume<1.5){
            this.engingVolume = 1.5;
        }else{
            this.engingVolume = engingVolume;
        }
    }

    @Override
    public String toString() {
        return "Марка " + brand +
                "\n модель авто " + model +
                "\n объем двигателя " + engingVolume + " литров";
    }

    public void startMovie() {
        System.out.println("Начать движение");
    }
    public void stopMove(){
        System.out.println("закончить движение");
    }

    public abstract String Pitstop();

    public abstract String bestTime();

    public abstract int maxSpeed();
}