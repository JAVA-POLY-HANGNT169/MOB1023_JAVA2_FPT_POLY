/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HangNT
 */
public class SinhVienService {

    public String ghiFile(String path, List<SinhVien> listSV) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (SinhVien sinhVien : listSV) {
                oos.writeObject(sinhVien);
            }
            oos.close();
            fos.close();
            return "Ghi file thành công!";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }

    public String docFile(String path, List<SinhVien> listSV) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                System.out.println("Không tìm thấy file!");
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available() > 0) {
                listSV.add((SinhVien) ois.readObject());
            }
            ois.close();
            fis.close();
            return "Đọc file thành công!";
        } catch (Exception e) {
            return "Đọc file thất bại";
        }
    }

    public boolean update(List<SinhVien> listSV, int viTriUpdate, SinhVien svUpdate) {
        boolean isUpdate = false;
        for (int i = 0; i < listSV.size(); i++) {
            if (i == viTriUpdate) {
                listSV.set(viTriUpdate, svUpdate);
                isUpdate = true;
            }
        }
        return isUpdate;
    }

    public void removeSV(List<SinhVien> listSV, int viTriRemove) {
        listSV.remove(viTriRemove);
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
}
