/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtab;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JEditorPane;

/**
 *
 * @author ascarneiro
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jRadioButton1 = new javax.swing.JRadioButton();
        panel1 = new java.awt.Panel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        AREA1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        AREA2 = new javax.swing.JPanel();
        panel2 = new java.awt.Panel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));

        panel1.setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(100);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        AREA1.setColumns(20);
        AREA1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        AREA1.setRows(5);
        jScrollPane3.setViewportView(AREA1);

        jSplitPane1.setTopComponent(jScrollPane3);

        AREA2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane1.setViewportView(AREA2);

        jSplitPane1.setRightComponent(jScrollPane1);

        panel1.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        panel2.setLayout(new java.awt.GridLayout(1, 0));

        jToggleButton1.setLabel("Convert");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        panel2.add(jToggleButton1);

        jToggleButton2.setActionCommand("Clear");
        jToggleButton2.setLabel("Clear");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        panel2.add(jToggleButton2);

        getContentPane().add(panel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        loadTab(AREA1.getText());
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        AREA1.setText("");
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
                if ("WIndows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AREA1;
    private javax.swing.JPanel AREA2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables

    private void loadTab(String text) {

        text = text.replaceAll("[A-Za-z]", "");
        //text = text.replaceAll("0", "-");
        text = text.replace(" ", "");
        String[] lines = text.split("\n");
        ArrayList<String> strings = new ArrayList<>();
        for (String line : lines) {
            strings.add(line);
        }

        String[] e = strings.get(0).replace("|", "").split("");
        String[] B = strings.get(1).replace("|", "").split("");
        String[] G = strings.get(2).replace("|", "").split("");
        String[] D = strings.get(3).replace("|", "").split("");
        String[] A = strings.get(4).replace("|", "").split("");
        String[] E = strings.get(5).replace("|", "").split("");

        ArrayList<String[]> fingerrings = new ArrayList<>();

        int fingers = 1;

        String[][] arm = new String[][]{
            {"□", "□", "□", "□", "□", "□", " - Capo"},
            {"|", "|", "|", "|", "|", "|", " - I"},
            {"|", "|", "|", "|", "|", "|", " - II"},
            {"|", "|", "|", "|", "|", "|", " - III"},
            {"|", "|", "|", "|", "|", "|", " - V"},
            {"|", "|", "|", "|", "|", "|", " - VI"},
            {"|", "|", "|", "|", "|", "|", " - VII"},
            {"|", "|", "|", "|", "|", "|", " - VIII"},
            {"|", "|", "|", "|", "|", "|", " - IX"},
            {"|", "|", "|", "|", "|", "|", " - X"},
            {"|", "|", "|", "|", "|", "|", " - XIX"},
            {"|", "|", "|", "|", "|", "|", " - XX"},
            {"|", "|", "|", "|", "|", "|", " - XXX"}};
        for (int i = 0; i < e.length; i++) {
            boolean stepInto = false;
            {

                if (fingers < 4) {
                    //NOP
                } else {

                    fingers = 1;
                    StringBuilder chord = new StringBuilder();
                    for (int j = 0; j < arm.length; j++) {
                        String[] key = arm[j];
                        for (int k = 0; k < key.length; k++) {
                            String string = key[k];
                            chord.append(arm[j][k]);
                        }
                        chord.append("\n");

                    }

                    JEditorPane editorPane = new JEditorPane();
                    Font f = new Font("Courier new", Font.BOLD, 18);
                    editorPane.setFont(f);
                    editorPane.setEditable(false);
                    editorPane.setText(chord.toString());
                    editorPane.setSize(200, 100);
                    AREA2.add(editorPane);

                    arm = new String[][]{
                        {"□", "□", "□", "□", "□", "□", " - Capo"},
                        {"|", "|", "|", "|", "|", "|", " - I"},
                        {"|", "|", "|", "|", "|", "|", " - II"},
                        {"|", "|", "|", "|", "|", "|", " - III"},
                        {"|", "|", "|", "|", "|", "|", " - V"},
                        {"|", "|", "|", "|", "|", "|", " - VI"},
                        {"|", "|", "|", "|", "|", "|", " - VII"},
                        {"|", "|", "|", "|", "|", "|", " - VIII"},
                        {"|", "|", "|", "|", "|", "|", " - IX"},
                        {"|", "|", "|", "|", "|", "|", " - X"},
                        {"|", "|", "|", "|", "|", "|", " - XIX"},
                        {"|", "|", "|", "|", "|", "|", " - XX"},
                        {"|", "|", "|", "|", "|", "|", " - XXX"}
                    };
                }

                if (e[i].replace("-", "").length() > 0) {

                    if (Integer.parseInt(e[i]) == 0) {
                        arm[0][5] = "■";
                    } else {
                        arm[Integer.parseInt(e[i])][5] = "●";
                        fingers++;
                    }

                    stepInto = true;

                }
                if (B[i].replace("-", "").length() > 0) {

                    if (Integer.parseInt(B[i]) == 0) {
                        arm[0][4] = "■";
                    } else {
                        arm[Integer.parseInt(B[i])][4] = "●";
                        fingers++;
                    }

                    stepInto = true;
                }
                if (G[i].replace("-", "").length() > 0) {
                    if (Integer.parseInt(G[i]) == 0) {
                        arm[0][3] = "■";
                    } else {
                        arm[Integer.parseInt(G[i])][3] = "●";
                        fingers++;
                    }

                    stepInto = true;
                }
                if (D[i].replace("-", "").length() > 0) {
                    if (Integer.parseInt(D[i]) == 0) {
                        arm[0][2] = "■";
                    } else {
                        arm[Integer.parseInt(D[i])][2] = "●";
                        fingers++;
                    }

                    stepInto = true;
                }
                if (A[i].replace("-", "").length() > 0) {
                    if (Integer.parseInt(A[i]) == 0) {
                        arm[0][1] = "■";
                    } else {
                        arm[Integer.parseInt(A[i])][1] = "●";
                        fingers++;
                    }
                    fingers++;

                }
                if (E[i].replace("-", "").length() > 0) {
                    if (Integer.parseInt(E[i]) == 0) {
                        arm[0][0] = "■";
                    } else {
                        arm[Integer.parseInt(E[i])][0] = "●";
                        fingers++;
                    }

                    stepInto = true;
                }
            }
        }

    }
}
