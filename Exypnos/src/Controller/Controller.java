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
import View.GUI_Login;
import View.NEW_GUI_ADMIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Afif Raihan
 */
public class Controller extends MouseAdapter implements ActionListener {

    Aplikasi model = new Aplikasi();
    GUI_Login viewLogin;
    NEW_GUI_ADMIN viewAdmin = new NEW_GUI_ADMIN();
    GUI_Siswa viewSiswa = new GUI_Siswa();
    Siswa user;
    
    

    public Controller() {
        viewLogin = new GUI_Login();
        viewLogin.addActionListener(this);
        viewSiswa.addActionListener(this);
        viewAdmin.addActionListener(this);
        viewSiswa.addMouseAdapter(this);
        viewAdmin.addMouseAdapter(this);
        
        viewLogin.setVisible(true);
//        viewAdmin.setVisible(true);
//        viewSiswa.setVisible(true);
        viewLogin.resetView();
        viewLogin.showTime();
        model.inputSiswa("Daffa Haris", "Ipa", 2015);
        user = model.searchSiswa("S-1");
        viewSiswa.setDate();
        viewSiswa.setWelcome(user.getNamaSiswa());

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
        resetTaView();
        resetList();

    }
    public void resetTaView(){
        viewAdmin.setTaDeleteKelasDeskripsiKelasString("");
        viewAdmin.setTaDeleteMapelDeksripsiMapel("");
        viewAdmin.setTaDeskripsiKelasString("");
        viewAdmin.setTaDeskripsiMapelCreateString("");
        viewAdmin.setTaDeskripsiMapelUpdateString("");
        viewAdmin.setTaViewKelasDeskripsiKelasString("");
        viewAdmin.setTaViewMapelDeskripsiMapelString("");
        viewAdmin.setTaViewSiswaDetailSiswaString("");
        viewAdmin.setTaViewSiswaKelasTentorDeskripsiKelasString("");
        viewAdmin.setTaViewTentorDetailTentorString("");
        viewSiswa.setKelasStringView("");
        viewSiswa.setKelasString("");
        viewSiswa.setMateriString("");
        viewSiswa.setDataPribadi(model.toStringSiswa(user.getId()));
        
    }
   
