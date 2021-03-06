
package calculadorapoo;

/**
 *
 * @author Daniel Vargas, Nicolas Tuseddu, Sofía Lugo
 */
public class Interfaz extends javax.swing.JFrame {
    operaciones obj = new operaciones();            //INSTANCIAR
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        setLocationRelativeTo(null);
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

        pantalla = new javax.swing.JTextField();
        nueve_boton = new javax.swing.JButton();
        cinco_boton = new javax.swing.JButton();
        siete_boton = new javax.swing.JButton();
        ocho_boton = new javax.swing.JButton();
        seis_boton = new javax.swing.JButton();
        cuatro_boton = new javax.swing.JButton();
        uno_boton = new javax.swing.JButton();
        dos_boton = new javax.swing.JButton();
        suma_boton = new javax.swing.JButton();
        cero_boton = new javax.swing.JButton();
        tres_boton = new javax.swing.JButton();
        igual_boton = new javax.swing.JButton();
        resta_boton = new javax.swing.JButton();
        potencia_boton = new javax.swing.JButton();
        iva_boton = new javax.swing.JButton();
        division_boton = new javax.swing.JButton();
        sen_boton = new javax.swing.JButton();
        raiz_boton = new javax.swing.JButton();
        cos_boton = new javax.swing.JButton();
        tan_boton = new javax.swing.JButton();
        borrar_boton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        punto_boton = new javax.swing.JButton();
        multiplicacion_boton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setBackground(new java.awt.Color(69, 255, 255));
        pantalla.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        pantalla.setForeground(new java.awt.Color(0, 0, 0));
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 530, 70));

        nueve_boton.setBackground(new java.awt.Color(69, 255, 255));
        nueve_boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nueve_boton.setForeground(new java.awt.Color(0, 0, 0));
        nueve_boton.setText("9");
        nueve_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueve_botonActionPerformed(evt);
            }
        });
        getContentPane().add(nueve_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 80, 55));

        cinco_boton.setBackground(new java.awt.Color(69, 255, 255));
        cinco_boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cinco_boton.setForeground(new java.awt.Color(0, 0, 0));
        cinco_boton.setText("5");
        cinco_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinco_botonActionPerformed(evt);
            }
        });
        getContentPane().add(cinco_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 80, 60));

        siete_boton.setBackground(new java.awt.Color(69, 255, 255));
        siete_boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        siete_boton.setForeground(new java.awt.Color(0, 0, 0));
        siete_boton.setText("7");
        siete_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siete_botonActionPerformed(evt);
            }
        });
        getContentPane().add(siete_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 55));

        ocho_boton.setBackground(new java.awt.Color(69, 255, 255));
        ocho_boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ocho_boton.setForeground(new java.awt.Color(0, 0, 0));
        ocho_boton.setText("8");
        ocho_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocho_botonActionPerformed(evt);
            }
        });
        getContentPane().add(ocho_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 80, 55));

        seis_boton.setBackground(new java.awt.Color(69, 255, 255));
        seis_boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        seis_boton.setForeground(new java.awt.Color(0, 0, 0));
        seis_boton.setText("6");
        seis_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seis_botonActionPerformed(evt);
            }
        });
        getContentPane().add(seis_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 80, 60));

        cuatro_boton.setBackground(new java.awt.Color(69, 255, 255));
        cuatro_boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cuatro_boton.setForeground(new java.awt.Color(0, 0, 0));
        cuatro_boton.setText("4");
        cuatro_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatro_botonActionPerformed(evt);
            }
        });
        getContentPane().add(cuatro_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, 60));

        uno_boton.setBackground(new java.awt.Color(69, 255, 255));
        uno_boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        uno_boton.setForeground(new java.awt.Color(0, 0, 0));
        uno_boton.setText("1");
        uno_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_botonActionPerformed(evt);
            }
        });
        getContentPane().add(uno_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 80, 60));

        dos_boton.setBackground(new java.awt.Color(69, 255, 255));
        dos_boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        dos_boton.setForeground(new java.awt.Color(0, 0, 0));
        dos_boton.setText("2");
        dos_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos_botonActionPerformed(evt);
            }
        });
        getContentPane().add(dos_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 80, 60));

        suma_boton.setBackground(new java.awt.Color(253, 183, 26));
        suma_boton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        suma_boton.setForeground(new java.awt.Color(0, 0, 0));
        suma_boton.setText("+");
        suma_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suma_botonActionPerformed(evt);
            }
        });
        getContentPane().add(suma_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 80, 70));

        cero_boton.setBackground(new java.awt.Color(69, 255, 255));
        cero_boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cero_boton.setForeground(new java.awt.Color(0, 0, 0));
        cero_boton.setText("0");
        cero_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cero_botonActionPerformed(evt);
            }
        });
        getContentPane().add(cero_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 122, 55));

        tres_boton.setBackground(new java.awt.Color(69, 255, 255));
        tres_boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tres_boton.setForeground(new java.awt.Color(0, 0, 0));
        tres_boton.setText("3");
        tres_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres_botonActionPerformed(evt);
            }
        });
        getContentPane().add(tres_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 80, 60));

        igual_boton.setBackground(new java.awt.Color(253, 183, 26));
        igual_boton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        igual_boton.setForeground(new java.awt.Color(0, 0, 0));
        igual_boton.setText("=");
        igual_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igual_botonActionPerformed(evt);
            }
        });
        getContentPane().add(igual_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 170, 70));

        resta_boton.setBackground(new java.awt.Color(253, 183, 26));
        resta_boton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        resta_boton.setForeground(new java.awt.Color(0, 0, 0));
        resta_boton.setText("-");
        resta_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resta_botonActionPerformed(evt);
            }
        });
        getContentPane().add(resta_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 80, 70));

        potencia_boton.setBackground(new java.awt.Color(253, 183, 26));
        potencia_boton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        potencia_boton.setForeground(new java.awt.Color(0, 0, 0));
        potencia_boton.setText("^");
        potencia_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencia_botonActionPerformed(evt);
            }
        });
        getContentPane().add(potencia_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 80, 70));

        iva_boton.setBackground(new java.awt.Color(253, 183, 26));
        iva_boton.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        iva_boton.setForeground(new java.awt.Color(0, 0, 0));
        iva_boton.setText("%IVA");
        iva_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iva_botonActionPerformed(evt);
            }
        });
        getContentPane().add(iva_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 80, 70));

        division_boton.setBackground(new java.awt.Color(253, 183, 26));
        division_boton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        division_boton.setForeground(new java.awt.Color(0, 0, 0));
        division_boton.setText("÷");
        division_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                division_botonActionPerformed(evt);
            }
        });
        getContentPane().add(division_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 80, 70));

        sen_boton.setBackground(new java.awt.Color(253, 183, 26));
        sen_boton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        sen_boton.setForeground(new java.awt.Color(0, 0, 0));
        sen_boton.setText("sen");
        sen_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sen_botonActionPerformed(evt);
            }
        });
        getContentPane().add(sen_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 80, 70));

        raiz_boton.setBackground(new java.awt.Color(253, 183, 26));
        raiz_boton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        raiz_boton.setForeground(new java.awt.Color(0, 0, 0));
        raiz_boton.setText("√");
        raiz_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raiz_botonActionPerformed(evt);
            }
        });
        getContentPane().add(raiz_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 80, 70));

        cos_boton.setBackground(new java.awt.Color(253, 183, 26));
        cos_boton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        cos_boton.setForeground(new java.awt.Color(0, 0, 0));
        cos_boton.setText("cos");
        cos_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cos_botonActionPerformed(evt);
            }
        });
        getContentPane().add(cos_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 80, 70));

        tan_boton.setBackground(new java.awt.Color(253, 183, 26));
        tan_boton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        tan_boton.setForeground(new java.awt.Color(0, 0, 0));
        tan_boton.setText("tan");
        tan_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tan_botonActionPerformed(evt);
            }
        });
        getContentPane().add(tan_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 80, 70));

        borrar_boton.setBackground(new java.awt.Color(253, 183, 26));
        borrar_boton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        borrar_boton.setForeground(new java.awt.Color(0, 0, 0));
        borrar_boton.setText("C");
        borrar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_botonActionPerformed(evt);
            }
        });
        getContentPane().add(borrar_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 260, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        punto_boton.setBackground(new java.awt.Color(69, 255, 255));
        punto_boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        punto_boton.setForeground(new java.awt.Color(0, 0, 0));
        punto_boton.setText(".");
        punto_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punto_botonActionPerformed(evt);
            }
        });

        multiplicacion_boton.setBackground(new java.awt.Color(253, 183, 26));
        multiplicacion_boton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        multiplicacion_boton.setForeground(new java.awt.Color(18, 0, 0));
        multiplicacion_boton.setText("x");
        multiplicacion_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacion_botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(multiplicacion_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(punto_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(multiplicacion_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(punto_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 570, 350));

        jPanel2.setBackground(new java.awt.Color(227, 227, 227));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uno_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_botonActionPerformed
        // BOTON 1
        obj.agrgarNum(1);
        pantalla.setText(obj.getDigito());  //MOSTRAR EL NUMERO DE LA CLASE EN LA PANTALLA
    }//GEN-LAST:event_uno_botonActionPerformed

    private void dos_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos_botonActionPerformed
        // BOTON 2
        obj.agrgarNum(2);
        pantalla.setText(obj.getDigito());  //MOSTRAR EL NUMERO DE LA CLASE EN LA PANTALLA
    }//GEN-LAST:event_dos_botonActionPerformed

    private void tres_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres_botonActionPerformed
        // BOTON 3
        obj.agrgarNum(3);
        pantalla.setText(obj.getDigito());  //MOSTRAR EL NUMERO DE LA CLASE EN LA PANTALLA
    }//GEN-LAST:event_tres_botonActionPerformed

    private void cuatro_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatro_botonActionPerformed
        // BOTON 4
        obj.agrgarNum(4);
        pantalla.setText(obj.getDigito());  //MOSTRAR EL NUMERO DE LA CLASE EN LA PANTALLA
    }//GEN-LAST:event_cuatro_botonActionPerformed

    private void cinco_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinco_botonActionPerformed
        // BOTON 5
        obj.agrgarNum(5);
        pantalla.setText(obj.getDigito());  //MOSTRAR EL NUMERO DE LA CLASE EN LA PANTALLA
    }//GEN-LAST:event_cinco_botonActionPerformed

    private void seis_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seis_botonActionPerformed
        // BOTON 6
        obj.agrgarNum(6);
        pantalla.setText(obj.getDigito());  //MOSTRAR EL NUMERO DE LA CLASE EN LA PANTALLA
    }//GEN-LAST:event_seis_botonActionPerformed

    private void siete_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siete_botonActionPerformed
        // BOTON 7
        obj.agrgarNum(7);
        pantalla.setText(obj.getDigito());  //MOSTRAR EL NUMERO DE LA CLASE EN LA PANTALLA
    }//GEN-LAST:event_siete_botonActionPerformed

    private void ocho_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocho_botonActionPerformed
        // BOTON 8
        obj.agrgarNum(8);
        pantalla.setText(obj.getDigito());  //MOSTRAR EL NUMERO DE LA CLASE EN LA PANTALLA
    }//GEN-LAST:event_ocho_botonActionPerformed

    private void nueve_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueve_botonActionPerformed
        // BOTON 9
        obj.agrgarNum(9);
        pantalla.setText(obj.getDigito());  //MOSTRAR EL NUMERO DE LA CLASE EN LA PANTALLA
    }//GEN-LAST:event_nueve_botonActionPerformed

    private void cero_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cero_botonActionPerformed
        // BOTON 0
        obj.agrgarNum(0);
        pantalla.setText(obj.getDigito());  //MOSTRAR EL NUMERO DE LA CLASE EN LA PANTALLA
    }//GEN-LAST:event_cero_botonActionPerformed

    private void suma_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suma_botonActionPerformed
        // SUMA
        
        obj.Suma(pantalla.getText());   // INTRODUCE LA VARIABLE
        //pantalla.setText("");           // REESTABLECE EL TEXTO EN PANTALLA
    }//GEN-LAST:event_suma_botonActionPerformed

    private void igual_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igual_botonActionPerformed
        // IGUAL
        pantalla.setText(""+obj.calculoigual(pantalla.getText()));
    }//GEN-LAST:event_igual_botonActionPerformed

    private void resta_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resta_botonActionPerformed
        // RESTA
        obj.Resta(pantalla.getText());
    }//GEN-LAST:event_resta_botonActionPerformed

    private void potencia_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencia_botonActionPerformed
        // POTENCIA
        obj.Potencia(pantalla.getText());
    }//GEN-LAST:event_potencia_botonActionPerformed

    private void iva_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iva_botonActionPerformed
        // IVA 19
        obj.Iva(pantalla.getText());
    }//GEN-LAST:event_iva_botonActionPerformed

    private void multiplicacion_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacion_botonActionPerformed
        // MULTIPLICACION
        obj.Multiplicacion(pantalla.getText());
    }//GEN-LAST:event_multiplicacion_botonActionPerformed

    private void division_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_division_botonActionPerformed
        // DIVISION
        obj.Division(pantalla.getText());
    }//GEN-LAST:event_division_botonActionPerformed

    private void sen_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sen_botonActionPerformed
        // SENO
        obj.Sen(pantalla.getText());
    }//GEN-LAST:event_sen_botonActionPerformed

    private void raiz_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raiz_botonActionPerformed
        // RAIZ
        obj.Raiz(pantalla.getText());
        //pantalla.setText("");
    }//GEN-LAST:event_raiz_botonActionPerformed

    private void cos_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cos_botonActionPerformed
        // COSENO
        obj.Cos(pantalla.getText());
        //pantalla.setText("");
    }//GEN-LAST:event_cos_botonActionPerformed

    private void tan_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tan_botonActionPerformed
        // TAN
        obj.Tan(pantalla.getText());
        //pantalla.setText("");
    }//GEN-LAST:event_tan_botonActionPerformed

    private void borrar_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_botonActionPerformed
        pantalla.setText("");
    }//GEN-LAST:event_borrar_botonActionPerformed

    private void punto_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punto_botonActionPerformed
        
    }//GEN-LAST:event_punto_botonActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar_boton;
    private javax.swing.JButton cero_boton;
    private javax.swing.JButton cinco_boton;
    private javax.swing.JButton cos_boton;
    private javax.swing.JButton cuatro_boton;
    private javax.swing.JButton division_boton;
    private javax.swing.JButton dos_boton;
    private javax.swing.JButton igual_boton;
    private javax.swing.JButton iva_boton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton multiplicacion_boton;
    private javax.swing.JButton nueve_boton;
    private javax.swing.JButton ocho_boton;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton potencia_boton;
    private javax.swing.JButton punto_boton;
    private javax.swing.JButton raiz_boton;
    private javax.swing.JButton resta_boton;
    private javax.swing.JButton seis_boton;
    private javax.swing.JButton sen_boton;
    private javax.swing.JButton siete_boton;
    private javax.swing.JButton suma_boton;
    private javax.swing.JButton tan_boton;
    private javax.swing.JButton tres_boton;
    private javax.swing.JButton uno_boton;
    // End of variables declaration//GEN-END:variables
}
