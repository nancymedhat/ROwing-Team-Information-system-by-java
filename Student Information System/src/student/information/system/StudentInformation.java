

package student.information.system;


import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;



public class StudentInformation extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
   
    public StudentInformation() {
        initComponents();
        conn=db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        currentDate();
        Update_table();
        
        
    }
   
    public void currentDate (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        lbl_date.setText((month+1)+"/"+day+"/"+year);
        
        //Time
      
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        lbl_time.setText(hour+":"+(minute)+":"+second);
        
       
    }
   
 private void Update_table() {
    try{
        String sql ="select * from Player_Info";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        student_table.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        r_male = new javax.swing.JRadioButton();
        r_female = new javax.swing.JRadioButton();
        txt_dob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lbl_img = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_apt = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        cmd_save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        present = new javax.swing.JRadioButton();
        absent = new javax.swing.JRadioButton();
        txt_gen = new javax.swing.JTextField();
        txt_emp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_search1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        lbl_date = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 36))); // NOI18N
        jPanel3.setName("player"); // NOI18N

        jLabel7.setText("Contact Number :");

        jLabel6.setText("Email :");

        jLabel11.setText("Gender:");

        r_male.setText("Male");
        r_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_maleActionPerformed(evt);
            }
        });

        r_female.setText("Female");
        r_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_femaleActionPerformed(evt);
            }
        });

        jLabel3.setText("Date of Birth :");

        jLabel1.setText("Name :");

        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(lbl_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setText("Address Line 1 :");

        jLabel15.setText("Apt./House No :");

        txt_apt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aptActionPerformed(evt);
            }
        });

        cmd_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/Save-icon.png"))); // NOI18N
        cmd_save.setText("Add Record");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/erase-128.png"))); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/update icon.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/delete_16x16.gif"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Generation :");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Add Attendence column");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Attendence:");

        present.setText("Present");
        present.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentActionPerformed(evt);
            }
        });

        absent.setText("Absent");
        absent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentActionPerformed(evt);
            }
        });

        txt_gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_genActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_firstname, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(txt_dob)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(present)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(absent))
                                    .addComponent(txt_apt, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(txt_tel)
                                    .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(r_male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(r_female))
                                    .addComponent(txt_address, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(txt_gen))))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(cmd_save, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel8))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmd_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(r_male)
                    .addComponent(r_female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_apt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_gen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(present)
                    .addComponent(absent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_emp.setText("emp");

        jLabel10.setText("Logged in As :");

        student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(student_table);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        jLabel13.setText("Player Name :");

        txt_search1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                txt_search1ComponentRemoved(evt);
            }
        });
        txt_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search1ActionPerformed(evt);
            }
        });
        txt_search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_search1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        File.setText("File");

        jMenuItem1.setText("Attach Image");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        File.add(jMenuItem1);

        jMenuBar1.add(File);

        lbl_date.setText("Date");
        jMenuBar1.add(lbl_date);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_emp))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_emp))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        filename =f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_DEFAULT));
        lbl_img.setIcon(imageIcon);
      try {

            File image = new File(filename);
            FileInputStream fis = new FileInputStream (image);
            ByteArrayOutputStream bos= new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for(int readNum; (readNum=fis.read(buf))!=-1; ){

                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        txt_firstname.setText("");
        
        txt_tel.setText("");
        txt_dob.setText("");
        txt_email.setText("");
        txt_address.setText("");
        txt_gen.setText("");
        lbl_img.setIcon(null);
        txt_search1.setText("");
        txt_apt.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
      
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(p==0){

            try {
                String sql ="insert into Player_Info " 
                        + "( name,Dob,Gender,Email,"
                        + "Telephone,Address,"
                        + "Image,gen,"
                        + "'"+day+"/"+(month+1)+"/"+year+"') values (?,?,?,?,?,?,?,?,?) ";

                pst=conn.prepareStatement(sql);
                pst.setString(1,txt_firstname.getText());
                pst.setString(2,txt_dob.getText());
                pst.setString(3,gender);
                pst.setString(4,txt_email.getText());
                pst.setString(5,txt_tel.getText());
                pst.setString(6,txt_address.getText());
                pst.setBytes(7,person_image);
                pst.setString(8,txt_gen.getText());
                pst.setString(9, att);
               
                
                

                pst.execute();
                JOptionPane.showMessageDialog(null,"Data is saved successfully");

            }
            catch (Exception e)

            {
               
            }
        
             finally {

                try{
                    rs.close();
                    pst.close();

                }  
                
                catch(Exception e){
                   JOptionPane.showMessageDialog(null,e);
                
            }
         }
            Update_table();
            
        }
        
    }//GEN-LAST:event_cmd_saveActionPerformed

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void r_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_femaleActionPerformed
        // TODO add your handling code here:
        gender ="Female";
        r_female.setSelected(true);
        r_male.setSelected(false);
        
    }//GEN-LAST:event_r_femaleActionPerformed

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_maleActionPerformed
        // TODO add your handling code here:
        gender ="Male";
        r_male.setSelected(true);
        r_female.setSelected(false);
    }//GEN-LAST:event_r_maleActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
         int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String value0 = timeString;
            String value1 = dateString;
            String val = txt_emp.getText().toString();
            String sql ="delete from Player_Info where name=? ";
            try{
                pst=conn.prepareStatement(sql);
                pst.setString(1, txt_firstname.getText());
                pst.execute();

                JOptionPane.showMessageDialog(null,"Record Deleted");

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, e);
            }finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){

                }
            }
        Update_table();
        
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?","Update Record",JOptionPane.YES_NO_OPTION);
          Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        if(p==0){
           
            try{

                String value1 = txt_firstname.getText();
                
                String value2 = txt_dob.getText();
               // String value4 = txt_studentid.getText();
                String value3 = txt_email.getText();
                String value4 = txt_tel.getText();
                String value5 = txt_address.getText();
                String value6 = txt_gen.getText();
                String value7= att;
               
                String sql= "update Player_Info set name='"+value1+"',  "
                        + "Dob='"+value2+"',Email='"+value3+"',Telephone='"+value4+"',Address='"+value5+"',gen='"+value6+"','"+day+"/"+(month+1)+"/"+year+"'='" +value7+"' "
                        
                        + "where name='"+value1+"' ";

                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Record Updated");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){

                }
            
Update_table();
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_search1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_search1ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search1ComponentRemoved

    private void txt_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search1ActionPerformed

    private void txt_search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search1KeyReleased
        // TODO add your handling code here:
        try{

            String sql ="select * from Player_Info where name=? ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search1.getText());
            rs=pst.executeQuery();



            String add1 =rs.getString("name");
            txt_firstname.setText(add1);

       

            String add2 =rs.getString("Dob");
            txt_dob.setText(add2);

            String add3 =rs.getString("Email");
            txt_email.setText(add3);

            String add4 =rs.getString("Telephone");
            txt_tel.setText(add4);

            String add5 =rs.getString("Address");
            txt_address.setText(add5);
            
            
            String add6 =rs.getString("gen");
            txt_address.setText(add6);

  

           
          
           

            byte[] img = rs.getBytes("Image");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH));
            lbl_img.setIcon(imageIcon);

        }catch(Exception e){
            
        }
        finally {

            try{

                rs.close();
                pst.close();

            }
            catch(Exception e){

            }
        }
    }//GEN-LAST:event_txt_search1KeyReleased

    private void txt_aptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_aptActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
            
           Statement p=conn.createStatement();
        int add=p.executeUpdate("ALTER TABLE player_Info ADD '"+day+"/"+(month+1)+"/"+year+"' VARCHAR(60); ");
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void presentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentActionPerformed
        // TODO add your handling code here:
        att="present";
        present.setSelected(true);
        absent.setSelected(false);
        
    }//GEN-LAST:event_presentActionPerformed

    private void absentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absentActionPerformed
        // TODO add your handling code here:
        att="absent";
        present.setSelected(false);
        absent.setSelected(true);
    }//GEN-LAST:event_absentActionPerformed

    private void txt_genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_genActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_genActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu File;
    private javax.swing.JRadioButton absent;
    private javax.swing.JButton cmd_save;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu lbl_date;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JMenu lbl_time;
    private javax.swing.JRadioButton present;
    private javax.swing.JRadioButton r_female;
    private javax.swing.JRadioButton r_male;
    private javax.swing.JTable student_table;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_apt;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JLabel txt_emp;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_gen;
    private javax.swing.JTextField txt_search1;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables

    private ImageIcon format =null;
    //strin filename
    String filename = null;
    byte[] person_image = null;
    
    private String gender;
    private String att;
    
    
}
