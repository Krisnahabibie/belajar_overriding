/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding_selasa;

/**
 *
 * @author krisn
 */
public class Overriding_selasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sapi itu = new sapi();
        cicak jika = new cicak();
        
        itu.makan();
        itu.berkembangbiak();
        System.out.println("===========================");
        jika.makan();
        jika.berkembangbiak();
    }
}