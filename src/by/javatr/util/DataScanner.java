package by.javatr.util;
import java.util.Scanner;

public class DataScanner {

    public static int intScan(){
        int scanResult;
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
        }
        scanResult = scan.nextInt();
        return scanResult;

    }
    public static double doubleScan(){
        double scanResult;
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextDouble()) {
            scan.next();
        }
        scanResult = scan.nextDouble();
        return scanResult;

    }
    public static String strIntScan(){
        String scanResult;
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
        }
        scanResult = scan.next();
        return scanResult;

    }
    public static String strScan(){
        String scanResult;
        Scanner scan = new Scanner(System.in);
        scanResult = scan.nextLine();
        return scanResult;

    }

}
