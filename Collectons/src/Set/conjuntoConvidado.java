package Set;
import java.util.HashSet;
import java.util.Set;

public class conjuntoConvidado {
  
    private Set<convidado> convidadoSet;

    public conjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }
    
    public void adcionarConvidado (String nome, int codigoConvite){
        convidadoSet.add(new convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite (int codigoConvite){
    convidado excluirConvidado = null;
    for(convidado c: convidadoSet){
        if (c.getCodigoConvite() == codigoConvite) {
            excluirConvidado = c;
            break;
        }
    }
    convidadoSet.remove(excluirConvidado);
    }
    public int contarCandidatos (){
        return convidadoSet.size();
    }
    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }
    

    public static void main(String[] args) {
        conjuntoConvidado ConjuntodeConvidados = new conjuntoConvidado();
         

        ConjuntodeConvidados.adcionarConvidado("wellington", 12345);
        ConjuntodeConvidados.adcionarConvidado("Douglas", 13245); 
        ConjuntodeConvidados.adcionarConvidado("joao miguel", 678678); 
        ConjuntodeConvidados.adcionarConvidado("maikon", 4225452); 


        System.out.println("Existem " + ConjuntodeConvidados.contarCandidatos()+ " Dentro do Set de convidados"); 
        
        ConjuntodeConvidados.removerConvidadoPorCodigoConvite(12345);

        System.out.println("Existem " + ConjuntodeConvidados.contarCandidatos()+ " Dentro do Set de convidados"); 
        
        ConjuntodeConvidados.exibirConvidado();
        
        System.out.println("Existem " + ConjuntodeConvidados.contarCandidatos()+ " Dentro do Set de convidados"); 

        ConjuntodeConvidados.contarCandidatos();
        
        System.out.println("Existem " + ConjuntodeConvidados.contarCandidatos()+ " Dentro do Set de convidados"); 

    }    
    
}

