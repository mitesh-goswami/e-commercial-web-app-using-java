/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.db;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static javaapplication.db.c1.d;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jigar
 */
public class Purchase extends javax.swing.JFrame {
public static String d;
    /**
     * Creates new form Purchase
     */
    public Purchase() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        a = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        q = new javax.swing.JTextField();
        lq = new javax.swing.JLabel();
        la = new javax.swing.JLabel();
        nm = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        am = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        a.setColumns(20);
        a.setRows(5);
        jScrollPane1.setViewportView(a);

        jLabel3.setText("Only COD avilable");

        jLabel4.setText("Your order will be placed within 4-5 days");

        jLabel6.setText("Enter the Quantity");

        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });

        nm.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nmAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        l.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel7.setText("Amount");

        am.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                amAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(q, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addComponent(am, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(la, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                        .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(la, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lq, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if( a.getText().trim().isEmpty() && q.getText().trim().isEmpty()){
          //  nm.setText("Name is empty");
            la.setText("Address is empty");
             lq.setText("Quantity is empty");
        }
       
        else if(a.getText().trim().isEmpty()){
            la.setText("Address is empty");
        }
        else if(q.getText().trim().isEmpty()){
            lq.setText("Quantity is empty");

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Purchase Sucessfull");
            new Home().setVisible(true);
        }
        
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
  Connection conn =null;
         PreparedStatement pstmt=null;
         login p=new login();
         
        try{
        //String UserName=U.getText();
        /*String*/ d=q.getText();
        
         String k=p.Username;         
            Class.forName("com.mysql.jdbc.Driver");

            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mitesh","root","mitesh123");
           // String query="Select password from new_table where name=' "+U.getText()+"' ";
            //PreparedStatement pst = conn.prepareStatement(query);
           /* Statement pst=null;
            pst=conn.createStatement();*/
            //ResultSet rs = pst.executeQuery("select name,q1 from new_table");
            pstmt=conn.prepareStatement("update new_table set q1=? where name like ? ");
            pstmt.setString(1,d);
            pstmt.setString(2, k);
           // ResultSet q=pst.executeQuery("select name,password from new_table");;
           // String k;
            int flag=0;
            int i=pstmt.executeUpdate();
            if(i>0)
                    {
                        JOptionPane.showMessageDialog(null,"data is saved");
                       // p.ki2="kid2";
                        //new Home().setVisible(true);
                       
                       
                    }
            else
            {
                JOptionPane.showMessageDialog(null,"Data is not saved");
            }
           /* while(rs.next())//do
            {
                String n=rs.getString(1);
                String w=rs.getString(2);
                k=n;
                flag=0;
                
                //JOptionPane.showMessageDialog(null, n);
               // break;
                if(UserName == null ? n == null :(UserName.equals(n) && d.equals(w)))
                {
                   JOptionPane.showMessageDialog(null, "login succesfull");
                     new Home().setVisible(true); 
                     flag=1;
                        break;
                }
            
             /*   else if(!q.next())
            {   
                                JOptionPane.showMessageDialog(null, "hello");
                                dispose();
            }
                //JOptionPane.showMessageDialog(null, k);
            }//while(rs.next());*/
           /* if(flag==0)
            {
            
            JOptionPane.showMessageDialog(null, "login unsuccesfull");
            dispose();
            }*/
            
              /*  if(!rs.next())
                {
                                JOptionPane.showMessageDialog(null, "login unsuccessfull");
                                dispose();
            
                }*/
           /* if(pass.equals(rs.getString("password"))){
                JOptionPane.showMessageDialog(null, "Login Successfull");
                        new Home().setVisible(true);

                
            }*/
          /*  else
            {
                                JOptionPane.showMessageDialog(null, "Login UnSuccessfull");
                                dispose();
            }*/
        }catch( HeadlessException | ClassNotFoundException | SQLException e)
        {
                            JOptionPane.showMessageDialog(null, e);

        } // TODO add your handling code here:
    }//GEN-LAST:event_qActionPerformed

    private void nmAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nmAncestorAdded
login pq=new login();
nm.setText(pq.Username);        // TODO add your handling code here:
        
    }//GEN-LAST:event_nmAncestorAdded

    private void lAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lAncestorAdded
        // TODO add your handling code here:
         ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("kid1.jpg")));
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(l.getWidth(),l.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        l.setIcon(i);
    }//GEN-LAST:event_lAncestorAdded

    private void amAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_amAncestorAdded
//c1 pq=new c1();
int n;
String s;
n=Integer.parseInt(d)*999;
s=Integer.toString(n);
am.setText(s);        // TODO add your handling code here:
    }//GEN-LAST:event_amAncestorAdded

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
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a;
    private javax.swing.JLabel am;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l;
    private javax.swing.JLabel la;
    private javax.swing.JLabel lq;
    private javax.swing.JLabel nm;
    private javax.swing.JTextField q;
    // End of variables declaration//GEN-END:variables
}
