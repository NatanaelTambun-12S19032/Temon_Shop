package temonshop;



/**
 *
 * @author User
 */
public class LogActivity {
    private int id;
    private int id_user;
    private String tanggal;
    private int checkin;
    private int checkout;
    private String shift;
    private String hari;
    private String Nama;

    public LogActivity() {
    }

    public LogActivity(int id, int id_user, String tanggal, int checkin, int checkout, String shift, String hari, String Nama) {
        this.id = id;
        this.id_user = id_user;
        this.tanggal = tanggal;
        this.checkin = checkin;
        this.checkout = checkout;
        this.shift = shift;
        this.hari = hari;
        this.Nama = Nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getCheckin() {
        return checkin;
    }

    public void setCheckin(int checkin) {
        this.checkin = checkin;
    }

    public int getCheckout() {
        return checkout;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    
}
