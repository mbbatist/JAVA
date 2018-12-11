/*
 Alunos: Mariana Brito Batista e João Vitor Azevedo Jacundá Santos
 */
package listarevisao1;

/**
 *
 * @author Mariana Brito
 */
public class LISTAREVISAO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //de 0 a 1000
        Programa p1=new Programa();
        p1.setId(0);
        Thread t1=new Thread(p1);
        t1.start();
        
        //de 1000 a 2000
        Programa p2=new Programa();
        p2.setId(1000);
        Thread t2=new Thread(p2);
        t2.start();
        
        //de 2000 a 3000
        Programa p3=new Programa();
        p3.setId(2000);
        Thread t3=new Thread(p3);
        t3.start();
        
        //de 3000 a 4000
        Programa p4=new Programa();
        p4.setId(3000);
        Thread t4=new Thread(p4);
        t4.start();
        
        //de 4000 a 5000
        Programa p5=new Programa();
        p5.setId(4000);
        Thread t5=new Thread(p5);
        t5.start();
        
        //de 5000 a 6000
        Programa p6=new Programa();
        p6.setId(5000);
        Thread t6=new Thread(p6);
        t6.start();
        
        //de 6000 a 7000
        Programa p7=new Programa();
        p7.setId(6000);
        Thread t7=new Thread(p7);
        t7.start();
        
        //de 7000 a 8000
        Programa p8=new Programa();
        p8.setId(7000);
        Thread t8=new Thread(p8);
        t8.start();
        
        //de 8000 a 9000
        Programa p9=new Programa();
        p9.setId(8000);
        Thread t9=new Thread(p9);
        t9.start();
        
        //de 9000 a 9999
        Programa p10=new Programa();
        p10.setId(9000);
        Thread t10=new Thread(p10);
        t10.start();
        
    }
    
}
