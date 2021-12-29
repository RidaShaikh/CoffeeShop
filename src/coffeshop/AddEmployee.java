/*
In this AddEmployee class admin can add new employee for coffee shop
that can login by their credential to serve the cutomers
*/
package coffeshop;
      
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;
    private ArrayList<Employee> employeeList;
    private File employeeFile;
    private int id = -1;

    public AddEmployee() {
        initComponents();

        outputStream = null;
        inputStream = null;
        employeeList = new ArrayList<>();
        employeeFile = new File("employee.txt");

        loadTable();
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
        employee_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employee_mobile = new javax.swing.JTextField();
        employee_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        employee_address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        employee_gender_male = new javax.swing.JRadioButton();
        employee_gender_female = new javax.swing.JRadioButton();
        add_employee = new javax.swing.JButton();
        update_employee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employee_table = new javax.swing.JTable();
        employee_password = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        go_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add Employee");

        jLabel2.setText("Name");

        jLabel3.setText("Mobile");

        jLabel4.setText("Email");

        jLabel5.setText("Address");

        jLabel6.setText("Gender");

        employee_gender_male.setText("Male");
        employee_gender_male.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employee_gender_maleMouseClicked(evt);
            }
        });

        employee_gender_female.setText("Female");
        employee_gender_female.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employee_gender_femaleMouseClicked(evt);
            }
        });

        add_employee.setText("Add");
        add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employeeActionPerformed(evt);
            }
        });

        update_employee.setText("Update");
        update_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_employeeActionPerformed(evt);
            }
        });

        employee_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Gender", "Mobile", "Address"
            }
        ));
        employee_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employee_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employee_table);

        jLabel7.setText("Password");

        go_back.setText("Go Back");
        go_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(go_back)
                                .addGap(205, 205, 205)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(employee_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(employee_address, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(employee_password, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(employee_name, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(employee_email, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(employee_gender_male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(employee_gender_female))
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_employee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update_employee)))
                        .addGap(0, 146, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(go_back))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(employee_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employee_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employee_gender_male)
                            .addComponent(employee_gender_female))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employee_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employee_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employee_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_employee)
                    .addComponent(update_employee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadFile() {
        if (employeeFile.isFile()) {
            try {
                inputStream = new ObjectInputStream(new FileInputStream(employeeFile));
                employeeList = (ArrayList<Employee>) inputStream.readObject();
                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File does't exists!");
        }
    }

    private void loadTable() {

        if (employeeFile.exists()) {
            loadFile();
        } else {
            System.out.println("No record found!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) employee_table.getModel();
        model.setRowCount(0);

        Object[] obj = new Object[5];
        for (int i = 0; i < employeeList.size(); i++) {
            obj[0] = employeeList.get(i).getName();
            obj[1] = employeeList.get(i).getEmail();
            obj[2] = employeeList.get(i).getGender();
            obj[3] = employeeList.get(i).getMobile();
            obj[4] = employeeList.get(i).getAddress();
            model.addRow(obj);
        }
    }

    private void clearFields() {
        employee_name.setText("");
        employee_email.setText("");
        employee_mobile.setText("");
        employee_address.setText("");
        employee_password.setText("");
        employee_gender_female.setSelected(false);
        employee_gender_male.setSelected(false);
    }

    private void add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employeeActionPerformed

        String name, email, mobile, address, password;
        String gender = "";

        name = employee_name.getText();
        email = employee_email.getText();
        mobile = employee_mobile.getText();
        address = employee_address.getText();
        password = employee_password.getText();

        if (employee_gender_female.isSelected()) {
            gender = "Female";
        } else if (employee_gender_male.isSelected()) {
            gender = "Male";
        }

        if (!name.isEmpty()) {
            if (!email.isEmpty()) {
                if (!gender.isEmpty()) {
                    if (!mobile.isEmpty()) {
                        if (!address.isEmpty()) {
                            if (!password.isEmpty()) {

                                try {
                                    loadFile();
                                    employeeList.add(new Employee(name, email, gender, mobile, address, password));
                                    outputStream = new ObjectOutputStream(new FileOutputStream(employeeFile));
                                    outputStream.writeObject(employeeList);
                                    outputStream.close();
                                    loadTable();
                                    clearFields();
                                    JOptionPane.showMessageDialog(null, "Employee Successfully Added");

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Please enter password");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please enter address");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter mobile number");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select gender");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter email");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter name");
        }


    }//GEN-LAST:event_add_employeeActionPerformed

    private void go_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_backActionPerformed

        Manager manager = new Manager();
        manager.setLocationRelativeTo(null);
        manager.setVisible(true);
        dispose();

    }//GEN-LAST:event_go_backActionPerformed

    private void employee_gender_maleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employee_gender_maleMouseClicked

        if (employee_gender_male.isSelected()) {
            employee_gender_female.setSelected(false);
        }


    }//GEN-LAST:event_employee_gender_maleMouseClicked

    private void employee_gender_femaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employee_gender_femaleMouseClicked

        if (employee_gender_male.isSelected()) {
            employee_gender_female.setSelected(false);
        }

    }//GEN-LAST:event_employee_gender_femaleMouseClicked

    private void employee_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employee_tableMouseClicked

        DefaultTableModel model = (DefaultTableModel) employee_table.getModel();

        int i = employee_table.getSelectedRow();
        id = i;
        String name = model.getValueAt(i, 0).toString();
        String email = model.getValueAt(i, 1).toString();
        String gender = model.getValueAt(i, 2).toString();
        String mobile = model.getValueAt(i, 3).toString();
        String address = model.getValueAt(i, 4).toString();

        employee_name.setText(name);
        employee_email.setText(email);
        if (gender.equals("Male")) {
            employee_gender_male.setSelected(true);
        } else if (gender.endsWith("Female")) {
            employee_gender_female.setSelected(true);
        }
        employee_mobile.setText(mobile);
        employee_address.setText(address);


    }//GEN-LAST:event_employee_tableMouseClicked

    private void update_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_employeeActionPerformed

        String name, email, mobile, address, password;
        String gender = "";

        name = employee_name.getText();
        email = employee_email.getText();
        mobile = employee_mobile.getText();
        address = employee_address.getText();
        password = employee_password.getText();

        if (employee_gender_female.isSelected()) {
            gender = "Female";
        } else if (employee_gender_male.isSelected()) {
            gender = "Male";
        }
        
        loadFile();
        
        employeeList.get(id).setName(name);
        employeeList.get(id).setEmail(email);
        employeeList.get(id).setGender(gender);
        employeeList.get(id).setMobile(mobile);
        employeeList.get(id).setAddress(address);
        employeeList.get(id).setPassword(password);

        try {
            
            outputStream = new ObjectOutputStream(new FileOutputStream(employeeFile));
            outputStream.writeObject(employeeList);
            outputStream.close();
            loadTable();
            clearFields();
            JOptionPane.showMessageDialog(null, "Employee Successfully Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_update_employeeActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_employee;
    private javax.swing.JTextField employee_address;
    private javax.swing.JTextField employee_email;
    private javax.swing.JRadioButton employee_gender_female;
    private javax.swing.JRadioButton employee_gender_male;
    private javax.swing.JTextField employee_mobile;
    private javax.swing.JTextField employee_name;
    private javax.swing.JTextField employee_password;
    private javax.swing.JTable employee_table;
    private javax.swing.JButton go_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton update_employee;
    // End of variables declaration//GEN-END:variables
}
