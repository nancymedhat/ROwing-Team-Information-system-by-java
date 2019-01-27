
package student.information.system;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import com.sun.glass.events.KeyEvent;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Login extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
         conn=db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        currentDate();
    }
 public void currentDate (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        txt_date.setText((month+1)+"/"+day+"/"+year);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_combo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        txt_date = new javax.swing.JMenu();
        txt_time = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Alex NBE Rowing Team");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 60, 450, 80);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 310, 90, 22);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 390, 80, 30);
        jPanel1.add(txt_username);
        txt_username.setBounds(330, 250, 160, 30);
        jPanel1.add(txt_password);
        txt_password.setBounds(330, 300, 160, 30);

        txt_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin" }));
        jPanel1.add(txt_combo);
        txt_combo.setBounds(330, 340, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Division :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 350, 80, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Username :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 260, 100, 22);

        txt_date.setText("Date");
        jMenuBar1.add(txt_date);

        txt_time.setText("Time");
        jMenuBar1.add(txt_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String sql = "select id,username,password,division from Users Where (username =? and password =? and division =?)";
                
               
        try{
           int count =0;
         
           pst=conn.prepareStatement(sql);
           
           
           pst.setString(1,txt_username.getText());
           pst.setString(2,txt_password.getText());
           pst.setString(3, txt_combo.getSelectedItem().toString());

           rs=pst.executeQuery();
           {
           }
           while(rs.next()){
           int id=rs.getInt(1);
           count =count+1;
           
           }
           
           
          String access=(txt_combo.getSelectedItem().toString());
            
          
           
           if(access=="Admin") {
           
               if(count==1){
                   JOptionPane.showMessageDialog(null,"Sucess" );
                  MainMenu j = new MainMenu();
                 // StudentInformation j = new StudentInformation();
                   j.setVisible(true);
                   this.dispose();
                   
                   
           }
               
           else if(count>1){
                   JOptionPane.showMessageDialog(null,"Duplicate Username or Password Access denied");
                   }
           else{
               JOptionPane.showMessageDialog(null,"Username and Password is not correct");
           }   
           }
                
        } catch(Exception e)

        {
             JOptionPane.showMessageDialog(null, e);

        }
        finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
                
            }
        
        }
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> txt_combo;
    private javax.swing.JMenu txt_date;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JMenu txt_time;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
