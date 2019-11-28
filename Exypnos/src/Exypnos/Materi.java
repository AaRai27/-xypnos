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
public class Materi {

    private String namaMateri;
    private int jmlBahasan;

    public Materi(String namaMateri, int jmlBahasan) {
        this.namaMateri = namaMateri;
        this.jmlBahasan = jmlBahasan;
    }

    public String getNamaMateri() {
        return namaMateri;
    }

    public void setNamaMateri(String namaMateri) {
        this.namaMateri = namaMateri;
    }

    public int getJmlBahasan() {
        return jmlBahasan;
    }

    public void setJmlBahasan(int jmlBahasan) {
        this.jmlBahasan = jmlBahasan;
    }

}
