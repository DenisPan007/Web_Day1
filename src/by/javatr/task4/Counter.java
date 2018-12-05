package by.javatr.task4;

public class Counter {
    public static int sum(int[] args){
        int sum = 0;
        for (int element: args) {
            sum += element;
        }
        return sum;
    }
    public static  int[] elementsMultiplyOfNumber(int[] args, int number){
        int counter = 0;
        for (int element: args) {
            if (element % number == 0) {
                counter++;
            }
        }
        int[] resultArr = new int[counter];
        int i = 0;
        int j = 0;
        while (i < args.length){
            if (args[i] % number == 0) {
                resultArr[j] = args[i];
                j++;
            }
            i++;
        }
        return resultArr;
    }
    public static int sumOfElementsMultiplyOfNumber(int[] args, int number){
        return sum(elementsMultiplyOfNumber(args, number));
    }
}
