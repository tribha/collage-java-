public class Abstraction2 extends Abstraction {
    void start() {
        System.out.println("the car is started");
    }
    void disp() {
        System.out.println("abstraction is used");
    }
    public static void main(String[] args) {
        Abstraction2 obj = new Abstraction2();
        obj.start();
        obj.display();
        obj.disp();
    }
}