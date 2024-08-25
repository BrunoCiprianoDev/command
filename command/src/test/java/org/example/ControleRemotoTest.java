package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControleRemotoTest {

    ControleRemoto controleRemoto;
    Luz luzSala;
    Porta portaGaragem;

    @BeforeEach
    void setUp() {
        controleRemoto = new ControleRemoto();
        luzSala = new Luz("Sala");
        portaGaragem = new Porta("Garagem");
    }

    @Test
    void deveLigarLuz() {
        Comando ligarLuz = new LigarLuzComando(luzSala);
        controleRemoto.setComando(ligarLuz);
        controleRemoto.pressionarBotao();

        assertEquals("A luz do Sala está ligada.", ligarLuz.executar());
    }

    @Test
    void deveDesligarLuz() {
        Comando desligarLuz = new DesligarLuzComando(luzSala);
        controleRemoto.setComando(desligarLuz);
        controleRemoto.pressionarBotao();

        assertEquals("A luz do Sala está desligada.", desligarLuz.executar());
    }

    @Test
    void deveAbrirPorta() {
        Comando abrirPorta = new AbrirPortaComando(portaGaragem);
        controleRemoto.setComando(abrirPorta);
        controleRemoto.pressionarBotao();

        assertEquals("A porta do Garagem está aberta.", abrirPorta.executar());
    }

    @Test
    void deveFecharPorta() {
        Comando fecharPorta = new FecharPortaComando(portaGaragem);
        controleRemoto.setComando(fecharPorta);
        controleRemoto.pressionarBotao();

        assertEquals("A porta do Garagem está fechada.", fecharPorta.executar());
    }

    @Test
    void deveDesfazerLigarLuz() {
        Comando ligarLuz = new LigarLuzComando(luzSala);
        controleRemoto.setComando(ligarLuz);
        controleRemoto.pressionarBotao();

        controleRemoto.pressionarDesfazer();
        assertEquals("A luz do Sala está desligada.", ligarLuz.desfazer());
    }

    @Test
    void deveDesfazerAbrirPorta() {
        Comando abrirPorta = new AbrirPortaComando(portaGaragem);
        controleRemoto.setComando(abrirPorta);
        controleRemoto.pressionarBotao();

        controleRemoto.pressionarDesfazer();
        assertEquals("A porta do Garagem está fechada.", abrirPorta.desfazer());
    }
}