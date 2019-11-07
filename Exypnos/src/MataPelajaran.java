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
    private int jmlKD;
    private int KKM;

    public MataPelajaran(String namaMapel, int jmlKD, int KKM) {
        this.namaMapel = namaMapel;
        this.jmlKD = jmlKD;
        this.KKM = KKM;
    }

    public String getNamaMapel() {
        return namaMapel;
    }

    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }

    public int getJmlKD() {
        return jmlKD;
    }

    public void setJmlKD(int jmlKD) {
        this.jmlKD = jmlKD;
    }

    public int getKKM() {
        return KKM;
    }

    public void setKKM(int KKM) {
        this.KKM = KKM;
    }
    
}
