package org.apple.browser;

public class Safari  implements IBrowser{
    @Override
    public void exibirPagina() {
        System.out.println("Página aberta!");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Nova página aberta!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Página anterior!");
    }

    @Override
    public void avancarPagina() {
        System.out.println("Próxima página!");
    }
}
