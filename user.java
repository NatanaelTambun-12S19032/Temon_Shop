/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temonshop;

/**
 *
 * @author Natanael Tambun - 12S19032
 */
public abstract class user {
    
    private int id;
    private String nama;
    private String no_telp;
    private String jabatan;
    private String alamat;
    private String role;

    public user() {
    }

    public user(int id, String nama, String no_telp, String jabatan, String alamat, String role) {
        this.id = id;
        this.nama = nama;
        this.no_telp = no_telp;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }  
}

