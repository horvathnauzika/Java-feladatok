
package feladatok;

import java.util.Random;
import java.util.Scanner;


public class HorvathNauzika_osszefoglalo {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    
    public static void main(String[] args) {
        // 1. feladat
//        final int DB = 100;
//        int randomSzamok[] = new int[DB];
//        for (int i = 0; i<DB; i++){
//            randomSzamok[i] = random.nextInt(3,11);
//        }
//        for (int i = 0; i<DB; i++){
//            System.out.println(randomSzamok[i]);
//        }
        Random random = new Random();
        int also = 3;
        int felso = 10;
        int randomSzam = random.nextInt(felso-also)+also;
        System.out.println("Random szám 3 és 10 között: " + randomSzam);
        
        
        // 2. és 3. feladat
        System.out.print("Írj be egy betűt: ");
        String betu = sc.nextLine();
        while(betu.length() != 1){
            System.out.print("Csak egy db betűt lehet beírni, írj be egy újat: ");
            betu = sc.nextLine();
        }
        System.out.println("A beírt betű: " + betu);
        
        // 4. feladat
        for (int i = 0; i < randomSzam; i++){
            System.out.print(betu+", ");
        }
        
        // 5. feladat
        final int DB = 5;
        double[] tomb = new double[DB];
        tomb[0] = Math.PI;
        tomb[1] = Math.E;
        for(int i = 0; i<tomb.length; i++){
            System.out.printf("{%d. index}: %f\n", i, tomb[i]); 
        }
        //6. feladat
        tomb[2] = 1%3;
        for(int i = 0; i<tomb.length; i++){
            if (tomb[i] > 0){
                System.out.printf("{%d. index}: %f\n", i, tomb[i]);
            }
        }
        // 7. feladat
        //double alsoErtek = 10.1;
        //double felsoErtek = 19.5;
        //double rndSzam = random.nextDouble(felso-also)+also;
        tomb[3] = random.nextDouble(10.5,19.5);
        tomb[4] = random.nextDouble(10.5,19.5);
        for(int i = 0; i<tomb.length; i++){
            System.out.printf("{%d. index}: %f\n", i, tomb[i]);
        }
        
        
    }
    
}