    public void resetList(){
        viewAdmin.setListDeleteKelasDaftarKelas(model.getKelasListId());
        viewAdmin.setlistDeleteMapelDaftarMapel(model.getMapelList());
        
        viewAdmin.setListMapelCreate(model.getKelasListMapel());
        
        viewAdmin.setListMapelUpdate(model.getKelasListMapel());
        viewAdmin.setListUpdateKelasDaftarKelas(model.getKelasListId());
        
        viewAdmin.setListViewMapelDaftarMapel(model.getMapelList());
        viewAdmin.setListViewKelasDaftarKelas(model.getKelasListId());
        viewAdmin.setListViewMateriKelasDaftarKelas(model.getKelasListId());
        viewAdmin.setListViewSiswaDaftarSiswa(model.getSiswaListId());
        viewAdmin.setListViewSiswaKelasTentorDaftarKelas(model.getKelasListId());
        viewAdmin.setListViewTentorDaftarTentor(model.getTentorListId());
        viewAdmin.setListCreateKelasMapel(model.getKelasListMapel());
        viewAdmin.setListCreateKelasTentor(model.getTentorListId());
        viewSiswa.setListKelas(model.getKelasListId());
        viewSiswa.setListKelasView(model.getKelasListSiswa(user.getId()));
        viewSiswa.setListMateri(model.getMapelListSiswa(user.getId()));
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar now = Calendar.getInstance();
        System.out.println(dateFormat.format(now.getTime()));

        Object button = ae.getSource();
        ////////Login
        if (button.equals(viewLogin.getBtnLogin())) {
            if (viewLogin.getUsernameLogin().equals("admin") && viewLogin.getPasswordLogin().equals("admin")) {
                viewAdmin.setVisible(true);
                viewSiswa.setVisible(true);
                viewLogin.resetView();
            } else if (viewLogin.getUsernameLogin().equals("siswa") && viewLogin.getPasswordLogin().equals("siswa")) {
                viewSiswa.setVisible(true);
                viewLogin.resetView();
            } else {
                viewLogin.statusViewSalah();
            }
        }
        
        ////////////////////// UPDATE ////////////////////
        if(button.equals(viewAdmin.getBtnUpdateMapel1())){
            String mapel = viewAdmin.getTfUpdateMapelNama();
            int bab = viewAdmin.getTfUpdateBabMapel();
            int Kkm = viewAdmin.getTfUpdateKkmMapel();
            String m1 = viewAdmin.getSelectedListMapelUpdate();
            viewAdmin.setTaDeskripsiMapelUpdateString("");
            model.updateMataPelajaran(m1, mapel, Kkm, bab);
            viewAdmin.resetTfView();
            resetList();
        }
        if(button.equals(viewAdmin.getBtnUpdateKelasUpdate())){
            String kelas = viewAdmin.getTfUpdateKelasNamaKelas();
            String k1 = viewAdmin.getSelectedListUpdateKelasDaftarKelas();
            model.updateKelas(k1,kelas);
            viewAdmin.resetTfView();
            resetList();
        }
        ////////////////////// DAFTAR ////////////////////
        if(button.equals(viewAdmin.getBtnDaftarMapel())){
            String mapel = viewAdmin.getTfNamaMapelCreate();
            int bab = viewAdmin.getTfJumlahBabCreate();
            int Kkm = viewAdmin.getTfKkmCreate();
            model.inputMapel(mapel, Kkm, bab);
            viewAdmin.resetTfView();
            resetList();
        }
        if(button.equals(viewAdmin.getBtnCreateTentorDaftar())){
            String tentor = viewAdmin.getTfCreateTentorNamaTentor();
            model.inputTentor(tentor);
            viewAdmin.resetTfView();
            resetList();
        }
        if(button.equals(viewAdmin.getBtnCreateKelasDaftar())){
            String kelas = viewAdmin.getTfCreatekelasNamaKelas();
            String tentor = viewAdmin.getSelectedListCreateKelasTentor();
            String mapel = viewAdmin.getSelectedListCreateKelasMapel();
            MataPelajaran m1 = model.searchMapel(mapel);
            Tentor t1 = model.searchTentor(tentor);
            model.inputKelasToTentor(t1, m1, kelas);
            viewAdmin.resetTfView();
            resetList();
        }
        if(button.equals(viewAdmin.getBtnCreateSiswaDaftar())){
            String nama = viewAdmin.getTfCreateSiswaNamaSiswa();
            String jurusan = viewAdmin.getTfCreateSiswaJurusan();
            int thnMasuk = viewAdmin.getTfCreateSiswaTahunMasuk();
            model.inputSiswa(nama, jurusan, thnMasuk);
            viewAdmin.resetTfView();
            resetList();
        }
        ////////////////////// DELETE ////////////////////
        if (button.equals(viewAdmin.getBtnAksiDeleteMapel())){
            String mapel1 = viewAdmin.getSelectedListDeleteMapelDaftarMapel();
            model.deleteMataPelajaran(mapel1);
            resetList();
            resetTaView();
        }
        if (button.equals(viewAdmin.getBtnAksiDeleteKelas())){
            String kelas = viewAdmin.getSelectedListDeleteKelasDaftarKelas();
            model.deleteKelas(kelas);
            resetList();
            resetTaView();
        }
         
        
/////////////////////////SISWA///////////////////////////////
        if (button.equals(viewSiswa.getBtnRegis())){
            String id = viewSiswa.getSelectedKelas();
            Kelas kelas = model.searchKelas(id);
            model.inputSiswaToKelas(user, kelas);
            viewSiswa.setStatusRegis("*Regisrasi Berhasil");
            viewSiswa.setListKelasView(model.getKelasListSiswa(user.getId()));
            viewSiswa.setListMateri(model.getKelasListSiswa(user.getId()));
        } 
        if (button.equals(viewSiswa.getBtnUpdate())){
            String nama = viewSiswa.getNama();
            String jurusan = viewSiswa.getJurusan();
            int tahunMasuk = viewSiswa.getTahunMasuk();
            model.updateSiswa(user.getIdSiswa(), nama, jurusan, tahunMasuk);
            viewSiswa.setDataPribadi(model.toStringSiswa(user.getId()));
            viewSiswa.setWelcome(user.getNamaSiswa());
        }
        
    }

