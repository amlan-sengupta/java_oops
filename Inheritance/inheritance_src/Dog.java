public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,int size, int weight, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        //super(name, brain, body, size, weight);
        this.eyes =2;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew(){
        System.out.println("Dog.chew is called");
    }
    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk is called");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run called");
        move(10);
    }
    private void movelegs(int speed){
        System.out.println("Dog.moveLegs() is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() is called");
        movelegs(speed);
        super.move(speed);
    }
}
