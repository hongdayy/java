package T3H.Buoi7;

public class SinhVien {
    private String ten;
    private int tuoi;
    private String maSinhVien;

    public SinhVien(String ten, int tuoi, String maSinhVien) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.maSinhVien = maSinhVien;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    @Override
    public String toString() {
        return "Mã sinh viên: " + maSinhVien + ", Tên: " + ten + ", Tuổi: " + tuoi;
    }
}
