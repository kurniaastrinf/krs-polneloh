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
public class Matakuliah {
     private String namaMatakuliah;
    private int sks;
    private int semester;
    private Dosen pengampu;
    
    
    public  Matakuliah(int sks, String namaMatakuliah){
       this.namaMatakuliah = namaMatakuliah;
       this.sks = sks;
    }
    
    public void setNamaMtakuliah(String namaMatakuliah){
        this.namaMatakuliah = namaMatakuliah;
    }
    
    public String getNamaMatakuliah(){
        return namaMatakuliah;
    }
    
    public void setSks(int sks){
        this.sks = sks;
    }
    
    public int getSks(){
        return sks;
    }
    
    public void setSemester(int semester){
        this.semester = semester;
    }
    
    public int getSemester(){
        return semester;
    }
    
    public void setPengampu(Dosen pengampu){
        this.pengampu = pengampu;
    }
    
    public Dosen getPengampu(){
        return pengampu;
    }
    
    public void showMatakuliah(){
        System.out.println("kosong");
    }
}
