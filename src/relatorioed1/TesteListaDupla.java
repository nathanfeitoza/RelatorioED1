/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorioed1;

import ListaDupla.ListaDupla;



/**
 *
 * @author Nathan H. Feitoza
 */
public class TesteListaDupla {
    public static void main(String[] args) {
        DadosTeste dados = new DadosTeste();
        int usando = dados.teste5;
        ListaDupla<Integer> dupla = new ListaDupla<>();
         dados.IniciarTeste();
        // Adicionar
        // Um só
        //dupla.adicionar(1);
        
        // Todos
        
        for(int i = 0; i < usando; i++) {
            dupla.adicionar(i);
        }
        //dados.FinalizarTeste();
        
        /*
        // Remover
        dados.IniciarTeste();
        // Remover do inicio
        //dupla.removerDoInicio();
        
        // Remover posição 500
        //dupla.remover(500);
        
        // Remover posição 1000
        //dupla.remover(1000);
        
        // Remover do final
        //dupla.remover((usando - 1));
        dados.FinalizarTeste();
        */
        
                
        /*
        // Buscar
         dados.IniciarTeste();
        // Posição, Elemento 0
        //dupla.obter(0);
        //dupla.PosicaoContem(0);
        
        // Posição, Elemento <usando - 1>
        //dupla.obter(usando - 1);
        //dupla.PosicaoContem(usando - 1);
        
        // Posição, Elemento 100
        //dupla.obter(100);
        //dupla.PosicaoContem(100);
        
        // Posição, Elemento 50
        //dupla.obter(50);
        //dupla.PosicaoContem(50);
       
        // Posição, Elemento 40
        //dupla.obter(40);
        //dupla.PosicaoContem(40);
        
        // Não existente
        try {
        // Posição, Elemento 2001
        //dupla.obter(usando + 1);
        //dupla.PosicaoContem(usando + 1);
        
        // Posição, Elemento 2002
        //dupla.obter(usando + 2);
        //dupla.PosicaoContem(usando + 2);
        
        // Posição, Elemento 2003
        //dupla.obter(usando + 3);
        //dupla.PosicaoContem(usando + 3);
        
        // Posição, Elemento 2004
        //dupla.obter(usando + 4);
        //dupla.PosicaoContem(usando + 4);
        
        // Posição, Elemento 2005
        //dupla.obter(usando + 5);
        //dupla.PosicaoContem(usando + 5);
        
        } catch(Exception e){ System.out.println(e.getMessage()); } finally{ dados.FinalizarTeste();}
        */
        
        
        // Listar
        dados.IniciarTeste();
        // For
       // for(int i = 0; i < usando; i++) { dupla.obter(i); }
        
        // Foreach
        for (Integer integer : dupla) {}
        dados.FinalizarTeste();
        
    }
}
