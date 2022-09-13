package br.com.alura.leilao.model;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeilaoTest {

    @Test
    public void getDescricao(){
        // criar cenario de teste
        Leilao videoGame = new Leilao("Video game");

        // executar ação esperada
        String descricaoDevolvida = videoGame.getDescricao();

        // testar resultado esperado
        Assert.assertEquals("Video game", descricaoDevolvida);
    }

}

