/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PARAM
 */
public class homepanel extends javax.swing.JPanel {

    /**
     * Creates new form homepanel
     */
    public homepanel() {
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
        hometweetpanel = new javax.swing.JPanel();
        hometweetpanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        scrolltweet.setBackground(new java.awt.Color(255, 255, 255));
        scrolltweet.setBorder(null);
        scrolltweet.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        hometweetpanel.setBackground(new java.awt.Color(255, 255, 255));

        hometweetpanel1.setBackground(new java.awt.Color(255, 255, 255));
        hometweetpanel1.setPreferredSize(new java.awt.Dimension(595, 957));

        javax.swing.GroupLayout hometweetpanel1Layout = new javax.swing.GroupLayout(hometweetpanel1);
        hometweetpanel1.setLayout(hometweetpanel1Layout);
        hometweetpanel1Layout.setHorizontalGroup(
            hometweetpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        hometweetpanel1Layout.setVerticalGroup(
            hometweetpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 959, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout hometweetpanelLayout = new javax.swing.GroupLayout(hometweetpanel);
        hometweetpanel.setLayout(hometweetpanelLayout);
        hometweetpanelLayout.setHorizontalGroup(
            hometweetpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hometweetpanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(hometweetpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(754, Short.MAX_VALUE))
        );
        hometweetpanelLayout.setVerticalGroup(
            hometweetpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hometweetpanelLayout.createSequentialGroup()
                .addComponent(hometweetpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                .addContainerGap())
        );

        scrolltweet.setViewportView(hometweetpanel);

        add(scrolltweet);
        scrolltweet.setBounds(5, 0, 1056, 650);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel hometweetpanel;
    public javax.swing.JPanel hometweetpanel1;
    public javax.swing.JScrollPane scrolltweet;
    // End of variables declaration//GEN-END:variables
}