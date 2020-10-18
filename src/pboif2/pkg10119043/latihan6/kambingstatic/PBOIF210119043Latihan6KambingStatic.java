/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan6.kambingstatic;

/**
 *
 * @author 
 * NAMA : FERMI NAUFAL AKBAR
 * KELAS     : IF2 
 * NIM       : 10119043 
 * DESKRIPSI : Program ini berisi program dengan variabel static
 */

public class PBOIF210119043Latihan6KambingStatic {

    /**
     * @param args the command line arguments
     */
    public static final String  NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing =485000;
        System.out.println(NAMA_KAMBING + " memiliki sebanyak " + Mamalia.jumlahKambing + " kambing");
    }
    
}
