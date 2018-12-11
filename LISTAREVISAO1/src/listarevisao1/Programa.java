package listarevisao1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariana Brito
 */
public class Programa implements Runnable 
{
     private int id;
    
    void setId(int i)
    {
        id=i;
    }
    
    public void run()
    {
       int qtd=id+1000;
       int i,j,cont=0;
       for(i=id;i<qtd;i++)
       {
           for(j=2;j<i;j++)
           {
               if(i%j==0)
               {
                    cont=1;
                    break;
               }
               else
               {
                   cont=0;
               }
            }
            if(cont==0)
            {
               System.out.println(i);
            }
        }
    }
}    
