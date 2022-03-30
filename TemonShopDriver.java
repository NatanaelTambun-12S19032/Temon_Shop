/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temonshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class TemonShopDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ParseException{
        // TODO code application logic here
        try{
            String className="com.mysql.cj.jdbc.Driver";
            Class.forName(className);
            System.out.println("Success");
            Scanner sc = new Scanner(System.in);
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lagi", "root", "natan0812");
            
            if(con.isClosed()){
                System.out.println("Connection is closed");
            }else{
                System.out.print("Masukkan id = ");
                int id = sc.nextInt();
                
                Admin admin = new Admin();
                Pegawai pegawai = new Pegawai();
                LogActivity LA = new LogActivity();
                
                Calendar calendar = Calendar.getInstance();
                
                String query = "Select * FROM user where id = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, id);
                
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    if(rs.getString("ROLE").contains("admin")){
                        System.out.println("Selamat datang ADMIN");
                        admin.setId(rs.getInt("ID"));
                        admin.setNama(rs.getString("name"));
                        admin.setAlamat(rs.getString("ALAMAT"));
                        admin.setJabatan(rs.getString("JABATAN"));
                        
                        System.out.println(String.format("Nama = %s", admin.getNama()));
                        System.out.println(String.format("Alamat = %s", admin.getAlamat()));
                        System.out.println(String.format("JABATAN = %s", admin.getJabatan()));
                    }else if(rs.getString("ROLE").contains("pegawai")) {
                        System.out.println("Selamat datang PEGAWAI");
                        
                        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE");
                        String dayOfWeek = dateFormat.format(calendar.getTime());
                        String dates = date.format(calendar.getTime());
                        System.out.println(dayOfWeek);
                        
                        System.out.print("Masukkan waktu checkin : ");
                        
                        LA.setCheckin(sc.nextInt());
                        LA.setId(id);                        
                        LA.setHari(dayOfWeek);
                        LA.setTanggal(dates);
                        System.out.println("masukkan jadwal shift");
                        LA.setShift(sc.next());
                        System.out.println("Masukkan waktu checkout : ");
                        LA.setCheckout(sc.nextInt());
                        System.out.println("masukkan nama");
                        LA.setNama(sc.next());
                        
                        
                        String _sql= "INSERT INTO LOGACTIVITY(ID_USER,TANGGAL, CHECKIN,HARI,CHECKOUT,SHIFT,NAMA) VALUES(?,?,?,?,?,?,?)";
                        PreparedStatement pS = con.prepareStatement(_sql);
                        pS.setInt(1, LA.getId());
                        pS.setString(2, LA.getTanggal());
                        pS.setInt(3, LA.getCheckin());
                        pS.setString(4, LA.getHari());
                        pS.setInt(5, LA.getCheckout());
                        pS.setString(6, LA.getShift());
                        pS.setString(7, LA.getNama());
                        
                       
                        
                        int response = pS.executeUpdate();
                        if(response>0) System.out.println("Success");
                        else    System.out.println("Unable to save the data");

                    }   
                }
                
                con.close();
            }
        }catch(ClassNotFoundException ex){
            System.err.println(ex.getException());
            Logger.getLogger(TemonShopDriver.class.getName()).log(Level.SEVERE, null,ex);
        }
        
    }
    
}
