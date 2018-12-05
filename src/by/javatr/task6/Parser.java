package by.javatr.task6;

import java.util.ArrayList;
import java.util.Scanner;

public class Parser {
    public static int[] parseIntSeq(String arg){
        ArrayList<Integer> list = new ArrayList<Integer>();
        String element;
        Scanner scan = new Scanner(arg);
        while (scan.hasNext()){
             element = scan.next();
            list.add(Integer.parseInt(element));
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        return  result;
    }
}
