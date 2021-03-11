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
public abstract class Person {
    private  String nama;
    
    public abstract void showProfil();
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
}
