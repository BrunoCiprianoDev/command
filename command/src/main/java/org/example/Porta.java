package org.example;

public class Porta {
    private String local;

    public Porta(String local) {
        this.local = local;
    }

    public String abrir() {
        return "A porta do " + local + " está aberta.";
    }

    public String fechar() {
        return "A porta do " + local + " está fechada.";
    }
}
