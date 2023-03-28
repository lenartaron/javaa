/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uuuuujjjjjjjjjjjjjjkmkj;

import java.io.*;

/**
 *
 * @author user3
 */
public class Uuuuujjjjjjjjjjjjjjkmkj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[6];
 
    try
    {
      raf = new RandomAccessFile("nevek.txt","r");
      raf.readLine();
      sor = raf.readLine();
      raf.close();
    }
    catch( IOException e )
    {
      System.err.println("HIBA");
      
    }
        
    }
    
}
