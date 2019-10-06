package InterfazColaCir;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class ColaCircularInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form ColaCircularInterfaz
     */
    public ColaCircularInterfaz() {
        initComponents();
        m = (DefaultTableModel) tbl.getModel();
        ImageIcon imgPop = new ImageIcon(new ImageIcon(getClass().getResource("/img/pop.png")).getImage());
        ImageIcon aa = new ImageIcon(imgPop.getImage().getScaledInstance(btnPop.getWidth(), btnPop.getHeight(), Image.SCALE_DEFAULT));
        btnPop.setIcon(aa);

        ImageIcon imgPush = new ImageIcon(new ImageIcon(getClass().getResource("/img/push.png")).getImage());
        ImageIcon bb = new ImageIcon(imgPush.getImage().getScaledInstance(btnPush.getWidth(), btnPush.getHeight(), Image.SCALE_DEFAULT));
        btnPush.setIcon(bb);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lbGenerar = new javax.swing.JLabel();
        btnPush = new javax.swing.JLabel();
        btnPop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Swis721 BT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Colas Circulares");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tbl.setRowHeight(170);
        jScrollPane1.setViewportView(tbl);

        jLabel2.setFont(new java.awt.Font("Swis721 BT", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione un número");

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cantidad", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        lbGenerar.setBackground(new java.awt.Color(204, 204, 204));
        lbGenerar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbGenerar.setForeground(new java.awt.Color(255, 255, 255));
        lbGenerar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGenerar.setText("Generar Muro");
        lbGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGenerarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbGenerar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnPush.setText("push");
        btnPush.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPush.setEnabled(false);
        btnPush.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPushMouseClicked(evt);
            }
        });

        btnPop.setText("pop");
        btnPop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPop.setEnabled(false);
        btnPop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPopMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPush, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(380, 380, 380))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPush, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPopMouseClicked
        int n = c.pop();
        ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("/img/blanco.jpg")).getImage());
        ImageIcon ib = new ImageIcon(img.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH));
        m.setValueAt(new JLabel(ib), 0,n);
        
    }//GEN-LAST:event_btnPopMouseClicked

    private void btnPushMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPushMouseClicked
        int n = c.push("E");
        ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("/img/block.jpg")).getImage());
        ImageIcon ib = new ImageIcon(img.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH));
        m.setValueAt(new JLabel(ib), 0,n);
    }//GEN-LAST:event_btnPushMouseClicked

    private void lbGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGenerarMouseClicked
        if (cb.getSelectedIndex() == 0) {
            showMessageDialog(this, "Ingrese una cantidad", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int n = cb.getSelectedIndex() +1;
            c = new ColaCircular(n);
            m.setColumnCount(n);
            btnPop.setEnabled(true);
            btnPush.setEnabled(true);
            tbl.setDefaultRenderer(Object.class, new Render());
            for (int i = 0; i < n; i++) {
                ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("/img/blanco.jpg")).getImage());
                ImageIcon ib = new ImageIcon(img.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH));
                m.setValueAt(new JLabel(ib), 0,i);
        
            }
        }
    }//GEN-LAST:event_lbGenerarMouseClicked

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
            java.util.logging.Logger.getLogger(ColaCircularInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColaCircularInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColaCircularInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColaCircularInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColaCircularInterfaz().setVisible(true);
            }
        });
    }

    int inicio = 0;
    int fin = 0;

    private DefaultTableModel m = new DefaultTableModel();
    ColaCircular c;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnPop;
    private javax.swing.JLabel btnPush;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbGenerar;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables

    
}
