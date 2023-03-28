/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusgyak2;


/**
 *
 * @author user3
 */
public class Metodusgyak2 {
    public static boolean kozeppont(int a, int b, int c) {
        int a2 = a;
        int b2 = b;
        int legkisebb = a;
        a = 0;
        if (legkisebb > b) {
            legkisebb = b;
            b = 0;
            a = a2;
        }
        if (legkisebb > c) {
            legkisebb = c;
            a = a2;
            b = b2;
            c = 0;
        }
        int legnagyobb = a;
        a = 0;
        if (legnagyobb < b) {
            legnagyobb = b;
            a = a2;
            b = 0;
        } 
        if (legnagyobb < c) {
            legnagyobb = c;
            a = a2;
            b = b2;
            c = 0;
        }
        System.out.println(legnagyobb);
        System.out.println(legkisebb);
        int egyutt = legnagyobb + legkisebb;
        System.out.println(egyutt);
        if (c != 0) {
            if (egyutt % c == 0) {
                return true;
            }
        } else if (b != 0) {
            if (egyutt % b == 0) {
                return true;
            }
        } else if (b != 0) {
            if (egyutt % b == 0) {
                return true;
            }
        }
        return false;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 9;
        System.out.println(kozeppont(a, b, c));
    }
    
}
