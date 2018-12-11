/*
 Alunos: Mariana Brito Batista e João Vitor Azevedo Jacundá Santos
 */
package listarevisao2;

/**
 *
 * @author Mariana Brito
 */
public class LISTAREVISAO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Programa p1=new Programa();
        p1.setId("A");
        Thread t1=new Thread(p1);
        
        Programa p2=new Programa();
        p2.setId("B");
        Thread t2=new Thread(p2);
                
        Programa p3=new Programa();
        p3.setId("C");
        Thread t3=new Thread(p3);
        
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
