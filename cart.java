/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.db;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jigar
 */
public class cart extends javax.swing.JFrame {

    /**
     * Creates new form cart
     */
    public int a[]=new int[6];
   // String n,w,x,y,z,xy,xyz;
    public cart() {
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

        m2 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        m4 = new javax.swing.JLabel();
        m5 = new javax.swing.JLabel();
        m6 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formHierarchyChanged(evt);
            }
        });

        m2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                m2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        m3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                m3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        m4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                m4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        m5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                m5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        m6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                m6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        l6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                l6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Purchase");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Purchase");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Purchase");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Purchase");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Purchase");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Purchase");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(m3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(l6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(m6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(m5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void m2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_m2AncestorAdded
        // TODO add your handling code here:
           login p=new login();
Connection conn =null;
        PreparedStatement pstmt=null;
try
{
     Class.forName("com.mysql.jdbc.Driver");
            
            //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=rootpassword"); 
            
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mitesh","root","mitesh123");
            String k=p.Username;
            //pstmt=conn.prepareStatement("select path from new_table where name like ? ");
            Statement pst=null;
           pst=conn.createStatement();
         //  pstmt=conn.prepareStatement("select path from new_table where name like ? ");
                 //      pstmt.setString(1,k);

            ResultSet rs = pst.executeQuery("select name,path from new_table");
            int flag=0;
            while(rs.next())
            {String n=rs.getString(1);
            String w=rs.getString(2);
            flag=0;
            //String x=rs.getString(3);

                                   /* String y=rs.getString(4);
            String z=rs.getString(5);
            String xy=rs.getString(6);*/
            
        /*if((p.Username == null ? n == null : p.Username.equals(n)))
        break;*/
         //if()
       /*  Stack Stack = Stack;
int s=new Stack(5);*/
            if((p.Username == null ? n == null : p.Username.equals(n)) && w!=null)
            {
           ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("kid1.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m2.getWidth(),m2.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m2.setIcon(i);
               flag=1;
               //l1.setText("w");
               break;
            }
        /*    else
                m2.setText(n);*/
                
            
           //JOptionPane.showMessageDialog(null, p.Username);

         //   else
          // {
               /*ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("kid1.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(l1.getWidth(),l1.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               l1.setIcon(i);*/
            //   l1.setText(w);
                             // l1.setText(n);

               
        //   }
            /*  else if(!rs.next())
            {
                               // JOptionPane.showMessageDialog(null, "login unsuccessfull");
                l1.setText(w);
                                dispose();
            }
            else
                  l1.setText(n);*/
            }
         /*   if(flag==0)
            {
                 ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bg.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m2.getWidth(),m2.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m2.setIcon(i);
            }*/
}
catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
    }//GEN-LAST:event_m2AncestorAdded

    private void m3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_m3AncestorAdded
        // TODO add your handling code here:
                // TODO add your handling code here:
           login p=new login();
Connection conn =null;
        PreparedStatement pstmt=null;
try
{
     Class.forName("com.mysql.jdbc.Driver");
            
            //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=rootpassword"); 
            
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mitesh","root","mitesh123");
            String k=p.Username;
            int flag=0;
            //pstmt=conn.prepareStatement("select path from new_table where name like ? ");
            Statement pst=null;
           pst=conn.createStatement();
         //  pstmt=conn.prepareStatement("select path from new_table where name like ? ");
                 //      pstmt.setString(1,k);

            ResultSet rs = pst.executeQuery("select name,path3 from new_table");
            while(rs.next())
            {String n=rs.getString(1);
            String w=rs.getString(2);
            flag=0;
            if((p.Username == null ? n == null : p.Username.equals(n)) && w!=null)
            {
           ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("man1.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m3.getWidth(),m3.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m3.setIcon(i);
               flag=1;
               //l1.setText("w");
               break;
            }
       //  cart ko =new cart();    
           //JOptionPane.showMessageDialog(null, p.Username);

         //   else
          // {
               /*ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("kid1.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(l1.getWidth(),l1.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               l1.setIcon(i);*/
            //   l1.setText(w);
                             // l1.setText(n);

               
        //   }
            /*  else if(!rs.next())
            {
                               // JOptionPane.showMessageDialog(null, "login unsuccessfull");
                l1.setText(w);
                                dispose();
            }
            else
                  l1.setText(n);*/
            }
         /*    if(flag==0)
            {
                 ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bg.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m3.getWidth(),m3.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m3.setIcon(i);
            }*/
}
catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                                    
    }//GEN-LAST:event_m3AncestorAdded

    private void m4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_m4AncestorAdded
        // TODO add your handling code here:
                // TODO add your handling code here:
           login p=new login();
Connection conn =null;
        PreparedStatement pstmt=null;
try
{
     Class.forName("com.mysql.jdbc.Driver");
            
            //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=rootpassword"); 
            
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mitesh","root","mitesh123");
            String k=p.Username;
            //pstmt=conn.prepareStatement("select path from new_table where name like ? ");
            Statement pst=null;
           pst=conn.createStatement();
         //  pstmt=conn.prepareStatement("select path from new_table where name like ? ");
                 //      pstmt.setString(1,k);

            ResultSet rs = pst.executeQuery("select name,path4 from new_table");
            int flag=0;
            while(rs.next())
            {String n=rs.getString(1);
            String w=rs.getString(2);
            flag=0;
            if((p.Username == null ? n == null : p.Username.equals(n)) && w!=null)
            {
           ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("man2.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m4.getWidth(),m4.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m4.setIcon(i);
               flag=1;
               //l1.setText("w");
               break;
            }
            
           //JOptionPane.showMessageDialog(null, p.Username);

         //   else
          // {
               /*ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("kid1.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(l1.getWidth(),l1.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               l1.setIcon(i);*/
            //   l1.setText(w);
                             // l1.setText(n);

               
        //   }
            /*  else if(!rs.next())
            {
                               // JOptionPane.showMessageDialog(null, "login unsuccessfull");
                l1.setText(w);
                                dispose();
            }
            else
                  l1.setText(n);*/
            }
     /*        if(flag==0)
            {
                 ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bg.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m4.getWidth(),m4.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m4.setIcon(i);
            }*/
}
catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                                   
    }//GEN-LAST:event_m4AncestorAdded

    private void m5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_m5AncestorAdded
        // TODO add your handling code here:
                // TODO add your handling code here:
           login p=new login();
Connection conn =null;
        PreparedStatement pstmt=null;
try
{
     Class.forName("com.mysql.jdbc.Driver");
            
       //  cart ko =new cart();    //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=rootpassword"); 
            
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mitesh","root","mitesh123");
            String k=p.Username;
            //pstmt=conn.prepareStatement("select path from new_table where name like ? ");
            Statement pst=null;
           pst=conn.createStatement();
         //  pstmt=conn.prepareStatement("select path from new_table where name like ? ");
                 //      pstmt.setString(1,k);

            ResultSet rs = pst.executeQuery("select name,path5 from new_table");
            int flag=0;
            while(rs.next())
            {String n=rs.getString(1);
            String w=rs.getString(2);
            flag=0;
            if((p.Username == null ? n == null : p.Username.equals(n)) && w!=null)
            {
           ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("w1.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m5.getWidth(),m5.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m5.setIcon(i);
               flag=1;
               //l1.setText("w");
               break;
            }
            
           //JOptionPane.showMessageDialog(null, p.Username);

         //   else
          // {
               /*ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("kid1.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(l1.getWidth(),l1.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               l1.setIcon(i);*/
            //   l1.setText(w);
                             // l1.setText(n);

               
        //   }
            /*  else if(!rs.next())
            {
                               // JOptionPane.showMessageDialog(null, "login unsuccessfull");
                l1.setText(w);
                                dispose();
            }
            else
                  l1.setText(n);*/
            }
         /*    if(flag==0)
            {
                 ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bg.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m5.getWidth(),m5.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m5.setIcon(i);
            }*/
}
catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                                   
    }//GEN-LAST:event_m5AncestorAdded

    private void m6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_m6AncestorAdded
        // TODO add your handling code here:
                // TODO add your handling code here:
           login p=new login();
Connection conn =null;
        PreparedStatement pstmt=null;
try
{
     Class.forName("com.mysql.jdbc.Driver");
            
            //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=rootpassword"); 
            
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mitesh","root","mitesh123");
            String k=p.Username;
            //pstmt=conn.prepareStatement("select path from new_table where name like ? ");
            Statement pst=null;
           pst=conn.createStatement();
         //  pstmt=conn.prepareStatement("select path from new_table where name like ? ");
                 //      pstmt.setString(1,k);

            ResultSet rs = pst.executeQuery("select name,path6 from new_table");
            int flag=0;
            while(rs.next())
            {String n=rs.getString(1);
            String w=rs.getString(2);
            flag=0;
            if((p.Username == null ? n == null : p.Username.equals(n)) && w!=null)
            {
           ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("w2.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m6.getWidth(),m6.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m6.setIcon(i);
               flag=1;
               //l1.setText("w");
               break;
            }
            
           //JOptionPane.showMessageDialog(null, p.Username);

         //   else
          // {
               /*ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("kid1.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(l1.getWidth(),l1.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               l1.setIcon(i);*/
            //   l1.setText(w);
                             // l1.setText(n);

               
        //   }
            /*  else if(!rs.next())
            {
                               // JOptionPane.showMessageDialog(null, "login unsuccessfull");
                l1.setText(w);
                                dispose();
            }
            else
                  l1.setText(n);*/
            }
    /*         if(flag==0)
            {
                 ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bg.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(m6.getWidth(),m6.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               m6.setIcon(i);
            }*/
}
catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                                   
    }//GEN-LAST:event_m6AncestorAdded

    private void l6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_l6AncestorAdded
        // TODO add your handling code here:
                // TODO add your handling code here:
           login p=new login();
Connection conn =null;
        PreparedStatement pstmt=null;
try
{
     Class.forName("com.mysql.jdbc.Driver");
            
            //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=rootpassword"); 
            
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mitesh","root","mitesh123");
            String k=p.Username;
            //pstmt=conn.prepareStatement("select path from new_table where name like ? ");
            Statement pst=null;
           pst=conn.createStatement();
         //  pstmt=conn.prepareStatement("select path from new_table where name like ? ");
                 //      pstmt.setString(1,k);

            ResultSet rs = pst.executeQuery("select name,path2 from new_table");
            int flag=0;
            while(rs.next())
            {String n=rs.getString(1);
            String w=rs.getString(2);
            flag=0;
            if((p.Username == null ? n == null : p.Username.equals(n)) && w!=null)
            {
           ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("kid2.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(l6.getWidth(),l6.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               l6.setIcon(i);
               flag=1;
               //l1.setText("w");
               break;
            }
            
           //JOptionPane.showMessageDialog(null, p.Username);

         //   else
          // {
               /*ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("kid1.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(l1.getWidth(),l1.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               l1.setIcon(i);*/
            //   l1.setText(w);
                             // l1.setText(n);

               
        //   }
            /*  else if(!rs.next())
            {
                               // JOptionPane.showMessageDialog(null, "login unsuccessfull");
                l1.setText(w);
                                dispose();
            }
            else
                  l1.setText(n);*/
            }
     /*        if(flag==0)
            {
                 ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bg.jpg")));
               Image img1=myimage.getImage();
               Image img2=img1.getScaledInstance(l6.getWidth(),l6.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon i=new ImageIcon(img2);
               l6.setIcon(i);
            }*/
}
catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
                                   
    }//GEN-LAST:event_l6AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                new Purchase().setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                        new Purchase().setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
                        new Purchase().setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                        new Purchase().setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                        new Purchase().setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
                        new Purchase().setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formHierarchyChanged

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
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public javax.swing.JLabel l6;
    public javax.swing.JLabel m2;
    public javax.swing.JLabel m3;
    public javax.swing.JLabel m4;
    public javax.swing.JLabel m5;
    public javax.swing.JLabel m6;
    // End of variables declaration//GEN-END:variables

    void m2AncestorAdded(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void l6AncestorAdded(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
