
package exercicio1;


public class Declaracoes {
    int a=16;
    double pi = 3.14;
    boolean verdade = true;
    char letra = 'a';
    byte y = 127;
    float w = 5.50f;
    long z =1l;
    short x = 32767;
    
    void atributos(){
    System.out.println("valor inteiro: "+a);
    System.out.println("valor para números reais: "+pi);
    System.out.println("valor verdadeiro ou falso: "+verdade);
    System.out.println("valor alfanuméricos: "+letra);
    System.out.println("valor longos: "+z);
    System.out.println("valor inteiro: "+y);
    System.out.println("valor para números reais: "+w);
    System.out.println("valor inteiro: "+x);
                    }
    public static void main(String[] args){
        Declaracoes dec= new Declaracoes();
        dec.atributos();
    }   
                        }
