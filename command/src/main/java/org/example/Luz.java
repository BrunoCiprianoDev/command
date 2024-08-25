package org.example;

public class Luz {
    private String local;

    public Luz(String local) {
        this.local = local;
    }

    public String ligar() {
        return "A luz do " + local + " está ligada.";
    }

    public String desligar() {
        return "A luz do " + local + " está desligada.";
    }
}
