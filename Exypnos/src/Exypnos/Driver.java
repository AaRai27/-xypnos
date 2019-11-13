///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Exypnos;
//
//import java.util.*;
//
///**
// *
// * @author Afif Raihan
// */
//public class Driver {

//    public static void main(String[] args) {
//        Aplikasi bantuan = new Aplikasi();
//        Scanner pilihan = new Scanner(System.in);
//
//        int input = 1;
//        while (input != 0) {
//            System.out.println("Pilihan Menu:");
//            System.out.println("1. Create Siswa");
//            System.out.println("2. Create Mata Kuliah");
//            System.out.print("Pilihan Anda : ");
//            input = pilihan.nextInt();
//            switch (input) {
//                case 1: {
//                    String Nama = "boy";
//                    String jurusan = "ips";
//                    int tahunMasuk = 2019;
//                    Siswa s1 = new Siswa(Nama, jurusan, tahunMasuk);
//                    bantuan.daftarSiswa.add(s1);
//
//                    Nama = "neng";
//                    jurusan = "ips";
//                    tahunMasuk = 2018;
//                    Siswa s2 = new Siswa(Nama, jurusan, tahunMasuk);
//                    bantuan.daftarSiswa.add(s2);
//
//                    Nama = "gan";
//                    jurusan = "ipa";
//                    tahunMasuk = 2019;
//                    Siswa s3 = new Siswa(Nama, jurusan, tahunMasuk);
//                    bantuan.daftarSiswa.add(s3);
//
//                    Nama = "cak";
//                    jurusan = "ips";
//                    tahunMasuk = 2000;
//                    Siswa s4 = new Siswa(Nama, jurusan, tahunMasuk);
//                    bantuan.daftarSiswa.add(s4);
//
////                    System.out.println();
//                }
//            }
//        }
//
////        System.out.println();
////        System.out.print("Masukan ID yang dicari : ");
////        String id = pilihan.next();
////        bantuan.tampilkanSearchSiswa(id, bantuan.daftarSiswa);
//        for (int i = 0; i < bantuan.daftarSiswa.size(); i++) {
//            System.out.println(i + 1 + ". " + bantuan.daftarSiswa.get(i).getIdSiswa());
//            System.out.println(i + 1 + ". " + bantuan.daftarSiswa.get(i).getNamaSiswa());
//            System.out.println(i + 1 + ". " + bantuan.daftarSiswa.get(i).getJurusan());
//            System.out.println(i + 1 + ". " + bantuan.daftarSiswa.get(i).getTahunMasuk());
//            System.out.println("======================================================");
//        }
//
//    }
//}
