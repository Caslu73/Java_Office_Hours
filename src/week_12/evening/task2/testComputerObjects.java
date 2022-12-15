package week_12.evening.task2;

public class testComputerObjects {

    public static void main(String[] args) {

        Asus asus = new Asus(512);
        System.out.println(asus);

        asus.openEdge();
        asus.shutdown();
        asus.start();
        asus.info();
        System.out.println("------------------------------");
        Mac mac = new Mac(512);
        System.out.println(mac);
        mac.info();
        mac.start();
        mac.shutdown();
    }
}
