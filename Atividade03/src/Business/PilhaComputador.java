package Business;

import java.util.Stack;

import Model.Computador;

public class PilhaComputador {
    private Stack<Computador> pilha;

    public PilhaComputador() {
        pilha = new Stack<>();
    }

    public void empilharComputador(Computador computador) {
        pilha.push(computador);
    }

    public Computador desempilharComputador() {
        if (!pilha.isEmpty()) {
            return pilha.pop();
        }
        return null; // Pilha vazia
    }
}
