/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0228offline;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Main {
    
    public static boolean mellett(int[][] szamok) {
        System.out.println();
        int i = 0;
        int j = 0;
        while (i < szamok.length) {
            j = 0;
            while (j < szamok.length - 1) {
                if (szamok[i][j] == szamok[i][j + 1]) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
    
    public static int[][] osszead(int[][] szamok, int[][] numbers) {
        System.out.println();
        System.out.println();
        int i, j;
        int [][] nums = new int[5][5];
        for (i = 0; i < szamok.length; i++) {
            for (j = 0; j < szamok.length; j++) {
                nums[i][j] = szamok[i][j] + numbers[i][j];
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        return nums;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] szamok = new int[5][5];
        Random random = new Random();
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                int szam = random.nextInt(69-10)+10;
                szamok[i][j] = szam;
                System.out.print(szamok[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (i = 0; i < szamok.length; i++) {
            int max = szamok[i][0];
            for (j = 0; j < szamok.length; j++) {
                if (max < szamok[i][j]) {
                    max = szamok[i][j];
                }  
            }
            System.out.print(max +  " ");
        }
        System.out.println();
        for (j = 0; j < szamok.length; j++) {
            int min = szamok[0][j];
            for (i = 0; i < szamok.length; i++) {
                if (min > szamok[i][j]) {
                    min = szamok[i][j];
                }  
            }
            System.out.print(min +  " ");
        }
        System.out.println();
        System.out.println();
        int[][] numbers = new int[5][5];
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                int szam = random.nextInt(100-10)+10;
                numbers[i][j] = szam;
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (i = 0; i < szamok.length; i++) {
            for (j = 0; j < szamok.length; j++) {
                float hanyados = (float)szamok[i][j] / (float)numbers[i][j];
                System.out.print(hanyados + " ");
            }
            System.out.println();
        }
        System.out.println(mellett(szamok));
    }
    
}
