/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temonshop;

import java.text.SimpleDateFormat;

/**
 *
 * @author 12S19002 Yoshua Silitonga
 */
public class Admin extends user{

    public Admin() {
    }

    public Admin(int id, String nama, String no_telp, String jabatan, String alamat, String role) {
        super(id, nama, no_telp, jabatan, alamat, role);
    }
    
    public void melihatLogActivity(){
    
    
    }
}
