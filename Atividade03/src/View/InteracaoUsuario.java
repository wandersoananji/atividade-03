package View;

import javax.swing.JOptionPane;

import Business.PilhaComputador;
import Model.Computador;

public class InteracaoUsuario {
    public static void main(String[] args) {
        PilhaComputador pilha = new PilhaComputador();

        // Exemplo de interação com o usuário utilizando JOptionPane
        String marca = JOptionPane.showInputDialog("Digite a marca do computador:");
        String modelo = JOptionPane.showInputDialog("Digite o modelo do computador:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação do computador:"));

        Computador computador = new Computador(marca, modelo, ano);
        pilha.empilharComputador(computador);

        JOptionPane.showMessageDialog(null, "Computador empilhado com sucesso!");

        // Desempilhando o computador
        Computador computadorDesempilhado = pilha.desempilharComputador();
        if (computadorDesempilhado != null) {
            JOptionPane.showMessageDialog(null, "Computador desempilhado: " + computadorDesempilhado.getMarca() +
                    " " + computadorDesempilhado.getModelo() + " " + computadorDesempilhado.getAnoFabricacao());
        } else {
            JOptionPane.showMessageDialog(null, "Não há computadores na pilha!");
        }
    }
}
