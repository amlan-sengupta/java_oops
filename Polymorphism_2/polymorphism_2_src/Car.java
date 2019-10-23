public class Car {
    private String name;
    private boolean engine;
    private int wheels;
    private int cylinder;

    public Car(String name, int cylinder) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinder = cylinder;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String startEngine(){
        return "car->startEngine()";
    }
    public String accelerate(){
        return "car->Accelerate";
    }
    public String brake(){
        return "Car->brake";
    }
}
//not be declare as public
class Hyundai extends Car{
    public Hyundai(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Hyundai->startEngine()";
    }

    @Override
    public String accelerate() {
        return "Hyundai->accelerate";
    }

    @Override
    public String brake() {
        //return "Hyundai->brake()";
        return getClass().getSimpleName()+"-> brake";
    }
}

class Honda extends Car{
    public Honda(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Honda->startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda->accelerate";
    }

    @Override
    public String brake() {
        return "Honda->brake()";
    }
}

