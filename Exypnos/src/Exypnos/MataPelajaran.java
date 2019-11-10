package Exypnos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MataPelajaran {
    private String namaMapel;
    private int jmlBab;
    private int KKM;

    public MataPelajaran(String namaMapel, int jmlBab, int KKM) {
        setNamaMapel(namaMapel);
        this.jmlBab = jmlBab;
        this.KKM = KKM;
    }

    public String getNamaMapel() {
        return namaMapel;
    }

    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }

    public int getJmlBab() {
        return jmlBab;
    }

    public void setJmlBab(int jmlBab) {
        this.jmlBab = jmlBab;
    }

    public int getKKM() {
        return KKM;
    }

    public void setKKM(int KKM) {
        this.KKM = KKM;
    }
    
}
