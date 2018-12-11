package sc;
import javax.swing.JOptionPane;
/**
 *
 * @author Mariana Brito
 */
public class somaeconverte {
    public static void main(String[] args){
        int num1, num2, soma;
        String firstnumber,secondnumber;
        
        firstnumber=JOptionPane.showInputDialog("Digite o primeiro número:");
        secondnumber=JOptionPane.showInputDialog("Digite o segundo número:");
        
        num1=Integer.parseInt(firstnumber);
        num2=Integer.parseInt(secondnumber);
        soma=num1+num2;
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " +soma ,"Resultado Soma", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}

