/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;

/**
 *
 * @author mateus
 */
public class CalculadoraFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraFrame
     */
    private String operando;
    private double operando1;
    private double operando2;
    private double resultado;
    private char   operacao;
    
    public CalculadoraFrame() {
        initComponents();
        operando  = "0";
        operando1 = operando2 = resultado = 0.0;
        operacao = ' ';
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSete = new javax.swing.JButton();
        jButtonOito = new javax.swing.JButton();
        jButtonNove = new javax.swing.JButton();
        jButtonQuatro = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonUm = new javax.swing.JButton();
        jButtonDois = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonPontoFlutuante = new javax.swing.JButton();
        jButtonPorcentagem = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jButtonMultiplicacao = new javax.swing.JButton();
        jButtonSubtracao = new javax.swing.JButton();
        jButtonAdicao = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonRaizQuadrada = new javax.swing.JButton();
        jButtonPotenciaQuadrada = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jLabelVisorOperacao = new javax.swing.JLabel();
        jLabelResultados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSete.setText("7");
        jButtonSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperando(evt);
            }
        });

        jButtonOito.setText("8");
        jButtonOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperando(evt);
            }
        });

        jButtonNove.setText("9");
        jButtonNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperando(evt);
            }
        });

        jButtonQuatro.setText("4");
        jButtonQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperando(evt);
            }
        });

        jButtonCinco.setText("5");
        jButtonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperando(evt);
            }
        });

        jButtonSeis.setText("6");
        jButtonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperando(evt);
            }
        });

        jButtonUm.setText("1");
        jButtonUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperando(evt);
            }
        });

        jButtonDois.setText("2");
        jButtonDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperando(evt);
            }
        });

        jButtonTres.setText("3");
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperando(evt);
            }
        });

        jButtonZero.setText("0");
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperando(evt);
            }
        });

        jButtonPontoFlutuante.setText(".");
        jButtonPontoFlutuante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperando(evt);
            }
        });

        jButtonPorcentagem.setText("%");
        jButtonPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperacao(evt);
            }
        });

        jButtonDivisao.setText("÷");
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperacao(evt);
            }
        });

        jButtonMultiplicacao.setText("×");
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperacao(evt);
            }
        });

        jButtonSubtracao.setText("–");
        jButtonSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperacao(evt);
            }
        });

        jButtonAdicao.setText("+");
        jButtonAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperacao(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpaTudo(evt);
            }
        });

        jButtonRaizQuadrada.setText("√");
        jButtonRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperacao(evt);
            }
        });

        jButtonPotenciaQuadrada.setText(" x²");
        jButtonPotenciaQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOperacao(evt);
            }
        });

        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacaoIgual(evt);
            }
        });

        jLabelVisorOperacao.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabelVisorOperacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelVisorOperacao.setText("0");
        jLabelVisorOperacao.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelResultados.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabelResultados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelVisorOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonOito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonNove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonLimpar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRaizQuadrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPotenciaQuadrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPontoFlutuante, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVisorOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSete)
                    .addComponent(jButtonOito)
                    .addComponent(jButtonNove)
                    .addComponent(jButtonDivisao)
                    .addComponent(jButtonLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonQuatro)
                    .addComponent(jButtonCinco)
                    .addComponent(jButtonSeis)
                    .addComponent(jButtonMultiplicacao)
                    .addComponent(jButtonRaizQuadrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUm)
                    .addComponent(jButtonDois)
                    .addComponent(jButtonTres)
                    .addComponent(jButtonSubtracao)
                    .addComponent(jButtonPotenciaQuadrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonZero)
                    .addComponent(jButtonPontoFlutuante)
                    .addComponent(jButtonPorcentagem)
                    .addComponent(jButtonAdicao)
                    .addComponent(jButtonIgual))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setOperando(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setOperando
        // TODO add your handling code here:
        if (evt.getSource() == jButtonZero) {
            if (operando.equalsIgnoreCase("0") || operacao != ' ' && 
                    !jLabelVisorOperacao.getText().matches("(.*).")) {
                operando = "0";
            } else {
                operando += "0";
            }
        } 
        
        if (evt.getSource() == jButtonPontoFlutuante) {
            if (!operando.contains(".")) {
                operando += ".";
            }
        }
        
        if (evt.getSource() == jButtonUm) {
            if (operando.equalsIgnoreCase("0") || operacao != ' ' && 
                    !jLabelVisorOperacao.getText().matches("(.*).")) {
                operando = "1";
            } else {
                operando += "1";
            }
        }
        
        if (evt.getSource() == jButtonDois) {
            if (operando.equalsIgnoreCase("0") || operacao != ' ' && 
                    !jLabelVisorOperacao.getText().matches("(.*).")) {
                operando = "2";
            } else {
                operando += "2";
            }
        }
        
        if (evt.getSource() == jButtonTres) {
            if (operando.equalsIgnoreCase("0") || operacao != ' ' && 
                    !jLabelVisorOperacao.getText().matches("(.*).")) {
                operando = "3";
            } else {
                operando += "3";
            }
        }
        
        if (evt.getSource() == jButtonQuatro) {
            if (operando.equalsIgnoreCase("0") || operacao != ' ' && 
                    !jLabelVisorOperacao.getText().matches("(.*).")) {
                operando = "4";
            } else {
                operando += "4";
            }
        }
        
        if (evt.getSource() == jButtonCinco) {
            if (operando.equalsIgnoreCase("0") || operacao != ' ' && 
                    !jLabelVisorOperacao.getText().matches("(.*).")) {
                operando = "5";
            } else {
                operando += "5";
            }
        }
        
        if (evt.getSource() == jButtonSeis) {
            if (operando.equalsIgnoreCase("0") || operacao != ' ' && 
                    !jLabelVisorOperacao.getText().matches("(.*).")) {
                operando = "6";
            } else {
                operando += "6";
            }
        }
        
        if (evt.getSource() == jButtonSete) {
            if (operando.equalsIgnoreCase("0") || operacao != ' ' && 
                    !jLabelVisorOperacao.getText().matches("(.*).")) {
                operando = "7";
            } else {
                operando += "7";
            }
        }
        
        if (evt.getSource() == jButtonOito) {
            if (operando.equalsIgnoreCase("0") || operacao != ' ' && 
                    !jLabelVisorOperacao.getText().matches("(.*).")) {
                operando = "8";
            } else {
                operando += "8";
            }
        }
        
        if (evt.getSource() == jButtonNove) {
            if (operando.equalsIgnoreCase("0") || operacao != ' ' && 
                    !jLabelVisorOperacao.getText().matches("(.*).")) {
                operando = "9";
            } else {
                operando += "9";
            }
        }
        
        this.setVisor(operando);
        
    }//GEN-LAST:event_setOperando

    private void setOperacao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setOperacao
        String visor = "";
        
        if(evt.getSource() == jButtonAdicao) {
            if(jLabelResultados.getText().equals("")) {
                resultado = Double.parseDouble(operando);
                operacao = '+';
                operando = "";
                visor = operando+"+";
            } else if (operacao == '='){
                operacao = '+';
                operando = "";
                visor = operando+"+";
            }else {
                if(jLabelVisorOperacao.getText().matches("(.*)²") || 
                        jLabelVisorOperacao.getText().matches("√(.*)")) {
                    operacao = '/';
                    visor = operando+"/";
                } else if(!operando.equals("")) {
                    resultado = this.realizaOperacao(operando,operacao);
                    operacao = '+';
                    operando = "";
                    visor = operando+"+";
                } else {
                    operacao = '+';
                    resultado = this.realizaOperacao(""+resultado, operacao);
                    visor = operando+"+";
                }  
            }
        }
        
        if(evt.getSource() == jButtonSubtracao) {
            if(jLabelResultados.getText().equals("")) {
                resultado = Double.parseDouble(operando);
                operacao = '-';
                operando = "";
                visor = operando+"-";
            } else if (operacao == '='){
                operacao = '-';
                operando = "";
                visor = operando+"-";
            }else {
                if(jLabelVisorOperacao.getText().matches("(.*)²") || 
                        jLabelVisorOperacao.getText().matches("√(.*)")) {
                    operacao = '/';
                    visor = operando+"/";
                } else if(!operando.equals("")) {
                    resultado = this.realizaOperacao(operando,operacao);
                    operacao = '-';
                    operando = "";
                    visor = operando+"-";
                } else {
                    operacao = '-';
                    resultado = this.realizaOperacao(""+resultado, operacao);
                    visor = operando+"-";
                }  
            }
        }
        
        if(evt.getSource() == jButtonMultiplicacao) {
            if(jLabelResultados.getText().equals("")) {
                resultado = Double.parseDouble(operando);
                operacao = '*';
                operando = "";
                visor = operando+"*";
            } else if (operacao == '='){
                operacao = '*';
                operando = "";
                visor = operando+"*";
            }else {
                if(jLabelVisorOperacao.getText().matches("(.*)²") || 
                        jLabelVisorOperacao.getText().matches("√(.*)")) {
                    operacao = '/';
                    visor = operando+"/";
                } else if(!operando.equals("")) {
                    resultado = this.realizaOperacao(operando,operacao);
                    operacao = '*';
                    operando = "";
                    visor = operando+"*";
                } else {
                    operacao = '*';
                    resultado = this.realizaOperacao(""+resultado, operacao);
                    visor = operando+"*";
                }  
            }
        }
        
        if(evt.getSource() == jButtonDivisao) {
            if(jLabelResultados.getText().equals("")) {
                resultado = Double.parseDouble(operando);
                operacao = '/';
                operando = "";
                visor = operando+"/";
            } else if (operacao == '='){
                operacao = '/';
                operando = "";
                visor = operando+"/";
            }else {
                if(jLabelVisorOperacao.getText().matches("(.*)²") || 
                        jLabelVisorOperacao.getText().matches("√(.*)")) {
                    operacao = '/';
                    visor = operando+"/";
                } else if(!operando.equals("")) {
                    resultado = this.realizaOperacao(operando,operacao);
                    operacao = '/';
                    operando = "";
                    visor = operando+"/";
                } else {
                    System.out.println("oi");
                    operacao = '/';
                    resultado = this.realizaOperacao(""+resultado, operacao);
                    visor = operando+"/";
                }  
            }
        }
        
        if(evt.getSource() == jButtonPotenciaQuadrada) {
            if(!jLabelVisorOperacao.getText().equals("") && jLabelResultados.getText().equals("")) {
                resultado = Math.pow(Double.parseDouble(jLabelVisorOperacao.getText()), 2.0);
                visor = jLabelVisorOperacao.getText() + "²";
            } else if (!jLabelResultados.getText().equals("")) {
                resultado = Math.pow(Double.parseDouble(jLabelResultados.getText()), 2.0);
                visor = jLabelResultados.getText() + "²";
            } else {
                resultado = Math.pow(0.0, 2.0);
                visor = 0.0 + "²";
            }
        }
        
        if(evt.getSource() == jButtonRaizQuadrada) {
            if(!jLabelVisorOperacao.getText().equals("") && jLabelResultados.getText().equals("")) {
                resultado = Math.sqrt(Double.parseDouble(jLabelVisorOperacao.getText()));
                visor = "√" + jLabelVisorOperacao.getText();
            } else if (!jLabelResultados.getText().equals("")) {
                resultado = Math.sqrt(Double.parseDouble(jLabelResultados.getText()));
                visor = "√" + jLabelResultados.getText();
            } else {
                resultado = Math.sqrt(0.0);
                visor = "√" + 0.0;
            }
        }
        
        if(evt.getSource() == jButtonPorcentagem) {
            if(!jLabelResultados.getText().equals("") && 
                    !jLabelVisorOperacao.getText().equals("") && 
                    !jLabelVisorOperacao.getText().matches("(.*)²") && 
                    !jLabelVisorOperacao.getText().matches("√(.*)") && 
                    (operacao != ' ' || operacao != '=')) {
                operando = ""+resultado * (Double.parseDouble(jLabelVisorOperacao.getText())/100);
                resultado = this.realizaOperacao(operando, operacao);
                operacao = '=';
            }
        }
        
        this.setVisor(visor);
        this.setVisorResultado(resultado);
    }//GEN-LAST:event_setOperacao

    private void limpaTudo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpaTudo
        this.jLabelResultados.setText("");
        this.jLabelVisorOperacao.setText("");
        this.operacao = ' ';
        this.operando = "";
        this.resultado = 0.0;
    }//GEN-LAST:event_limpaTudo

    private void operacaoIgual(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacaoIgual
        String visor = "";
        if(!jLabelResultados.getText().equals("") && !operando.equals("")){
            resultado = realizaOperacao(operando, operacao);
            operacao = '=';
            operando = "";
            visor = operando+"=";
        } else if(operando.equals("")){
            operacao = '=';
            visor = operando+"=";
        }else {
            resultado = Double.parseDouble(operando);
            operacao = '=';
            operando = "";
            visor = operando+"=";
        }
        this.setVisor(visor);
        this.setVisorResultado(resultado);
    }//GEN-LAST:event_operacaoIgual

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
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicao;
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonDois;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonNove;
    private javax.swing.JButton jButtonOito;
    private javax.swing.JButton jButtonPontoFlutuante;
    private javax.swing.JButton jButtonPorcentagem;
    private javax.swing.JButton jButtonPotenciaQuadrada;
    private javax.swing.JButton jButtonQuatro;
    private javax.swing.JButton jButtonRaizQuadrada;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSete;
    private javax.swing.JButton jButtonSubtracao;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUm;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JLabel jLabelResultados;
    private javax.swing.JLabel jLabelVisorOperacao;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setVisor(String operando) {
        jLabelVisorOperacao.setText(operando);
    }

    private void setVisorResultado(double resultado) {
        jLabelResultados.setText(""+resultado);
    }

    private double realizaOperacao(String operando, char operacao) {
        switch(operacao) {
            case '+':
                return resultado + Double.parseDouble(operando);
            case '-':
                return resultado - Double.parseDouble(operando);
            case '*':
                return resultado * Double.parseDouble(operando);
            case '/':
                return Double.parseDouble(operando) != 0 ? resultado / Double.parseDouble(operando) : erroDivisaoPorZero();
        }
        return -1.0;
    }

    private double erroDivisaoPorZero() {
        jLabelVisorOperacao.setText("Erro! Divisão por zero!");
        throw new IllegalArgumentException("Divisão por zero!"); 
    }
}
