
package boletin.pkg30;

/**
 *
 * @author dam1
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    
    private float aux=0;
    private float aux2=0;
    private int control;
    private float operacion;
    
    public Calculadora() {
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

        jPanel1 = new javax.swing.JPanel();
        panelNumeros = new javax.swing.JPanel();
        b7 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bDivision = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bMultiplicacion = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bMenos = new javax.swing.JButton();
        bComa = new javax.swing.JButton();
        bIgual = new javax.swing.JButton();
        bMas = new javax.swing.JButton();
        areaCalculadora = new javax.swing.JTextArea();
        bAC = new javax.swing.JButton();
        bOff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBounds(new java.awt.Rectangle(0, 0, 250, 380));
        setMaximumSize(new java.awt.Dimension(250, 380));
        setMinimumSize(new java.awt.Dimension(250, 380));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(250, 380));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 380));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 380));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNumeros.setBackground(new java.awt.Color(204, 204, 204));

        b7.setBackground(new java.awt.Color(102, 102, 102));
        b7.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("7");
        b7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b7.setPreferredSize(new java.awt.Dimension(40, 40));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(102, 102, 102));
        b4.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("4");
        b4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b4.setPreferredSize(new java.awt.Dimension(40, 40));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(102, 102, 102));
        b8.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("8");
        b8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b8.setPreferredSize(new java.awt.Dimension(40, 40));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(102, 102, 102));
        b9.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.setText("9");
        b9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b9.setPreferredSize(new java.awt.Dimension(40, 40));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bDivision.setBackground(new java.awt.Color(102, 102, 102));
        bDivision.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        bDivision.setForeground(new java.awt.Color(255, 255, 255));
        bDivision.setText("/");
        bDivision.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bDivision.setPreferredSize(new java.awt.Dimension(40, 40));
        bDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivisionActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(102, 102, 102));
        b5.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("5");
        b5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b5.setPreferredSize(new java.awt.Dimension(40, 40));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(102, 102, 102));
        b6.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("6");
        b6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b6.setPreferredSize(new java.awt.Dimension(40, 40));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bMultiplicacion.setBackground(new java.awt.Color(102, 102, 102));
        bMultiplicacion.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        bMultiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        bMultiplicacion.setText("*");
        bMultiplicacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bMultiplicacion.setPreferredSize(new java.awt.Dimension(40, 40));
        bMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiplicacionActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(102, 102, 102));
        b1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("1");
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b1.setPreferredSize(new java.awt.Dimension(40, 40));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(102, 102, 102));
        b2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("2");
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b2.setPreferredSize(new java.awt.Dimension(40, 40));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(102, 102, 102));
        b3.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("3");
        b3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b3.setPreferredSize(new java.awt.Dimension(40, 40));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(102, 102, 102));
        b0.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        b0.setForeground(new java.awt.Color(255, 255, 255));
        b0.setText("0");
        b0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b0.setPreferredSize(new java.awt.Dimension(40, 40));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bMenos.setBackground(new java.awt.Color(102, 102, 102));
        bMenos.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        bMenos.setForeground(new java.awt.Color(255, 255, 255));
        bMenos.setText("-");
        bMenos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bMenos.setPreferredSize(new java.awt.Dimension(40, 40));
        bMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosActionPerformed(evt);
            }
        });

        bComa.setBackground(new java.awt.Color(102, 102, 102));
        bComa.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        bComa.setForeground(new java.awt.Color(255, 255, 255));
        bComa.setText(".");
        bComa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bComa.setPreferredSize(new java.awt.Dimension(40, 40));
        bComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComaActionPerformed(evt);
            }
        });

        bIgual.setBackground(new java.awt.Color(102, 102, 102));
        bIgual.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        bIgual.setForeground(new java.awt.Color(255, 255, 255));
        bIgual.setText("=");
        bIgual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bIgual.setPreferredSize(new java.awt.Dimension(40, 40));
        bIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIgualActionPerformed(evt);
            }
        });

        bMas.setBackground(new java.awt.Color(102, 102, 102));
        bMas.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        bMas.setForeground(new java.awt.Color(255, 255, 255));
        bMas.setText("+");
        bMas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bMas.setPreferredSize(new java.awt.Dimension(40, 40));
        bMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNumerosLayout = new javax.swing.GroupLayout(panelNumeros);
        panelNumeros.setLayout(panelNumerosLayout);
        panelNumerosLayout.setHorizontalGroup(
            panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNumerosLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNumerosLayout.createSequentialGroup()
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNumerosLayout.createSequentialGroup()
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNumerosLayout.createSequentialGroup()
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNumerosLayout.createSequentialGroup()
                        .addComponent(bComa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        panelNumerosLayout.setVerticalGroup(
            panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumerosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bComa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(panelNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, 220));

        areaCalculadora.setBackground(new java.awt.Color(153, 153, 153));
        areaCalculadora.setColumns(25);
        areaCalculadora.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        areaCalculadora.setForeground(new java.awt.Color(69, 73, 74));
        areaCalculadora.setRows(5);
        areaCalculadora.setFocusable(false);
        areaCalculadora.setMinimumSize(new java.awt.Dimension(250, 22));
        jPanel1.add(areaCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 90));

        bAC.setBackground(new java.awt.Color(255, 0, 51));
        bAC.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        bAC.setForeground(new java.awt.Color(255, 255, 255));
        bAC.setText("AC");
        bAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bACActionPerformed(evt);
            }
        });
        jPanel1.add(bAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        bOff.setBackground(new java.awt.Color(0, 0, 255));
        bOff.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        bOff.setForeground(new java.awt.Color(255, 255, 255));
        bOff.setText("OFF");
        bOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOffActionPerformed(evt);
            }
        });
        jPanel1.add(bOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bACActionPerformed
        areaCalculadora.setText("");
        aux = 0;
        aux2 = 0;
        operacion=0;
        control = 0;
    }//GEN-LAST:event_bACActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        areaCalculadora.setText(areaCalculadora.getText() + "8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        areaCalculadora.setText(areaCalculadora.getText() + "2");
    }//GEN-LAST:event_b2ActionPerformed

    private void bMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosActionPerformed
        if (aux == 0 && control == 0){
            aux = Float.parseFloat(areaCalculadora.getText());
            control=2;
        }
        else if(aux!= 0 && operacion ==0){
            aux2 = Float.parseFloat(areaCalculadora.getText());
            control = 0;
            operacion = aux-aux2;
        }
        else if(operacion !=0){
            aux = Float.parseFloat(areaCalculadora.getText());
            operacion = operacion -aux;
        }
        
        
         
        
        
        
        areaCalculadora.setText("");
        
    }//GEN-LAST:event_bMenosActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        areaCalculadora.setText(areaCalculadora.getText() + "1");
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        areaCalculadora.setText(areaCalculadora.getText() + "0");
    }//GEN-LAST:event_b0ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        areaCalculadora.setText(areaCalculadora.getText() + "3");
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        areaCalculadora.setText(areaCalculadora.getText() + "4");
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        areaCalculadora.setText(areaCalculadora.getText() + "5");
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        areaCalculadora.setText(areaCalculadora.getText() + "6");
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        areaCalculadora.setText(areaCalculadora.getText() + "7");
    }//GEN-LAST:event_b7ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        areaCalculadora.setText(areaCalculadora.getText() + "9");
    }//GEN-LAST:event_b9ActionPerformed

    private void bOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOffActionPerformed
        this.dispose();
    }//GEN-LAST:event_bOffActionPerformed

    private void bIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIgualActionPerformed
        switch(control){
            case 1:
                aux2 = Float.parseFloat(areaCalculadora.getText());
                operacion = aux+aux2;
                break;
            case 2:
                aux2= Float.parseFloat(areaCalculadora.getText());
                operacion = aux-aux2;
                break;
            case 3:
                aux2= Float.parseFloat(areaCalculadora.getText());
                operacion = aux*aux2;
                break;
            case 4:
                aux2= Float.parseFloat(areaCalculadora.getText());
                operacion = aux/aux2;
                break;
            case 0:
                break;
                
        }
        areaCalculadora.setText(Float.toString(operacion));
        
    }//GEN-LAST:event_bIgualActionPerformed

    private void bMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasActionPerformed
        if (aux == 0 && control == 0){
            aux = Float.parseFloat(areaCalculadora.getText());
            control=1;
            
        }
        else if(aux!= 0 && operacion ==0){
            aux2 = Float.parseFloat(areaCalculadora.getText());
            control = 0;
            operacion = aux+aux2;
        }
        else if(aux!=0){
            aux = Float.parseFloat(areaCalculadora.getText());
            operacion = operacion +aux;
            control=0;
        }
        areaCalculadora.setText("");
    }//GEN-LAST:event_bMasActionPerformed

    private void bMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiplicacionActionPerformed
        if (aux == 0 && control == 0){
            aux = Float.parseFloat(areaCalculadora.getText());
            control=3;
        }
        else if(aux!= 0 && operacion ==0){
            aux2 = Float.parseFloat(areaCalculadora.getText());
            control = 0;
            operacion = aux*aux2;
        }
        else if(operacion !=0){
            aux = Float.parseFloat(areaCalculadora.getText());
            operacion = operacion*aux;
        }
        areaCalculadora.setText("");
    }//GEN-LAST:event_bMultiplicacionActionPerformed

    private void bDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivisionActionPerformed
        if (aux == 0 && control == 0){
            aux = Float.parseFloat(areaCalculadora.getText());
            control=4;
        }
        else if(aux!= 0 && operacion ==0){
            aux2 = Float.parseFloat(areaCalculadora.getText());
            control = 0;
            operacion = aux/aux2;
        }
        else if(operacion !=0){
            aux = Float.parseFloat(areaCalculadora.getText());
            operacion = operacion /aux;
        }
        areaCalculadora.setText("");
    }//GEN-LAST:event_bDivisionActionPerformed

    private void bComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComaActionPerformed
        areaCalculadora.setText(areaCalculadora.getText() + ".");
    }//GEN-LAST:event_bComaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCalculadora;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bAC;
    private javax.swing.JButton bComa;
    private javax.swing.JButton bDivision;
    private javax.swing.JButton bIgual;
    private javax.swing.JButton bMas;
    private javax.swing.JButton bMenos;
    private javax.swing.JButton bMultiplicacion;
    private javax.swing.JButton bOff;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelNumeros;
    // End of variables declaration//GEN-END:variables
}