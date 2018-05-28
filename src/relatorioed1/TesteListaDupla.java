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
        dados.IniciarTeste();
        ListaDupla<Integer> dupla = new ListaDupla<>();
        // Adicionar
        // Um só
        dupla.adicionar(1);
        
        // Todos
        /*
        for(int i = 0; i < dados.teste4; i++) {
            dupla.adicionar(i);
        }*/
        dados.FinalizarTeste();
    }
}
