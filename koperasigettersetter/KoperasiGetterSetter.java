/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author PC
 */
public class KoperasiGetterSetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Anggota anggota1 = new Anggota("Nilam ", "Pulosari");
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp." + anggota1.getSimpanan());
        
        
        anggota1.setNama("Nilam Yuniari");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        
        anggota1.setor(1000000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp." + anggota1.getSimpanan());
        anggota1.pinjam(50000);
        
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp." + anggota1.getSimpanan());
    } 
}
