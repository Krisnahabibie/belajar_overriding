/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding_selasa;

/**
 *
 * @author krisn
 */
public class cicak extends hewan{
     @Override
     public void makan(){
         super.makan();
        System.out.println("cicak makan laron");
        
    }
     @Override
    public void berkembangbiak(){
        super.berkembangbiak();
        System.out.println("cicak bertelur");
        
    }
}
