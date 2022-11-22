/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1122;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Main {
    public static int legkisebb() {
        Scanner bill = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Adjon meg egy számot: ");
            int szam = bill.nextInt();
            list.add(szam);
        }
        int minimum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (minimum > list.get(i)) {
                minimum = list.get(i);
            }
    }
        return minimum;
    }
    
    public static String kozepso(String szoveg) {
        int hossz = szoveg.length();
        if (hossz % 2 == 0) {
            hossz = hossz / 2;
            System.out.println(hossz);
            String szoveg1 = szoveg.substring((hossz-1), (hossz+1));
            return szoveg1;
        } else {
            hossz = hossz / 2;
            System.out.println(hossz);
            String szoveg1 = szoveg.substring(hossz, hossz+1);
            return szoveg1;
        }   
    }
    
    public static int szo(String szoveg1) {
        int szo = 0;
        String[] vag = szoveg1.split(" ");
        for (int i = 0; i < vag.length; i++) {           
            szo++;
        }
        return szo;       
    }
    
    public static char jelszo(String jelszo1) {
        if (jelszo1.length() < 10){
            
        } else {
            System.out.println("Érvénytelen jelszó");
        }
        return 0;
    }
    
    public static boolean novekvo(int szam1, int szam2, int szam3) {
        if (szam1 < szam2 && szam2 < szam3) {
            return true;
        }
        return false;
    }
    
    public static int tobbszame(int tobbszam) {
        int osszeg = 0;
        int eleje = 0;
        var elem = 0;
        String betuszam = String.valueOf(tobbszam);
        for (int i = 0; i < betuszam.length(); i++) {
            int betuszammasol = Integer.parseInt(betuszam);
            System.out.println(betuszammasol);
            eleje = betuszammasol;
            osszeg = osszeg + eleje;
            elem++;
        }
        return osszeg;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bill = new Scanner(System.in);
        System.out.println("legkisebb: " + legkisebb());
        
        System.out.println("Adjon meg egy szöveget: ");
        String szoveg = bill.nextLine();
        System.out.println(kozepso(szoveg));
        
        System.out.println("Adjon meg egy szöveget: ");
        String szoveg1 = bill.nextLine();
        System.out.println(szo(szoveg1));
        
        System.out.println("Adja meg a jelszavát: ");
        String jelszo1 = bill.nextLine();
        System.out.println(jelszo(jelszo1));
        
        System.out.println("Adja meg az első számot: ");
        int szam1 = bill.nextInt();
        System.out.println("Adja meg a második számot: ");
        int szam2 = bill.nextInt();
        System.out.println("Adja meg a harmadik számot: ");
        int szam3 = bill.nextInt();
        System.out.println(novekvo(szam1, szam2, szam3));
        
        System.out.println("Adjon meg egy számot: ");
        int tobbszam = bill.nextInt();
        System.out.println(tobbszame(tobbszam));
    
    }
}