public class Main {

    public static void main(String[] args) {
        Car car=new Car("BaseCar",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println();

        Hyundai hyundai=new Hyundai("i10",6);
        System.out.println(hyundai.startEngine());
        System.out.println(hyundai.accelerate());
        System.out.println(hyundai.brake());

        System.out.println();

        Honda honda=new Honda("accord",12);
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());

        System.out.println();


    }
}
