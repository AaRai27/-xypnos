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
    
     public String searchSiswa(String id,List<Siswa> daftarSiswa) {
        int i =0;
        while(daftarSiswa.get(i).getIdSiswa() != id){
            i++;
        }
        return id;
    }
    
    
    public static void main(String[] args) {
        Scanner pilihan = new Scanner(System.in);
        List<Siswa> daftarSiswa = new ArrayList<>();
        List<Tentor> daftarTentor = new ArrayList<>();
        List<MataPelajaran> daftarMapel = new ArrayList<>();
        int input = 1;
        while (input != 0) {
            System.out.println("Pilihan Menu:");
            System.out.println("1. Create Siswa");
            System.out.println("2. Create Mata Kuliah");
            System.out.print("Pilihan Anda : ");
            input = pilihan.nextInt();
            switch (input) {
                case 1: {
                    System.out.print("Masukkan nama siswa : ");
                    String Nama = pilihan.next();
                    System.out.print("Masukkan Jurusan siswa : ");
                    String jurusan = pilihan.next();
                    System.out.print("Masukkan Tahun Masuk siswa : ");
                    int tahunMasuk = pilihan.nextInt();
                    Siswa s1 = new Siswa(Nama, jurusan, tahunMasuk);
                    daftarSiswa.add(s1);
//                System.out.println("Berhasil id: "+s1.getIdSiswa());
                    System.out.println();
                }
            }            
        }
        for (int i = 0; i < daftarSiswa.size(); i++) {
            System.out.println(i + 1 + ". " + daftarSiswa.get(i).getNamaSiswa());
        }
        
        System.out.print("Masukan ID yang dicari : ");
        String id = pilihan.next();
        String cari = searchSiswa(id, daftarSiswa);
        System.out.println();
        
    

//        Siswa s1 = new Siswa("1301184", "Jokodok", "Teknik_pencitraan", 1647);
//        Siswa s2 = new Siswa("1301234", "Praproro", "Teknik_uang", 1947);
//        Siswa s3 = new Siswa("1301432", "Moeldoko", "Teknik_aniyaya", 2647);
//        MataPelajaran m1 = new MataPelajaran("kalkulus", 5, 68);
//        MataPelajaran m2 = new MataPelajaran("Probstats", 7, 56);
//        Kelas k1 = new Kelas("IF-42-04", m1);
//        Kelas k2 = new Kelas("IF-42-03", m2);
//        k1.addSiswa(s1);
//        k1.addSiswa(s2);
//        k2.addSiswa(s3);
//        k1.createMateri("Limit", 3);
//        System.out.println(k1.getSiswa(1).getNamaSiswa());
//        System.out.println(k1.getSiswa(1).getJurusan());   
    }
    
   
}
