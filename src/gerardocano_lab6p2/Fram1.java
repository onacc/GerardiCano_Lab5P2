/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gerardocano_lab6p2;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author gcano
 */
public class Fram1 extends javax.swing.JFrame {

    /**
     * Creates new form Fram1
     */
    public Fram1() {
        initComponents();
        setLocationRelativeTo(null);
        //Limpiar();
        jtxt_displayname.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_agregar = new javax.swing.JFrame();
        jtxt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxt_poder = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcombobox_uni = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        bt_crear = new javax.swing.JButton();
        jtxt_fuerza = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxt_debilidad = new javax.swing.JTextField();
        jtxt_puntosvida = new javax.swing.JTextField();
        jtxt_fisica = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxt_mental = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jf_listado = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_personajes = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_personajes = new javax.swing.JList<>();
        bt_regresar = new javax.swing.JButton();
        jlabel_nombreper = new javax.swing.JLabel();
        jtxt_displayname = new javax.swing.JTextField();
        jf_sim = new javax.swing.JFrame();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        pop_up = new javax.swing.JPopupMenu();
        jmi_Eliminar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        bt_agregar = new javax.swing.JButton();
        bt_listado = new javax.swing.JButton();
        bt_simulaicon = new javax.swing.JButton();

        jtxt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Poder:");

        jtxt_poder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_poderActionPerformed(evt);
            }
        });

        jLabel5.setText("Fuerza:");

        jLabel6.setText("Halibidad Fisica:");

        jLabel7.setText("Hablidad Mental:");

        jcombobox_uni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marvel", "Capcom", "Mortal Kombat", "DC" }));

        jLabel8.setText("Universo:");

        bt_crear.setText("Crear");
        bt_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearActionPerformed(evt);
            }
        });

        jLabel9.setText("Debilidad:");

        jtxt_puntosvida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_puntosvidaActionPerformed(evt);
            }
        });

        jLabel10.setText("Puntos de vida:");

        jtxt_mental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_mentalActionPerformed(evt);
            }
        });

        jLabel11.setText("Creacion de personaje");

        javax.swing.GroupLayout jf_agregarLayout = new javax.swing.GroupLayout(jf_agregar.getContentPane());
        jf_agregar.getContentPane().setLayout(jf_agregarLayout);
        jf_agregarLayout.setHorizontalGroup(
            jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_agregarLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jf_agregarLayout.createSequentialGroup()
                        .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_fisica, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jtxt_mental)))
                    .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jf_agregarLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxt_debilidad))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jf_agregarLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jf_agregarLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jtxt_poder, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jf_agregarLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtxt_fuerza))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jf_agregarLayout.createSequentialGroup()
                            .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxt_puntosvida)))
                    .addGroup(jf_agregarLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(bt_crear))
                    .addGroup(jf_agregarLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcombobox_uni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(jf_agregarLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jf_agregarLayout.setVerticalGroup(
            jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_agregarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxt_fuerza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxt_debilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jtxt_puntosvida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxt_fisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxt_mental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jf_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcombobox_uni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(bt_crear)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Personajes");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("DC");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Marvel");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Capcom");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mortal Kombat");
        treeNode1.add(treeNode2);
        jt_personajes.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_personajes.setComponentPopupMenu(pop_up);
        jt_personajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_personajesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jt_personajesMouseReleased(evt);
            }
        });
        jt_personajes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_personajesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jt_personajes);

        jl_personajes.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_personajes);

        bt_regresar.setText("Regresar");
        bt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jf_listadoLayout = new javax.swing.GroupLayout(jf_listado.getContentPane());
        jf_listado.getContentPane().setLayout(jf_listadoLayout);
        jf_listadoLayout.setHorizontalGroup(
            jf_listadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_listadoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_listadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jf_listadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_listadoLayout.createSequentialGroup()
                        .addComponent(bt_regresar)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_listadoLayout.createSequentialGroup()
                        .addComponent(jlabel_nombreper)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_listadoLayout.createSequentialGroup()
                        .addComponent(jtxt_displayname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        jf_listadoLayout.setVerticalGroup(
            jf_listadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_listadoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlabel_nombreper)
                .addGap(1, 1, 1)
                .addComponent(jtxt_displayname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jf_listadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(bt_regresar)
                .addContainerGap())
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jList1.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jList1);

        jList2.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jList2);

        jButton1.setText("Batalla");

        javax.swing.GroupLayout jf_simLayout = new javax.swing.GroupLayout(jf_sim.getContentPane());
        jf_sim.getContentPane().setLayout(jf_simLayout);
        jf_simLayout.setHorizontalGroup(
            jf_simLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_simLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jf_simLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jf_simLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(jf_simLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
            .addGroup(jf_simLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jf_simLayout.setVerticalGroup(
            jf_simLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_simLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jf_simLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jf_simLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jmi_Eliminar.setText("Eliminar");
        jmi_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_EliminarActionPerformed(evt);
            }
        });
        pop_up.add(jmi_Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lab5P2");

        bt_agregar.setText("Agregar Personajes");
        bt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarActionPerformed(evt);
            }
        });

        bt_listado.setText("Listado de Personajes");
        bt_listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_listadoActionPerformed(evt);
            }
        });

        bt_simulaicon.setText("Simulacion de Batalla");
        bt_simulaicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simulaiconActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bt_simulaicon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_listado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_agregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bt_agregar)
                .addGap(18, 18, 18)
                .addComponent(bt_listado)
                .addGap(18, 18, 18)
                .addComponent(bt_simulaicon)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_listadoActionPerformed
        DefaultTreeModel m = (DefaultTreeModel) jt_personajes.getModel();
        
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        setVisible(false);
        jf_listado.setVisible(true);
        jf_listado.setLocationRelativeTo(this);
        jf_listado.setSize(700, 600);
        jf_listado.setResizable(false);
        for (Personaje t : personajes) {
            switch(t.getUniverso()){
                case "Marvel":{
                  
                   nodo_seleccionado = new DefaultMutableTreeNode(t.getNombre());
                   ((DefaultMutableTreeNode)raiz.getChildAt(1)).add(nodo_seleccionado);
                   
                }break;
                
                case "DC":
                    nodo_seleccionado = new DefaultMutableTreeNode(t.getNombre());
                    ((DefaultMutableTreeNode)raiz.getChildAt(0)).add(nodo_seleccionado);
                    
                break;
                
                case "Capcom":
                    nodo_seleccionado = new DefaultMutableTreeNode(t.getNombre());
                    ((DefaultMutableTreeNode)raiz.getChildAt(2)).add(nodo_seleccionado);
                break;
                
                case "Mortal Kombat":
                    nodo_seleccionado = new DefaultMutableTreeNode(t.getNombre());
                    ((DefaultMutableTreeNode)raiz.getChildAt(3)).add(nodo_seleccionado);
                break;
            }
        }
    }//GEN-LAST:event_bt_listadoActionPerformed

    private void bt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarActionPerformed
        setVisible(false);
        jf_agregar.setVisible(true);
        jf_agregar.setLocationRelativeTo(this);
        jf_agregar.setSize(400, 500);
        
        jf_agregar.setResizable(false);
    }//GEN-LAST:event_bt_agregarActionPerformed

    private void bt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_regresarActionPerformed
    jf_listado.setVisible(false);
    setVisible(true);
    }//GEN-LAST:event_bt_regresarActionPerformed

    private void jtxt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombreActionPerformed

    private void jtxt_poderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_poderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_poderActionPerformed

    private void jtxt_puntosvidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_puntosvidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_puntosvidaActionPerformed

    private void bt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearActionPerformed
        int index =0;
        index = jcombobox_uni.getSelectedIndex();
        personajes.add(new Personaje(jtxt_nombre.getText(),
                jtxt_poder.getText(),
                jtxt_debilidad.getText(),
                jcombobox_uni.getItemAt(index),
                Double.parseDouble(jtxt_fuerza.getText()),
                Double.parseDouble(jtxt_puntosvida.getText()),
                Double.parseDouble(jtxt_fisica.getText()),
                Double.parseDouble(jtxt_mental.getText())));
                jf_agregar.setVisible(false);
                setVisible(true);
        
        //System.out.println(personajes);
        jtxt_poder.setText("");
        jtxt_debilidad.setText("");
        jtxt_mental.setText("");
        jtxt_fuerza.setText("");
        jtxt_puntosvida.setText("");
        jtxt_nombre.setText("");
        jtxt_fisica.setText("");
        
    }//GEN-LAST:event_bt_crearActionPerformed

    private void jtxt_mentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_mentalActionPerformed
        
    }//GEN-LAST:event_jtxt_mentalActionPerformed

    private void jt_personajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_personajesMouseClicked
        DefaultListModel modelo = (DefaultListModel) jl_personajes.getModel();
        
            
         
        if (evt.isMetaDown()) {
            
            int row = jt_personajes.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_personajes.setSelectionRow(row);
            Object v1 = jt_personajes.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            
            if (nodo_seleccionado.getUserObject() instanceof Personaje) {
                
               
                 
                personaje_seleccionado= (Personaje) nodo_seleccionado.getUserObject();
                
                //jtxt_displayname.setText(personaje_seleccionado.getNombre());
                pop_up.show(evt.getComponent(),evt.getX(), evt.getY());
                //modelo.addElement(personaje_seleccionado.toString2());
                //jl_personajes.setModel(modelo);
                
         }
        }
    }//GEN-LAST:event_jt_personajesMouseClicked

    private void bt_simulaiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simulaiconActionPerformed
        jf_sim.setVisible(true);
        setVisible(false);
        jf_sim.setResizable(false);
        jf_sim.setLocationRelativeTo(this);
        jf_sim.setSize(500, 500);
        
    }//GEN-LAST:event_bt_simulaiconActionPerformed

    private void jmi_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_EliminarActionPerformed
        int response = JOptionPane.showConfirmDialog(this,"Seguro de Eliminar?",
                "Confirm",JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.OK_OPTION) {
            DefaultTreeModel m = (DefaultTreeModel) jt_personajes.getModel();
            m.removeNodeFromParent(nodo_seleccionado);
            m.reload();
        }
    }//GEN-LAST:event_jmi_EliminarActionPerformed

    private void jt_personajesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_personajesMouseReleased
        /*if (evt.isPopupTrigger()) {
            
            int row = jt_personajes.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_personajes.setSelectionRow(row);
            Object v1 = jt_personajes.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            
            if (nodo_seleccionado.getUserObject() instanceof Personaje) {
                
                personaje_seleccionado= (Personaje) nodo_seleccionado.getUserObject();
                
                jtxt_displayname.setText(personaje_seleccionado.getNombre());
                pop_up.show(jf_listado,evt.getX(), evt.getY());
                
         }}*/
    }//GEN-LAST:event_jt_personajesMouseReleased

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jt_personajesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_personajesKeyPressed
      
       DefaultListModel modelo = (DefaultListModel) jl_personajes.getModel();
        if (evt.getKeyCode()==5) {
        if (nodo_seleccionado.getUserObject() instanceof Personaje) {
                
                modelo.clear();
                 
                personaje_seleccionado= (Personaje) nodo_seleccionado.getUserObject();
                
                jtxt_displayname.setText(personaje_seleccionado.getNombre());
               
                modelo.addElement(personaje_seleccionado.toString2());
                jl_personajes.setModel(modelo);
                
         }else{
        modelo.clear();
        modelo.addElement(personajes.toString());
        jl_personajes.setModel(modelo);
        jtxt_displayname.setText("");
            }}
    }//GEN-LAST:event_jt_personajesKeyPressed
    public DefaultListModel Limpiar(){
        DefaultListModel modelo = new DefaultListModel();
        jl_personajes.setModel(modelo);
        return modelo;
    }
    static void Imprimir(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.indexOf(i) + " " + lista.get(i));
        }
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
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fram1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_crear;
    private javax.swing.JButton bt_listado;
    private javax.swing.JButton bt_regresar;
    private javax.swing.JButton bt_simulaicon;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> jcombobox_uni;
    private javax.swing.JFrame jf_agregar;
    private javax.swing.JFrame jf_listado;
    private javax.swing.JFrame jf_sim;
    private javax.swing.JList<String> jl_personajes;
    private javax.swing.JLabel jlabel_nombreper;
    private javax.swing.JMenuItem jmi_Eliminar;
    private javax.swing.JTree jt_personajes;
    private javax.swing.JTextField jtxt_debilidad;
    private javax.swing.JTextField jtxt_displayname;
    private javax.swing.JTextField jtxt_fisica;
    private javax.swing.JTextField jtxt_fuerza;
    private javax.swing.JTextField jtxt_mental;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_poder;
    private javax.swing.JTextField jtxt_puntosvida;
    private javax.swing.JPopupMenu pop_up;
    // End of variables declaration//GEN-END:variables
    ArrayList <Personaje> personajes = new ArrayList();
    DefaultMutableTreeNode nodo_seleccionado;
    Personaje personaje_seleccionado;
}
