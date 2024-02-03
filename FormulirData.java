import java.util.List;

public class FormulirData {
    private String nama;
    private String alamat;
    private String noTelepon;

    public FormulirData(String nama, String alamat, String noTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public List<String> getData() {
        List<String> data = new ArrayList<>();
        data.add(nama);
        data.add(alamat);
        data.add(noTelepon);
        return data;
    }

    public boolean isDataLengkap() {
        for (String a : getData()) {
            if (a.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
