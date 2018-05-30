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
        TabelaHash<String> t = new TabelaHash<>();
       t.adicionar("Nathan");
       t.adicionar("Nathaaa");
       t.adicionar("Feitoza");
       t.adicionar("Henrique");
       try {
           for (Object object : t.obter("Nathaaa")) {
               System.out.println(object);
           }
       } catch(Exception e) {
           System.out.println(e.getMessage());
       }
    }
}
