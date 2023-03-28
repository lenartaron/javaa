/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0131;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Main {
    
    public static int reverses(int[][] szamok) {
        System.out.println("mátrix visszafele kiíratása");
        System.out.println("---------------------------");
        for (int i = 0; i < 4; i++) {
            for (int j =  szamok.length; j >= 0; j--) {
                System.out.print(szamok[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }
    
    public static int sums(int[][] szamok) {
        System.out.println("mátrix elemeinek összegének kiíratása");
        System.out.println("-------------------------------------");
        int sum = 0;
        for (int i = 0; i < szamok.length; i++) {
            for (int j = 0; j < szamok[i].length; j++) {
                sum = sum + szamok[i][j];
            }
        }
        return sum;
    }
    
    public static boolean paros(int[][] szamok) {
        System.out.println();
        System.out.println("mátrix elemeinek több mint a fele páros");
        System.out.println("---------------------------------------");
        int paros = 0;
        int pont = 0;
        for (int i = 0; i < szamok.length; i++) {
            for (int j = 0; j < szamok[i].length; j++) {
                if (szamok[i][j] % 2 == 0) {
                    paros++;
                }
                pont++;
            }
        }
        System.out.println(pont + " " + paros);
        if (pont / 2 < paros) {
            return true;
        } 
        else {
            return false;
        }
    }
    
    public static int doubles(int[][] szamok) {
        System.out.println();
        int [][] dupla = new int [4][5];
        for (int i = 0; i < szamok.length; i++) {
            for (int j = 0; j < szamok[i].length; j++) {
                dupla[i][j] = szamok[i][j] * 2;
            }
        }
        return 0;
    }
    
    public static int tomb() {
        int [][] szamok = new int[4][5];
        int i, j;
        Random random = new Random();
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                int szam = random.nextInt(10);
                szamok[i][j] = szam;
                System.out.print(szamok[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(reverses(szamok));
        System.out.print(sums(szamok));
        System.out.print(paros(szamok));
        System.out.print(doubles(szamok));
        return 0;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(tomb());
    }
}
