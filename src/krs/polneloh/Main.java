/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krs.polneloh;

import krs.polneloh.model.Mahasiswa;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args){
        Mahasiswa m = new Mahasiswa("190513", "astrin");
        System.out.println(m.getNim());
        System.out.println(m.getNama());
    }
}
