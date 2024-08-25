package org.example;

import java.util.Stack;

public class ControleRemoto {
    private Comando comandoAtual;
    private Stack<Comando> historicoComandos = new Stack<>();

    public void setComando(Comando comando) {
        this.comandoAtual = comando;
    }

    public void pressionarBotao() {
        comandoAtual.executar();
        historicoComandos.push(comandoAtual);
    }

    public void pressionarDesfazer() {
        if (!historicoComandos.isEmpty()) {
            Comando comando = historicoComandos.pop();
            comando.desfazer();
        }
    }
}