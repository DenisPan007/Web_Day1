package by.javatr.task4;

public class Generator {
    public static int[] generate(int size){
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = (int)(Math.random()*30);
        }
        return result;
    }
}
