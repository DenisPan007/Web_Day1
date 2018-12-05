package by.javatr.task4;


import by.javatr.util.DataScanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер случайно сгенерированного массива натуральных числе");
        int size = DataScanner.intScan();
        System.out.println("Введите кратность");
        int k = DataScanner.intScan();
        int[] arr= Generator.generate(size);
        int sum = Counter.sumOfElementsMultiplyOfNumber(arr,k);
        System.out.println("исходный массив: ");
        for (int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println("\n" + "сумма кратных заданному числу: " + sum);
    }
}
