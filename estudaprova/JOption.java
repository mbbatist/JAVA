/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudaprova;
import javax.swing.JOptionPane;
/**
 *
 * @author Mariana Brito
 */
public class JOption {
    public static void main(String[] args){
    int num1,num2;
    String firstNumber,secondNumber;
    int soma;
    
    firstNumber=JOptionPane.showInputDialog("Insira o primeiro número:");
    secondNumber=JOptionPane.showInputDialog("Insira o segundo número:");
    
    num1=Integer.parseInt(firstNumber);
    num2=Integer.parseInt(secondNumber);
    
    soma=num1+num2;
    
    JOptionPane.showMessageDialog(null,"RESULTADO : " +soma,"Resultado da soma",JOptionPane.INFORMATION_MESSAGE);
    
    
    }
}
public interface Teste {
void metodo(int parametro) {
System.out.println("Ola");
}
 }