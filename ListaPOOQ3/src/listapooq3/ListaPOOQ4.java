/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapooq3;

/**
 *
 * @author Mariana Brito
 */
public class ListaPOOQ4 {
    
}
class ExemploExcecao {
public static void main (String[] args) {
int len = args.length;
// a linha abaixo produz a exceção
// java.lang.ArrayIndexOutOfBoundsException
String s = args[len];
System.out.println("Vou terminar a execucao");
}
}

class ExemploTrataExcecao {
public static void main (String[] args) {
try {
int len = args.length;
String s = args[len];
}
catch (Exception e)
{
System.out.println("Ocorreu uma exceção");
}
System.out.println("Vou terminar a execução");
 }}
/* No ExemploExcecao, como não possui o tratamento de exceção o programa para de executar,
ou seja, não permite que o comando que vem logo após o responsavel pela exceção ocorra, e não é possivel o compilamento.
No ExemploTrataExcecao prevê o erro, mas permite que algo aconteça se tiver uma exceção,
e depois também, podendo executar o comando de impressao que no ExemploExcecao não foi possível*/

