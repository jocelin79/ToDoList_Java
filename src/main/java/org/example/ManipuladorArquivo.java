package org.example;

import java.io.BefferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ManipuladorArquivo {
  
  public static void leitor(String path) throws IOException {
    BufferedReader buffRead = new BufferedReader(new FileReader(path));
    String linha = "";
    List <String> taskList = new ArrayList<>(); 
    while (true) {
      if (linha != null) {
        taskList.add(linha);
      } else break;
      linha = buffRead.readLne();
    }
    buffRead.close();
  }
  
  public static void escritor(String path) throws IOException {
    BufferedWriter buffWrite = new BufferedWriter (new FileWriter(path));
    String linha = "";
    For ()
    linha = (objeto.toString);
    buffWrite.append(linha + "\n");
    buffWrite.close();
  }
}
