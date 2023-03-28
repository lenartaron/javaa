/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixtomb;

/**
 *
 * @author user3
 */
public class Matrixtomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 2D tömb (mátrix) inicializálás
        int [][] szamok = {{2,9,7}, {1,0,3} };
        int i, j;
        
        // 2D tömb bejárása
        System.out.println(szamok.length); //mátrix mérete
        i = 0;
        System.out.println(szamok[i].length); //sor mérete
        
        for (i = 0; i < szamok.length; i++) {
            for (j = 0; j < szamok[i].length; j++) {
                System.out.print(szamok[i][j] + " ");
            }
            System.out.println();
        }
        //2. sor bejárása
        for (j = 0; j < szamok[1].length; j++) {
            System.out.print(szamok[1][j] + " ");
        }
        System.out.println();
        
        //2. oszlop bejárása
        for (i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i][1] + " ");
        }
        System.out.println();
        
        //tömb elemeinek összege
        int osszeg = 0;
        for (i = 0; i < szamok.length; i++) {
            for (j = 0; j < szamok[i].length; j++) {
                osszeg = osszeg + szamok[i][j];
            }
        }
        System.out.println(osszeg);
        
        //tömb sorainak összege
        for (i = 0; i < szamok.length; i++) {
            int osszeg1 = 0;
            for (j = 0; j < szamok[i].length; j++) {
                osszeg1 = osszeg1 + szamok[i][j];
            }
            System.out.print(osszeg1 + " ");
        }
        System.out.println();
        
        
        //hány darab páros szám van a tömbben
        int parasdb = 0;
        for (i = 0; i < szamok.length; i++) {
            for (j = 0; j < szamok[i].length; j++) {
                if (szamok[i][j] % 2 == 0) {
                    parasdb++;
                }
            }
        }
        System.out.println(parasdb);
        System.out.println();
        
        
        //hány darab páros szám van soronként
        for (i = 0; i < szamok.length; i++) {
            int sorparas = 0;
            for (j = 0; j < szamok[i].length; j++) {
                if (szamok[i][j] % 2 == 0) {
                    sorparas++;
                }
            }
            System.out.print(sorparas + " ");
        }
        System.out.println();
        
        
        //sorok szerinti kiíratás
        for (j = 0; j < szamok[0].length; j++) {
            for (i = 0; i < szamok.length; i++) {
                System.out.print(szamok[i][j] + " ");
            }
        }
        System.out.println();
        
        //összeg oszlopok
        for (j = 0; j < szamok[0].length; j++) {
            osszeg = 0;
            for (i = 0; i < szamok.length; i++) {
                osszeg = osszeg + szamok[i][j];
            }
            System.out.print(osszeg + " ");
        }
        
        
    }
    
}
