/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Arrays;

/**
 *
 * @author Guilherme Santanna
 */
public class Vetor {
    // Declarando e Inicializando um array de Aluno com capacidade 100.
  private Clientes[] alunos = new Clientes[100];
  
    public void adiciona(Clientes aluno) {
    for (int i = 0; i < this.alunos.length; i++) {
      if (this.alunos[i] == null) {
        this.alunos[i] = aluno;
        break;
      }
    }
  }

  public void adiciona(int posicao, Clientes aluno) {
    // implementação
  }



  public void remove(int posicao) {
    // implementação
  }

 


  
  public String toString() {
    return Arrays.toString(alunos);
  }
}
