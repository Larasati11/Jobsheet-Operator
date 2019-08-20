/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
import java.util.Scanner;
public class KonversiSuhu {
   
    public static void main(String[] args) {
    // Deklarasi
    Double fahrenheit;
    int celcius;
    
    // Membuat scanner baru
    Scanner baca = new Scanner (System.in);
    
    // Input
    System.out.println("Suhu Celcius ke Fahrenheit");
    System.out.print("Celcius: ");
    celcius = baca.nextInt ();
    
    // Proses
    fahrenheit = Double.valueOf((celcius * 9 / 5) + 32);
    
    // Ouput
    System.out.println("F: " + fahrenheit)
            


}

        

