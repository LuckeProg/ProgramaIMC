package classes;

/**
 *
 * @author Lucas
 */
public class TelaImc extends javax.swing.JFrame {

    public TelaImc() {
        initComponents();
        panResultado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtIdade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMasc = new javax.swing.JRadioButton();
        btnFem = new javax.swing.JRadioButton();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panResultado = new javax.swing.JPanel();
        lblImc = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdade.setBackground(new java.awt.Color(32, 33, 35));
        txtIdade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIdade.setForeground(new java.awt.Color(255, 255, 255));
        txtIdade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 53, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Idade");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 50, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sexo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        buttonGroup1.add(btnMasc);
        btnMasc.setForeground(new java.awt.Color(255, 255, 255));
        btnMasc.setText("Masculino");
        jPanel1.add(btnMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        buttonGroup1.add(btnFem);
        btnFem.setForeground(new java.awt.Color(255, 255, 255));
        btnFem.setText("Feminino");
        jPanel1.add(btnFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        txtAltura.setBackground(new java.awt.Color(32, 33, 35));
        txtAltura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAltura.setForeground(new java.awt.Color(255, 255, 255));
        txtAltura.setText("1.62");
        txtAltura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 53, -1));

        txtPeso.setBackground(new java.awt.Color(32, 33, 35));
        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(255, 255, 255));
        txtPeso.setText("60");
        txtPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 52, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kg");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Calculo IMC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Altura");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Peso");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cm");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        panResultado.setBackground(new java.awt.Color(32, 33, 35));
        panResultado.setForeground(new java.awt.Color(32, 33, 35));

        lblImc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblImc.setForeground(new java.awt.Color(255, 0, 0));
        lblImc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImc.setText("Seu IMC Aqui");

        lblRes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblRes.setForeground(new java.awt.Color(255, 255, 255));
        lblRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRes.setText("Recomendação");

        javax.swing.GroupLayout panResultadoLayout = new javax.swing.GroupLayout(panResultado);
        panResultado.setLayout(panResultadoLayout);
        panResultadoLayout.setHorizontalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRes, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addComponent(lblImc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panResultadoLayout.setVerticalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblImc)
                .addGap(18, 18, 18)
                .addComponent(lblRes, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 410, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 19, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(404, 366));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        panResultado.setVisible(true);
        int idade = Integer.parseInt(txtIdade.getText());
        float altura = Float.parseFloat(txtAltura.getText());
        float peso = Float.parseFloat(txtPeso.getText());
        float imc = peso/(altura*altura);
        lblImc.setText(String.format("Seu IMC é " + "%.1f",imc));
        
        if (imc< 16.0) {
            lblRes.setText("<html> Você está com magreza grave procure um nutricionista para mais detalhes </html>");
        } else if (imc>=16 && imc<17) {
            lblRes.setText("<html>Você está com magreza moderada procure um nutricionista para mais detalhes</html>");
        } else if (imc>=17 && imc<18.5) {
            lblRes.setText("<html>Você está com magreza leve procure um nutricionista para mais detalhes</html>");
        } else if (imc>=18.5 && imc<25) {
            lblRes.setText("<html>Parabéns você está dentro do que é considerado saudável</html>");
        } else if (imc>=25 && imc<30) {
            lblRes.setText("<html>Você está com sobrepeso procure um nutricionista para mais detalhes</html>");
        } else if (imc>=30 && imc<35) {
            lblRes.setText("<html>Você está com obesidade grau I procure um nutricionista para mais detalhes</html>");
        } else if (imc>=35 && imc<40) {
            lblRes.setText("<html>Você está com obesidade grau II procure um nutricionista para mais detalhes</html>");
        } else {
            lblRes.setText("<html>Você está com obesidade mórbida procure um médico com urgência</html>");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        
    }//GEN-LAST:event_txtPesoActionPerformed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel8MousePressed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(TelaImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaImc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnFem;
    private javax.swing.JRadioButton btnMasc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImc;
    private javax.swing.JLabel lblRes;
    private javax.swing.JPanel panResultado;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
