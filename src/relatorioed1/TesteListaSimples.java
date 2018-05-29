/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorioed1;

import ListaSimples.ListaSimplesmenteEncadeada;

/**
 *
 * @author Nathan H. Feitoza
 */
public class TesteListaSimples {
    public static void main(String[] args) {
        DadosTeste dados = new DadosTeste();
        int usando = dados.teste5;
        ListaSimplesmenteEncadeada<Integer> simples = new ListaSimplesmenteEncadeada<>();
        /*
        // Adicionar
        dados.IniciarTeste();
        // Um só
        simples.adicionar(1);
        
        // Todos
        */
        for(int i = 0; i < usando; i++) {
            simples.adicionar(i);
        }
        //dados.FinalizarTeste();
        /*
        // Remover
        dados.IniciarTeste();
        // Remover do inicio
        simples.removerDoInicio();
        
        // Remover posição 500
        //simples.remover(500);
        
        // Remover posição 1000
        //simples.remover(1000);
        
        // Remover do final
        //simples.remover((usando - 1));
        dados.FinalizarTeste();
        */
       
        /*
        // Buscar
         dados.IniciarTeste();
        // Posição, Elemento 0
        simples.obter(0);
        //simples.PosicaoContem(0);
        
        // Posição, Elemento <usando - 1>
        //simples.obter(usando - 1);
        //simples.PosicaoContem(usando - 1);
        
        // Posição, Elemento 100
        //simples.obter(100);
        //simples.PosicaoContem(100);
        
        // Posição, Elemento 50
        //simples.obter(50);
        //simples.PosicaoContem(50);
       
        // Posição, Elemento 40
        //simples.obter(40);
        //simples.PosicaoContem(40);
        
        // Não existente
        try {
        // Posição, Elemento 2001
        //simples.obter(usando + 1);
        //simples.PosicaoContem(usando + 1);
        
        // Posição, Elemento 2002
        //simples.obter(usando + 2);
        //simples.PosicaoContem(usando + 2);
        
        // Posição, Elemento 2003
        //simples.obter(usando + 3);
        //simples.PosicaoContem(usando + 3);
        
        // Posição, Elemento 2004
        //simples.obter(usando + 4);
        //simples.PosicaoContem(usando + 4);
        
        // Posição, Elemento 2005
        //simples.obter(usando + 5);
        //simples.PosicaoContem(usando + 5);
        
        } catch(Exception e){ System.out.println(e.getMessage()); } finally{ dados.FinalizarTeste();}
        */
        
        // Listar
        dados.IniciarTeste();
        // For
        //for(int i = 0; i < usando; i++) { simples.obter(i); }
        
        // Foreach
        //for (Integer integer : simples) {}
        dados.FinalizarTeste();
        
    }
}
