/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krs.polneloh.model;

/**
 *
 * @author DELL
 */
public class Mahasiswa extends Person{
    private String nim;
    private KRS krs;
    
    public Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.setNama(nama);
    }   
    @Override
    public void showProfil(){
    }
 
        
        public void setNim(String nim){
            //kasus 1 ketika inputan harus angka
           // String input =nim;
            //if (input.matches("[0-9]*") == false){
              //  System.out.println("Inputan harus angka!!");
                //return;
           // }else{
             //   System.out.println("Inputan menggunakan angka");
            //}
            
            //kasus 2 ketika inputan harus 7 karakter
           // //if(nim.length() ! = 7){
            //System.out.println("panjang karakter nim tidak valid!!");
            //return;
        //}
            this.nim = nim;
        }
        
       
        public String getNim(){
            return this.nim;
        }
        
        public void pilihPaketKRS(KRS krs){
            System.out.println("Paket KRS");
        }
        
        public KRS getKRS(){
            return krs;
        }

}
