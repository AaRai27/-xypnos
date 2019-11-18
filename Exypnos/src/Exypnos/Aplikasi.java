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

    private List<Siswa> daftarSiswa = new ArrayList<>();
    private List<Tentor> daftarTentor = new ArrayList<>();
    private List<Orang> daftarOrang = new ArrayList<>();
    private List<MataPelajaran> daftarMapel = new ArrayList<>();
    private List<Kelas> daftarKelas = new ArrayList<>();

// method search    
    public Siswa searchSiswa(String id) {
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

    public Tentor searchTentor(String id) {
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

    public Kelas searchKelas(String kelas) {
        int i = 0;
        while (i < daftarKelas.size()) {
            if (!daftarKelas.get(i).getNamaKelas().equals(kelas)) {
                i++;
            } else {
                return daftarKelas.get(i);
            }
        }
        return null;
    }

    public MataPelajaran searchMapel(String mapel) {
        int i = 0;
        while (i < daftarMapel.size()) {
            if (!daftarMapel.get(i).getNamaMapel().equals(mapel)) {
                i++;
            } else {
                return daftarMapel.get(i);
            }
        }
        return null;
    }
    
    
// method view
    public void tampilkanSearchSiswa(String id) {
        if (searchSiswa(id) == null) {
            System.out.println("data Siswa tidak ditemukan");
        } else {
            System.out.println("No.ID\t\t: " + searchSiswa(id).getIdSiswa());
            System.out.println("Nama\t\t: " + searchSiswa(id).getNamaSiswa());
            System.out.println("Jurusan\t\t: " + searchSiswa(id).getJurusan());
            System.out.println("Tahun Masuk\t: " + searchSiswa(id).getTahunMasuk());
            System.out.println("===========================================================");
        }
    }

    public void tampilkanSearchTentor(String id) {
        Tentor t1 = searchTentor(id);
        if (t1 == null) {
            System.out.println("data Tentor tidak ditemukan");
        } else {
            System.out.println("ID TENTOR\t: " + t1.getIdTentor());
            System.out.println("Nama\t\t: " + t1.getNamaTentor());
            System.out.println("====================================");
        }

    }
    
    public void tampilkanSearchMapel(String mapel) {
        if (searchMapel(mapel) == null) {
            System.out.println("data  Mata Pelajaran tidak ditemukan");
        } else {
            System.out.println("Nama Mata Pelajaran\t: " + searchMapel(mapel).getNamaMapel());
            System.out.println("Jumlah Bab\t\t: " + searchMapel(mapel).getJmlBab());
            System.out.println("KKM \t\t\t: " + searchMapel(mapel).getKKM());
            System.out.println("========================================");
        }
    }

    public void tampilkanSearchKelas(String kelas) {
        if (searchKelas(kelas) == null) {
            System.out.println("data Kelas tidak ditemukan");
        } else {
            System.out.println("Kode Kelas\t\t: " + searchKelas(kelas).getNamaKelas());
            System.out.println("Mata pelajaran\t\t: " + searchKelas(kelas).getMapel().getNamaMapel());
            System.out.println("Jumlah Siswa\t\t: " + searchKelas(kelas).getListSiswaSize());
            System.out.println("=============================================");
        }
    }
    
    public void tampilkanSearchTentorFull(String id) {
        Tentor t1 = searchTentor(id);
        if (t1 == null) {
            System.out.println("data Tentor tidak ditemukan");
        } else {
            tampilkanSearchTentor(t1.getIdTentor());
            for (int i = 0; i < t1.getListKelasSize(); i++) {
                tampilkanSearchKelasFull(t1.getKelas(i).getNamaKelas());
            }
        }

    }
    
    public void tampilkanSearchKelasFull(String kelas) {
        if (searchKelas(kelas) == null) {
            System.out.println("data Kelas tidak ditemukan");
        } else {
            tampilkanSearchKelas(kelas);
            System.out.println("Materi\t\t: ");
            for (int i = 0; i < searchKelas(kelas).getListMateriSize(); i++) {
                System.out.println("Nama Materi\t:"+searchKelas(kelas).getMateri(i).getNamaMateri());
                System.out.println("Jumlah Bahasan\t:"+searchKelas(kelas).getMateri(i).getJmlBahasan());
            }
            System.out.println("Nama Siswa Pada Kelas "+kelas+" : ");
            for (int i = 0; i < searchKelas(kelas).getListSiswaSize(); i++) {
                tampilkanSearchSiswa(searchKelas(kelas).getSiswa(i).getIdSiswa());
            }
            
        }
    }

    public void tampilkanSearchKelasdanTentor(String id) {
        Tentor t1 = searchTentor(id);
        if (t1 == null) {
            System.out.println("data Tentor tidak ditemukan");
        } else {
            for (int i = 0; i < t1.getListKelasSize(); i++) {
                tampilkanSearchKelas(t1.getKelas(i).getNamaKelas());
                tampilkanSearchTentor(t1.getIdTentor());
            }
        }

    }
    
    public void tampilkanSearchKelasMilikSiswa(String id){
        Siswa s1 = searchSiswa(id);
        boolean cek = false;
        System.out.println(daftarKelas.size());
        if (s1 != null){
            for (int i = 0; i < daftarKelas.size(); i++) {
                if (daftarKelas.get(i).searchSiswa(id) != null){
                    cek = true;
                    tampilkanSearchKelas(daftarKelas.get(i).getNamaKelas());
                    for (int j = 0; j < daftarKelas.get(i).getListMateriSize(); j++) {
                        System.out.println("Nama materi :"+ daftarKelas.get(i).getMateri(j).getNamaMateri());
                        System.out.println("Jumlah Bahasan :"+ daftarKelas.get(i).getMateri(j).getJmlBahasan());
                    }
                }
            }
            if (cek == false){
                System.out.println("Siswa belum terdaftar dikelas manapun");
            }
        } else {
            System.out.println("Siswa tidak ditemukan");
        }
    }
// method input
    public void inputTentor(String namaTentor) {
        Tentor t1 = new Tentor(namaTentor);
        daftarTentor.add(t1);
        daftarOrang.add(t1);
    }

    public void inputSiswa(String nama, String jurusan, int tahunMasuk) {
        Siswa s1 = new Siswa(nama, jurusan, tahunMasuk);
        daftarSiswa.add(s1);
        daftarOrang.add(s1);
    }

    public void inputMapel(String mapel, int bab, int kkm) {
        MataPelajaran m1 = searchMapel(mapel);
        if (m1 == null) {
            m1 = new MataPelajaran(mapel, bab, kkm);
            daftarMapel.add(m1);
        }
    }

    public void inputKelasToTentor(Tentor tentor, MataPelajaran mapel, String namaKelas) {
        Tentor t1 = searchTentor(tentor.getIdTentor());
        MataPelajaran m1 = searchMapel(mapel.getNamaMapel());
        Kelas k1 = searchKelas(namaKelas);
        if (t1 != null && k1 == null && m1 != null)  {
            t1.createKelas(mapel, namaKelas);
            Kelas k2 = new Kelas(mapel, namaKelas);
            daftarKelas.add(k2);
        }

    }

    public void inputSiswaToKelas(Siswa siswa, Kelas kelas) {
        Siswa s1 = kelas.searchSiswa(siswa.getIdSiswa());
        if (s1 == null) {
            kelas.addSiswa(siswa);
        } else {
            System.out.println("Siswa sudah diinput");
        }

    }
    
    public void inputMateriToKelas(Kelas kelas, String namaMateri, int jumlahBahasan){
        if (kelas.searchMateri(namaMateri) == null){
            kelas.createMateri(namaMateri, jumlahBahasan);
        } else {
            System.out.println("Materi sudah dimasukkan ke Kelas");
        }
        
    }
    
    
// method getSize
    public int getDaftarSiswaSize() {
        return daftarSiswa.size();
    }

    public int getDaftarTentorSize() {
        return daftarTentor.size();
    }

    public int getDaftarMapelSize() {
        return daftarMapel.size();
    }

    public int getDaftarKelasSize() {
        return daftarKelas.size();
    }
    
    
// method getobject dari list di aplikasi
    public Siswa getSiswa(int i) {
        return daftarSiswa.get(i);
    }

    public Tentor gettentor(int i) {
        return daftarTentor.get(i);
    }

    public MataPelajaran getMapel(int i) {
        return daftarMapel.get(i);
    }

    public Kelas getKelas(int i) {
        return daftarKelas.get(i);
    }
    
// Method Hapus-Hapusan    
    
    public void deleteMataPelajaran(String namaMapel){
        MataPelajaran m1 = searchMapel(namaMapel);
        if(m1 != null){
            daftarMapel.remove(m1);
            for (int i = 0; i < daftarKelas.size(); i++) {
                if(daftarKelas.get(i).getMapel() == m1){
                    MataPelajaran m2 = new MataPelajaran("KOSONG", 0, 0);
                    daftarKelas.get(i).addMapel(m2);
                }
            }
            System.out.println("Delete MataPelajaran Berhasil");
        } else{
            System.out.println("MataPelajaran Tidak Ditemukan");
        }
    }
    
    public void updateMataPelajaran(String namaMapelLama, String namaMapelBaru, int kkm, int jmlBab){
        MataPelajaran m0 = searchMapel(namaMapelLama);
        MataPelajaran m2 = searchMapel(namaMapelBaru);
        if(m0 != null){
            if(m2 == null){
                MataPelajaran m1 = new MataPelajaran(namaMapelBaru, jmlBab, kkm);
                for (int i = 0; i < daftarKelas.size(); i++) {
                    if (daftarKelas.get(i).getMapel() == m0) {
                        daftarKelas.get(i).addMapel(m1);
                    }
                }
                daftarMapel.set(daftarMapel.indexOf(m0), m1);
                System.out.println("UPDATE MAPEL BERHASIL");
            } else {
                System.out.println("Mata Pelajaran baru sudah ada");
            }
        } else {
            System.out.println("Mata pelajaran Lama tidak ditemukan");
        }
    }
}


