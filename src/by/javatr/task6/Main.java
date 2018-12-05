package by.javatr.task6;

import by.javatr.util.DataScanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите последовательность натуральных чисел");
        String seq = DataScanner.strScan();
        System.out.println(Checker.isGroving(Parser.parseIntSeq(seq)));

    }
}
