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
public class KRS {
    private String noKrs;
    private ArrayList<Matakuliah> paketMatakuliah;
    
    public void tambahMatakuliahKRS(Matakuliah matakuliah){
        
    }
    public void setnoKrs(String noKrs){
        this.noKrs = noKrs;
    }
    public String getnoKrs(){
        return noKrs;
    }
}
