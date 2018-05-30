/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorioed1;

import ListaVetor.ListaVetor;

/**
 *
 * @author Nathan H. Feitoza
 */
public class TesteListaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DadosTeste dados = new DadosTeste();
        // Para o método adicionar
        //dados.IniciarTeste();
        int usando = dados.teste5;
        ListaVetor<Integer> lista_vetor = new ListaVetor<>(usando);
        
        // Adicionar   
        // Somente um
        //lista_vetor.adicionar(1);
        // Todos
        for(int i = 0; i < usando; i++) {
            lista_vetor.adicionar(i);
        }
        /*
        // Remover
        dados.IniciarTeste();
        // Remover do inicio
        //lista_vetor.removerDoInicio();
        
        // Remover posição 500
        //lista_vetor.remover(500);
        
        // Remover posição 1000
        //lista_vetor.remover(1000);
        
        // Remover do final
        //lista_vetor.remover((usando - 1));
        dados.FinalizarTeste();
        */
        
        /*
        // Buscar
         dados.IniciarTeste();
        // Posição, Elemento 0
        //lista_vetor.obter(0);
        //lista_vetor.PosicaoContem(0);
        
        // Posição, Elemento <usando - 1>
        //lista_vetor.obter(usando - 1);
        //lista_vetor.PosicaoContem(usando - 1);
        
        // Posição, Elemento 100
        //lista_vetor.obter(100);
        //lista_vetor.PosicaoContem(100);
        
        // Posição, Elemento 50
        //lista_vetor.obter(50);
        //lista_vetor.PosicaoContem(50);
       
        // Posição, Elemento 40
        //lista_vetor.obter(40);
        //lista_vetor.PosicaoContem(40);
        
        // Não existente
        try {
        // Posição, Elemento 2001
        //lista_vetor.obter(usando + 1);
        lista_vetor.PosicaoContem(usando + 1);
        
        // Posição, Elemento 2002
        //lista_vetor.obter(usando + 2);
        //lista_vetor.PosicaoContem(usando + 2);
        
        // Posição, Elemento 2003
        //lista_vetor.obter(usando + 3);
        //lista_vetor.PosicaoContem(usando + 3);
        
        // Posição, Elemento 2004
        //lista_vetor.obter(usando + 4);
        //lista_vetor.PosicaoContem(usando + 4);
        
        // Posição, Elemento 2005
        //lista_vetor.obter(usando + 5);
        //lista_vetor.PosicaoContem(usando + 5);
        
        } catch(Exception e){ System.out.println(e.getMessage()); } finally{ dados.FinalizarTeste();}
        */
        
        // Listar
        dados.IniciarTeste();
        // For
        //for(int i = 0; i < usando; i++) { lista_vetor.obter(i); }
        
        // Foreach
        for (Integer integer : lista_vetor) {}
        dados.FinalizarTeste();
        
        // TODO code application logic here
    }
    
}
