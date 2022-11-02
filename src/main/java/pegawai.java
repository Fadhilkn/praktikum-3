/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class pegawai {
    private String nama;
    private double gajihpokok;
    
    public void setNama(String Nama){
        this.nama = Nama;
    }
    
    public String getnama(){
        return this.nama;
    }
    public void setgajipokok(double gajipokok){
        this.gajihpokok = gajipokok;
    }
    public double getgajipokok(){
        return this.gajihpokok;
    }
    
    public void cetakinfo(){
        System.out.println("nama = " + getnama());
        System.out.println("Gaji Pokok = " + getgajipokok());
        
    }

 
}
