//motherboard,case, monitor
//compositon has-a relation

public class Main {
    public static void main(String[] args) {


        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2249", "Dell", dimensions);
        Monitor theMonitor = new Monitor("27inch", "ACER", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("82-200", "Asus", 6, 4, "v2.44");
        PC thePC = new PC(theCase, theMonitor, motherboard);
        thePC.getMonitor().drawPixel(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
