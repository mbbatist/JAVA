/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_threadsq4;
import java.util.Collection;
/**
 *
 * @author Mariana Brito
 */
 public class ProduzMensagem implements Runnable {

     private int fim;
     private int comeco;
     private Collection<String> mensagens;
     
     public ProduzMensagem(int fim,int comeco,Collection<String> mensagens)
     {
         this.comeco=comeco;
         this.fim=fim;
         this.mensagens=mensagens;
     }
     public void run()
     {
     for(int i=comeco;i<fim;i++)
     {
     mensagens.add("Mensagem"+i);
     }
     }
 }

   

