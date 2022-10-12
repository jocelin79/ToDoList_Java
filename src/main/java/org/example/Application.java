package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        ArrayList<Task> taskList = new ArrayList<Task>();

        boolean on = true;

        while (on) {
            System.out.println("\nSe deseja listar os Candidatos, digite 1;\n" +
                    "Se deseja inserir um novo Candidato, digite 2;\n" +
                    "Se deseja alterar um novo Candidato, digite 3;\n" +
                    "Se deseja remover um novo Candidato, digite 4;\n" +
                    "Caso deseje Finalizar o atendimento, digite 0.\n" +
                    "Digite aqui:");

            Scanner s = new Scanner(System.in);
            String response = s.nextLine();

            switch (response) {
                case "1":
                    CandidatoDAO candidatoDAO = new CandidatoDAO();
                    List candidato = candidatoDAO.listar();
                    for(c in candidato) {
                        System.out.println(c);
                    }
                    break;
                case "2":
                    CandidatoDAO candidatoDAO = new CandidatoDAO()
                    Candidato candidato = new Candidato()
                    System.out.println("Digite o nome:")
                    s = new Scanner(System.in)
                    candidato.setNome(s.nextLine())
                    System.out.println("Digite o sobrenome:")
                    s = new Scanner(System.in)
                    candidato.setSobrenome(s.nextLine())
                    System.out.println("Digite a data de nascimento:")
                    s = new Scanner(System.in)
                    candidato.setData_nascimento(s.nextLine())
                    System.out.println("Digite o email:")
                    s = new Scanner(System.in)
                    candidato.setEmail(s.nextLine())
                    System.out.println("Digite o cpf:")
                    s = new Scanner(System.in)
                    candidato.setCpf(s.nextLine())
                    System.out.println("Digite o pais onde reside:")
                    s = new Scanner(System.in)
                    candidato.setPais_onde_reside(s.nextLine())
                    System.out.println("Digite o cep:")
                    s = new Scanner(System.in)
                    candidato.setCep(s.nextLine())
                    System.out.println("Digite a descrição:")
                    s = new Scanner(System.in)
                    candidato.setDescricao(s.nextLine())
                    System.out.println("Digite a senha:")
                    s = new Scanner(System.in)
                    candidato.setSenha(s.nextLine())
                    candidatoDAO.inserir(candidato)
                    System.out.println("Candidato Inserido.")
                    break
                case "3":
                    CandidatoDAO candidatoDAO = new CandidatoDAO()
                    Candidato candidato = new Candidato()
                    System.out.println("Digite o nome:")
                    s = new Scanner(System.in)
                    candidato.setNome(s.nextLine())
                    System.out.println("Digite o sobrenome:")
                    s = new Scanner(System.in)
                    candidato.setSobrenome(s.nextLine())
                    System.out.println("Digite a data de nascimento:")
                    s = new Scanner(System.in)
                    candidato.setData_nascimento(s.nextLine())
                    System.out.println("Digite o email:")
                    s = new Scanner(System.in)
                    candidato.setEmail(s.nextLine())
                    print("Digite o cpf:")
                    s = new Scanner(System.in)
                    candidato.setCpf(s.nextLine())
                    print("Digite o pais onde reside:")
                    s = new Scanner(System.in)
                    candidato.setPais_onde_reside(s.nextLine())
                    print("Digite o cep:")
                    s = new Scanner(System.in)
                    candidato.setCep(s.nextLine())
                    print("Digite a descrição:")
                    s = new Scanner(System.in)
                    candidato.setDescricao(s.nextLine())
                    print("Digite a senha:")
                    s = new Scanner(System.in)
                    candidato.setSenha(s.nextLine())
                    print("Digite o id:")
                    s = new Scanner(System.in)
                    candidato.setId(Integer.parseInt(s.nextLine()))
                    candidatoDAO.alterar(candidato)
                    print("Candidato Alterado.")
                    break
                case "4":
                    CandidatoDAO candidatoDAO = new CandidatoDAO()
                    print("Digite o id:")
                    s = new Scanner(System.in)
                    candidatoDAO.remover(Integer.parseInt(s.nextLine()))
                    print("Candidato Removido.")
                    break
                case "0":
                    on = false
                    break
            }
        }

        //CREATE

        System.out.println("CREATE");

        taskList.add(new Task("Cortar","Cortar cabelo.","25/09/22",2,"pessoal","ToDo"));
        taskList.add(new Task("Vender","Vender carro do amigo.","21/09/22",4,"pessoal","ToDo"));
        taskList.add(new Task("Reunião","Reunião da empresa.","18/07/22",4,"proficional","Done"));
        taskList.add(new Task("Aniversários","Atualizar planilha de aniversários.","25/09/22",2,"proficional","Doing"));
        taskList.add(new Task("Exames","Realizar bateria de exames.","11/09/22",5,"pessoal","Doing"));
        taskList.add(new Task("Filho","Levar filho para a apresentação.","07/08/22",4,"pessoal","Done"));

        printElements(taskList);

        //READ

        System.out.println("READ");

        System.out.println(taskList.get(2));

        //DELETE

        System.out.println("DELETE - Vender");

        taskList.remove(1);

        printElements(taskList);

        //Listar por Prioridade

        System.out.println("LISTAR por Prioridade");

        Collections.sort(taskList);
        printElements(taskList);

        //Listar por Categoria

        System.out.println("LISTAR por Categoria");

        taskList.sort(new ComparatorCategory());
        printElements(taskList);

        //Listar por Status

        System.out.println("LISTAR por Status");

        taskList.sort(new ComparatorStatus());
        printElements(taskList);

        //Adição com rebalanceamento por proiridade

        System.out.println("ADIÇÃO com rebalanceamento por proiridade");

        addTask(taskList, new Task("Arroz","Fazer arroz.","01/09/22",3,"pessoal","Doing"));
        printElements(taskList);

    }

    public static void printElements(List someList){
        for(int i = 0; i < someList.size(); i++){
            System.out.println(someList.get(i));
        }
    }

    public static void addTask( List someList, Task someTask){
        Task newTask = someTask;
        someList.add(newTask);
        Collections.sort(someList);
    }
}