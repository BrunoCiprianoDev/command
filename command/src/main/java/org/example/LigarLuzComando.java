package org.example;

public class LigarLuzComando implements Comando {
    private Luz luz;

    public LigarLuzComando(Luz luz) {
        this.luz = luz;
    }

    public String executar() {
       return luz.ligar();
    }

    public String desfazer() {
        return luz.desligar();
    }
}