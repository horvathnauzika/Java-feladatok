
package feladatok;

import java.util.Random;
import java.util.Scanner;


public class Feladatok {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // 1. feladat
        Random random = new Random();
        int also = 3;
        int felso = 10;
        int randomSzam = random.nextInt(felso-also)+also;
        System.out.println("Random szám 3 és 10 között: " + randomSzam);
        
        // 2. feladat
        System.out.print("Írj be egy betűt: ");
        String betu = sc.nextLine();
        System.out.println("A beírt betű: " + betu);
    }
    
}
