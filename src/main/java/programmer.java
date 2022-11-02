/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class programmer extends pegawai {
    private double Bonus;
    
    
    public void setBonus(double bonus){
        this.Bonus = bonus;
    }
    public double getBonus(){
        return this.Bonus;
    }
    
    public void cetakinfo(){
        super.cetakinfo();
        System.out.println("Bonus = " + getBonus());
    }
}
