package by.javatr.task6;

public class Checker {
    public static boolean isGroving(int ... args){
        for(int i = 0; i < args.length -1; i++){
            if (args[i] > args[i+1]) {
                return false;
            }
        }
        return  true;
    }
}
