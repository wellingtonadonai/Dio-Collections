package Catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List<Livro> livroList;

public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }
public void adicionarlivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

public List<Livro> pesquisarPorAutor (String autor){
    List<Livro> LivrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
          for(Livro l : livroList){
            if (l.getAutor().equalsIgnoreCase(autor)) {
                LivrosPorAutor.add(l);
            }
          }  
        }
        return LivrosPorAutor;

    }
public List<Livro> PesquisaPorIntervalosDeAno(int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervalosDeAno = new ArrayList<>();
    if (!livroList.isEmpty()) {
        for(Livro l : livroList){
            if (l.getAnoPulblicacao() >= anoInicial && l.getAnoPulblicacao()<= anoFinal) {
                livrosPorIntervalosDeAno.add(l);
                
            }
        }
        
    }
    return livrosPorIntervalosDeAno;
  }
public Livro pesquisaPorTitulo (String titulo){
 Livro livroPorTitulo = null;
 if (!livroList.isEmpty()) {
    for(Livro l : livroList){
    if (l.getTitulo().equalsIgnoreCase(titulo)) {
        livroPorTitulo = l;
        break;
    }
   }
  }
  return livroPorTitulo;
 }
}
   
