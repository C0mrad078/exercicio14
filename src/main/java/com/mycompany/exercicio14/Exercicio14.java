/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio14;
/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;
public class Exercicio14 {

    public static void main(String[] args) {
        int nascimento,anoAtual,resultado;
            nascimento = Integer.parseInt(JOptionPane.showInputDialog("voce nasceu em qual ano? "));
            anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano voce esta:"));   
            resultado = anoAtual - nascimento;
            if(nascimento >= anoAtual){JOptionPane.showMessageDialog(null,"A informaçao fornecida esta incorreta");}
            if(nascimento < anoAtual)JOptionPane.showMessageDialog(null,"Sua idade e: " + resultado);
}
}