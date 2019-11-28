///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Controller;
//
//import Exypnos.Aplikasi;
//import Exypnos.GUI_Siswa;
//import Exypnos.Kelas;
//import Exypnos.MataPelajaran;
//import Exypnos.Siswa;
//import Exypnos.Tentor;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//
//
//
///**
// *
// * @author ASUS
// */
//
//public class ControllerSiswa extends MouseAdapter implements ActionListener{
//    GUI_Siswa menu;
//    Aplikasi model;
//    Siswa user;
//
//    public ControllerSiswa() {
//        
//        menu = new GUI_Siswa();
//        model = new Aplikasi();
//        //////////////////////////////////////////////////
//        model.inputSiswa("Daffa Haris", "Ipa", 2015);
//        user = model.searchSiswa("S-1");
//        
//        String nama = "Andi";
//        model.inputTentor(nama);
//        nama = "Ani";
//        model.inputTentor(nama);
//
//        String Mapel = "Kalkulus";
//        int bab = 3;
//        int kkm = 95;
//        model.inputMapel(Mapel, bab, kkm);
//        Mapel = "Fisika";
//        bab = 69;
//        kkm = 75;
//        model.inputMapel(Mapel, bab, kkm);
//        Mapel = "Fisika";
//        bab = 69;
//        kkm = 75;
//        model.inputMapel(Mapel, bab, kkm);
//
//        
//        String IdTentor = "T-1";
//        String mapel = "Kalkulus";
//        Tentor t1 = model.searchTentor(IdTentor);
//        MataPelajaran m1 = model.searchMapel(mapel);
//        model.inputKelasToTentor(t1, m1, "K0001");
//
//        IdTentor = "T-1";
//        mapel = "Fisika";
//        t1 = model.searchTentor(IdTentor);
//        m1 = model.searchMapel(mapel);
//        model.inputKelasToTentor(t1, m1, "F0001");
//
//        IdTentor = "T-2";
//        mapel = "Fisika";
//        t1 = model.searchTentor(IdTentor);
//        m1 = model.searchMapel(mapel);
//        model.inputKelasToTentor(t1, m1, "F0002");
//
//        String materi = "Integral Lipat";
//        int jmlBahasan = 2;
//        String kelasSiswa = "F0002";
//        Kelas k2 = model.searchKelas(kelasSiswa);
//        if (k2 != null) {
//            model.inputMateriToKelas(k2, materi, jmlBahasan);
//        }
//
//        materi = "Turunan";
//        jmlBahasan = 4;
//        kelasSiswa = "K0001";
//        k2 = model.searchKelas(kelasSiswa);
//        if (k2 != null) {
//            model.inputMateriToKelas(k2, materi, jmlBahasan);
//        }
//        materi = "Naikan";
//        jmlBahasan = 9;
//        kelasSiswa = "K0001";
//        k2 = model.searchKelas(kelasSiswa);
//        if (k2 != null) {
//            model.inputMateriToKelas(k2, materi, jmlBahasan);
//        }
//        materi = "GLBB";
//        jmlBahasan = 5;
//        kelasSiswa = "F0001";
//        k2 = model.searchKelas(kelasSiswa);
//        if (k2 != null) {
//            model.inputMateriToKelas(k2, materi, jmlBahasan);
//        }
//
//        materi = "GLB";
//        jmlBahasan = 3;
//        kelasSiswa = "F0001";
//        k2 = model.searchKelas(kelasSiswa);
//        if (k2 != null) {
//            model.inputMateriToKelas(k2, materi, jmlBahasan);
//        }
//        /////////////////////////////////////////////
//        menu.addActionListener(this);
//        menu.addMouseAdapter(this);
//        menu.setVisible(true);
//        menu.setDate();
//        menu.setWelcome(user.getNamaSiswa());
//        menu.setDataPribadi(model.toStringSiswa(user.getId()));
//        menu.setListKelas(model.getKelasListId());
//    }
//    public void actionPerformed(ActionEvent ae){
//        Object source = ae.getSource();
//        if (source.equals(menu.getBtnRegis())){
//            String id = menu.getSelectedKelas();
//            Kelas kelas = model.searchKelas(id);
//            model.inputSiswaToKelas(user, kelas);
//            menu.setStatusRegis("*Regisrasi Berhasil");
//            menu.setListKelasView(model.getKelasListSiswa(user.getId()));
//            menu.setListMateri(model.getKelasListSiswa(user.getId()));
//        } else if (source.equals(menu.getBtnUpdate())){
//            String nama = menu.getNama();
//            String jurusan = menu.getJurusan();
//            int tahunMasuk = menu.getTahunMasuk();
//            model.updateSiswa(user.getIdSiswa(), nama, jurusan, tahunMasuk);
//            menu.setDataPribadi(model.toStringSiswa(user.getId()));
//            menu.setWelcome(user.getNamaSiswa());
//        }
//        
//    }
//    public void mousePressed(MouseEvent me){
//        Object source = me.getSource();
//        if (source.equals(menu.getListKelas())){
//            String id = menu.getSelectedKelas();
//            menu.setKelasString(model.toStringkelas(id));
//        } else if (source.equals(menu.getListKelasView())){
//            String id1 = menu.getSelectedKelasView();
//            menu.setKelasStringView(model.toStringkelas(id1));
//        } else if (source.equals(menu.getListMateri())){
//            String id2 = menu.getSelectedMateri();
//            menu.setMateriString(model.toStringMateri(id2));
//        }
//    }
//    
//    
//}
