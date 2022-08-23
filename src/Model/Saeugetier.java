package Model;

abstract public class Saeugetier implements Lebewesen {
//Methoden
    @Override
    public void atmen() {
        System.out.println("Das Saeugetier atmet mit dem Mund");
    }
}
