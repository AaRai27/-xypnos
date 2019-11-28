/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exypnos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Afif Raihan
 */
public class ControllerAdmin extends MouseAdapter implements ActionListener{

    GUI_Admin viewAdmin;
    Aplikasi model;
    String mapelUpdate;
    String mapelDelete;

    public ControllerAdmin() {
        viewAdmin = new GUI_Admin();
        model = new Aplikasi();
        viewAdmin.addActionListener(this);
        viewAdmin.addMouseAdapter(this);
        viewAdmin.setVisible(true);
        model.inputSiswa("Daffa Haris", "Ipa", 2015);
        

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
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object button = ae.getSource();
        if(button.equals(viewAdmin.getBtnLihatKelas())){
            viewAdmin.tampilkanHasil("Kelas");
        }else if(button.equals(viewAdmin.getBtnLihatMapel())){
            viewAdmin.setListMapelDelete(model.getKelasListMapel());
        }else if (button.equals(viewAdmin.getBtnLihatTentor())){
            viewAdmin.setListMapelUpdate(model.getKelasListMapel());

        }else if(button.equals(viewAdmin.getBtnLihatSiswa())){
            viewAdmin.setListMapel(model.getKelasListMapel());
        } else if (button.equals(viewAdmin.getBtnDaftar())){
            String Mapel = viewAdmin.getNamaMapel();
            int bab = viewAdmin.getJumlahBab();
            int Kkm = viewAdmin.getKkm();
            model.inputMapel(Mapel, bab, Kkm);
            viewAdmin.setListMapel(model.getKelasListMapel());
            viewAdmin.resetView();
        } else if (button.equals(viewAdmin.getBtnUpdateMapel())){
            String mapel = viewAdmin.getNamaMapelUpdate();
            int bab = viewAdmin.getJumlahBabUpdate();
            int Kkm = viewAdmin.getKkmUpdate();
            mapelUpdate = viewAdmin.getSelectedMapelUpdate();
            model.updateMataPelajaran(mapelUpdate, mapel, Kkm, bab);
            viewAdmin.setListMapelUpdate(model.getKelasListMapel());
            viewAdmin.resetView();
        }  else if (button.equals(viewAdmin.getBtnDeleteMapel())){
            model.deleteMataPelajaran(mapelDelete);
            viewAdmin.setListMapelDelete(model.getKelasListMapel());
            viewAdmin.resetView();
        }
    }
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(viewAdmin.getListMapel())){
            String mapel = viewAdmin.getSelectedMapel();
            viewAdmin.setMapelString(model.toStringMapel(mapel));
        } else if (source.equals(viewAdmin.getListMapelUpdate())){
            mapelUpdate = viewAdmin.getSelectedMapelUpdate();
            viewAdmin.setUpdateMapelString(model.toStringMapel(mapelUpdate));
        } else if (source.equals(viewAdmin.getListMapelDelete())){
            mapelDelete = viewAdmin.getSelectedMapelDelete();
            viewAdmin.setDeleteMapelString(model.toStringMapel(mapelDelete));
        }
    }
    
}
