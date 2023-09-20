package org.apple.phone;

import org.apple.browser.IBrowser;
import org.apple.music.IPlayer;

public class IPhone implements ITelephone, IPlayer, IBrowser {
    @Override
    public void ligar() {
        System.out.println("Ligando no iPhone...");
    }

    @Override
    public void receber() {
        System.out.println("Atendendo no iPhone...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando no iPhone...");
    }

    @Override
    public void ligarCaixaPostal() {
        System.out.println("Ligando caixa postal no iPhone...");
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo no iPhone...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado no iPhone!");
    }

    @Override
    public void avancar() {
        System.out.println("Próxima música no iPhone...");
    }

    @Override
    public void retroceder() {
        System.out.println("Música anterior no iPhone...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página aberta no iPhone!");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Nova página aberta no iPhone!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no iPhone!");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Página anterior no iPhone!");
    }

    @Override
    public void avancarPagina() {
        System.out.println("Próxima página no iPhone!");
    }
}
