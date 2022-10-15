package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorArquivo {
  
  public static void leitor(String path) throws IOException {

    File file = new File(path);
    if (!file.exists()) {
      System.out.println("O arquivo, indicado pelo path, não existe.");
      return;
    }

    BufferedReader buffRead = new BufferedReader(new FileReader(file));
    String linha = "";
    List<String> taskList = new ArrayList<>();
    while (true) {
      if (linha != null) {
        taskList.add(linha);
      } else break;
      linha = buffRead.readLine();
    }
    buffRead.close();

    //return linha;
  }
  
  public static void escritor(String path) throws IOException {

    File file = new File(path);
    try {
      boolean isCreated = file.createNewFile();
    } catch (IOException exception) {
      exception.printStackTrace();
      System.out.println("O arquivo, indicado pelo path, não existe e nem pôde ser criado.");
    }

    BufferedWriter buffWrite = new BufferedWriter (new FileWriter(file));
    String linha = "";
    For ()
    linha = (objeto.toString);
    buffWrite.append(linha);
    buffWrite.newLine();
    buffWrite.flush();
    buffWrite.close();
  }
}
