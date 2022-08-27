package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        ArrayList<Task> taskList = new ArrayList<Task>();

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