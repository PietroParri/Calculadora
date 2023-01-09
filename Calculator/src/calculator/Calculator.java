/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author pietro
 */
public class Calculator {
    public static void main(String[] args) {        
        new GUI().setVisible(true);
    }
    
    public static double OperacaoSoma(String num1, String num2){
        double x = Double.parseDouble(num1);
        double y = Double.parseDouble(num2);
        double resultado;
        resultado = x + y;
        return resultado;       
    }
    public static double OperacaoSubtracao(String num1, String num2){
        double x = Double.parseDouble(num1);
        double y = Double.parseDouble(num2);
        double resultado;
        resultado = x - y;
        return resultado;
    }
    public static double OperacaoMultiplicacao(String num1, String num2){
        double x = Double.parseDouble(num1);
        double y = Double.parseDouble(num2);
        double resultado;
        resultado = x * y;
        return resultado;
    }
    public static double OperacaoDivisao(String num1, String num2){
        double x = Double.parseDouble(num1);
        double y = Double.parseDouble(num2);
        double resultado;
        resultado = x/y;
        return resultado;
    }
}
