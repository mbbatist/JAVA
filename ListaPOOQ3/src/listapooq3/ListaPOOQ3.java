/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapooq3;
import java.util.Scanner;
/**
 *
 * @author Mariana Brito
 */

public class ListaPOOQ3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        float salario;
        Q3 method=new Q3();
        
        
        System.out.println("Informe o seu Nome:");
        nome=entrada.nextLine();
        
       
        try{
        
        method.nome(nome);
        
        }
        
        catch(IllegalArgumentException erro)
        {
          System.out.println("Número de caracteres inválidos "+erro.getMessage());
        }

        System.out.println("Informe o seu Salário:");
         salario=entrada.nextFloat();
        try{
        
        method.salario(salario);
        }
        catch(IllegalArgumentException erro)
        {
          System.out.println("Salário Inválido! "+erro.getMessage());
        }
        
            method.resultado(nome, salario);
        }
    }

