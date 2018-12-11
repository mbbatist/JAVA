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
public class Declaracoestres {
 String senha;
 int s;
 int confirmasenha=123456;
 void senhacerta(){
 senha=JOptionPane.showInputDialog("Digite a senha: ");
 s=Integer.parseInt(senha);
 if(s!=confirmasenha){
 JOptionPane.showMessageDialog(null,"Login não efetuado, tente novamente!","Login",JOptionPane.INFORMATION_MESSAGE);}
else{
JOptionPane.showMessageDialog(null,"Login efetuado!","Login",JOptionPane.INFORMATION_MESSAGE);
}}
 public static void main(String[] args){
 Declaracoestres sc=new Declaracoestres();
 sc.senhacerta();}}
