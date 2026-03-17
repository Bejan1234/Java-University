import ro.ase.csie.cts.exceptions.HydrogenException;
import ro.ase.csie.cts.models.Car;
import ro.ase.csie.cts.models.EEngine;
import ro.ase.csie.cts.models.HEngine;
import ro.ase.csie.cts.models.TEngine;

public void main() {
    TEngine engine = new TEngine(2000, 260, "Diesel");
    EEngine engine2 = new EEngine(1500, 358, "Electric");
    Car car = new Car("Kia", "red", 5, engine);
    Car electricCar = new Car("Tesla", "blue", 5, engine2);

    car.move(200);
    electricCar.move(200);
    engine2.print();
    car.setEngine(new HEngine(2000, 1500,"Hidrogen" ));
    try{
        car.engine.stopEngine();
    }catch(Exception e) {}

}
