package com.raven.component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TEvento extends javax.swing.JPanel {

    public TEvento() {
        initComponents();
        setOpaque(false);
    }
    
    public void clear() {
        if (tevento1 != null) {
            tevento1.setText(""); // Limpa o texto do componente
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tevento1 = new com.raven.swing.tevento();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        tevento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tevento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tevento1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tevento1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tevento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tevento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tevento1ActionPerformed

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.tevento tevento1;
    // End of variables declaration//GEN-END:variables
}
