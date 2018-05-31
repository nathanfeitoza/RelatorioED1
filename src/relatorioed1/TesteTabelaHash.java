/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorioed1;

import TabelaHash.TabelaHash;

/**
 *
 * @author Nathan H. Feitoza
 */
public class TesteTabelaHash {
        public static void main(String[] args) {
        TabelaHash<Integer> t = new TabelaHash<>();
        DadosTeste dados = new DadosTeste();
        double total = 0;
        int usando = dados.teste5;
        for(int nf = 1; nf <= 5; nf++) {
            //dados.IniciarTeste();
            for(int i = 0; i < usando; i++) {
                t.adicionar(i);
            }
           dados.IniciarTeste();
           // Remover
           //t.remover(0);
           //t.remover(500);
           //t.remover(1000);
           //t.remover(usando - 1);
           try {
            /*t.obter(0);
            t.obter(1999);
            t.obter(100);
            t.obter(50);
            t.obter(40);*/
            
            /*t.obter((usando + 1));
            t.obter((usando + 2));
            t.obter((usando + 3));
            t.obter((usando + 4));
            t.obter((usando + 5));*/
            
            /*int cont = 0;
            for (Object object : t.obertTodos()) {
               for (Object obj : t.obter(cont)) {
                   //System.out.println(obj);
               }
            }*/
            
            for(int f = 0; f < t.obertTodos().tamanho(); f++) {
                t.obter(f);
            }
           
           } catch(Exception e) {}
            
           double tempo = dados.TempoRealizado();
           total += tempo;
           System.out.println(tempo / 1000);
        }
        double media = (total / 5) / 1000;
        System.out.println("Média: "+ media);
       /*try {
           int cont = 0;
           for (Object object : t.obertTodos()) {
               for (Object obj : t.obter(cont)) {
                   System.out.println(obj);
               }
               cont++;
               //for (Integer dados : t.obterLista(object)) {
                   
               }//
           }
       } catch(Exception e) {
           System.out.println(e.getMessage());
       }*/
    }
}
