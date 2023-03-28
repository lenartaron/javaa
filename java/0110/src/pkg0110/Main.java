/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0110;

import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<>();
        String nyers = "0-0-200-548-20-0-0-0-310-980-1280-650-102-0-0-45-0-21-65-0-0";
        String[] spl = nyers.split("-");
        for (String i : spl) {
            int szam = Integer.valueOf(i);
            list.add(szam);
        }
        int db = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > 0 && list.get(i-1) == 0) {
                db++; 
            }
        }
        int max = 0;
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        var volgy = false;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i-1) && list.get(i-2) > list.get(i-1) && list.get(i-1) != 0) {
                volgy = true;
            }       
        }
        int elsosziget = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > 0 && list.get(i-1) == 0) {
                elsosziget = i;
                break;
            }
        }
        int hossz = 0;
        int maxhossz = 0;
        int jobb = 0;
        int bal = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > 0) {
                maxhossz++;
                if (hossz < maxhossz) {
                    hossz = maxhossz;
                    if (list.get(i) > 0 && list.get(i+1) == 0) {
                        jobb = list.get(i);
                        bal = list.get(i-hossz+1);
                    }
                }
            }
            if (list.get(i) == 0) {
                maxhossz = 0;
            }
        }
        
        System.out.println(list);
        System.out.println("Szigetek száma:" + db); 
        System.out.println("Legmagasabb pont:" + max);
        System.out.println("Völgyek:" + volgy);
        System.out.println("Az első sziget egység száma:" + elsosziget);
        System.out.println("Leghosszabb sziget hossza:" + hossz);
        System.out.println("Leghosszabb sziget bal- és jobb oldala:" + bal + ";" + jobb);
    } 
    
}
