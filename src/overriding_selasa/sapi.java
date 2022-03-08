/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding_selasa;

/**
 *
 * @author krisn
 */
public class sapi extends hewan {
    @Override
    public void makan(){
        super.makan();
        System.out.println("sapi makan rumput");
       
    }
    @Override
    public void berkembangbiak(){
        super.berkembangbiak();
        System.out.println("sapi beranak");
        
    }
}
