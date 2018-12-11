/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;
import javax.swing.JOptionPane;
/**
 *
 * @author Mariana Brito
 */
public class seletiva {
    public static void main(String[]args){
    String idadevisitante;
    int iv;
    
    idadevisitante=JOptionPane.showInputDialog("Digite a idade:");
    iv=Integer.parseInt(idadevisitante);
    
    if(iv<18){
     JOptionPane.showMessageDialog(null, "Volte para casa, você tem apenas " +iv+ " anos" ,"Boate Club", JOptionPane.INFORMATION_MESSAGE);
             }
    else{
     JOptionPane.showMessageDialog(null, "Aproveite a festa, você tem " +iv+ " anos" ,"Boate Club", JOptionPane.INFORMATION_MESSAGE);
     System.exit(0);
        }
                                        }
                       }
    

