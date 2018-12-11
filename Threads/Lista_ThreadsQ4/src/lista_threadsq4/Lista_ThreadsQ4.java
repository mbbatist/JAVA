/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_threadsq4;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author Mariana Brito
 */
public class Lista_ThreadsQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       Collection<String> mensagens= new ArrayList<String>();
       
       Thread t1=new Thread(new ProduzMensagem(0,1000,mensagens));
       Thread t2=new Thread(new ProduzMensagem(0,1000,mensagens));
       Thread t3=new Thread(new ProduzMensagem(0,1000,mensagens));
       
       t1.start();
       t2.start();
       t3.start();
       
       t1.join();
       t2.join();
       t3.join();
       
       System.out.println("Threads produtoras de mensagens finalizadas!");
       
       for(int i=0;i<15000;i++)
       {
           if(!mensagens.contains("Mensagem"+i))
           {
               throw new IllegalStateException("Não encontrei a mensagem "+i);
           }
       }
       if(!mensagens.contains(null))
        {
            throw new IllegalStateException("Não devia ter nulo aqui dentro!");
        }
       System.out.println("Fim de execução com sucesso!");
    }
    
}
