/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * homeClothoJPanel.java
 *
 * Created on 2012-10-20, 22:21:38
 */
package org.igem.browser;

import org.GCircle.MyJFrame;

/**
 *
 * @author Administrator
 */
public class homeClothoJPanel extends javax.swing.JPanel {

    /** Creates new form homeClothoJPanel */
    public homeClothoJPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel50 = new javax.swing.JLabel();

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/screen/G-circle.png"))); // NOI18N
        jLabel50.setToolTipText("<html><BODY STYLE=\"BACKGROUND-COLOR:#FFFFFF;\"><font size=\"5\" face=\"Verdana\">\nThis is the section for sequence information.<br>\nIt can illustrate the given genome and the expression<br>\nlevel of genes within it underdifferent environment<br>\n in one graph.</html>"); // NOI18N
        jLabel50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel50.setName("jLabel50"); // NOI18N
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel50MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel50MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(396, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked

        new MyJFrame().setVisible(true);     }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel50MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseEntered
        this.jLabel50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(105, 105, 105), 2, true));     
	}//GEN-LAST:event_jLabel50MouseEntered

    private void jLabel50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseExited
        this.jLabel50.setBorder(null);     
	}//GEN-LAST:event_jLabel50MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel50;
    // End of variables declaration//GEN-END:variables
}
