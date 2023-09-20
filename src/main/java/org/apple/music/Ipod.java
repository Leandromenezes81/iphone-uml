package org.apple.music;

public class Ipod implements  IPlayer{
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado!");
    }

    @Override
    public void avancar() {
        System.out.println("Próxima música...");
    }

    @Override
    public void retroceder() {
        System.out.println("Música anterior...");
    }
}
