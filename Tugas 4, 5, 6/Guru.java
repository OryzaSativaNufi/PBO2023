/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilandatabase;

/**
 *
 * @author ASUS
 */
public class Guru {

    /**
     * @return the ID_Guru
     */
    String getID_Guru() {
        return ID_Guru;
    }

    /**
     * @param ID_Guru the ID_Guru to set
     */
    void setID_Guru(String ID_Guru) {
        this.ID_Guru = ID_Guru;
    }

    /**
     * @return the Nama
     */
    String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the Mata_Pelajaran
     */
    String getMata_Pelajaran() {
        return Mata_Pelajaran;
    }

    /**
     * @param Mata_Pelajaran the Mata_Pelajaran to set
     */
    void setMata_Pelajaran(String Mata_Pelajaran) {
        this.Mata_Pelajaran = Mata_Pelajaran;
    }
    private String ID_Guru;
    private String Nama;
    private String Mata_Pelajaran;
}
