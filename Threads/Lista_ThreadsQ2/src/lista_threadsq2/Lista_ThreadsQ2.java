/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_threadsq2;

/**
 *
 * @author Mariana Brito
 */

public class Lista_ThreadsQ2 extends Thread {
    
    int tempo_de_sono,num_da_thread;

    Lista_ThreadsQ2(int b)
    {
        
        num_da_thread=b;
        tempo_de_sono=0 + (int) (Math.random() * 5000);
        
    }
    Lista_ThreadsQ2(int b,int prioridade)
    {
        
        setPriority(prioridade);
        
        num_da_thread=b;
        tempo_de_sono=0 + (int) (Math.random() * 5000);
        
    }
    
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
            if ((num_da_thread == 2) && (i == 25)) {
            try {
                System.out.println(i+".Tá dormindo: "+ num_da_thread);
                Thread.sleep(1000);
                }
                catch (InterruptedException xx) {
              
                }}
            else{ System.out.println(i+".Não dormiu: "+num_da_thread);}
           
                                                    }
                        

        }
    
    
public static void main(String[] args) {
    Lista_ThreadsQ2 run = new Lista_ThreadsQ2(1,10);
    run.start();
    
    Lista_ThreadsQ2 run1 = new Lista_ThreadsQ2(2,5);
    run1.start();   
    
    Lista_ThreadsQ2 run2 = new Lista_ThreadsQ2(3);
    run2.start();   
    
    Lista_ThreadsQ2 run3 = new Lista_ThreadsQ2(4);
    run3.start();   
    
}}
