/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;
import javax.swing.JOptionPane;  
  
public class convertetemp{
    public static void main(String[] args){  
        String firstNumber;
        int number1,sum;
        // obtêm a entrada de usuário a partir dos diálogos de entrada  
        firstNumber = JOptionPane.showInputDialog("Temperatura em Graus Fahrenheit");  
          
        // converte os valores recebido em string para int  
        number1 = Integer.parseInt( firstNumber );  
          
        // conversão de guaus fahrenheit para graus celsius  
        sum = 5/9*(number1 - 32);  
          
        // exibe o resultado no diálogo de mensagem JOptionPane  
        JOptionPane.showMessageDialog(null, "Graus Celsius " + sum, "Conversor de Graus", JOptionPane.INFORMATION_MESSAGE);  
         System.exit(0);
    }  
}  

