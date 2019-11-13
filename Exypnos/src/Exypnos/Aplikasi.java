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
    
     static Siswa searchSiswa(String id,List<Siswa> daftarSiswa) {
        int i =0;
        while(i<daftarSiswa.size()){
            if(!daftarSiswa.get(i).getIdSiswa().equals(id)){
                i++;
            }else{
               return daftarSiswa.get(i); 
            }
        }
            return null;
    }
     
     static void tampilkanSearchSiswa(String id, List<Siswa> daftarSiswa){
        if (searchSiswa(id, daftarSiswa) == null) {
             System.out.println("data tidak ditemukan");
         }else{
        System.out.println("Nama : " + searchSiswa(id, daftarSiswa).getNamaSiswa());
        System.out.println("Jurusan : " + searchSiswa(id, daftarSiswa).getJurusan());
        System.out.println("Tahun Masuk : " + searchSiswa(id, daftarSiswa).getTahunMasuk());
         }
     }
    
    
    public static void main(String[] args) {
        Aplikasi bantuan = new Aplikasi();
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
                    String Nama = "boy";
                    System.out.print("Masukkan Jurusan siswa : ");
                    String jurusan = "ips";
                    System.out.print("Masukkan Tahun Masuk siswa : ");
                    int tahunMasuk = 2019;
                    Siswa s1 = new Siswa(Nama, jurusan, tahunMasuk);
                    daftarSiswa.add(s1);
                    
//                    System.out.print("Masukkan nama siswa : ");
                    Nama = "neng";
//                    System.out.print("Masukkan Jurusan siswa : ");
                    jurusan = "ips";
//                    System.out.print("Masukkan Tahun Masuk siswa : ");
//                    tahunMasuk = 2019;
                    Siswa s2 = new Siswa(Nama, jurusan, tahunMasuk);
                    daftarSiswa.add(s2);
                    
//                    System.out.print("Masukkan nama siswa : ");
                    Nama = "gan";
//                    System.out.print("Masukkan Jurusan siswa : ");
                     jurusan = "ipa";
//                    System.out.print("Masukkan Tahun Masuk siswa : ");
                     tahunMasuk = 2019;
                    Siswa s3 = new Siswa(Nama, jurusan, tahunMasuk);
                    daftarSiswa.add(s3);
                    
//                System.out.println("Berhasil id: "+s1.getIdSiswa());
                    System.out.println();
                    
                    
                }
            }            
        }
        for (int i = 0; i < daftarSiswa.size(); i++) {
            System.out.println(i + 1 + ". " + daftarSiswa.get(i).getNamaSiswa());
        }
        System.out.println();
        System.out.print("Masukan ID yang dicari : ");
        String id = pilihan.next();
        tampilkanSearchSiswa(id, daftarSiswa);
        

    }
    
   
}
