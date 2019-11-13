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
public class Siswa extends Orang{
    private String idSiswa;
    private String namaSiswa;
    private String jurusan;
    private int tahunMasuk;
    private static int sid = 1;

    public Siswa(String namaSiswa, String jurusan, int tahunMasuk) {
        setIdSiswa("S-"+sid);
        sid++;
        setNamaSiswa(namaSiswa);
        setJurusan(jurusan);
        setTahunMasuk(tahunMasuk);
    }

    public String getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(String idSiswa) {
        this.idSiswa = idSiswa;
    }

    public String getNamaSiswa() {
        return namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
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
