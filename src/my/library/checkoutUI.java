/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author nishitatanwar
 */
public class checkoutUI extends javax.swing.JFrame {

    /**
     * Creates new form checkoutUI
     */
    private JFrame frame;
    public checkoutUI() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Enter Required Details");

        jLabel2.setText("Enter Book Id");

        jLabel3.setText("Enter Branch Id");

        jLabel4.setText("Enter Card Number");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Check Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(10, 10, 10)))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(69, 69, 69))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date date = new Date();
				Calendar c = Calendar.getInstance();
				c.setTime(date);
		        String date_out=dateFormat.format(date);
		        c.add(Calendar.DATE, 14);
		        String due_date=dateFormat.format(c.getTime());
		        
		        ResultSet rs=null;
		        String loan_id=null; 
		     Connection conn=null;
		        
		        try{
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
					Statement stmt = conn.createStatement();
					stmt.execute("use Library;");
					
					rs=stmt.executeQuery("select * from book where isbn='"+jTextField1.getText()+"';");
		       
                                        if(!rs.next()){
		        		JOptionPane.showMessageDialog(frame, "Book doesn't exist", "Error", JOptionPane.PLAIN_MESSAGE);
		        		jTextField1.setText("");
		        		return;
		        	        }
		        	
		        	rs=stmt.executeQuery("select * from library_branch where branch_id="+jTextField2.getText()+";");
		        	if(!rs.next()){
		        		JOptionPane.showMessageDialog(frame, "Invalid Branch ID", "Error", JOptionPane.PLAIN_MESSAGE);
		        		jTextField2.setText("");
		        		return;
		        	}
		        	rs=stmt.executeQuery("select * from borrower where card_no='"+jTextField3.getText()+"';");
		        	if(!rs.next()){
		        		JOptionPane.showMessageDialog(frame, "Invalid Card No.", "Error", JOptionPane.PLAIN_MESSAGE);
		        		jTextField3.setText("");
		        		return;
		        	}
		        	
		        	rs=stmt.executeQuery("select count(*) from book_loan where card_no='"+jTextField3.getText()+"' and date_in IS NULL ;");
		        	rs.next();
		        	int count=rs.getInt(1);
		        	if(count>=3){
		        		JOptionPane.showMessageDialog(frame, "User has already borrowed 3 books. Cannot borrow more", "Error", JOptionPane.PLAIN_MESSAGE);
		        		return;
		        	}
		        	
		        	rs=stmt.executeQuery("select no_of_copies from book_copies where book_id='"+jTextField1.getText()+"' and branch_id="+jTextField2.getText()+";");
		        	rs.next();
		        	if(rs.getInt(1)==0){
		        		JOptionPane.showMessageDialog(frame, "Book not available currently", "Error", JOptionPane.PLAIN_MESSAGE);
		        		return;
		        	}
		        	
		        	rs=stmt.executeQuery("select max(loan_id)+1 from book_loan");
					rs.next();
					loan_id=rs.getString(1);
					String query="insert into book_loan(loan_id,isbn,branch_id,card_no,date_out,date_due) values ("+loan_id+",'"+jTextField1.getText()+"',"+jTextField2.getText()+",'"+jTextField3.getText()+"','"+date_out+"','"+due_date+"');";
					stmt.execute(query);
					stmt.execute("update book_copies set no_of_copies=no_of_copies-1 where book_id='"+jTextField1.getText()+"' and branch_id='"+jTextField2.getText()+"';");
					JOptionPane.showMessageDialog(frame, "Checked Out Successfully", "Success", JOptionPane.PLAIN_MESSAGE);
					jTextField1.setText("");
					jTextField2.setText("");
					jTextField3.setText("");
					
					jTextField1.getDocument().addDocumentListener(new DocumentListener() {
						
						@Override
						public void removeUpdate(DocumentEvent e) {
							validate();
						}
						
						@Override
						public void insertUpdate(DocumentEvent e) {
							validate();
						}
						
						@Override
						public void changedUpdate(DocumentEvent e) {
							validate();
						}
						
						public void validate(){
							if(jTextField1.getText().compareTo("")==0 || jTextField2.getText().compareTo("")==0 || jTextField3.getText().compareTo("")==0){
								jButton2.setEnabled(false);
							}else{
								jButton2.setEnabled(true);
							}
						}
					});
					
					jTextField2.getDocument().addDocumentListener(new DocumentListener() {
						
						@Override
						public void removeUpdate(DocumentEvent e) {
							validate();
						}
						
						@Override
						public void insertUpdate(DocumentEvent e) {
							validate();
						}
						
						@Override
						public void changedUpdate(DocumentEvent e) {
							validate();
						}
						
						public void validate(){
							if(jTextField1.getText().compareTo("")==0 || jTextField2.getText().compareTo("")==0 || jTextField3.getText().compareTo("")==0){
								jButton2.setEnabled(false);
							}else{
								jButton2.setEnabled(true);
							}
						}
					});

					jTextField3.getDocument().addDocumentListener(new DocumentListener() {
						
						@Override
						public void removeUpdate(DocumentEvent e) {
							validate();
						}
						
						@Override
						public void insertUpdate(DocumentEvent e) {
							validate();
						}
						
						@Override
						public void changedUpdate(DocumentEvent e) {
							validate();
						}
						
						public void validate(){
							if(jTextField1.getText().compareTo("")==0 || jTextField2.getText().compareTo("")==0 || jTextField3.getText().compareTo("")==0){
								jButton2.setEnabled(false);
							}else{
								jButton2.setEnabled(true);
							}
						}
					});
					
					
		        	
					
					rs.close();
					conn.close();
					
		        }
		        catch(SQLException ex) {
					System.out.println("Error in connection: " + ex.getMessage());
				}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        libraryUI h = new libraryUI();
        h.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(checkoutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkoutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkoutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkoutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkoutUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
