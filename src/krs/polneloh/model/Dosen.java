/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krs.polneloh.model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Dosen extends Person {
     private String nidn;
    private ArrayList<Matakuliah> listMatakuliahPengampu;
    private Matakuliah matakuliahPengampu;


public Dosen(String nama, String nidn){
    this.nidn = nidn;
    this.setNama(nama);
}
@Override
    public void showProfil(){
    }

public void lihatListMatakuliahPengampu(){
    System.out.println("Pengampu");
}

public void tambahMtakuliahPengampu(Matakuliah matakuliah){
    System.out.println("Mtakuliah");
}

public void setNidn(String nidn){
    this.nidn = nidn;
}

public String getNidn(){
    return nidn;
}
}
