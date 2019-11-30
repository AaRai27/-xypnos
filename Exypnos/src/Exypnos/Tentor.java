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

public class Tentor extends Orang {

    private List<Kelas> listKelas;
    private static int sid = 1;

    public Tentor(String namaTentor) {
        super(namaTentor, "T-" + sid);
        sid++;
        listKelas = new ArrayList<>();
    }

    public Kelas getKelas(int x) {
        return listKelas.get(x);
    }

    public void createKelas(MataPelajaran mapel, String namaKelas) {
        Kelas kelas = new Kelas(mapel, namaKelas);
        listKelas.add(kelas);
    }

    public String getIdTentor() {
        return super.getId();
    }


    public String getNamaTentor() {
        return super.getNama();
    }

    public int getListKelasSize() {
        return listKelas.size();
    }
    
    public void removeListKelas(Kelas kelas){
        listKelas.remove(kelas);
    }

}
