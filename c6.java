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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javaapplication.db.c1.d;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jigar
 */
public class c6 extends javax.swing.JFrame {
public static String d;
    /**
     * Creates new form c1
     */
    public c6() {
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

        m5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        q = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        m5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                m5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton1.setText("Purchase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantity");

        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_m5AncestorAdded
        // TODO add your handling code here:
         login p=new login();
Connection conn =null;
        PreparedStatement pstmt=null;
try
{
     Class.forName("com.mysql.jdbc.Driver");
            
         cart ko =new cart();    //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=rootpassword"); 
            
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mitesh","root","mitesh123");
            String k=p.Username;
            //pstmt=conn.prepareStatement("select path from new_table where name like ? ");
            Statement pst=null;
           pst=conn.createStatement();
         //  pstmt=conn.prepareStatement("select path from new_table where name like ? ");
                 //      pstmt.setString(1,k);

            ResultSet rs = pst.executeQuery("select name,path2 from new_table");
            int flag=0;
            int g=0;
            while(rs.next())
            {String n=rs.getString(1);
            String w=rs.getString(2);
            flag=0;
           
            if(p.Username == null ? n == null :( p.Username.equals(n)))
            {
               /*ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("w1.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m5.getWidth(),m5.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m5.setIcon(i);*/
                //JOptionPane.showMessageDialog(null, w);
               flag=1;
               //g=1;
             // w="a";
               
               if(w==null)
            { //JOptionPane.showMessageDialog(null, n);
            //g=1; 
                g=1;
                   break;
               
            }
               
            else
               {
                  
                    ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("kid2.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m5.getWidth(),m5.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m5.setIcon(i);
               break;
               }
               
               
                
                //dispose();
                
            
              // JOptionPane.showMessageDialog(null, "a");
               //l1.setText("w");
              // break;
            }
            }
            if(g==1)
            {//JOptionPane.showMessageDialog(null, g);
            dispose();}
     
            
}
catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                      
    }//GEN-LAST:event_m5AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new pk2().setVisible(true);        // TODO add your handling code here:
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
            pstmt=conn.prepareStatement("update new_table set q2=? where name like ? ");
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

        }         // TODO add your handling code here:
    }//GEN-LAST:event_qActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {  new Home().setVisible(true);
                        JOptionPane.showMessageDialog(null,"Purchase Sucessfull");

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(c6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(c6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(c6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(c6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new c6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel m5;
    private javax.swing.JTextField q;
    // End of variables declaration//GEN-END:variables
}
