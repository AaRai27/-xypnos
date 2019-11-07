/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Materi {
    private String namaMateri;
    private int jmlBab;

    public Materi(String namaMateri, int jmlBab) {
        this.namaMateri = namaMateri;
        this.jmlBab = jmlBab;
    }

    public String getNamaMateri() {
        return namaMateri;
    }

    public void setNamaMateri(String namaMateri) {
        this.namaMateri = namaMateri;
    }

    public int getBab() {
        return jmlBab;
    }

    public void setBab(int jmlBab) {
        this.jmlBab = jmlBab;
    }
    
    
            
}
