/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Exypnos.Aplikasi;
import View.GUI_Siswa;
import Exypnos.Kelas;
import Exypnos.MataPelajaran;
import Exypnos.Siswa;
import Exypnos.Tentor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;




/**
 *
 * @author ASUS
 */

public class ControllerSiswa extends MouseAdapter implements ActionListener{
    GUI_Siswa viewSiswa;
    Aplikasi model;
    Siswa user;

    public ControllerSiswa() {
        
        viewSiswa = new GUI_Siswa();
        model = new Aplikasi();
        //////////////////////////////////////////////////
        model.inputSiswa("Daffa Haris", "Ipa", 2015);
        user = model.searchSiswa("S-1");
        
        String nama = "Andi";
        model.inputTentor(nama);
        nama = "Ani";
        model.inputTentor(nama);

        String Mapel = "Kalkulus";
        int bab = 3;
        int kkm = 95;
        model.inputMapel(Mapel, bab, kkm);
        Mapel = "Fisika";
        bab = 69;
        kkm = 75;
        model.inputMapel(Mapel, bab, kkm);
        Mapel = "Fisika";
        bab = 69;
        kkm = 75;
        model.inputMapel(Mapel, bab, kkm);

        
        String IdTentor = "T-1";
        String mapel = "Kalkulus";
        Tentor t1 = model.searchTentor(IdTentor);
        MataPelajaran m1 = model.searchMapel(mapel);
        model.inputKelasToTentor(t1, m1, "K0001");

        IdTentor = "T-1";
        mapel = "Fisika";
        t1 = model.searchTentor(IdTentor);
        m1 = model.searchMapel(mapel);
        model.inputKelasToTentor(t1, m1, "F0001");

        IdTentor = "T-2";
        mapel = "Fisika";
        t1 = model.searchTentor(IdTentor);
        m1 = model.searchMapel(mapel);
        model.inputKelasToTentor(t1, m1, "F0002");

        String materi = "Integral Lipat";
        int jmlBahasan = 2;
        String kelasSiswa = "F0002";
        Kelas k2 = model.searchKelas(kelasSiswa);
        if (k2 != null) {
            model.inputMateriToKelas(k2, materi, jmlBahasan);
        }

        materi = "Turunan";
        jmlBahasan = 4;
        kelasSiswa = "K0001";
        k2 = model.searchKelas(kelasSiswa);
        if (k2 != null) {
            model.inputMateriToKelas(k2, materi, jmlBahasan);
        }
        materi = "Naikan";
        jmlBahasan = 9;
        kelasSiswa = "K0001";
        k2 = model.searchKelas(kelasSiswa);
        if (k2 != null) {
            model.inputMateriToKelas(k2, materi, jmlBahasan);
        }
        materi = "GLBB";
        jmlBahasan = 5;
        kelasSiswa = "F0001";
        k2 = model.searchKelas(kelasSiswa);
        if (k2 != null) {
            model.inputMateriToKelas(k2, materi, jmlBahasan);
        }

        materi = "GLB";
        jmlBahasan = 3;
        kelasSiswa = "F0001";
        k2 = model.searchKelas(kelasSiswa);
        if (k2 != null) {
            model.inputMateriToKelas(k2, materi, jmlBahasan);
        }
        /////////////////////////////////////////////
        viewSiswa.addActionListener(this);
        viewSiswa.addMouseAdapter(this);
        viewSiswa.setVisible(true);
        viewSiswa.setDate();
        viewSiswa.setWelcome(user.getNamaSiswa());
        viewSiswa.setDataPribadi(model.toStringSiswa(user.getId()));
        viewSiswa.setListKelas(model.getKelasListId());
    }
    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();
        if (source.equals(viewSiswa.getBtnRegis())){
            String id = viewSiswa.getSelectedKelas();
            Kelas kelas = model.searchKelas(id);
            model.inputSiswaToKelas(user, kelas);
            viewSiswa.setStatusRegis("*Regisrasi Berhasil");
            viewSiswa.setListKelasView(model.getKelasListSiswa(user.getId()));
            viewSiswa.setListMateri(model.getKelasListSiswa(user.getId()));
        } else if (source.equals(viewSiswa.getBtnUpdate())){
            String nama = viewSiswa.getNama();
            String jurusan = viewSiswa.getJurusan();
            int tahunMasuk = viewSiswa.getTahunMasuk();
            model.updateSiswa(user.getIdSiswa(), nama, jurusan, tahunMasuk);
            viewSiswa.setDataPribadi(model.toStringSiswa(user.getId()));
            viewSiswa.setWelcome(user.getNamaSiswa());
        }
        
    }
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(viewSiswa.getListKelas())){
            String id = viewSiswa.getSelectedKelas();
            viewSiswa.setKelasString(model.toStringkelas(id));
        } else if (source.equals(viewSiswa.getListKelasView())){
            String id1 = viewSiswa.getSelectedKelasView();
            viewSiswa.setKelasStringView(model.toStringkelas(id1));
        } else if (source.equals(viewSiswa.getListMateri())){
            String id2 = viewSiswa.getSelectedMateri();
            viewSiswa.setMateriString(model.toStringMateri(id2));
        }
    }
    
    
}
