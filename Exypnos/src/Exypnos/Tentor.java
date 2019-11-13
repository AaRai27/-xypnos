package Exypnos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author ASUS
 */

public class Tentor extends Orang{
    private List<Kelas> listKelas;
    private String idTentor;
    private String namaTentor;
    private Kelas kelas;
    private static int sid = 1;

    public Tentor(String namaTentor) {
        this.namaTentor = namaTentor;
        setIdTentor("T-"+sid);
        sid++;
        listKelas = new ArrayList<>();
    }
    
    
    public Kelas getKelas(int x) {
        return listKelas.get(x);
    }

    public void createKelas(String namaKelas, MataPelajaran mapel) {
        Kelas kelas = new Kelas(namaKelas, mapel);
        listKelas.add(kelas);
    }

    public String getIdTentor() {
        return idTentor;
    }

    public void setIdTentor(String idTentor) {
        this.idTentor = idTentor;
    }

    public String getNamaTentor() {
        return namaTentor;
    }

    public void setNamaTentor(String namaTentor) {
        this.namaTentor = namaTentor;
    }
    public int getListKelasSize(){
        return listKelas.size();
    }
    
}
