package OperaçoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo
    private List<Tarefa> tarefalList;
    //construtor
    public ListaTarefa() {
        this.tarefalList = new ArrayList<>();
    }                       //criei um objeto
public void adcionarTarefa(String descricao){
    tarefalList.add(new Tarefa(descricao));
}
public void removerTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for(Tarefa t : tarefalList ){
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefasParaRemover.add(t);
        }
    }
    tarefalList.removeAll(tarefasParaRemover);
}
public int obterNumeroTotalTarefas(){
    return tarefalList.size();
}
public void obterDescricoesTarefas(){
    System.out.println(tarefalList);
 }
public static void main(String[] args) {

    ListaTarefa listaTarefa = new ListaTarefa();

    
    listaTarefa.adcionarTarefa("tarefa 1");
    listaTarefa.adcionarTarefa("tarefa 1");
    listaTarefa.adcionarTarefa("tarefa 3");
    
    System.out.println("o numero total da lista e : " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.removerTarefa("tarefa 3");

    System.out.println("o numero total da lista e : " + listaTarefa.obterNumeroTotalTarefas());
    
    listaTarefa.obterDescricoesTarefas();
    
    //System.out.println("o numero total da lista e : " + listaTarefa.obterNumeroTotalTarefas());
}

}
