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

    public Kelas(MataPelajaran mapel, String namaKelas) {
        setNamaKelas(namaKelas);
        this.listSiswa = new ArrayList<>();
        this.listMateri = new ArrayList<>();
        this.mapel = mapel;
    }

    public MataPelajaran getMapel() {
        return mapel;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public void addSiswa(Siswa siswa) {
        listSiswa.add(siswa);
    }

    public void addMapel(MataPelajaran mapel) {
        this.mapel = mapel;
    }

    public void createMateri(String namaMateri, int bab) {
        Materi materi = new Materi(namaMateri, bab);
        listMateri.add(materi);
    }

    public Siswa getSiswa(int x) {
        return listSiswa.get(x);
    }

    public Materi getMateri(int x) {
        return listMateri.get(x);
    }

    public Siswa searchSiswa(String id) {
        int i = 0;
        while (i < listSiswa.size()) {
            if (!listSiswa.get(i).getIdSiswa().equals(id)) {
                i++;
            } else {
                return listSiswa.get(i);
            }
        }
        return null;
    }

    public Materi searchMateri(String namaMateri) {
        int i = 0;
        while (i < listMateri.size()) {
            if (!listMateri.get(i).getNamaMateri().equals(namaMateri)) {
                i++;
            } else {
                return listMateri.get(i);
            }
        }
        return null;
    }

    public int getListSiswaSize() {
        return listSiswa.size();
    }

    public int getListMateriSize() {
        return listMateri.size();
    }

    public void removeMateri(String namaMateri) {
        Materi m1 = searchMateri(namaMateri);
        listMateri.remove(m1);
    }
}
