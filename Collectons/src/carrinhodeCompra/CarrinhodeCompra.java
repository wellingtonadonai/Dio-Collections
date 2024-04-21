package carrinhodeCompra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CarrinhodeCompra {

    private List<Item> itemList = new ArrayList<>();

    public CarrinhodeCompra(){

    }

    public void adicionarItem(String nome, double preco, int quantidade){
    Item item = new Item(nome, preco, quantidade);
    this.itemList.add(item);
        
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!this.itemList.isEmpty()) {
            @SuppressWarnings("rawtypes")
            Iterator var3 = this.itemList.iterator();
   
            while(var3.hasNext()) {
               Item i = (Item)var3.next();
               if (i.getNome().equalsIgnoreCase(nome)) {
                  itensParaRemover.add(i);
               }
            }
   
            this.itemList.removeAll(itensParaRemover);
         } else {
            System.out.println("A lista est\u00e1 vazia!");
         }
   
      }
   
      public double calcularValorTotal() {
         double valorTotal = 0.0;
         if (this.itemList.isEmpty()) {
            throw new RuntimeException("A lista est\u00e1 vazia!");
         } else {
            double valorItem;
            for(@SuppressWarnings("rawtypes")
            Iterator var3 = this.itemList.iterator(); var3.hasNext(); valorTotal += valorItem) {
               Item item = (Item)var3.next();
               valorItem = item.getPreco() * (double)item.getQuant();
            }
   
            return valorTotal;
         }
      }
   
      public void exibirItens() {
         if (!this.itemList.isEmpty()) {
            System.out.println(this.itemList);
         } else {
            System.out.println("A lista est\u00e1 vazia!");
         }
   
      }
   
      public String toString() {
         return "CarrinhodeCompra{itens=" + this.itemList + "}";
      }
   
      public static void main(String[] args) {
         CarrinhodeCompra carrinhoDeCompras = new CarrinhodeCompra();
         carrinhoDeCompras.adicionarItem("L\u00e1pis", 2.0, 3);
         carrinhoDeCompras.adicionarItem("L\u00e1pis", 2.0, 3);
         carrinhoDeCompras.adicionarItem("Caderno", 35.0, 1);
         carrinhoDeCompras.adicionarItem("Borracha", 2.0, 2);
         carrinhoDeCompras.exibirItens();
         carrinhoDeCompras.removerItem("L\u00e1pis");
         carrinhoDeCompras.exibirItens();
         System.out.println("O valor total da compra \u00e9 = " + carrinhoDeCompras.calcularValorTotal());
      }
   }

