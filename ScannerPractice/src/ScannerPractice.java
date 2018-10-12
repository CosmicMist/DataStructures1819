import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerPractice {

    static Scanner sc = null;
    public static void main(String[] args) {
        try {
            System.out.println( getFavFood() );
        }
        catch ( Exception e ) {
            System.out.println( e );
        }
        finally {
            if ( sc != null ) {
                sc.close();
            }
        }
    }
    
    public static String getFavFood() {
        File f = new File( "./src/foods.txt" );
        try {
            sc = new Scanner( f );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String favFood = sc.nextLine();
        int amount = sc.nextInt();
        double liking = sc.nextDouble();
        sc.nextLine();
        System.out.println( liking + " " + amount );
//        while ( sc.hasNext() ) {
//            if ( sc.nextDouble() > liking ) {
//                favFood = sc.nextLine();
//                amount = sc.nextInt();
//                liking = sc.nextDouble();
//            }
//        }
        return favFood;
    }
}
