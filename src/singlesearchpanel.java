/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PARAM
 */
public class singlesearchpanel extends javax.swing.JPanel {

    /**
     * Creates new form singlesearchpanel
     */
    public singlesearchpanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrolltweet = new javax.swing.JScrollPane();
        searchpanel1 = new javax.swing.JPanel();
        dmbt = new javax.swing.JButton();
        searchpanel = new javax.swing.JPanel();
        followbt = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        scrolltweet.setBackground(new java.awt.Color(255, 255, 255));
        scrolltweet.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        searchpanel1.setBackground(new java.awt.Color(255, 255, 255));

        dmbt.setText("DM");
        dmbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmbtActionPerformed(evt);
            }
        });

        searchpanel.setBackground(new java.awt.Color(255, 255, 255));
        searchpanel.setPreferredSize(new java.awt.Dimension(595, 0));

        javax.swing.GroupLayout searchpanelLayout = new javax.swing.GroupLayout(searchpanel);
        searchpanel.setLayout(searchpanelLayout);
        searchpanelLayout.setHorizontalGroup(
            searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        searchpanelLayout.setVerticalGroup(
            searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1197, Short.MAX_VALUE)
        );

        followbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchpanel1Layout = new javax.swing.GroupLayout(searchpanel1);
        searchpanel1.setLayout(searchpanel1Layout);
        searchpanel1Layout.setHorizontalGroup(
            searchpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchpanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(searchpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addGroup(searchpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(followbt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dmbt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(721, Short.MAX_VALUE))
        );
        searchpanel1Layout.setVerticalGroup(
            searchpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchpanel1Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(dmbt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(followbt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(searchpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1197, Short.MAX_VALUE)
        );

        scrolltweet.setViewportView(searchpanel1);

        add(scrolltweet);
        scrolltweet.setBounds(0, 0, 1056, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void followbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_followbtActionPerformed

    private void dmbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dmbtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton dmbt;
    public javax.swing.JButton followbt;
    public javax.swing.JScrollPane scrolltweet;
    public javax.swing.JPanel searchpanel;
    public javax.swing.JPanel searchpanel1;
    // End of variables declaration//GEN-END:variables
}
