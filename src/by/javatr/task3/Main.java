package by.javatr.task3;
import by.javatr.util.DataScanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите последовательно 2 катета");
        double leg1 = DataScanner.doubleScan();
        double leg2 = DataScanner.doubleScan();
        double sqr = Counter.sqr(leg1, leg2);
        double hypo = Counter.hypo(leg1, leg2);
        System.out.printf("sqr: %.2f %nhypo: %.2f %n", sqr, hypo);
    }
}
