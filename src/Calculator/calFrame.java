
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

//import javax.swing.JOptionPane;

/**
 *
 * @author HER EXCELLENCY
 */
public class calFrame extends javax.swing.JFrame {

    String fnum = "";
    String snum = "";
    //String thnum = "";
    //String fonum = "";
    //String finum = "";
    String opr = "";

    public calFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblDisplay = new javax.swing.JLabel();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtnp = new javax.swing.JButton();
        jbtnm = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnd = new javax.swing.JButton();
        jbtndo = new javax.swing.JButton();
        jbtnmu = new javax.swing.JButton();
        jbtn00 = new javax.swing.JButton();
        jbtnc = new javax.swing.JButton();
        jbtne = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnpm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jlblDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblDisplay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtnp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnp.setText("+");
        jbtnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpActionPerformed(evt);
            }
        });

        jbtnm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnm.setText("-");
        jbtnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnd.setText("/");
        jbtnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndActionPerformed(evt);
            }
        });

        jbtndo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtndo.setText(".");
        jbtndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndoActionPerformed(evt);
            }
        });

        jbtnmu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnmu.setText("*");
        jbtnmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmuActionPerformed(evt);
            }
        });

        jbtn00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn00.setText("00");
        jbtn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn00ActionPerformed(evt);
            }
        });

        jbtnc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnc.setText("C");
        jbtnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncActionPerformed(evt);
            }
        });

        jbtne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtne.setText("=");
        jbtne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtneActionPerformed(evt);
            }
        });

        jLabel1.setText("Rose Calculator");

        jbtnpm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnpm.setText("+/-");
        jbtnpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnp, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtn00, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnmu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtndo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtndo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnmu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn00, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtne, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void EDbtn() {
        if (jlblDisplay.getText().length() > 0) {
            jbtn0.setEnabled(true);
            jbtnp.setEnabled(true);
            jbtnm.setEnabled(true);
            jbtn00.setEnabled(true);
            jbtnmu.setEnabled(true);
            jbtnpm.setEnabled(true);
            jbtnd.setEnabled(true);
            jbtne.setEnabled(true);
        } else {
            jbtn0.setEnabled(false);
            jbtnp.setEnabled(false);
            jbtnm.setEnabled(false);
            jbtn00.setEnabled(false);
            jbtnmu.setEnabled(false);
            jbtnpm.setEnabled(false);
            jbtnd.setEnabled(false);
            jbtne.setEnabled(false);
        }
    }
    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        String ds = jlblDisplay.getText();
        jlblDisplay.setText("");
        ds = ds + jbtn1.getText();
        jlblDisplay.setText(ds);
        EDbtn();
        
        /*String ds = jlblDisplay.getText();
        String dt = jlblDisplay.getText();
        String du = jlblDisplay.getText();
        String dv = jlblDisplay.getText();
        ds = ds + dt + du + dv + jbtn1.getText();
        jlblDisplay.setText(ds);
       */ //EDbtn();
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        String ds = jlblDisplay.getText();
        ds = ds + jbtn2.getText();
        jlblDisplay.setText(ds);
        EDbtn();
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String ds = jlblDisplay.getText();
        ds = ds + jbtn3.getText();
        jlblDisplay.setText(ds);
        EDbtn();
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        String ds = jlblDisplay.getText();
        ds = ds + jbtn4.getText();
        jlblDisplay.setText(ds);
        EDbtn();
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String ds = jlblDisplay.getText();
        ds = ds + jbtn5.getText();
        jlblDisplay.setText(ds);
        EDbtn();
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        String ds = jlblDisplay.getText();
        ds = ds + jbtn6.getText();
        jlblDisplay.setText(ds);
        EDbtn();
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String ds = jlblDisplay.getText();
        ds = ds + jbtn7.getText();
        jlblDisplay.setText(ds);
        EDbtn();
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String ds = jlblDisplay.getText();
        ds = ds + jbtn8.getText();
        jlblDisplay.setText(ds);
        EDbtn();          
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        String ds = jlblDisplay.getText();
        ds = ds + jbtn9.getText();
        jlblDisplay.setText(ds);
        EDbtn();           
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        String ds = jlblDisplay.getText();
        ds = ds + jbtn0.getText();
        jlblDisplay.setText(ds);
        EDbtn(); 
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn00ActionPerformed
        String ds = jlblDisplay.getText();
        ds = ds + jbtn00.getText();
        jlblDisplay.setText(ds);
        EDbtn();
         
    }//GEN-LAST:event_jbtn00ActionPerformed

    private void jbtndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndoActionPerformed
        String ds = jlblDisplay.getText();
        ds = ds + jbtndo.getText();
        EDbtn(); 
        if (jlblDisplay.getText().length() > 0) {
            jlblDisplay.setText("");
            jlblDisplay.setText(ds);
        } else {
            jlblDisplay.setText("");
            jlblDisplay.setText("0" + ds);
        }

        jbtndo.setEnabled(false);
    }//GEN-LAST:event_jbtndoActionPerformed

    private void jbtncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncActionPerformed
        jlblDisplay.setText("");
        fnum = "";
        snum = "";
        //thnum = "";
        //fonum= "";
        //finum = "";
        opr = "";
        EDbtn();
        jbtndo.setEnabled(true);
        jbtn0.setEnabled(true);
        jbtn00.setEnabled(true);
    }//GEN-LAST:event_jbtncActionPerformed

    private void jbtnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpActionPerformed
        fnum = jlblDisplay.getText();
        jlblDisplay.setText("");
        opr = jbtnp.getText();
        jbtndo.setEnabled(true);
        EDbtn();
    }//GEN-LAST:event_jbtnpActionPerformed

    private void jbtnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmActionPerformed
        fnum = jlblDisplay.getText();
        jlblDisplay.setText("");
        opr = jbtnm.getText();
        jbtndo.setEnabled(true);
        EDbtn();   
    }//GEN-LAST:event_jbtnmActionPerformed

    private void jbtnmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmuActionPerformed
        fnum = jlblDisplay.getText();
        jlblDisplay.setText("");
        opr = jbtnmu.getText();
        jbtndo.setEnabled(true);
        EDbtn();
    }//GEN-LAST:event_jbtnmuActionPerformed

    private void jbtndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndActionPerformed
        fnum = jlblDisplay.getText();
        jlblDisplay.setText("");
        opr = jbtnd.getText();
        jbtndo.setEnabled(true);
        jbtn0.setEnabled(false);
        jbtn00.setEnabled(false);
        EDbtn();
    }//GEN-LAST:event_jbtndActionPerformed

    private void jbtneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtneActionPerformed
        snum = jlblDisplay.getText();
        //thnum = jlblDisplay.getText();
        //fonum = jlblDisplay.getText();
        //finum = jlblDisplay.getText();
        double n1 = Double.parseDouble(fnum);
        double n2 = Double.parseDouble(snum);
        //double n3 = Double.parseDouble(thnum);
        //double n4 = Double.parseDouble(fonum);
        //double n5 = Double.parseDouble(finum);
        double answer = 0.00;
        if (opr == "+") {
            answer = n1 + n2;// + n3 + n4 + n5;
        }
        if (opr == "-") {
            answer = n1 - n2;// - n3 - n4 - n5;
        }
        if (opr == "*") {
            answer = n1 * n2;// * n3 * n4 * n5;
        }
        if (opr == "/") {
            answer = n1 / n2;// n3 / n4 / n5;
        }

        jlblDisplay.setText(String.valueOf(answer));
        jbtn0.setEnabled(true);
        jbtn00.setEnabled(true);

    }//GEN-LAST:event_jbtneActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        EDbtn();
    }//GEN-LAST:event_formWindowOpened

    private void jbtnpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpmActionPerformed
        double gt = Double.parseDouble(jlblDisplay.getText());
        gt = gt * -1;
        jlblDisplay.setText(String.valueOf(gt));
    }//GEN-LAST:event_jbtnpmActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       // JOptionPane.showMessageDialog(null, "THANK YOU \n FOR USING \n ROSE CALCULATORS \n Visit our site www.rose.com");
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new calFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn00;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnc;
    private javax.swing.JButton jbtnd;
    private javax.swing.JButton jbtndo;
    private javax.swing.JButton jbtne;
    private javax.swing.JButton jbtnm;
    private javax.swing.JButton jbtnmu;
    private javax.swing.JButton jbtnp;
    private javax.swing.JButton jbtnpm;
    private javax.swing.JLabel jlblDisplay;
    // End of variables declaration//GEN-END:variables
}
