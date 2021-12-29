/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeshop;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ViewOrders extends javax.swing.JFrame {

    /**
     * Creates new form ViewOrders
     */
    
    private ObjectInputStream inputStream;
    private ArrayList<Orders> ordersList;
    private File ordersFile;
    
    public ViewOrders() {
        initComponents();
        
        inputStream = null;
        ordersList = new ArrayList<>();
        ordersFile = new File("orders.txt");
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        order_list_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        total_sale = new javax.swing.JLabel();
        go_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Orders List");

        order_list_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Coffee Name", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(order_list_table);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Total Sales");

        total_sale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        total_sale.setText("0");

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(go_back)
                                .addGap(220, 220, 220)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total_sale)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(go_back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(total_sale))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void go_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_backActionPerformed
        
        
        if (AdminLogin.role.equals("admin")) {
            Manager manager = new Manager();
            manager.setLocationRelativeTo(null);
            manager.setVisible(true);
            dispose();
        } else if (AdminLogin.role.equals("employee")) {
            EmployeeWindow employeeWindow = new EmployeeWindow();
            employeeWindow.setLocationRelativeTo(null);
            employeeWindow.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_go_backActionPerformed

    public void loadOrdersFile() {
        if (ordersFile.isFile()) {
            try {
                inputStream = new ObjectInputStream(new FileInputStream(ordersFile));
                ordersList = (ArrayList<Orders>) inputStream.readObject();
                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File does't exists!");
        }
    }
    
    private void loadTable() {

        if (ordersFile.exists()) {
            loadOrdersFile();
        } else {
            System.out.println("No record found!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) order_list_table.getModel();

        double totalSales = 0.0;
        Object[] obj = new Object[4];
        for (int i = 0; i < ordersList.size(); i++) {
            obj[0] = ordersList.get(i).getCustomerName();
            obj[1] = ordersList.get(i).getCoffeeName();
            obj[2] = ordersList.get(i).getQuantity();
            obj[3] = ordersList.get(i).getPrice();
            totalSales += ordersList.get(i).getPrice();
            model.addRow(obj);
        }
        
        total_sale.setText(String.valueOf(totalSales));
    }
    
    
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
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton go_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable order_list_table;
    private javax.swing.JLabel total_sale;
    // End of variables declaration//GEN-END:variables
}