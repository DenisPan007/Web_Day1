package by.javatr.task5;

public class Main {
    public static void main(String[] args) {
        String str1 = "String1";
        String str2 = "String2";
        String str3 = "";
        String str4 = "String1";
        String str5 = "STring1";
        System.out.println("length of " + '"'+ str1 +'"' + "is " + str1.length());
        System.out.println("" + str1.isEmpty() + "  " + str3.isEmpty());
        System.out.println("String1[3] is " + str1.charAt(3));
        System.out.println("" + str1.equals(str2) + "  " + str1.equals(str4) );
        System.out.println("" + str1.equals(str5) + "  " + str1.equalsIgnoreCase(str5) );
    }

}
