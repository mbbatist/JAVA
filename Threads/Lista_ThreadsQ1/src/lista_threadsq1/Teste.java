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

public class Teste {

    public static void main(String[] args) {
        Programa p1=new Programa();
        p1.setId(1);
        Thread t1=new Thread(p1);
        t1.start();
        
        
        Programa p2=new Programa();
        p2.setId(2);
        Thread t2=new Thread(p2);
        t2.start();
        
        /* É observável que na compilação, o programa 2 e 1 não possuem ordem,
           com isso é importante afirmar que os dois programas não possuem ordem de execução,
           e compilar ao mesmo tempo, printando o resultado ao mesmo tempo. */
    }
    
}
