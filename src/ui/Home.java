package ui;
import javax.swing.JFrame;
import app.*;

/**6
 *
 * @author Rui Varela
 */
public class Home extends javax.swing.JFrame {
    private static Passes passes;

    public Home(Passes passes) {
        initComponents();
        this.passes = passes;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        novoPass = new javax.swing.JButton();
        carregarPasse = new javax.swing.JButton();
        validarPasse = new javax.swing.JButton();
        pagarViagem = new javax.swing.JButton();
        alterarPasse = new javax.swing.JButton();
        passarPasse = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(180, 180, 180));

        novoPass.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        novoPass.setText("Novo Passe");
        novoPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoPassActionPerformed(evt);
            }
        });

        carregarPasse.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        carregarPasse.setText("Carregar Passe");
        carregarPasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarPasseActionPerformed(evt);
            }
        });

        validarPasse.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        validarPasse.setText("Validar Passe");
        validarPasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarPasseActionPerformed(evt);
            }
        });

        pagarViagem.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        pagarViagem.setText("Pagar viagem");
        pagarViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarViagemActionPerformed(evt);
            }
        });

        alterarPasse.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        alterarPasse.setText("Alterar Passe");
        alterarPasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarPasseActionPerformed(evt);
            }
        });

        passarPasse.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        passarPasse.setText("Passar Saldo");
        passarPasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passarPasseActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PaDi Application");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(novoPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carregarPasse, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(validarPasse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pagarViagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterarPasse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passarPasse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(novoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carregarPasse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validarPasse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pagarViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alterarPasse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passarPasse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoPassActionPerformed
        // TODO add your handling code here:
        TipPasse tp = new TipPasse(passes);
        tp.setVisible(true);
        tp.pack();
        tp.setLocationRelativeTo(null);
        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_novoPassActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_sairActionPerformed

    private void carregarPasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarPasseActionPerformed
        carregarPasse tp = new carregarPasse(passes);
        tp.setVisible(true);
        tp.pack();
        tp.setLocationRelativeTo(null);
        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_carregarPasseActionPerformed

    private void validarPasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarPasseActionPerformed
        validarPasse tp = new validarPasse(passes);
        tp.setVisible(true);
        tp.pack();
        tp.setLocationRelativeTo(null);
        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_validarPasseActionPerformed

    private void pagarViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarViagemActionPerformed
        pagarViagem tp = new pagarViagem(passes);
        tp.setVisible(true);
        tp.pack();
        tp.setLocationRelativeTo(null);
        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_pagarViagemActionPerformed

    private void alterarPasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarPasseActionPerformed
        alterarPasse tp = new alterarPasse(passes);
        tp.setVisible(true);
        tp.pack();
        tp.setLocationRelativeTo(null);
        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_alterarPasseActionPerformed

    private void passarPasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passarPasseActionPerformed
        passarSaldo tp = new passarSaldo(passes);
        tp.setVisible(true);
        tp.pack();
        tp.setLocationRelativeTo(null);
        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_passarPasseActionPerformed

    public void startApp() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home(passes).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarPasse;
    private javax.swing.JButton carregarPasse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton novoPass;
    private javax.swing.JButton pagarViagem;
    private javax.swing.JButton passarPasse;
    private javax.swing.JButton sair;
    private javax.swing.JButton validarPasse;
    // End of variables declaration//GEN-END:variables
}
