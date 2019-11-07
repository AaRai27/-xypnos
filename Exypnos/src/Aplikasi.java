
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
    public static void main(String[] args) {
        List<Siswa> daftarSiswa = new ArrayList<>();
        List<Tentor> daftarTentor = new ArrayList<>();
        List<MataPelajaran> daftarMapel = new ArrayList<>();
        
        Siswa s1 = new Siswa("1301184", "Jokodok", "Teknik_pencitraan", 1647);
        Siswa s2 = new Siswa("1301234", "Praproro", "Teknik_uang", 1947);
        Siswa s3 = new Siswa("1301432", "Moeldoko", "Teknik_aniyaya", 2647);
        
        
        MataPelajaran m1 = new MataPelajaran("kalkulus", 5, 68);
        MataPelajaran m2 = new MataPelajaran("Probstats", 7, 56);
        
        Kelas k1 = new Kelas("IF-42-04", m1);
        Kelas k2 = new Kelas("IF-42-03", m2);
        
        k1.addSiswa(s1);
        k1.addSiswa(s2);
        k2.addSiswa(s3);
        
        System.out.println(k1.getSiswa(1).getNamaSiswa());
        System.out.println(k1.getSiswa(1).getJurusan());
         
        
        
        
        
        
        
    }
}
