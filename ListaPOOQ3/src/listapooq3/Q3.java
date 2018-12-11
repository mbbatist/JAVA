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

public class Q3 {
    Scanner entrada = new Scanner(System.in);
        String nome;
        float salario;
        
        
        void nome(String nome){
        if(nome.length()<5 || nome.length()>50){
        IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;

        }
        }
        
        void salario(float salario)
        {
            if(salario<465.0){
        IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        }
        
        }
        
        void resultado(String nome,float salario){
        System.out.println(" \n Recibo de Pagamento \n");
        System.out.println("Nome:      "+nome);
        System.out.println("Salário:   R$"+salario);
        System.out.println("FGTS:      R$"+(salario*8)/100);}
    }
    
