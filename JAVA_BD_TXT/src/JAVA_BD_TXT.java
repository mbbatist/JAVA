/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariana
 */
public class JAVA_BD_TXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String arq="BD.txt";
      //GRAVAÇÃO
      if(arq.isEmpty()){
      String texto="Lorem \r\n Ipsum";
      
      if(Arquivo.Write(arq, texto))
      {
          System.out.println("Arquivo Salvo com sucesso!");
      }
      else
      {
          System.out.println("Erro ao salvar o arquivo");
      }
      }
      //LEITURA
      String texto=Arquivo.Read(arq);
      if(texto.isEmpty())
          System.out.println("ERRO: Arquivo Vazio!");
      else
          System.out.println(texto);
      
      //DELETAR
     
      
//      String ArqConfig = "BD.txt";
//      String Campus="Palmas";
//      String Endereco="Inserir";
//      String Telefone="Inserir";
//      
//      String print = Campus+" | "+Endereco+" | "+Telefone+"n";
//      Arquivo.Write(ArqConfig,print);
    }    
}
