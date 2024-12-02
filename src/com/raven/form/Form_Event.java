package com.raven.form;

import com.raven.dialog.Message;
import com.raven.main.Main;
import com.raven.model.ModelCard;
import com.raven.model.ModelStudent;
import com.raven.swing.icon.GoogleMaterialDesignIcons;
import com.raven.swing.icon.IconFontSwing;
import com.raven.swing.noticeboard.ModelNoticeBoard;
import com.raven.swing.table.EventAction;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Form_Event extends javax.swing.JPanel {

    public Form_Event() {
        initComponents();
        setOpaque(false);
        initData();
    }

    private void initData() {
        initNoticeBoard();
    }


    private void initNoticeBoard() {
        noticeBoard.addDate("16/05/2025");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(218, 49, 238), "Tipo de evento:", "Festa de Aniversário infantil", "Será daqui há 3 dias", "Ordem de Servoço: 0001\n" + "!Família Vegana!\n" + "!Intolerante a lactose!\n" + "Castanhas trituradas ao invés de granulado nos brigadeiros\n" + "Brigadeiras azuis\n" + "Bolo de referência"));
        noticeBoard.addDate("25/06/2025");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(94, 49, 238),"", "Bodas", "Distante", "Ordem de Servoço: 0002\n" + "Doces e salgados finos\n" + "Faltam os salgados"));
        noticeBoard.addDate("30/06/2025");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(32, 171, 43),"", "Desp. Solteiro", "Distante", "Ordem de Servoço: 0003\n" + "Doces personalizados\n" + "Faltam ingredientes"));
        noticeBoard.addDate("30/06/2025");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(50, 93, 215),"", "Evento", "Tempo","Ordem de Servoço:\n" + "Descrição"));
        noticeBoard.addDate("30/06/2025");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(27, 188, 204),"", "Evento ", "Tempo","Ordem de Servoço:\n" + "Descrição"));
        noticeBoard.addDate("30/06/2025");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(238, 46, 57),"", "Evento", "Tempo", "Ordem de Servoço:\n" + "Descrição"));
        noticeBoard.scrollToTop();
    }

    private boolean showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        border1 = new com.raven.swing.Border();
        borderB1 = new com.raven.swing.BorderB();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        noticeBoard = new com.raven.swing.noticeboard.NoticeBoard();
        jLabel14 = new javax.swing.JLabel();
        border3 = new com.raven.swing.Border();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        borderBC1 = new com.raven.swing.BorderBC();
        jLabel11 = new javax.swing.JLabel();
        borderBC2 = new com.raven.swing.BorderBC();
        jLabel12 = new javax.swing.JLabel();
        borderBC3 = new com.raven.swing.BorderBC();
        jLabel13 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalhes do evento");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setText("Descrição");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel14.setText("Data do evento:");
        jLabel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noticeBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 632, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noticeBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 644, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout borderB1Layout = new javax.swing.GroupLayout(borderB1);
        borderB1.setLayout(borderB1Layout);
        borderB1Layout.setHorizontalGroup(
            borderB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
            .addGroup(borderB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(borderB1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        borderB1Layout.setVerticalGroup(
            borderB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(borderB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderB1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout border1Layout = new javax.swing.GroupLayout(border1);
        border1.setLayout(border1Layout);
        border1Layout.setHorizontalGroup(
            border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(borderB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        border1Layout.setVerticalGroup(
            border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(borderB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Perfil do Cliente");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Person2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eduarda Coelho");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Serviço Atual:");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 201, 160));
        jLabel6.setText("Festa de aniversário infantíl");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Data do evento:");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(7, 201, 160));
        jLabel9.setText("16/05/2025");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Observações");
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setText("Vegana");

        javax.swing.GroupLayout borderBC1Layout = new javax.swing.GroupLayout(borderBC1);
        borderBC1.setLayout(borderBC1Layout);
        borderBC1Layout.setHorizontalGroup(
            borderBC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderBC1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        borderBC1Layout.setVerticalGroup(
            borderBC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderBC1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel12.setText("Intolerante a lactose");

        javax.swing.GroupLayout borderBC2Layout = new javax.swing.GroupLayout(borderBC2);
        borderBC2.setLayout(borderBC2Layout);
        borderBC2Layout.setHorizontalGroup(
            borderBC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderBC2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        borderBC2Layout.setVerticalGroup(
            borderBC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderBC2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel12)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel13.setText("<html>\nGostaria de brigadeiros azuis e castanhas ao <br>\ninvés de granulado\n</html>");

        javax.swing.GroupLayout borderBC3Layout = new javax.swing.GroupLayout(borderBC3);
        borderBC3.setLayout(borderBC3Layout);
        borderBC3Layout.setHorizontalGroup(
            borderBC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderBC3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );
        borderBC3Layout.setVerticalGroup(
            borderBC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderBC3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout border3Layout = new javax.swing.GroupLayout(border3);
        border3.setLayout(border3Layout);
        border3Layout.setHorizontalGroup(
            border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(48, 48, 48)))
                        .addGap(42, 42, 42))
                    .addGroup(border3Layout.createSequentialGroup()
                        .addGroup(border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(border3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(borderBC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borderBC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borderBC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        border3Layout.setVerticalGroup(
            border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borderBC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borderBC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borderBC3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16)
                        .addComponent(border3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(border3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Border border1;
    private com.raven.swing.Border border3;
    private com.raven.swing.BorderB borderB1;
    private com.raven.swing.BorderBC borderBC1;
    private com.raven.swing.BorderBC borderBC2;
    private com.raven.swing.BorderBC borderBC3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.raven.swing.noticeboard.NoticeBoard noticeBoard;
    // End of variables declaration//GEN-END:variables
}
