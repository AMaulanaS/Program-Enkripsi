package progenkripsi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FormEnkrip extends javax.swing.JFrame {
    private JFileChooser dialog = new JFileChooser();
    
    public FormEnkrip() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btBuka = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtChiperText = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPlaintext = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btEnkrip = new javax.swing.JButton();
        btDekrip = new javax.swing.JButton();
        txtKey = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("===>");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program Enkripsi");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        setModalExclusionType(null);
        setResizable(false);

        btBuka.setText("Buka File");
        btBuka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBukaActionPerformed(evt);
            }
        });

        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btKeluar.setText("Keluar");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });

        txtChiperText.setColumns(20);
        txtChiperText.setRows(5);
        jScrollPane3.setViewportView(txtChiperText);

        txtPlaintext.setColumns(20);
        txtPlaintext.setRows(5);
        jScrollPane4.setViewportView(txtPlaintext);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ENKRIPSI ");

        jLabel3.setText("Plaintext");

        jLabel4.setText("Chipertext");

        btEnkrip.setText("Enkirpsi");
        btEnkrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnkripActionPerformed(evt);
            }
        });

        btDekrip.setText("Dekripsi");
        btDekrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDekripActionPerformed(evt);
            }
        });

        txtKey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyKeyPressed(evt);
            }
        });

        jLabel6.setText("Masukan Key");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btEnkrip, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btBuka)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel3)
                        .addGap(188, 188, 188)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnkrip)
                    .addComponent(btDekrip)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSimpan)
                    .addComponent(btBuka)
                    .addComponent(btKeluar)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //BUTTON OPEN
    private void btBukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBukaActionPerformed
        txtChiperText.setText(null);
        int isi = dialog.showOpenDialog(this);

        if (isi == JFileChooser.APPROVE_OPTION) {   //jika file dipilih open
            File file = dialog.getSelectedFile();
            try{
                FileInputStream fstream = new FileInputStream(file);
                DataInputStream in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));                
                String strLine;
                while ((strLine = br.readLine()) != null){
                    StringTokenizer st = new StringTokenizer(strLine, ",");
                    txtChiperText.setText(txtChiperText.getText() + st.nextToken() +"\n");
                }
                in.close();
            }catch (Exception e){
                System.err.println("Error: " + e.getMessage());
            }
        } 
    }//GEN-LAST:event_btBukaActionPerformed
    //BUTTON SIMPAN
    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        int isi = dialog.showSaveDialog(this);
        if (isi == JFileChooser.APPROVE_OPTION) {    // jika file di pilih untuk di simpan
            File file = dialog.getSelectedFile();
            try {
                file.createNewFile();
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));                
                out.print(txtChiperText.getText());
                out.flush();   
            } 
            catch (IOException ex) {
                System.err.println("Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btSimpanActionPerformed
    // BUTTON KELUAR
    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btKeluarActionPerformed
    // BUTTON ENKRIPSI
    private void btEnkripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnkripActionPerformed
       String key = txtKey.getText();
       String isitext = (key.length())+key+txtPlaintext.getText();
       String out= "" ;
        for (int i = 0; i < isitext.length(); i++) {
           int index = isitext.charAt(i);
           char s = (char)(index+1) ;
           out = out+ String.valueOf(s);
        }  
       txtChiperText.setText(out);
       txtPlaintext.setText("");
       txtKey.setText("");
    }//GEN-LAST:event_btEnkripActionPerformed
    // BUTTON DEKRIP
    private void btDekripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDekripActionPerformed
       String isitext = txtChiperText.getText();
       char k = (char)(isitext.charAt(0));
       String key = "",out = "";
       int   jumKey = Integer.parseInt(String.valueOf(k))-1;
    //   JOptionPane.showMessageDialog(null,jumKey);
       // buka password
       for (int i = 1 ; i <= jumKey; i++) {
           int index = isitext.charAt(i);
           char s = (char)(index-1) ;
           key = key + String.valueOf(s);
        }  
    //   JOptionPane.showMessageDialog(null,key);
       
       if (key.equals(txtKey.getText())){  // hasil true
            for (int i = (jumKey+1) ; i < isitext.length(); i++) {
                int index = isitext.charAt(i);
                char s = (char)(index-1) ;
                out = out + String.valueOf(s);
            }  
            txtPlaintext.setText(out);    
       }
       
       else{
         JOptionPane.showMessageDialog(null,"Key tidak cocok \nSilahkan coba lagi");
       }
    }//GEN-LAST:event_btDekripActionPerformed

    private void txtKeyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyKeyPressed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override 
            public void run() {
                new FormEnkrip().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuka;
    private javax.swing.JButton btDekrip;
    private javax.swing.JButton btEnkrip;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtChiperText;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextArea txtPlaintext;
    // End of variables declaration//GEN-END:variables
}
