/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1209;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Main {
    public static double kamat(double alap, int ev, int kamatozas) {
        for (int i = 0; i < ev; i++) {
            double kamat = alap;
            kamat = (kamat / 100) * kamatozas;
            alap = alap + kamat;
        }
        return alap;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bill = new Scanner(System.in);
        System.out.println("Adja meg az összeget: ");
        double alap = bill.nextInt();
        System.out.println("Adja meg hány évig kamatozzon ");
        int ev = bill.nextInt();
        System.out.println("Adja meg hány zázalékot kamatozik: ");
        int kamatozas = bill.nextInt();
        System.out.println(kamat(alap, ev, kamatozas));
    }
    
}
