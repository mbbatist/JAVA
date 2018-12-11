/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Mariana
 */
public class Arquivo {
    public static String Read(String Caminho)
    {
    String conteudo="";
    try{
        FileReader arq=new FileReader(Caminho);
        BufferedReader lerArq=new BufferedReader(arq);
        String linha="";
    try{
            linha=lerArq.readLine();
            while(linha!=null)
            {
                conteudo+=linha+"\n";
                linha=lerArq.readLine();
            }
            arq.close();
        }catch (IOException ex)
            { 
                System.out.println("Erro:Não foi possível ler o arquivo!");
                return conteudo;
            }
        }catch(FileNotFoundException ex)
            { 
                System.out.println("Erro:Arquivo não encontrado!"); 
                return conteudo;
            }   
        return conteudo;
    }
    public static boolean Write(String Caminho,String Texto)
        {
           try
           {
               FileWriter arq=new FileWriter(Caminho);
               PrintWriter gravarArq=new PrintWriter(arq);
               gravarArq.println(Texto);
               gravarArq.close();
               return true;
           }catch(IOException e)
            {
                System.out.println(e.getMessage());
                return false;
            } 
        }
    public static String Delete(String Caminho)
    {
        try
           {
               FileReader arq=new FileReader(Caminho);
               BufferedReader lerArq=new BufferedReader(arq);
               
               String linha=lerArq.readLine();
               ArrayList<String> salvar =new ArrayList();
               
               while(linha!=null)
               {
                   if(linha.equals("linha3")== false)
                   {
                       salvar.add(linha);
                   }
                   linha= lerArq.readLine();
               }
               
               lerArq.close();
               arq.close();
               FileWriter arqw2=new FileWriter(Caminho);
               arqw2.close();               
               
               FileWriter arqw=new FileWriter(Caminho);
               PrintWriter gravarArqw=new PrintWriter(arqw);
               
               for(int i=0;i<salvar.size();i++)
               {
                    gravarArqw.write(salvar.get(i));
                    gravarArqw.newLine();
               }
               
               }catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
    }
}