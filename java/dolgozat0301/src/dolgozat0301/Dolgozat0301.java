/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolgozat0301;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Dolgozat0301 {
    
    
    //1.feladat
    public static String kulonbseg(int[][] szamok) {
        int i, j;
        int max = 0;
        int min = 40;
        System.out.println();
        for (i = 0; i < szamok.length; i++) {
            max = 0;
            min = 40;
            for (j = 0; j < szamok[i].length; j++) {
                if (max < szamok[i][j]) {
                    max = szamok[i][j];
                }
                if (min > szamok[i][j]) {
                    min = szamok[i][j];
                } 
            }
            int ertek = max - min;
            int hely = i+1;
            System.out.println("A(z) " + hely + ".sorban a különbség: " + ertek);
        }
        System.out.println();
        return null;
    }
    
    //2.feladat
    public static boolean paratlan(int[][] szamok) {
        int i, j;
        for (i = 0; i < szamok.length; i++) {
            for (j = 0; j < szamok[i].length; j++) {
                if (szamok[i][j] % 2 != 0) {
                    System.out.println("A mátrixban van páratlan szám.");
                    return true;    
                }
            }
        }
        return false;
    }
    
    //3.feladat
    public static String vane(int[][] szamok) {
        int i, j;
        for (i = 0; i < szamok.length; i++) {
            for (j = 0; j < szamok[i].length; j++) {
                if (szamok[i][j] % 2 != 0) {
                    i++;
                    j++;
                    System.out.println("Az első páratlan szám helye a(z) " + i + ".sor " + j + ".oszlop");
                    return "---------------------";
                }
            }
        }
        System.out.println("Nincs a mátrixban páratlan szám");
        return "---------------------";
    }
    
    public static boolean primes(int[][] szamok) {
        for (int i = 0; i < szamok.length; i++) {
            for ( int j = 0; j < szamok[0].length; j++) {
                if (prime(szamok[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean prime(int number) {
        for (int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    

    /**
     * @param args the command line arguments
     */
    
    //0.feladat
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] szamok = new int[4][4];
        Random random = new Random();
        int i, j;
        for (i = 0; i < szamok.length; i++) {
            for (j = 0; j < szamok[i].length; j++) {
                int szam = random.nextInt(30-10)+10;
                szamok[i][j] = szam;
                System.out.print(szamok[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(kulonbseg(szamok));
        System.out.println(paratlan(szamok));
        System.out.println(vane(szamok));
        
        
    }
    
}
