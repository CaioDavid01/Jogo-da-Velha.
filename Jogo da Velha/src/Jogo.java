/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Caio David
 */
public class Jogo extends javax.swing.JFrame {
public boolean jog1=true;
public boolean jog2=true;
public int contpos=0;
public int k=0,i=0;
int op;
public String linha1, linha2, linha3, coluna1, coluna2, coluna3, diagonal1, diagonal2;
String[][]posvetor=new String[3][3];

     
     
    public Jogo() {
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

        bnt1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        Reiniciar = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        sair = new javax.swing.JButton();
        Resetar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/IMG_1056 (7).JPG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, 60, 170));

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, 80));

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 100, 90));

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 110, 90));

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 100, 90));

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 149, 100, 90));

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 278, 110, 70));

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 100, 70));

        Reiniciar.setText("REINICIAR");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 450, -1, 40));

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 280, 90, 70));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 190, 70));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 190, 70));

        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 320, 20));

        sair.setText("SAIR");
        getContentPane().add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 470, -1, 30));

        Resetar.setText("RESETAR");
        getContentPane().add(Resetar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, -1, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void verificarJogadordavez(){{
        if(jog1&&jog2){
            this.op=1;
            jog1=false;
            jog2=true;
}else if(jog1&&jog2==false){
       this.op=1;
       jog1=false;
       jog2=true;
       
}else{
  this.op=2;
       jog1=true;
       jog2=false;  
            } 
        }
    }
    
    public void Limpaposicoes(){
        for(i=0;i<3;i++){
            for(k=0;k<3;k++){
                posvetor[i] [k]="";
            }
        }
    }
      
    public void VerificarVencedor(){
        linha1=posvetor[0][0]+posvetor[0][1]+posvetor[0][2];
        linha2=posvetor[1][0]+posvetor[1][1]+posvetor[1][2];
        linha3=posvetor[2][0]+posvetor[2][1]+posvetor[2][2];

         coluna1=posvetor[0][0]+posvetor[1][0]+posvetor[2][0];
         coluna2=posvetor[0][1]+posvetor[1][1]+posvetor[2][1];
         coluna3=posvetor[0][2]+posvetor[1][2]+posvetor[2][2];

         diagonal1=posvetor[0][0]+posvetor[1][1]+posvetor[2][2];
         diagonal2=posvetor[0][2]+posvetor[1][1]+posvetor[2][0];

if (linha1.equals("xxx")){
txtvisor.setText("o vencedor é o X");
}
    }
    
    
    private void bnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt1ActionPerformed
        verificarJogadordavez();{
        if(op==1){
        bnt1.setText("X");
        posvetor[0][0]="X";
}else{
    bnt1.setText("O");
    posvetor[0][0]="O";
}
        bnt1.setEnabled(false);
        VerificarVencedor();
    }//GEN-LAST:event_bnt1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        
        if(op==1){
        btn2.setText("X");
        posvetor[0][1]="X";
        }else{
    btn2.setText("O");
    posvetor[0][1]="O";
}
        btn2.setEnabled(false);
VerificarVencedor();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       
if(op==1){
}
        btn3.setText("X");
        posvetor[0][2]="X";
    }else{

    btn3.setText("O");
    posvetor[0][2]="O";
}
        btn3.setEnabled(false);
  VerificarVencedor();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(op==1){
        btn4.setText("X");
        posvetor[1][0]="X";
    }else{

    btn4.setText("O");
    posvetor[1][1]="O";
}
        btn4.setEnabled(false);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(op==1){
        btn5.setText("X");
        posvetor[1][1]="X";
    }else{

    btn5.setText("O");
    posvetor[1][1]="O";
}
        btn5.setEnabled(false); 
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         if(op==1){
        btn6.setText("X");
        posvetor[1][2]="X";
    }else{

    btn6.setText("O");
    posvetor[1][2]="O";
}
        btn6.setEnabled(false); 
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
           if(op==1){
        btn7.setText("X");
        posvetor[2][0]="X";
    }else{

    btn7.setText("O");
    posvetor[2][0]="O";
}
        btn7.setEnabled(false); 
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
              if(op==1){
        btn8.setText("X");
        posvetor[2][1]="X";
    }else{

    btn8.setText("O");
    posvetor[2][1]="O";
}
        btn8.setEnabled(false); 
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
             if(op==1){
        btn9.setText("X");
        posvetor[2][2]="X";
    }else{

    btn9.setText("O");
    posvetor[2][2]="O";
}
        btn9.setEnabled(false); 
    }//GEN-LAST:event_btn9ActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        bnt1.setText("");
        bnt1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        Limpaposicoes();
        
        
        
    }//GEN-LAST:event_ReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reiniciar;
    private javax.swing.JButton Resetar;
    private javax.swing.JButton bnt1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
