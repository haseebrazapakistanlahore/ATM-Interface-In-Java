/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atminterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Haseeb Raza
 */
public class Fastcash extends javax.swing.JFrame {

    /**
     * Creates new form Fastcash
     */
    public Fastcash() {
        initComponents();
    }
   int MyAccNum;
    int OldBalance;
    public Fastcash(int AccNum) {
        initComponents();
        MyAccNum=AccNum;    
        GetBalance();
    }
    Connection Con=null;
      PreparedStatement pst=null,pst1=null;
      ResultSet Rs =null,Rs1=null;
      Statement  St=null,St1=null;
    private void GetBalance(){
          String Query="select * from accountdetails where AccNum='"+MyAccNum+"'";
        try{
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            St1= Con.createStatement();
            Rs1=St1.executeQuery(Query);
            if(Rs1.next()){
            OldBalance= Rs1.getInt(2);   
            Balancelbl.setText("Rs"+OldBalance);
            }
            else{
               // JOptionPane.showMessageDialog(this, "Wrong Account Number or PIN");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
            
        }
        
    } 

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        depositbtn = new javax.swing.JButton();
        fastcashbtn = new javax.swing.JButton();
        changebtn = new javax.swing.JButton();
        withdrawbtn = new javax.swing.JButton();
        ministatementbtn = new javax.swing.JButton();
        balancebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Balancelbl = new javax.swing.JLabel();
        Balancelbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Haseeb Bank limited");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        depositbtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        depositbtn.setForeground(new java.awt.Color(52, 102, 255));
        depositbtn.setText("Rs 100");
        depositbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositbtnMouseClicked(evt);
            }
        });

        fastcashbtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fastcashbtn.setForeground(new java.awt.Color(52, 102, 255));
        fastcashbtn.setText("Rs 1000");
        fastcashbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fastcashbtnMouseClicked(evt);
            }
        });

        changebtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        changebtn.setForeground(new java.awt.Color(52, 102, 255));
        changebtn.setText("Rs 5000");
        changebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changebtnMouseClicked(evt);
            }
        });

        withdrawbtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        withdrawbtn.setForeground(new java.awt.Color(51, 102, 255));
        withdrawbtn.setText("Rs 500");
        withdrawbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawbtnMouseClicked(evt);
            }
        });

        ministatementbtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ministatementbtn.setForeground(new java.awt.Color(52, 102, 255));
        ministatementbtn.setText("Rs 2000");
        ministatementbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ministatementbtnMouseClicked(evt);
            }
        });

        balancebtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        balancebtn.setForeground(new java.awt.Color(52, 102, 255));
        balancebtn.setText("Rs 10000");
        balancebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balancebtnMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 102, 255));
        jLabel4.setText("Fast cash");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 102, 255));
        jLabel6.setText("Haseeb Bank Limited");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("LOG OUT");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        Balancelbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Balancelbl.setForeground(new java.awt.Color(52, 102, 255));
        Balancelbl.setText("Balance");

        Balancelbl1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Balancelbl1.setForeground(new java.awt.Color(52, 102, 255));
        Balancelbl1.setText("Your Balance");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fastcashbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(withdrawbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ministatementbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balancebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addGap(76, 76, 76))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Balancelbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Balancelbl)
                        .addGap(180, 180, 180))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Balancelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Balancelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fastcashbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ministatementbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balancebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(77, 77, 77)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String MyDate;
    public void GetDate(){
        java.util.Date d=new java.util.Date();
        SimpleDateFormat s=new SimpleDateFormat("dd,mm,yyyy");
         MyDate =s.format(d);
    }
    private void depositbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositbtnMouseClicked
        if (OldBalance<100){
             JOptionPane.showMessageDialog(this, "No Enough Amount");
        }
        else{
            try{
                String Query ="Update accountdetails set Balance=? where AccNum=?";
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps= Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-100);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                    JOptionPane.showMessageDialog(this, "Balance Updated");
                  GetDate();
               Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
               PreparedStatement Add=Con.prepareStatement("insert into trasanctiontbl values (?,?,?,?,?)");
               Add.setInt(1,1);
               Add.setInt(2, MyAccNum);
               Add.setString(3, "Withdraw");
               Add.setString(4, MyDate);
               Add.setInt(5, 100);
               int row=Add.executeUpdate();
               Con.close();
                     Mainmenu mainMenu = new Mainmenu(MyAccNum); // Use the account number
                     mainMenu.setVisible(true);
    this.dispose(); // Close the current window
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_depositbtnMouseClicked

    private void withdrawbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawbtnMouseClicked
        if (OldBalance<500){
             JOptionPane.showMessageDialog(this, "No Enough Amount");
        }
        else{
            try{
                String Query ="Update accountdetails set Balance=? where AccNum=?";
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps= Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-500);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                    JOptionPane.showMessageDialog(this, "Balance Updated");
                GetDate();
               Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
               PreparedStatement Add=Con.prepareStatement("insert into trasanctiontbl values (?,?,?,?,?)");
               Add.setInt(1,1);
               Add.setInt(2, MyAccNum);
               Add.setString(3, "Withdraw");
               Add.setString(4, MyDate);
               Add.setInt(5, 500);
               int row=Add.executeUpdate();
               Con.close();
                Mainmenu mainMenu = new Mainmenu(MyAccNum); // Use the account number
                 mainMenu.setVisible(true);
             
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_withdrawbtnMouseClicked

    private void fastcashbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fastcashbtnMouseClicked
       if (OldBalance<1000){
             JOptionPane.showMessageDialog(this, "No Enough Amount");
        }
        else{
            try{
                String Query ="Update accountdetails set Balance=? where AccNum=?";
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps= Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-1000);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                    JOptionPane.showMessageDialog(this, "Balance Updated");
                     GetDate();
               Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
               PreparedStatement Add=Con.prepareStatement("insert into trasanctiontbl values (?,?,?,?,?)");
               Add.setInt(1,1);
               Add.setInt(2, MyAccNum);
               Add.setString(3, "Withdraw");
               Add.setString(4, MyDate);
               Add.setInt(5, 1000);
               int row=Add.executeUpdate();
               Con.close();
                    Mainmenu mainMenu = new Mainmenu(MyAccNum); // Use the account number
                    mainMenu.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_fastcashbtnMouseClicked

    private void ministatementbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ministatementbtnMouseClicked
         if (OldBalance<2000){
             JOptionPane.showMessageDialog(this, "No Enough Amount");
        }
        else{
            try{
                String Query ="Update accountdetails set Balance=? where AccNum=?";
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps= Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-2000);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                    JOptionPane.showMessageDialog(this, "Balance Updated");
                     GetDate();
               Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
               PreparedStatement Add=Con.prepareStatement("insert into trasanctiontbl values (?,?,?,?,?)");
               Add.setInt(1,1);
               Add.setInt(2, MyAccNum);
               Add.setString(3, "Withdraw");
               Add.setString(4, MyDate);
               Add.setInt(5, 2000);
               int row=Add.executeUpdate();
               Con.close();
                     Mainmenu mainMenu = new Mainmenu(MyAccNum); // Use the account number
                     mainMenu.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_ministatementbtnMouseClicked

    private void changebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changebtnMouseClicked
          if (OldBalance<5000){
             JOptionPane.showMessageDialog(this, "No Enough Amount");
        }
        else{
            try{
                String Query ="Update accountdetails set Balance=? where AccNum=?";
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps= Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-5000);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                    JOptionPane.showMessageDialog(this, "Balance Updated");
                    GetDate();
               Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
               PreparedStatement Add=Con.prepareStatement("insert into trasanctiontbl values (?,?,?,?,?)");
               Add.setInt(1,1);
               Add.setInt(2, MyAccNum);
               Add.setString(3, "Withdraw");
               Add.setString(4, MyDate);
               Add.setInt(5, 5000);
               int row=Add.executeUpdate();
               Con.close();
                    Mainmenu mainMenu = new Mainmenu(MyAccNum); // Use the account number
                    mainMenu.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_changebtnMouseClicked

    private void balancebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balancebtnMouseClicked
         if (OldBalance<10000){
             JOptionPane.showMessageDialog(this, "No Enough Amount");
        }
        else{
            try{
                String Query ="Update accountdetails set Balance=? where AccNum=?";
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                PreparedStatement ps= Con.prepareStatement(Query);
                ps.setInt(1, OldBalance-10000);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate()==1){
                    JOptionPane.showMessageDialog(this, "Balance Updated");
                   GetDate();
               Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
               PreparedStatement Add=Con.prepareStatement("insert into trasanctiontbl values (?,?,?,?,?)");
               Add.setInt(1,1);
               Add.setInt(2, MyAccNum);
               Add.setString(3, "Withdraw");
               Add.setString(4, MyDate);
               Add.setInt(5, 10000);
               int row=Add.executeUpdate();
               Con.close();
                   Mainmenu mainMenu = new Mainmenu(MyAccNum); // Use the account number
                   mainMenu.setVisible(true);
    this.dispose(); // Close the current window
                }else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_balancebtnMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      new Login().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fastcash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balancelbl;
    private javax.swing.JLabel Balancelbl1;
    private javax.swing.JButton balancebtn;
    private javax.swing.JButton changebtn;
    private javax.swing.JButton depositbtn;
    private javax.swing.JButton fastcashbtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton ministatementbtn;
    private javax.swing.JButton withdrawbtn;
    // End of variables declaration//GEN-END:variables
}
