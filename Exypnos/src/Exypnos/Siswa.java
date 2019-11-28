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
public class Siswa extends Orang {


    private String jurusan;
    private int tahunMasuk;
    private static int sid = 1;

    public Siswa(String namaSiswa, String jurusan, int tahunMasuk) {
        super(namaSiswa,"S-" + sid);
        sid++;
        setJurusan(jurusan);
        setTahunMasuk(tahunMasuk);
    }

    public String getIdSiswa() {
        return super.getId();
    }

    public String getNamaSiswa() {
        return super.getNama();
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

}
