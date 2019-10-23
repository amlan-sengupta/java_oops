public class Main {
    public static void main(String[] args) {
        Printer printer=new Printer(50,false);
        //encapsulation
        System.out.println("Initial pages="+printer.getPagesPrinted());
        int pagesPrinted=printer.printPages(4);
        System.out.println("Now pages printed:"+printer.getPagesPrinted());
    }
}
