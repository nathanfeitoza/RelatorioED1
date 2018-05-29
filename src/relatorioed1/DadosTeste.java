/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorioed1;

/**
 *
 * @author Nathan H. Feitoza
 */
public class DadosTeste {
    public int 
    teste1 = 2000,
    teste2 = 20000,
    teste3 = 200000,
    teste4 = 2000000,
    teste5 = 20000000;
    private long tempoInicial;
    
    public void IniciarTeste() {
        this.tempoInicial = System.currentTimeMillis();
    }
    
    public void FinalizarTeste() {
        System.out.println("o metodo executou em " + (System.currentTimeMillis() - this.tempoInicial));
    }
    
}
