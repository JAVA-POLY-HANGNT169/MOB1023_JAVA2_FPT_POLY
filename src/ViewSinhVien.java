/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HangNT
 */
public class ViewSinhVien extends javax.swing.JFrame {

    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultComboBoxModel dcbmChuyenNganh = new DefaultComboBoxModel();
    private final String path = "SinhVien.txt";
    private List<SinhVien> listSV = new ArrayList<>();
    private List<String> chuyenNganhs = new ArrayList<>();
    private final SinhVienService sinhVienService = new SinhVienService();

    public ViewSinhVien() {
        initComponents();
        // set table và combobox 
        dtm = (DefaultTableModel) tblSinhVien.getModel();
        dcbmChuyenNganh = (DefaultComboBoxModel) cbbChuyenNganh.getModel();
        // fake data
        listSV = sinhVienService.fakeDataSinhVien();
        chuyenNganhs = sinhVienService.fakeDataChuyenNganh();
        // load data len table va combobox
        loadCbbChuyenNganh();
        showData(listSV);
        // fill phan tu
        SinhVien sinhVien = listSV.get(2);
        fillData(sinhVien);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenSV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cbbChuyenNganh = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnSearchTheoTen = new javax.swing.JButton();
        txtTimKiemTen = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        txtMax = new javax.swing.JTextField();
        btnSearchTeoTuoi = new javax.swing.JButton();
        btnDocFile = new javax.swing.JButton();
        btnGhiFile = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtTenLop = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTuoi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("QUAN LY SINH VIEN ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jLabel2.setText("Ma SV:");

        jLabel3.setText("Ten SV:");

        jLabel4.setText("Gioi tinh:");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nu");

        jLabel5.setText("Chuyen nganh:");

        cbbChuyenNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search theo ten"));

        jLabel7.setText("Nhap ten:");

        btnSearchTheoTen.setText("Search");
        btnSearchTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTheoTenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtTimKiemTen, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchTheoTen)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnSearchTheoTen))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search theo khoang tuoi"));

        jLabel8.setText("Min:");

        jLabel9.setText("Max:");

        btnSearchTeoTuoi.setText("Search");
        btnSearchTeoTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTeoTuoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMax, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(txtMin))
                .addGap(62, 62, 62)
                .addComponent(btnSearchTeoTuoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnSearchTeoTuoi)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnDocFile.setText("Doc file");
        btnDocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocFileActionPerformed(evt);
            }
        });

        btnGhiFile.setText("Ghi file");
        btnGhiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiFileActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("List SV:");

        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Tên SV", "Tuổi", "Tên chuyên ngành", "Giới tính", "Tên lớp"
            }
        ));
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        jLabel11.setText("Ten lop:");

        jLabel12.setText("Tuoi:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtTenSV))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtTenLop)))
                                        .addGap(72, 72, 72))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(btnDocFile)
                                        .addGap(53, 53, 53)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39)
                                        .addComponent(rdoNam)
                                        .addGap(26, 26, 26)
                                        .addComponent(rdoNu))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnGhiFile)
                                                .addGap(34, 34, 34)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbbChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(btnExit))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnAdd)
                                .addGap(63, 63, 63)
                                .addComponent(btnUpdate)
                                .addGap(69, 69, 69)
                                .addComponent(btnRemove)
                                .addGap(53, 53, 53)
                                .addComponent(btnClear))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbbChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnRemove)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDocFile)
                        .addComponent(btnGhiFile)))
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiFileActionPerformed
        JOptionPane.showMessageDialog(this, sinhVienService.ghiFile(path, listSV));
    }//GEN-LAST:event_btnGhiFileActionPerformed

    private void btnDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocFileActionPerformed
        listSV.clear();
        JOptionPane.showMessageDialog(this, sinhVienService.docFile(path, listSV));
        showData(listSV);
    }//GEN-LAST:event_btnDocFileActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        JOptionPane.showMessageDialog(this, sinhVienService.addSinhVien(listSV, svAddAndUpdate()));
        showData(listSV);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int viTriUpdate = tblSinhVien.getSelectedRow();
        JOptionPane.showMessageDialog(this, sinhVienService.updateSinhVien(listSV, viTriUpdate, svAddAndUpdate()));
        showData(listSV);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        int index = tblSinhVien.getSelectedRow();
        SinhVien sinhVien = listSV.get(index);
        fillData(sinhVien);
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtMaSV.setText("");
        txtMax.setText("");
        txtMin.setText("");
        txtTenLop.setText("");
        txtTenSV.setText("");
        txtTimKiemTen.setText("");
        txtTuoi.setText("");
        cbbChuyenNganh.setSelectedItem("PTPM");
        rdoNam.setSelected(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int viTriXoa = tblSinhVien.getSelectedRow();
        JOptionPane.showMessageDialog(this, sinhVienService.removeSinhVien(listSV, viTriXoa));
        showData(listSV);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSearchTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTheoTenActionPerformed
        String tenSearch = txtTimKiemTen.getText();
        List<SinhVien> listTheoTen = sinhVienService.searchTheoTen(listSV, tenSearch);
        if (listTheoTen.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Khong tim thay!");
            showData(listSV);
        } else {
            showData(listTheoTen);
        }
    }//GEN-LAST:event_btnSearchTheoTenActionPerformed

    private void btnSearchTeoTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTeoTuoiActionPerformed
        List<SinhVien> listTheoTuoi = sinhVienService.searchTheoTuoi(listSV,
                Integer.valueOf(txtMin.getText()), Integer.valueOf(txtMax.getText()));
        if (listTheoTuoi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Khong co sinh vien nao trong do tuoi tim kiem!");
            showData(listSV);
        } else {
            showData(listTheoTuoi);
        }
    }//GEN-LAST:event_btnSearchTeoTuoiActionPerformed

    private void showData(List<SinhVien> listSV) {
        dtm.setRowCount(0);
        for (SinhVien sinhVien : listSV) {
            dtm.addRow(sinhVien.toDataRow());
        }
    }

    private void loadCbbChuyenNganh() {
        dcbmChuyenNganh.addAll(chuyenNganhs);
        dcbmChuyenNganh.setSelectedItem(0);
    }

    private void fillData(SinhVien sinhVien) {
        txtMaSV.setText(sinhVien.getMaSV());
        txtTenSV.setText(sinhVien.getTenSV());
        txtTenLop.setText(sinhVien.getTenLop());
        txtTuoi.setText(String.valueOf(sinhVien.getTuoi()));
        if (sinhVien.isGioiTinh()) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        dcbmChuyenNganh.setSelectedItem(sinhVien.getChuyenNganh());
    }

    private SinhVien svAddAndUpdate() {
        SinhVien sinhVien = null;
        if (checkValidate()) {
            String maSV = txtMaSV.getText();
            String tenSV = txtTenSV.getText();
            String tenLop = txtTenLop.getText();
            boolean gioiTinh = false;
            if (rdoNam.isSelected()) {
                gioiTinh = true;
            }
            int tuoi = Integer.valueOf(txtTuoi.getText());
            String chuyenNganh = (String) dcbmChuyenNganh.getSelectedItem();
            sinhVien = new SinhVien(maSV, tenSV, tenLop, gioiTinh, tuoi, chuyenNganh);
        }
        return sinhVien;
    }

    private boolean checkValidate() {
        boolean isCheck = false;
        if (txtMaSV.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ma khong duoc de trong");
        } else if (txtTenLop.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ten lop khong duoc de trong");
        } else if (txtTenSV.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui long nhap ten!");
        } else if (txtTuoi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui long nhap tuoi!");
        } else if (!txtTuoi.getText().matches("[0-9]+") || (Integer.valueOf(txtTuoi.getText()) <= 0)) {
            JOptionPane.showMessageDialog(this, "Tuoi phai la so nguyen duong!");
        } else {
            isCheck = true;
        }
        return isCheck;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewSinhVien().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDocFile;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGhiFile;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearchTeoTuoi;
    private javax.swing.JButton btnSearchTheoTen;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbChuyenNganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtTenLop;
    private javax.swing.JTextField txtTenSV;
    private javax.swing.JTextField txtTimKiemTen;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
