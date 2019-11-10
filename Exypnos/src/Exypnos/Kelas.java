package Exypnos;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Kelas {
    private String namaKelas;
    private List<Siswa> listSiswa;
    private List<Materi> listMateri;
    private MataPelajaran mapel;
    private Materi materi;
//    private int numOfSiswa = 0;
//    private int numOfMateri = 0;
    

    public Kelas(String namaKelas, MataPelajaran mapel) {
        setNamaKelas(namaKelas);
        this.listSiswa = new ArrayList<>();
        this.listMateri = new ArrayList<>();
        this.mapel = mapel;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public void addSiswa(Siswa siswa){
        listSiswa.add(siswa);
    }
    
//    public void addMapel(MataPelajaran mapel){
//        listMapel.add(Mapel);
//    }
    
    public void createMateri(String namaMateri, int bab){
        Materi materi = new Materi(namaMateri, bab);
        listMateri.add(materi);
    }
    
    public Siswa getSiswa(int x){
        return listSiswa.get(x);
    }
    
    
}
