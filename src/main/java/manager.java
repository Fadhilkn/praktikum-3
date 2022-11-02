/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class manager extends pegawai {
    private double Tunjangan;
    
    
    
    public void setTunjangan(double tunjangan){
        this.Tunjangan = tunjangan;
    }
    public double getTunjangan(){
        return this.Tunjangan;
    }
    
    public void cetakinfo(){
        super.cetakinfo();
        System.out.println("Tunjangan = " + getTunjangan());
    }
    
}
