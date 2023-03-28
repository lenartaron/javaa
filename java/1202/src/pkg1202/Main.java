/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1202;

import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> tomb = new ArrayList<>();
        ArrayList<Integer> tomb2 = new ArrayList<>();
        tomb.add(5);
        tomb.add(10);
        tomb.add(8);
        tomb.add(2);
        tomb.add(12);
        tomb.add(91);
        tomb.add(61);
        tomb.add(56);
        int max = 0, max2 = 0, index = 1, meret = 0;
        for (int i = 0; i < tomb.size(); i++) {
            if (max < tomb.get(i)) {
                max = tomb.get(i);
            }
        }
        for (int i = 0; i < tomb.size(); i++) {
            if (max2 < tomb.get(i) && max != tomb.get(i)) {
                max2 = tomb.get(i);
            }
        }
        System.out.println(max2);
        tomb.add(index, max);
        System.out.println(tomb);
        
        
        tomb2.add(5);
        tomb2.add(10);
        tomb2.add(8);
        tomb2.add(2);
        tomb2.add(12);
        tomb2.add(91);
        tomb2.add(61);
        tomb2.add(56);
        if (tomb.size() == tomb2.size()) {
            for (int i = 0; i < tomb.size(); i++) {
                if (tomb.get(i) == tomb2.get(i)) {
                    meret++;
                }
            }
        }
        if (tomb.size() == meret) {
            System.out.println("Igaz");
        } else {
            System.out.println("Hamis");
        }
    }
    
}
