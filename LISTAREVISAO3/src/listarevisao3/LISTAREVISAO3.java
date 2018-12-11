/*
 Alunos: Mariana Brito Batista e João Vitor Azevedo Jacundá Santos
 */
package listarevisao3;
import java.util.Scanner;
/**
 *
 * @author Mariana Brito
 */
public class LISTAREVISAO3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int num;
        
        System.out.println("Informe o seu Nome:");
        nome=entrada.nextLine();
        System.out.println("Informe o número da sua conta:");
        num=entrada.nextInt();
        
        ContaCorrente jv = new ContaCorrente(num, nome, 0);
        jv.setValorLimite(100);
        while(num!=0)
        {
            System.out.println("Qual operação deseja realizar Sr(a)."+nome+"? \n Digite 1 para sacar \n 2 para depositar \n 0 para encerrar operação");
            num=entrada.nextInt();
            if(num==2)
            { 
                System.out.println("Informe o valor a ser depositado:");
                num=entrada.nextInt();
                try
                {
                    jv.Depositar(num);
                }
                catch(IllegalArgumentException erro)
                {
                    System.out.println("Valor negativo! "+erro.getMessage());
                }
            }
            else if(num==1)
            {  
                System.out.println("Informe o valor a ser sacado:");
                num=entrada.nextInt();
                try
                {
                    jv.Sacar(num);
                }
                catch(IllegalArgumentException erro)
                {
                    System.out.println("Operação não permitida! "+erro.getMessage());
                }
            }
            else 
            {
                if(num!=0)
                    System.out.println("Operação não disponível!");
            }
    }

}}
