/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0117offline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Main {
    public static boolean emaile(String email) {
        for (int i = 0; i < email.length(); i++) {
            if (email.contains("@")) {
                return true;  
            }
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.feladat
        Scanner bill = new Scanner(System.in);
        System.out.println("Adja meg az e-mail címét: ");
        String email = bill.nextLine();
        System.out.println(emaile(email));
        
        //2.feladat
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int szam = (int)Math.floor(Math.random() * (20 - 10 + 1) +10);
            list.add(szam);
        }
        int hany = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1) < list.get(i)) {
                hany++;
            }
        }
        int novekvo = 0;
        System.out.println(list);
        System.out.println(hany);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i-1) < list.get(i)) {
                novekvo++;
            }
        }
        if (novekvo == list.size()) {
            System.out.println("Növekvő");
        } else {
            System.out.println("Nem növekvő");
        }
    }
    
}
