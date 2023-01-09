/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pietro
 */
public class CalculadoraFrame extends javax.swing.JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    enum EstadoCalculadora {
        INICIAL, IGNORADO, ENTRADA1, OPERADOR, ENTRADA2, CALCULANDO
    };
    private EstadoCalculadora estadoCalc = EstadoCalculadora.INICIAL;
    private int num1 = 0, num2 = 0;
    private char sinal = '+';
}
