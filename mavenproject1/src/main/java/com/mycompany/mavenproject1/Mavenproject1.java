/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author 55199
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        //JOptionPane.showInputDialog(null, "CPF Invalido: digite novamente","cuidado", JOptionPane.ERROR_MESSAGE);
        
        String nome = JOptionPane.showInputDialog("qual seu nome:");
        
        int op = JOptionPane.showConfirmDialog(null, "seu nome é " + nome + "?");
        
        if(op == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Dado cadastrado com sucesso");
        }else if(op == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "nome não cadastrado");
        }else {
            JOptionPane.showMessageDialog(null,"Ação cancelada");
        }
        
    }
}
