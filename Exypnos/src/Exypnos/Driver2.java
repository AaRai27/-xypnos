/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exypnos;

import java.util.*;

/**
 *
 * @author Afif Raihan
 */
public class Driver2 {

    public static void main(String[] args) {
        Aplikasi bantuan = new Aplikasi();
        Scanner pilihan = new Scanner(System.in);

        int input = 1;
        while (input != 0) {
            System.out.println();
            System.out.println("Pilihan Menu:");
            System.out.println("1. Create Siswa");
            System.out.println("2. Create Tentor");
            System.out.println("3. Create Mata Pelajaran ");
            System.out.println("4. Create Kelas ");
            System.out.println("5. Masukkan Siswa ke Kelas");
            System.out.println("6. Masukkan Materi ke Kelas");
            System.out.println("7. Tampilkan Tentor");
            System.out.println("8. Tampilkan  data Seluruh Siswa");
            System.out.println("9. Tampilkan  data Seluruh Mata Pelajaran");
            System.out.println("10. Tampilkan  data Seluruh Kelas");
            System.out.println("11. Tampilkan  data Lengkap Kelas-Siswa-Tentor");
            System.out.println("12. Tampilkan  data Lengkap Kelas yang diajar seorang tentor");
            System.out.println("13. Tampilkan  data Lengkap Kelas dan tentornya");
            System.out.println("14. Tampilkan  data Kelas Yang Siswa Pilih");
            System.out.println("15. Delete MataPelajaran");
            System.out.println("16. Update MataPelajaran");
            System.out.println("17. Delete Kelas");
            System.out.println("18. Update Data Diri Siswa");
            System.out.println("19. Update Data Diri Tentor");
            System.out.println("20. Tampilkan List Orang");
            System.out.print("Pilihan Anda : ");
            input = pilihan.nextInt();
            System.out.println();

            switch (input) {
                case 1:
                    String Nama = "boy";
                    String jurusan = "ips";
                    int tahunMasuk = 2019;
                    bantuan.inputSiswa(Nama, jurusan, tahunMasuk);

                    Nama = "neng";
                    jurusan = "ips";
                    tahunMasuk = 2018;
                    bantuan.inputSiswa(Nama, jurusan, tahunMasuk);

                    Nama = "gan";
                    jurusan = "ipa";
                    tahunMasuk = 2019;
                    bantuan.inputSiswa(Nama, jurusan, tahunMasuk);

                    Nama = "cak";
                    jurusan = "ips";
                    tahunMasuk = 2000;
                    bantuan.inputSiswa(Nama, jurusan, tahunMasuk);
                    break;
                case 2:
                    String nama = "Andi";
                    bantuan.inputTentor(nama);
                    nama = "Ani";
                    bantuan.inputTentor(nama);
                    break;
                case 3:
                    String Mapel = "Kalkulus";
                    int bab = 3;
                    int kkm = 95;
                    bantuan.inputMapel(Mapel, bab, kkm);
                    Mapel = "Fisika";
                    bab = 69;
                    kkm = 75;
                    bantuan.inputMapel(Mapel, bab, kkm);
                    Mapel = "Fisika";
                    bab = 69;
                    kkm = 75;
                    bantuan.inputMapel(Mapel, bab, kkm);
                    break;
                case 4:
                    String IdTentor = "T-1";
                    String mapel = "Kalkulus";
                    Tentor t1 = bantuan.searchTentor(IdTentor);
                    MataPelajaran m1 = bantuan.searchMapel(mapel);
                    bantuan.inputKelasToTentor(t1, m1, "K0001");

                    IdTentor = "T-1";
                    mapel = "Fisika";
                    t1 = bantuan.searchTentor(IdTentor);
                    m1 = bantuan.searchMapel(mapel);
                    bantuan.inputKelasToTentor(t1, m1, "F0001");
                            

                    IdTentor = "T-2";
                    mapel = "Fisika";
                    t1 = bantuan.searchTentor(IdTentor);
                    m1 = bantuan.searchMapel(mapel);
                    bantuan.inputKelasToTentor(t1, m1, "F0002");
                    
                    break;
                case 5:
                    String idSiswa = "S-1";
                    String kelasSiswa = "K0001";
                    Siswa s2 = bantuan.searchSiswa(idSiswa);
                    Kelas k2 = bantuan.searchKelas(kelasSiswa);
                    if (k2 != null) {
                        bantuan.inputSiswaToKelas(s2, k2);
                    }

                    idSiswa = "S-2";
                    kelasSiswa = "K0001";
                    s2 = bantuan.searchSiswa(idSiswa);
                    k2 = bantuan.searchKelas(kelasSiswa);
                    if (k2 != null) {
                        bantuan.inputSiswaToKelas(s2, k2);
                    }

                    idSiswa = "S-2";
                    kelasSiswa = "K0001";
                    s2 = bantuan.searchSiswa(idSiswa);
                    k2 = bantuan.searchKelas(kelasSiswa);
                    if (k2 != null) {
                        bantuan.inputSiswaToKelas(s2, k2);
                    }
                    
                    idSiswa = "S-2";
                    kelasSiswa = "F0002";
                    s2 = bantuan.searchSiswa(idSiswa);
                    k2 = bantuan.searchKelas(kelasSiswa);
                    if (k2 != null) {
                        bantuan.inputSiswaToKelas(s2, k2);
                    }

                    idSiswa = "S-3";
                    kelasSiswa = "F0001";
                    s2 = bantuan.searchSiswa(idSiswa);
                    k2 = bantuan.searchKelas(kelasSiswa);
                    if (k2 != null) {
                        bantuan.inputSiswaToKelas(s2, k2);
                    }

                    idSiswa = "S-4";
                    kelasSiswa = "F0002";
                    s2 = bantuan.searchSiswa(idSiswa);
                    k2 = bantuan.searchKelas(kelasSiswa);
                    if (k2 != null) {
                        bantuan.inputSiswaToKelas(s2, k2);
                    }
                    break;
                case 6:
                    String materi = "Integral Lipat";
                    int jmlBahasan = 2;
                    kelasSiswa = "F0002";
                    k2 = bantuan.searchKelas(kelasSiswa);
                    if (k2!=null){
                        bantuan.inputMateriToKelas(k2, materi, jmlBahasan);
                    }
                    
                    materi = "Turunan";
                    jmlBahasan = 4;
                    kelasSiswa = "K0001";
                    k2 = bantuan.searchKelas(kelasSiswa);
                    if (k2!=null){
                        bantuan.inputMateriToKelas(k2, materi, jmlBahasan);
                    }
                    materi = "Turunan";
                    jmlBahasan = 4;
                    kelasSiswa = "K0001";
                    k2 = bantuan.searchKelas(kelasSiswa);
                    if (k2!=null){
                        bantuan.inputMateriToKelas(k2, materi, jmlBahasan);
                    }
                    materi = "GLBB";
                    jmlBahasan = 5;
                    kelasSiswa = "F0001";
                    k2 = bantuan.searchKelas(kelasSiswa);
                    if (k2!=null){
                        bantuan.inputMateriToKelas(k2, materi, jmlBahasan);
                    }
                    
                    materi = "GLB";
                    jmlBahasan = 3;
                    kelasSiswa = "F0001";
                    k2 = bantuan.searchKelas(kelasSiswa);
                    if (k2!=null){
                        bantuan.inputMateriToKelas(k2, materi, jmlBahasan);
                    }
                    break;
                case 7:
                    for (int i = 0; i < bantuan.getDaftarTentorSize(); i++) {
                        bantuan.tampilkanSearchTentor(bantuan.gettentor(i).getIdTentor());
                    }
                    break;
                case 8:
                    for (int i = 0; i < bantuan.getDaftarSiswaSize(); i++) {
                        bantuan.tampilkanSearchSiswa(bantuan.getSiswa(i).getIdSiswa());
                    }
                    break;
                case 9:
                    for (int i = 0; i < bantuan.getDaftarMapelSize(); i++) {
                        bantuan.tampilkanSearchMapel(bantuan.getMapel(i).getNamaMapel());
                    }
                    break;
                case 10:
                    for (int i = 0; i < bantuan.getDaftarKelasSize(); i++) {
                        bantuan.tampilkanSearchKelas(bantuan.getKelas(i).getNamaKelas());
                    }
                    break;
                case 11:
                    for (int i = 0; i < bantuan.getDaftarTentorSize(); i++) {
                        bantuan.tampilkanSearchTentorFull(bantuan.gettentor(i).getIdTentor());
                    }
                    break;
                case 12 :
                        String cariTentor = "T-1";
                        if (bantuan.searchTentor(cariTentor) != null){
                           bantuan.tampilkanSearchTentorFull(bantuan.searchTentor(cariTentor).getIdTentor()); 
                        } else {
                            System.out.println("Tentor tidak ditemukan");
                        }
                        break;
                case 13 :
                    for (int i = 0; i < bantuan.getDaftarTentorSize(); i++) {
                        bantuan.tampilkanSearchKelasdanTentor(bantuan.gettentor(i).getIdTentor());
                    }
                    break;
                case 14 :
                    String id_Siswa = "S-2";
                    bantuan.tampilkanSearchKelasMilikSiswa(id_Siswa);
                    break;
                case 15 :
                    String namaMapel = "Fisika";
                    bantuan.deleteMataPelajaran(namaMapel);
                    break;
                case 16 :
                    String namaMapelLama = "Fisikafff";
                    String namaMapelBaru = "Automata";
                    int jmlBabBaru = 6;
                    int kkmBaru = 60;
                    bantuan.updateMataPelajaran(namaMapelLama, namaMapelBaru, jmlBabBaru, kkmBaru);
                    break;
                case 17 :
                    String namaKelas = "F0002";
                    bantuan.deleteKelas(namaKelas);
                    break;
                case 18 :
                    String idSiswaUPDATE = "S-9";
                    String namaSiswaBaru = "Alex Ganteng";
                    String jurusanBaru = "TEKNIK NUKLIR";
                    int tahunMasukBaru = 1889;
                    bantuan.updateSiswaPribadi(idSiswaUPDATE, namaSiswaBaru, jurusanBaru, tahunMasukBaru);
                    break;
                case 19 :
                    String idTentorUPDATE = "Tasdwa-1";
                    String namaTentorBaru = "Daffa Ganteng";
                    bantuan.updateTentorPribadi(idTentorUPDATE, namaTentorBaru);
                    break;
                case 20 :
                    bantuan.tampilkanDaftarOrang();
                    break;
                case 21 :
                    bantuan.updateMateri("F0001", "GLBB", "GLB", 69);
                    break;
                case 22 :
                    bantuan.deleteMateri("F0001", "GLB");
                    break;
                case 23:
                    bantuan.updateKelas("K0001", "B0001");
                    break;
            }
        }

    }
}
