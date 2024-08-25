package org.example;

public class DesligarLuzComando implements Comando {
    private Luz luz;

    public DesligarLuzComando(Luz luz) {
        this.luz = luz;
    }

    public String executar() {
        return luz.desligar();
    }

    public String desfazer() {
        return luz.ligar();
    }
}
