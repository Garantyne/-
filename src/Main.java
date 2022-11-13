import lecenseDrive.Category_C;
import lecenseDrive.Driver;
import transport.*;


public class Main {
    public static void main(String[] args) {
        Bus man = new Bus("Man","people",5.5);
        Truck kamaz = new Truck("Камаз","ХЗ какая нибудь последняя",8);
        PassengerCar chevrolet = new PassengerCar("Шевроле","Авео",1.4);

        System.out.println(man);
        System.out.println();
        System.out.println(kamaz);
        System.out.println();
        System.out.println(chevrolet);

        Competings ural = new Truck("URAL","dahz",6.7);
        Competings mann = new Bus("MANN","Banan",555);
        Competings bmw = new PassengerCar("BMW","X6",4);
        System.out.println(ural.Pitstop());
        System.out.println();
        System.out.println(mann.bestTime());
        System.out.println();
        System.out.println(bmw.maxSpeed() + " км/ч");

        Driver oleg = new Category_C("Oleg","категория Б",12);
        System.out.println(oleg);
    }

}