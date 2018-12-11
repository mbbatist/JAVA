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
public class Declaracoesdois {
    String anonasc;
    int an;
    String anoatual;
    int aa;
    int idade;
    void anos(){
    anonasc=JOptionPane.showInputDialog("Digite o ano do seu nascimento: ");
    an=Integer.parseInt(anonasc);
    anoatual=JOptionPane.showInputDialog("Digite o ano em que você está:");
    aa=Integer.parseInt(anoatual);
    idade=aa-an;
    JOptionPane.showMessageDialog(null,"Sua idade é: "+idade,"Idade do usuário",JOptionPane.INFORMATION_MESSAGE);
               }
    public static void main(String[] args){
    Declaracoesdois id=new Declaracoesdois();
    id.anos();}
    
}
