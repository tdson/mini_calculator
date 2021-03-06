/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Calculator;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author TRANDAISON
 */
public class HelpCalc extends javax.swing.JFrame {

    /**
     * Creates new form HelpCalc
     */
    public HelpCalc() {
        initComponents();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                setVisible(false);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        labelInfo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ScrollPaneTutorial = new javax.swing.JScrollPane();
        textHelp = new javax.swing.JTextArea();
        buttonOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitle.setText("HƯỚNG DẪN");

        labelInfo.setText("Calculator (version 1.2.4)");

        textHelp.setEditable(false);
        textHelp.setColumns(20);
        textHelp.setRows(5);
        textHelp.setText("Phím AC/C: dùng để xóa màn hình nhập\n- Nếu nhập nhầm toán hạng hoặc nhầm toán tử,\nđể xóa toán hạng, toán tử vừa nhập nhấn AC/C.\n- Nhấn AC/C lần nữa để xóa màn hình.\n\nĐể lưu kết quả vừa tính vào bộ nhớ đệm, nhấn\ntổ hợp phím Ctrl + C hoặc vào Edit >> Copy.\n\nMàn hình hiển thị được 32 ký tự kể cả dấu chấm thập phân.\nĐể gán số từ bộ nhớ đệm vào màn hình nhập dùng\ntổ hợp phím Ctrl + V hoặc vào Edit >> paste.\n\n-----\nCalculator (version 1.2.4), (c) 2015 by Son Tran\nEmail: sontd.it@gmail.com");
        ScrollPaneTutorial.setViewportView(textHelp);

        buttonOK.setText("OK");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonOK)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ScrollPaneTutorial, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addComponent(labelInfo)
                        .addComponent(labelTitle)
                        .addComponent(jSeparator1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneTutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(buttonOK)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        setVisible(false);
    }//GEN-LAST:event_buttonOKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneTutorial;
    private javax.swing.JButton buttonOK;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextArea textHelp;
    // End of variables declaration//GEN-END:variables
}
