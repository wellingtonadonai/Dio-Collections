package OperaçoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo
    private List<Tarefa> tarefalList;

    public ListaTarefa() {
        this.tarefalList = new ArrayList<>();
    }
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
}
