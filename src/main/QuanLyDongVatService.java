package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class QuanLyDongVatService {

    private final List<DongVat> listDongVat;
    private final List<Integer> listNamSinh;

    public QuanLyDongVatService() {
        listDongVat = new ArrayList<>();
        listNamSinh = new ArrayList<>();

        listDongVat.add(new DongVat("DV01", "Dong Vat 1", true, 10, "Ha Noi", 2000));
        listDongVat.add(new DongVat("DV02", "Dong Vat 2", false, 101, "Ha Noi1", 2001));
        listDongVat.add(new DongVat("DV03", "Dong Vat 3", true, 102, "Ha Noi", 2004));
        listDongVat.add(new DongVat("DV04", "Dong Vat 4", false, 10, "Ha Noi5", 1990));
        listDongVat.add(new DongVat("DV05", "Dong Vat 5", true, 105, "Ha Noi", 2005));
        setAllNamSinh();
    }

    public List<DongVat> getAll() {
        return listDongVat;
    }

    public String addDongVat(DongVat dongVat) {
        if (dongVat != null) {
            listDongVat.add(dongVat);
            return "Add success";
        }
        return "Add false";
    }

    public String removeDongVat(int viTri) {
        if (viTri >= 0) {
            listDongVat.remove(viTri);
            return "Remove success";
        }
        return "Remove false";
    }

    public String updateDongVat(int viTri, DongVat dongVat) {
        if (viTri >= 0) {
            if (dongVat != null) {
                listDongVat.set(viTri, dongVat);
                return "Update success";
            }
        }
        return "Update false";
    }

    private void setAllNamSinh() {
        for (int i = 1990; i < 2016; i++) {
            listNamSinh.add(i);
        }
    }

    public List<Integer> getAllNamSinh() {
        return listNamSinh;
    }
}
