package org.example;

public class FecharPortaComando implements Comando {
    private Porta porta;

    public FecharPortaComando(Porta porta) {
        this.porta = porta;
    }

    public String executar() {
        return porta.fechar();
    }

    public String desfazer() {
        return porta.abrir();
    }
}