
package GUI;

import java.awt.Color;
import java.awt.Dimension;

public class ChiTietHoaDonGUI extends javax.swing.JFrame {

    public ChiTietHoaDonGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog_searchProduct = new javax.swing.JDialog();
        container_searchProduct = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        container_all = new javax.swing.JPanel();
        scroll_tableProduct = new javax.swing.JScrollPane();
        table_product = new javax.swing.JTable();
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
        label_product = new javax.swing.JLabel();
        btn_addProduct = new javax.swing.JButton();

        dialog_searchProduct.setMaximumSize(new java.awt.Dimension(450, 300));
        dialog_searchProduct.setMinimumSize(new java.awt.Dimension(450, 300));
        dialog_searchProduct.setUndecorated(true);
        dialog_searchProduct.setPreferredSize(new java.awt.Dimension(450, 300));
        dialog_searchProduct.setResizable(false);
        dialog_searchProduct.setType(java.awt.Window.Type.POPUP);
        dialog_searchProduct.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                dialog_searchProductWindowDeactivated(evt);
            }
        });

        container_searchProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        container_searchProduct.setMaximumSize(new java.awt.Dimension(450, 300));
        container_searchProduct.setMinimumSize(new java.awt.Dimension(450, 300));
        container_searchProduct.setPreferredSize(new java.awt.Dimension(450, 300));
        container_searchProduct.setLayout(null);

        jTextField1.setText("jTextField1");
        container_searchProduct.add(jTextField1);
        jTextField1.setBounds(10, 10, 430, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        container_searchProduct.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 430, 240);

        dialog_searchProduct.getContentPane().add(container_searchProduct, java.awt.BorderLayout.CENTER);

        dialog_searchProduct.getAccessibleContext().setAccessibleDescription("");
        dialog_searchProduct.getAccessibleContext().setAccessibleParent(container_all);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order 1");
        setBackground(null);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(770, 690));
        setMinimumSize(new java.awt.Dimension(770, 690));
        setName("Hoa Don 1"); // NOI18N
        setPreferredSize(new java.awt.Dimension(770, 690));
        setResizable(false);
        setSize(new java.awt.Dimension(770, 690));
        getContentPane().setLayout(null);

        container_all.setBackground(new java.awt.Color(255, 255, 255));
        container_all.setLayout(null);

        table_product.setAutoCreateRowSorter(true);
        table_product.getTableHeader().setBackground(new Color(0, 0, 60));
        table_product.getTableHeader().setForeground(Color.white);
        table_product.setPreferredScrollableViewportSize(new Dimension(970, 320));
        table_product.setBackground(java.awt.Color.white);
        table_product.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Name", "Quantity", "Unit", "Price", "Tool"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_product.setToolTipText("");
        table_product.setGridColor(new java.awt.Color(0, 0, 60));
        table_product.setInheritsPopupMenu(true);
        table_product.setRowHeight(30);
        scroll_tableProduct.setViewportView(table_product);
        if (table_product.getColumnModel().getColumnCount() > 0) {
            table_product.getColumnModel().getColumn(0).setMinWidth(50);
            table_product.getColumnModel().getColumn(0).setPreferredWidth(50);
            table_product.getColumnModel().getColumn(0).setMaxWidth(50);
            table_product.getColumnModel().getColumn(2).setMinWidth(100);
            table_product.getColumnModel().getColumn(2).setPreferredWidth(100);
            table_product.getColumnModel().getColumn(2).setMaxWidth(100);
            table_product.getColumnModel().getColumn(3).setMinWidth(100);
            table_product.getColumnModel().getColumn(3).setPreferredWidth(100);
            table_product.getColumnModel().getColumn(3).setMaxWidth(100);
            table_product.getColumnModel().getColumn(5).setMinWidth(70);
            table_product.getColumnModel().getColumn(5).setPreferredWidth(70);
            table_product.getColumnModel().getColumn(5).setMaxWidth(70);
        }

        container_all.add(scroll_tableProduct);
        scroll_tableProduct.setBounds(20, 360, 700, 210);

        pnl_note.setBackground(null);
        pnl_note.setBorder(javax.swing.BorderFactory.createTitledBorder("Note"));
        pnl_note.setForeground(new java.awt.Color(0, 0, 0));

        scroll_note.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        text_note.setBackground(new java.awt.Color(0, 255, 0));
        text_note.setColumns(20);
        text_note.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_note.setForeground(new java.awt.Color(0, 0, 0));
        text_note.setLineWrap(true);
        text_note.setRows(1);
        text_note.setText("wssdsadasdasdasdasdasda");
        scroll_note.setViewportView(text_note);

        javax.swing.GroupLayout pnl_noteLayout = new javax.swing.GroupLayout(pnl_note);
        pnl_note.setLayout(pnl_noteLayout);
        pnl_noteLayout.setHorizontalGroup(
            pnl_noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_noteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_note, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_noteLayout.setVerticalGroup(
            pnl_noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_note, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        container_all.add(pnl_note);
        pnl_note.setBounds(20, 230, 700, 90);

        pnl_id.setBackground(null);
        pnl_id.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));
        pnl_id.setForeground(new java.awt.Color(0, 0, 0));
        pnl_id.setMinimumSize(new java.awt.Dimension(170, 60));
        pnl_id.setPreferredSize(new java.awt.Dimension(170, 60));

        text_id.setBackground(new java.awt.Color(204, 204, 0));
        text_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_id.setForeground(new java.awt.Color(0, 0, 0));
        text_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_id.setText("1");
        text_id.setBorder(null);

        javax.swing.GroupLayout pnl_idLayout = new javax.swing.GroupLayout(pnl_id);
        pnl_id.setLayout(pnl_idLayout);
        pnl_idLayout.setHorizontalGroup(
            pnl_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_id, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_idLayout.setVerticalGroup(
            pnl_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        text_id.getAccessibleContext().setAccessibleName("");

        container_all.add(pnl_id);
        pnl_id.setBounds(20, 10, 110, 60);

        pnl_customer.setBackground(null);
        pnl_customer.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer"));
        pnl_customer.setForeground(new java.awt.Color(0, 0, 0));

        text_customer.setBackground(new java.awt.Color(0, 255, 0));
        text_customer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_customer.setForeground(new java.awt.Color(0, 0, 0));
        text_customer.setText("Join Smith");
        text_customer.setBorder(null);

        javax.swing.GroupLayout pnl_customerLayout = new javax.swing.GroupLayout(pnl_customer);
        pnl_customer.setLayout(pnl_customerLayout);
        pnl_customerLayout.setHorizontalGroup(
            pnl_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_customerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_customerLayout.setVerticalGroup(
            pnl_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        container_all.add(pnl_customer);
        pnl_customer.setBounds(300, 10, 420, 60);

        pnl_date.setBackground(null);
        pnl_date.setBorder(javax.swing.BorderFactory.createTitledBorder("Date"));
        pnl_date.setForeground(new java.awt.Color(0, 0, 0));
        pnl_date.setMinimumSize(new java.awt.Dimension(300, 60));
        pnl_date.setPreferredSize(new java.awt.Dimension(300, 60));

        text_date.setBackground(new java.awt.Color(153, 0, 0));
        text_date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_date.setForeground(new java.awt.Color(0, 0, 0));
        text_date.setText("2020-10-30");
        text_date.setBorder(null);

        javax.swing.GroupLayout pnl_dateLayout = new javax.swing.GroupLayout(pnl_date);
        pnl_date.setLayout(pnl_dateLayout);
        pnl_dateLayout.setHorizontalGroup(
            pnl_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_date, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_dateLayout.setVerticalGroup(
            pnl_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text_date, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        container_all.add(pnl_date);
        pnl_date.setBounds(20, 80, 200, 60);

        pnl_address.setBackground(null);
        pnl_address.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));
        pnl_address.setForeground(new java.awt.Color(0, 0, 0));
        pnl_address.setMinimumSize(new java.awt.Dimension(300, 60));
        pnl_address.setPreferredSize(new java.awt.Dimension(300, 60));

        text_address.setBackground(new java.awt.Color(0, 255, 102));
        text_address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_address.setForeground(new java.awt.Color(0, 0, 0));
        text_address.setText("123 Nguyen Trai");
        text_address.setBorder(null);

        javax.swing.GroupLayout pnl_addressLayout = new javax.swing.GroupLayout(pnl_address);
        pnl_address.setLayout(pnl_addressLayout);
        pnl_addressLayout.setHorizontalGroup(
            pnl_addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_address, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_addressLayout.setVerticalGroup(
            pnl_addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text_address, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        container_all.add(pnl_address);
        pnl_address.setBounds(300, 80, 420, 60);

        pnl_city.setBackground(null);
        pnl_city.setBorder(javax.swing.BorderFactory.createTitledBorder("City"));
        pnl_city.setForeground(new java.awt.Color(153, 0, 102));
        pnl_city.setMinimumSize(new java.awt.Dimension(300, 60));
        pnl_city.setPreferredSize(new java.awt.Dimension(300, 60));

        text_city.setBackground(new java.awt.Color(204, 255, 204));
        text_city.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_city.setForeground(new java.awt.Color(0, 0, 0));
        text_city.setText("Ho Chi Minh");
        text_city.setBorder(null);

        javax.swing.GroupLayout pnl_cityLayout = new javax.swing.GroupLayout(pnl_city);
        pnl_city.setLayout(pnl_cityLayout);
        pnl_cityLayout.setHorizontalGroup(
            pnl_cityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_city, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_cityLayout.setVerticalGroup(
            pnl_cityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text_city, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        container_all.add(pnl_city);
        pnl_city.setBounds(300, 150, 420, 60);

        label_total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_total.setForeground(new java.awt.Color(0, 0, 0));
        label_total.setText("Total: 3333333444");
        container_all.add(label_total);
        label_total.setBounds(550, 580, 170, 40);

        label_product.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_product.setForeground(new java.awt.Color(0, 0, 0));
        label_product.setText("Product");
        container_all.add(label_product);
        label_product.setBounds(20, 330, 90, 20);

        btn_addProduct.setBackground(new java.awt.Color(0, 0, 60));
        btn_addProduct.setForeground(java.awt.Color.white);
        btn_addProduct.setText("Add Product");
        btn_addProduct.setFocusPainted(false);
        btn_addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addProductActionPerformed(evt);
            }
        });
        container_all.add(btn_addProduct);
        btn_addProduct.setBounds(610, 330, 110, 23);

        getContentPane().add(container_all);
        container_all.setBounds(10, 10, 740, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProductActionPerformed
        
        
        dialog_searchProduct.setLocation(500, 350);
        dialog_searchProduct.setVisible(true);
    }//GEN-LAST:event_btn_addProductActionPerformed

    private void dialog_searchProductWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialog_searchProductWindowDeactivated
        dialog_searchProduct.setVisible(false);
    }//GEN-LAST:event_dialog_searchProductWindowDeactivated

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietHoaDonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addProduct;
    private javax.swing.JPanel container_all;
    private javax.swing.JPanel container_searchProduct;
    private javax.swing.JDialog dialog_searchProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
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
