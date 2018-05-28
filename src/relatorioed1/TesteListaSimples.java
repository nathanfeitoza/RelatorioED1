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
        dados.IniciarTeste();
        ListaSimplesmenteEncadeada<Integer> simples = new ListaSimplesmenteEncadeada<>();
        
        // Adicionar
        // Um só
        simples.adicionar(1);
        
        // Todos
        /*for(int i = 0; i < dados.teste4; i++) {
            simples.adicionar(i);
        }*/
        dados.FinalizarTeste();
    }
}
