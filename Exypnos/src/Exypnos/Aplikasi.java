package Exypnos;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Afif Raihan
 */
public class Aplikasi {

    List<Siswa> daftarSiswa = new ArrayList<>();
    List<Tentor> daftarTentor = new ArrayList<>();
    List<MataPelajaran> daftarMapel = new ArrayList<>();

    public Siswa searchSiswa(String id, List<Siswa> daftarSiswa) {
        int i = 0;
        while (i < daftarSiswa.size()) {
            if (!daftarSiswa.get(i).getIdSiswa().equals(id)) {
                i++;
            } else {
                return daftarSiswa.get(i);
            }
        }
        return null;
    }

    public void tampilkanSearchSiswa(String id, List<Siswa> daftarSiswa) {
        if (searchSiswa(id, daftarSiswa) == null) {
            System.out.println("data tidak ditemukan");
        } else {
            System.out.println("Nama : " + searchSiswa(id, daftarSiswa).getNamaSiswa());
            System.out.println("Jurusan : " + searchSiswa(id, daftarSiswa).getJurusan());
            System.out.println("Tahun Masuk : " + searchSiswa(id, daftarSiswa).getTahunMasuk());
        }
    }

    public Tentor searchTentor(String id, List<Tentor> daftarTentor) {
        int i = 0;
        while (i < daftarTentor.size()) {
            if (!daftarTentor.get(i).getIdTentor().equals(id)) {
                i++;
            } else {
                return daftarTentor.get(i);
            }
        }
        return null;
    }

    public void tampilkanSearchTentor(String id, List<Tentor> daftarTentor) {
        if (searchTentor(id, daftarTentor) == null) {
            System.out.println("data tidak ditemukan");
        } else {
            System.out.println("Nama : " + searchTentor(id, daftarTentor).getNamaTentor());
            System.out.println("Kelas : ");
            for (int i = 0; i < daftarTentor.size(); i++) {
                System.out.println("\n" + i + 1 + ") " + searchTentor(id, daftarTentor).getKelas(i));
            }
        }

    }
    
    public void inputKelasToTentor(String id, MataPelajaran mapel, String namaKelas ){
        Tentor t1 = searchTentor(id, daftarTentor);
        if(t1 != null){
            t1.createKelas(namaKelas, mapel);
        }
        
    }

    public void inputTentor(String namaTentor) { 
            Tentor t1 = new Tentor(namaTentor);
            daftarTentor.add(t1);
    }

}
