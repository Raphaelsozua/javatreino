/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ListaContato;
import model.Pessoa;

/**
 *
 * @author 55199
 */
public class PessoaController {
    public boolean cadastrar(int id, String nome, String celular, String email){
        
        Pessoa pessoa = new Pessoa(id, nome, celular, email);
        return ListaContato.getInstance().add(pessoa);
    }
    
 public void preencherTabela(JTable jTabela){
     DefaultTableModel dtm = (DefaultTableModel) jTabela.getModel();
     
     dtm.setRowCount (ListaContato.getInstance().size());
     jTabela.setModel(dtm);
     
     int posicaoLinha = 0;
     
     for(int i = 0; i< ListaContato.getInstance().size(); i++){
         jTabela.setValueAt(ListaContato.getInstance().get(i).getId(),posicaoLinha, 0);
          jTabela.setValueAt(ListaContato.getInstance().get(i).getNome(),posicaoLinha, 1);
           jTabela.setValueAt(ListaContato.getInstance().get(i).getCelular(),posicaoLinha, 2);
            jTabela.setValueAt(ListaContato.getInstance().get(i).getEmail(),posicaoLinha, 3);
            
            posicaoLinha += 1;
     }
     
    
 }
 
 public void excluir (JTable jTabela){
     if(jTabela.getSelectedRow() == -1){
         JOptionPane.showMessageDialog(null, "selecione um contato na tabela!", "Aviso", 0);
     }
     else {
         int resposta = JOptionPane.showConfirmDialog(
                 null,
                 "Tem certeza que deseja excluir o contato?",
                 "Aviso",
                 JOptionPane.YES_NO_OPTION
         );
         
         if(resposta == JOptionPane.YES_OPTION){
             ListaContato.getInstance().remove(jTabela.getSelectedRow());
             JOptionPane.showMessageDialog(null, "Contato excluido com sucesso", "Aviso", 1);
             
             preencherTabela(jTabela);
         }
     }
 }
 
 public List<Object> pesquisar(int id){
     
     boolean achou = false;
     int posicao = -1;
     
     for(int i = 0; i< ListaContato.getInstance().size(); i++){
         
         if(ListaContato.getInstance().get(i).getId() == id){
             achou = true;
             posicao = i;
         }
     }
     
     if(achou == true){
         String nome = ListaContato.getInstance().get(posicao).getNome();
         String celular = ListaContato.getInstance().get(posicao).getCelular();
         String email = ListaContato.getInstance().get(posicao).getEmail();
         
         return Arrays.asList(id, nome, celular, email);
         
     }
     else {
         JOptionPane.showMessageDialog(null, "Contato não encontrado", "Aviso", 0);
         return null;
     }
     
 }
 
 public void editar (int id, String nome, String celular, String email){
     
     int resposta = JOptionPane.showConfirmDialog(
             null,
             "Tem certeza que deseja atualizar o contato?",
             "Aviso",
             JOptionPane.YES_NO_OPTION
     );
     
     if(resposta == JOptionPane.YES_OPTION){
         Pessoa pessoa = new Pessoa(id, nome, celular, email);
         
         int posicao = pesquisarPessoa(id);
         ListaContato.getInstance().set(posicao, pessoa);
     }
 }
 
 private int pesquisarPessoa(int id){
     
     int posicao = -1;
     
     for(int i = 0; i <ListaContato.getInstance().size(); i++){
         if(ListaContato.getInstance().get(i).getId()== id){
             posicao = i;
         }
     }
     return posicao;
 }
    
}
