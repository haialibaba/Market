
package GUI;

import java.awt.Dialog;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ChiTietHoaDonGUI extends javax.swing.JFrame {

    public ChiTietHoaDonGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        pnl_note = new javax.swing.JPanel();
        scroll_note = new javax.swing.JScrollPane();
        text_note = new javax.swing.JTextArea();
        pnl_id = new javax.swing.JPanel();
        text_id = new javax.swing.JTextField();
        pnl_customer = new javax.swing.JPanel();
        text_customer = new javax.swing.JTextField();
        pnl_date = new javax.swing.JPanel();
        text_date = new javax.swing.JTextField();
        pnl_address = new javax.swing.JPanel();
        text_address = new javax.swing.JTextField();
        pnl_city = new javax.swing.JPanel();
        text_city = new javax.swing.JTextField();
        label_total = new javax.swing.JLabel();
        scroll_tableProduct = new javax.swing.JScrollPane();
        table_product = new javax.swing.JTable();
        label_product = new javax.swing.JLabel();
        btn_addProduct = new javax.swing.JButton();

        jDialog1.setMinimumSize(new java.awt.Dimension(200, 200));
        jDialog1.setUndecorated(true);
        jDialog1.setResizable(false);
        jDialog1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                jDialog1WindowDeactivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order 1");
        setBackground(null);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setName("Hoa Don 1"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(null);

        pnl_note.setBackground(null);
        pnl_note.setBorder(javax.swing.BorderFactory.createTitledBorder("Note"));

        scroll_note.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        text_note.setBackground(null);
        text_note.setColumns(20);
        text_note.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_note.setLineWrap(true);
        text_note.setRows(3);
        scroll_note.setViewportView(text_note);

        javax.swing.GroupLayout pnl_noteLayout = new javax.swing.GroupLayout(pnl_note);
        pnl_note.setLayout(pnl_noteLayout);
        pnl_noteLayout.setHorizontalGroup(
            pnl_noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_noteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_note, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_noteLayout.setVerticalGroup(
            pnl_noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_noteLayout.createSequentialGroup()
                .addComponent(scroll_note, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnl_note);
        pnl_note.setBounds(30, 230, 600, 90);

        pnl_id.setBackground(null);
        pnl_id.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        text_id.setBackground(null);
        text_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_id.setText("1");
        text_id.setBorder(null);

        javax.swing.GroupLayout pnl_idLayout = new javax.swing.GroupLayout(pnl_id);
        pnl_id.setLayout(pnl_idLayout);
        pnl_idLayout.setHorizontalGroup(
            pnl_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_id, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_idLayout.setVerticalGroup(
            pnl_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_idLayout.createSequentialGroup()
                .addComponent(text_id)
                .addContainerGap())
        );

        text_id.getAccessibleContext().setAccessibleName("");

        getContentPane().add(pnl_id);
        pnl_id.setBounds(20, 10, 170, 54);

        pnl_customer.setBackground(null);
        pnl_customer.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer"));

        text_customer.setBackground(null);
        text_customer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text_customer.setText("Join Smith");
        text_customer.setBorder(null);

        javax.swing.GroupLayout pnl_customerLayout = new javax.swing.GroupLayout(pnl_customer);
        pnl_customer.setLayout(pnl_customerLayout);
        pnl_customerLayout.setHorizontalGroup(
            pnl_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_customerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_customerLayout.setVerticalGroup(
            pnl_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_customerLayout.createSequentialGroup()
                .addComponent(text_customer)
                .addContainerGap())
        );

        getContentPane().add(pnl_customer);
        pnl_customer.setBounds(230, 10, 200, 54);

        pnl_date.setBackground(null);
        pnl_date.setBorder(javax.swing.BorderFactory.createTitledBorder("Date"));

        text_date.setBackground(null);
        text_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text_date.setText("2020-10-30");
        text_date.setBorder(null);

        javax.swing.GroupLayout pnl_dateLayout = new javax.swing.GroupLayout(pnl_date);
        pnl_date.setLayout(pnl_dateLayout);
        pnl_dateLayout.setHorizontalGroup(
            pnl_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_date, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_dateLayout.setVerticalGroup(
            pnl_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dateLayout.createSequentialGroup()
                .addComponent(text_date)
                .addContainerGap())
        );

        getContentPane().add(pnl_date);
        pnl_date.setBounds(20, 80, 170, 54);

        pnl_address.setBackground(null);
        pnl_address.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));

        text_address.setBackground(null);
        text_address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text_address.setText("123 Nguyen Trai");
        text_address.setBorder(null);

        javax.swing.GroupLayout pnl_addressLayout = new javax.swing.GroupLayout(pnl_address);
        pnl_address.setLayout(pnl_addressLayout);
        pnl_addressLayout.setHorizontalGroup(
            pnl_addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_address, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_addressLayout.setVerticalGroup(
            pnl_addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addressLayout.createSequentialGroup()
                .addComponent(text_address)
                .addContainerGap())
        );

        getContentPane().add(pnl_address);
        pnl_address.setBounds(230, 80, 200, 54);

        pnl_city.setBackground(null);
        pnl_city.setBorder(javax.swing.BorderFactory.createTitledBorder("City"));

        text_city.setBackground(null);
        text_city.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text_city.setText("Ho Chi Minh");
        text_city.setBorder(null);

        javax.swing.GroupLayout pnl_cityLayout = new javax.swing.GroupLayout(pnl_city);
        pnl_city.setLayout(pnl_cityLayout);
        pnl_cityLayout.setHorizontalGroup(
            pnl_cityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_city, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_cityLayout.setVerticalGroup(
            pnl_cityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cityLayout.createSequentialGroup()
                .addComponent(text_city)
                .addContainerGap())
        );

        getContentPane().add(pnl_city);
        pnl_city.setBounds(230, 150, 200, 54);

        label_total.setText("Total: ");
        getContentPane().add(label_total);
        label_total.setBounds(540, 580, 60, 30);

        table_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Name", "Quantity", "Unit", "Price", "Tool"
            }
        ));
        scroll_tableProduct.setViewportView(table_product);

        getContentPane().add(scroll_tableProduct);
        scroll_tableProduct.setBounds(30, 360, 600, 210);

        label_product.setText("Product");
        getContentPane().add(label_product);
        label_product.setBounds(30, 330, 60, 16);

        btn_addProduct.setText("Add Product");
        btn_addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addProductActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addProduct);
        btn_addProduct.setBounds(520, 330, 110, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProductActionPerformed
        
        jDialog1.setLocation(500, 350);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_btn_addProductActionPerformed

    private void jDialog1WindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowDeactivated
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jDialog1WindowDeactivated

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietHoaDonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addProduct;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_product;
    private javax.swing.JLabel label_total;
    private javax.swing.JPanel pnl_address;
    private javax.swing.JPanel pnl_city;
    private javax.swing.JPanel pnl_customer;
    private javax.swing.JPanel pnl_date;
    private javax.swing.JPanel pnl_id;
    private javax.swing.JPanel pnl_note;
    private javax.swing.JScrollPane scroll_note;
    private javax.swing.JScrollPane scroll_tableProduct;
    private javax.swing.JTable table_product;
    private javax.swing.JTextField text_address;
    private javax.swing.JTextField text_city;
    private javax.swing.JTextField text_customer;
    private javax.swing.JTextField text_date;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextArea text_note;
    // End of variables declaration//GEN-END:variables
}
