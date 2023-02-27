/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.Serializable;

/**
 *
 * @author HangNT
 */
public class SinhVien implements Serializable {

    private String maSV;
    private String tenSV;
    private String tenLop;
    private boolean gioiTinh;
    private int tuoi;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String tenLop, boolean gioiTinh, int tuoi, String chuyenNganh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tenLop = tenLop;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public Object[] toDataRow() {
        return new Object[]{maSV, tenSV, tuoi, (gioiTinh == true ? "Nam" : "Nu"), tenLop, chuyenNganh};
    }
}
