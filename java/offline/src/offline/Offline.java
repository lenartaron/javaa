/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Offline {
    
    public static int prim(int num) {
        int nume = 0;
        if (num % num == 0 && num % 1 == 0 && num % 2 != 0 && num % 3 != 0){
            System.out.println("A(z) " + num + " prímszám");
        }
        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bill = new Scanner(System.in);
        int num1 = 1;
        int num = 0;
        while (num1 != 0) {
            num = num1;
            System.out.println("Adjon meg egy egész számot");
            num1 = bill.nextInt();           
        }
        prim(num);
        
    }
    
}
