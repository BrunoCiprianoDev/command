package org.example;

public class AbrirPortaComando implements Comando {
    private Porta porta;

    public AbrirPortaComando(Porta porta) {
        this.porta = porta;
    }

    public String executar() {
        return porta.abrir();
    }

    public String desfazer() {
        return porta.fechar();
    }
}