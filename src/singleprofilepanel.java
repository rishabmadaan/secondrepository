/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PARAM
 */
public class singleprofilepanel extends javax.swing.JPanel {

    /**
     * Creates new form singleprofilepanel
     */
    public singleprofilepanel() {
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

        prnm = new javax.swing.JLabel();
        singlephoto = new javax.swing.JLabel();
        prscrnm = new javax.swing.JLabel();
        pbp = new javax.swing.JPanel();
        pblb = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        prnm.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        prnm.setText("jLabel2");
        add(prnm);
        prnm.setBounds(30, 170, 160, 40);

        singlephoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        add(singlephoto);
        singlephoto.setBounds(20, 70, 90, 90);

        prscrnm.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        prscrnm.setText("jLabel1");
        add(prscrnm);
        prscrnm.setBounds(30, 200, 150, 40);

        pbp.setLayout(null);
        pbp.add(pblb);
        pblb.setBounds(0, 0, 292, 110);

        add(pbp);
        pbp.setBounds(0, 0, 292, 110);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel pblb;
    public javax.swing.JPanel pbp;
    public javax.swing.JLabel prnm;
    public javax.swing.JLabel prscrnm;
    public javax.swing.JLabel singlephoto;
    // End of variables declaration//GEN-END:variables
}
