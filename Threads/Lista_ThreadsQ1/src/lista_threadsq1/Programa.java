/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_threadsq1;

/**
 *
 * @author Mariana Brito
 */
public class Programa implements Runnable {

    private int id;
    
    void setId(int i)
    {
     id=i;
    }
    
    public void run()
    {
        for(int i=0;i<10000;i++)
        {
            System.out.println("Programa: "+id+" Valor: "+i);
        }
    }} 
