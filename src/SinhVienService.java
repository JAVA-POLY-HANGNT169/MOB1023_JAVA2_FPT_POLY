/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HangNT
 */
public class SinhVienService {

    public List<String> fakeDataChuyenNganh() {
        List<String> chuyenNganhs = new ArrayList<>();
        chuyenNganhs.add("UDPM");
        chuyenNganhs.add("PTPM");
        chuyenNganhs.add("KTPM");
        chuyenNganhs.add("ATTT");
        return chuyenNganhs;
    }

    public List<SinhVien> fakeDataSinhVien() {
        List<SinhVien> listSV = new ArrayList<>();
        listSV.add(new SinhVien("SV1", "Sinh vien 1", "IT17300", true, 19, "PTPM"));
        listSV.add(new SinhVien("SV2", "Sinh vien 2", "IT17301", false, 19, "TKW"));
        listSV.add(new SinhVien("SV3", "Sinh vien 3", "IT17300", true, 20, "UDPM"));
        listSV.add(new SinhVien("SV4", "Sinh vien 4", "IT17302", false, 19, "ADR"));
        listSV.add(new SinhVien("SV5", "Sinh vien 5", "IT17300", true, 19, "PTPM"));
        return listSV;
    }

    public String addSinhVien(List<SinhVien> listSV, SinhVien sv) {
        if (sv != null) {
            listSV.add(sv);
            return "Add thanh cong";
        }
        return " Add that bai";
    }

    public String updateSinhVien(List<SinhVien> listSV, int viTriUpdate, SinhVien svUpdate) {
        if (viTriUpdate >= 0) {
            if (svUpdate != null) {
                listSV.set(viTriUpdate, svUpdate);
                return "Update thanh cong";
            }
            return "Vui long nhap thong tin sinh vien";
        }
        return "Vui long chonj vi tri can update";

    }

    public String removeSinhVien(List<SinhVien> listSV, int viTriRemove) {
        if (viTriRemove >= 0) {
            listSV.remove(viTriRemove);
            return "Remove thanh cong";
        }
        return " Remove that bai";
    }

    public List<SinhVien> searchTheoTen(List<SinhVien> listSV, String ten) {
        List<SinhVien> listSearchTheoTen = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTenSV().contains(ten)) {
                listSearchTheoTen.add(sinhVien);
            }
        }
        return listSearchTheoTen;
    }

    public List<SinhVien> searchTheoTuoi(List<SinhVien> listSV, int min, int max) {
        List<SinhVien> listSearchTheoTuoi = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTuoi() >= min && sinhVien.getTuoi() <= max) {
                listSearchTheoTuoi.add(sinhVien);
            }
        }
        return listSearchTheoTuoi;
    }

    public String ghiFile(String path, List<SinhVien> listSV) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (SinhVien sinhVien : listSV) {
                    oos.writeObject(sinhVien);
                }
            }
            return "Ghi file thành công!";
        } catch (IOException e) {
            return "Ghi file thất bại";
        }
    }

    public String docFile(String path, List<SinhVien> listSV) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                System.out.println("Không tìm thấy file!");
            }
            try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listSV.add((SinhVien) ois.readObject());
                }
            }
            return "Đọc file thành công!";
        } catch (IOException | ClassNotFoundException e) {
            return "Đọc file thất bại";
        }
    }
}