    public void mousePressed(MouseEvent me) {
        Object source = me.getSource();
        ////////////////////// VIEW ////////////////////
        if (source.equals(viewAdmin.getListViewKelasDaftarKelas())){
            String kelas = viewAdmin.getSelectedListViewKelasDaftarKelas();
            viewAdmin.setTaViewKelasDeskripsiKelasString(model.toStringkelas(kelas));
        } 
        if (source.equals(viewAdmin.getListViewTentorDaftarTentor())){
            String idtentor = viewAdmin.getSelectedListViewTentorDaftarTentor();
            viewAdmin.setTaViewTentorDetailTentorString(model.toStringTentor(idtentor));
        } 
        if (source.equals(viewAdmin.getListViewSiswaDaftarSiswa())){
            String siswa = viewAdmin.getSelectedListViewSiswaDaftarSiswa();
            viewAdmin.setTaViewSiswaDetailSiswaString(model.toStringSiswa(siswa));
        } 
        if (source.equals(viewAdmin.getListViewMapelDaftarMapel())){
            String mapel = viewAdmin.getSelectedListViewMapelDaftarMapel();
            viewAdmin.setTaViewMapelDeskripsiMapelString(model.toStringMapel(mapel));
        } 
        if (source.equals(viewAdmin.getListViewSiswaKelasTentorDaftarKelas())){
            String kelas1 = viewAdmin.getSelectedListViewSiswaKelasTentorDaftarKelas();
            ////////////viewAdmin.setTaViewMapelDeskripsiMapelString(model.toString);
        } 
        if (source.equals(viewAdmin.getListViewMateriKelasDaftarKelas())){
            String kelas = viewAdmin.getSelectedListViewMateriKelasDaftarKelas();
            viewAdmin.setTaViewMateriKelasDetailString(model.toStringMateri(kelas));
        }
        
        ////////////////////// UPDATE ////////////////////
        if (source.equals(viewAdmin.getListMapelUpdate())){
            String mapelUpdate = viewAdmin.getSelectedListMapelUpdate();
            viewAdmin.setTaDeskripsiMapelUpdateString(model.toStringMapel(mapelUpdate));
        }
        if (source.equals(viewAdmin.getListUpdateKelasDaftarKelas())){
            viewAdmin.setTfUpdateKelasNamaKelas("");
            String kelas = viewAdmin.getSelectedListUpdateKelasDaftarKelas();
            Kelas k1 =  model.searchKelas(kelas);
            viewAdmin.setTaDeskripsiKelasString(model.toStringkelas(kelas));
            viewAdmin.SetTfUpdateKelasMataPelajaran(k1.getMapel().getNamaMapel());
        }
        ////////////////////// CREATE ////////////////////
        if (source.equals(viewAdmin.getListMapelCreate())){
            String mapelCreate = viewAdmin.getSelectedListMapelCreate();
            viewAdmin.setTaDeskripsiMapelCreateString(model.toStringMapel(mapelCreate));
        }
        ////////////////////// Delete ////////////////////
        if (source.equals(viewAdmin.getListDeleteMapelDaftarMapel())){
            String mapelDelete = viewAdmin.getSelectedListDeleteMapelDaftarMapel();
            viewAdmin.setTaDeleteMapelDeksripsiMapel(model.toStringMapel(mapelDelete));
        }
        if (source.equals(viewAdmin.getListDeleteKelasDaftarKelas())){
            String kelasDelete = viewAdmin.getSelectedListDeleteKelasDaftarKelas();
            viewAdmin.setTaDeleteKelasDeskripsiKelasString(model.toStringkelas(kelasDelete));
        }
///////////////////////////SISWA///////////////////////////
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
    
//    public void controllerSiswa() {
//        GUI_Siswa viewSiswa;
//        Aplikasi model;
//        Siswa user;
//
//        viewSiswa = new GUI_Siswa();
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
////        viewSiswa.setDate();
////        viewSiswa.setWelcome(user.getNamaSiswa());
////        viewAdmin.setDataPribadi(model.toStringSiswa(user.getId()));
//        viewSiswa.setListKelas(model.getKelasListId());
//    }
        
}
