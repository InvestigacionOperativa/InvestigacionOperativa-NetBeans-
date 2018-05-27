/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import elementos.Ecuacion;
import elementos.Funcion;
import java.awt.geom.Point2D;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Ventana extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        model.addColumn("Punto");
        model.addColumn("X1");
        model.addColumn("X2");
        model.addColumn("S1");
        model.addColumn("S2");
        model.addColumn("Z");
        this.table.setModel(model);
        this.table.setDefaultEditor(Object.class, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fx1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        r2x1 = new javax.swing.JTextField();
        r1x1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fx2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        r1x2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        r2x2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        opti = new javax.swing.JComboBox<>();
        r1signo = new javax.swing.JComboBox<>();
        r2signo = new javax.swing.JComboBox<>();
        r1b = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        r2b = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        calcular = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fx1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Funcion Objetivo:");

        jLabel2.setText("Restricción 1:");

        jLabel3.setText("Restricción 2:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        r2x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2x1ActionPerformed(evt);
            }
        });

        r1x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1x1ActionPerformed(evt);
            }
        });

        jLabel4.setText("x1 +");

        jLabel5.setText("x1 +");

        jLabel6.setText("x1 +");

        fx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fx2ActionPerformed(evt);
            }
        });

        jLabel7.setText("x2");

        r1x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1x2ActionPerformed(evt);
            }
        });

        jLabel8.setText("x2");

        r2x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2x2ActionPerformed(evt);
            }
        });

        jLabel9.setText("x2");

        opti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maximizar", "Minimizar" }));
        opti.setName(""); // NOI18N
        opti.setNextFocusableComponent(r1x1);
        opti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optiActionPerformed(evt);
            }
        });

        r1signo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<=", "=", ">=" }));
        r1signo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1signoActionPerformed(evt);
            }
        });

        r2signo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<=", "=", ">=" }));
        r2signo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2signoActionPerformed(evt);
            }
        });

        r1b.setNextFocusableComponent(r2x1);
        r1b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1bActionPerformed(evt);
            }
        });

        r2b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2bActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Punto", "X1", "X2", "Z"
            }
        ));
        jScrollPane2.setViewportView(table);

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel12.setText("Analizador de Vertices");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(r2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(r2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(fx1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(fx2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(r1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(r1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(r1signo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(r1b, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(r2signo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(r2b, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(opti, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(calcular)
                                        .addGap(142, 142, 142)))
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel12)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(289, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel10)
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(fx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(opti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(r1x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(r1x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(r1signo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r2x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(r2x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(r2signo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(calcular)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(286, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fx1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void r2x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2x1ActionPerformed

    private void r1x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1x1ActionPerformed

    private void fx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fx2ActionPerformed

    private void r1x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1x2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1x2ActionPerformed

    private void r2x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2x2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2x2ActionPerformed

    private void optiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optiActionPerformed

    private void r1signoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1signoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1signoActionPerformed

    private void r2signoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2signoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2signoActionPerformed

    private void r1bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1bActionPerformed

    private void r2bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2bActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
                double coefFuncionx1, coefFuncionx2, coefx1Rest1, coefx2Rest1, bRest1, coefx1Rest2, coefx2Rest2, bRest2 ;
                boolean optimizar;
                String signor1, signor2,op;

                //Guardo inputs de la funcion y creo la funcion
                try{
                    coefFuncionx1 = Double.parseDouble(fx1.getText());
                    coefFuncionx2 = Double.parseDouble(fx2.getText());
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(Ventana.this,"Datos incorrectos \n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                op = (String)opti.getSelectedItem();
                optimizar = op.equals("Maximizar"); //Pregunta si estoy maximizando(true), sino false
                Funcion funcion = new Funcion(coefFuncionx1,coefFuncionx2,optimizar);
                
                //Creo la restriccion 1
                try{
                coefx1Rest1 = Double.parseDouble(r1x1.getText());
                coefx2Rest1 = Double.parseDouble(r1x2.getText());
                bRest1 = Double.parseDouble(r1b.getText());
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(Ventana.this,"Datos incorrectos \n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                signor1 = (String) r1signo.getSelectedItem();      
                Ecuacion r1 = new Ecuacion(coefx1Rest1,coefx2Rest1,signor1,bRest1);
                //Creo la restriccion 2
                try{
                coefx1Rest2 = Double.parseDouble(r2x1.getText());
                coefx2Rest2 = Double.parseDouble(r2x2.getText());
                bRest2 = Double.parseDouble(r2b.getText());
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(Ventana.this,"Datos incorrectos \n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }                
                signor2 =(String) r2signo.getSelectedItem();                
                Ecuacion r2 = new Ecuacion(coefx1Rest2,coefx2Rest2,signor2,bRest2);
                
                
                //Cambio signos = de r1 y r2 al correspondiente >= o <=
                if (r1.getSigno().equals("=")) {
                    if (funcion.isMaximizacion()) {
                        r1.setSigno("<=");
                    } else {
                        r1.setSigno(">=");
                    }
                }else if (r2.getSigno().equals("=")) {
                    if (funcion.isMaximizacion()) {
                        r2.setSigno("<=");
                    } else {
                        r2.setSigno(">=");
                    }
                }
           
                //Busco vertices
                model.getDataVector().removeAllElements();
                Set<Point2D.Double> vertices = new HashSet<>();
                vertices.add(r1.calcularPuntoX1());
                vertices.add(r1.calcularPuntoX2());
                vertices.add(r2.calcularPuntoX1());
                vertices.add(r2.calcularPuntoX2());
                vertices.add(r1.calcularInterseccion(r2));
                
                //Controlamos que los vertices esten en el factible
                for (Iterator<Point2D.Double> iter = vertices.iterator(); iter.hasNext(); ) {
                    Point2D vertice = iter.next();          
                    double x1 = vertice.getX();
                    double x2 = vertice.getY();
                    boolean viable = true;         
                    if(x1 < 0 || x2 < 0){
                        viable = false;
                    }
                    //Verificar si el vertice cumple r1               
                    if (r1.getSigno().equals(">=")) {
                        if (Double.compare((r1.getX1() * x1 + r1.getX2() * x2), r1.getB()) < 0) { //no cumple r1
                            viable = false;
                        }
                    } else { // "<="
                        if (Double.compare((r1.getX1() * x1 + r1.getX2() * x2), r1.getB()) > 0) { //no cumple r1
                            viable = false;
                        }
                    }
                    //Verificar si el vertice cumple r2
                    if (r2.getSigno().equals(">=")) {
                        if (Double.compare((r2.getX1() * x1 + r2.getX2() * x2), r2.getB()) < 0) { //no cumple r2
                            viable = false;
                        }
                    } else { // "<="
                        if (Double.compare((r2.getX1() * x1 + r2.getX2() * x2), r2.getB()) > 0) { //no cumple r2
                            viable = false;
                        }
                    }
                    
                    if(!viable){
                        iter.remove();
                    }
                }
                
                //Verifico casos especiales
                if(vertices.isEmpty()){
                    JOptionPane.showMessageDialog(Ventana.this,"El problema no tiene solucion (Infactible)");
                }else if(funcion.solucionInfinita(r1,r2)){
                    JOptionPane.showMessageDialog(Ventana.this,"El problema tiene infinitas soluciones");
                }else{
                    if(r1.getSigno().equals(">=") && r2.getSigno().equals(">=") && funcion.isMaximizacion()){
                        JOptionPane.showMessageDialog(Ventana.this,"Solución no acotada");
                    }
                } 
                    
                    
                //Cargar vertices en tabla
                Object[] ob = new Object[6];
                int a = 0;
                for (Iterator<Point2D.Double> iter = vertices.iterator(); iter.hasNext(); ) {
                    Point2D vertice = iter.next();          
                    String value = "A";
                    int charValue = value.charAt(0);
                    ob[0] = (char) (charValue + a); a++;
                    ob[1] = String.format("%.4f", vertice.getX());
                    ob[2] = String.format("%.4f", vertice.getY());
                    ob[3] = String.format("%.4f", r1.getSlack(vertice.getX(), vertice.getY()));
                    ob[4] = String.format("%.4f", r2.getSlack(vertice.getX(), vertice.getY()));
                    ob[5] = String.format("%.4f", funcion.evaluarEn(vertice.getX(), vertice.getY()));
                    model.addRow(ob);           
                }
                //Pintar min o max
                if (funcion.isMaximizacion()){
                    this.table.setDefaultRenderer(Object.class, new TableColorMax());
                }else{
                    this.table.setDefaultRenderer(Object.class, new TableColorMin());
                }
    }//GEN-LAST:event_calcularActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JTextField fx1;
    private javax.swing.JTextField fx2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> opti;
    private javax.swing.JTextField r1b;
    private javax.swing.JComboBox<String> r1signo;
    private javax.swing.JTextField r1x1;
    private javax.swing.JTextField r1x2;
    private javax.swing.JTextField r2b;
    private javax.swing.JComboBox<String> r2signo;
    private javax.swing.JTextField r2x1;
    private javax.swing.JTextField r2x2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
