/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarevisao2;

/**
 *
 * @author Mariana Brito
 */
public class Programa implements Runnable {
    private String id;
    
    void setId(String i)
    {
        id=i;
    }
    
    public void run()
    {
        System.out.println(id);
    }
}
