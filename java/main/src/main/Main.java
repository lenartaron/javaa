/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.*;

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
        RandomAccessFile raf;
    String sor;
    String[] nevek = new String[6];
 
    try
    {
      raf = new RandomAccessFile("nevek.txt","r");
       int db = 0;
      sor = raf.readLine();
 
      while( sor != null )
      {
        nevek[db] = sor;
        db++;
        sor = raf.readLine();
      }
 
      raf.close();
    }
    catch( IOException e )
    {
      System.err.println("HIBA");
      
    }
    
    for( String str : nevek )
    {
      System.out.println(str);
    }
    } 
}
    
