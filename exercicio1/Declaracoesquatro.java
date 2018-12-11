/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;
import javax.swing.JOptionPane;
/**
 *
 * @author Mariana Brito
 */
public class Declaracoesquatro {
 String senha;
 int s;
 int i;
 int confirmasenha=123456;
 
 void password(){
    senha=JOptionPane.showInputDialog("Digite a senha: ");
    s=Integer.parseInt(senha);
    for(i=0;i<3;i++){
    if(s!=confirmasenha){
        JOptionPane.showMessageDialog(null,"Login não efetuado, tente novamente!","Login",JOptionPane.INFORMATION_MESSAGE);
        if(i<2){
        senha=JOptionPane.showInputDialog("Digite a senha: ");
        s=Integer.parseInt(senha);
                        }
        }
    }
    if(s==confirmasenha){
        JOptionPane.showMessageDialog(null,"Login efetuado!","Login",JOptionPane.INFORMATION_MESSAGE);
        }}
 
  public static void main(String[] args){
 Declaracoesquatro a=new Declaracoesquatro();
 a.password();} }
