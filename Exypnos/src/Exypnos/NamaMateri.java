/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exypnos;

/**
 *
 * @author Afif Raihan
 */
public class NamaMateri {
    private String namaMateri;
    private int posisiMateri;

    public NamaMateri(String namaMateri, int posisiMateri) {
        this.namaMateri = namaMateri;
        this.posisiMateri = posisiMateri;
    }
    

    public String getNamaMateri() {
        return namaMateri;
    }

    public void setNamaMateri(String namaMateri) {
        this.namaMateri = namaMateri;
    }

    public int getPosisiMateri() {
        return posisiMateri;
    }

    public void setPosisiMateri(int posisiMateri) {
        this.posisiMateri = posisiMateri;
    }
    
    
    
}
