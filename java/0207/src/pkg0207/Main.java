/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0207;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Main {
    
    public static int foatlo(int [][] tomb) {
        int i, j;
        int osszeg = 0;
        for (i = 0; i < tomb.length; i++) {
            for (j = 0; j < tomb[i].length; j++) {
                if (j == i) {
                    System.out.print(tomb[i][j] + " ");
                    osszeg = osszeg + tomb[i][j];
                }
            }
        }
        System.out.println();
        return osszeg;
    }
    
    public static int felcserel(int [][] tomb, int oszlop1, int oszlop2, int sor1, int sor2) {
        int copy = tomb[sor1][oszlop1];
        tomb[sor1][oszlop1] = tomb[sor2][oszlop2];
        tomb[sor2][oszlop2] = copy;
        return 0;
    }
    
    public static boolean osszehasonlitas(int[][] tomb2, int[][] tomb1) {
        int j, i = 0;
        if (tomb1.length == tomb2.length && tomb1[i].length == tomb2[i].length) {
            for (i = 0; i < tomb1.length; i++) {
                for (j = 0; j < tomb1[i].length; j++) {
                    if (tomb1[i][j] != tomb2[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    
    
    public static int[][] doubles(int[][] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            for (int j =  0; j < tomb[i].length; j++) {
                tomb[i][j] = tomb[i][j] * 2;
            }
        }
        return tomb;
    }
    
    public static int[][] reverses(int[][] tomb3) {
        int i, j = 0;
        for (i = tomb3[j].length; i >= 0 ; i--) {
            for (j = tomb3.length; j >= 0; j--) {
                System.out.print(tomb3[i][j] + " ");
            }
            System.out.println();
        }
        return tomb3;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] tomb = {{2, 9, 0, 7, 12}, {1, 0, 10, 9, 9}, {8, 7, 3, 2, 0}, {14, 0, 5, 6, 12}, {8, 4, 4, 10, 1}};
        int [][] tomb1 = {{1, 9, 0, 7, 12}, {2, 0, 10, 6, 9}};
        int [][] tomb2 = {{1, 9, 0, 7, 12}, {2, 0, 10, 6, 9}};
        int [][] tomb3 = {{1, 9, 0, 7, 12}, {2, 0, 10, 6, 9}};
        System.out.println(foatlo(tomb));
        System.out.println("-----------------------------");
        Scanner bill = new Scanner(System.in);
        System.out.println("Ki cserélendő szám oszlopa: ");
        int oszlop1 = bill.nextInt();
        System.out.println("Ki cserélendő szám sora: ");
        int sor1 = bill.nextInt();
        System.out.println("Ki cserélendő szám sora: ");
        int sor2 = bill.nextInt();
        System.out.println("Ki cserélendő szám oszlopa: ");
        int oszlop2 = bill.nextInt();
        System.out.println(felcserel(tomb, oszlop1, oszlop2, sor1, sor2));
        System.out.println("-----------------------------");
        System.out.println(osszehasonlitas(tomb1, tomb2));
        System.out.println(doubles(tomb));
        System.out.println(reverses(tomb3));
    }
    
}
