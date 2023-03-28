/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1214;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Main {
    
    public static boolean derekszoge(int a,int b,int c) {
       if(c*c == a*a + b*b) {
           return true;
       } else {
           return false;
       }      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bill = new Scanner(System.in);
        System.out.println("Adja meg a háromszög \"a\" oldalát: ");
        int a = bill.nextInt();
        System.out.println("Adja meg a háromszög \"b\" oldalát: ");
        int b = bill.nextInt();
        System.out.println("Adja meg a háromszög \"c\" oldalát: ");
        int c = bill.nextInt();
        System.out.println(derekszoge(a, b, c));
    }
    
}
