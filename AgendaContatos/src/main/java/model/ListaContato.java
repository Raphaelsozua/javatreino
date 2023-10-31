/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author 55199
 */
public class ListaContato {
    private static List<Pessoa> lista;
    
    private ListaContato(){}

    
    public static List<Pessoa> getInstance(){
        if(lista == null) {
            lista = new ArrayList<>();
        }
        
        return lista;
    }
}
