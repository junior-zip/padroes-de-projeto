package entities;

public class SofaArtDeco extends MovelFactory implements Sofa{

    @Override
    public void lugares() {
        System.out.println("Quatro");

    }

    @Override
    public void tamanho() {
        System.out.println("3m");

    }

    @Override
    public void estilo() {
        System.out.println("Sofa ArtDeco");

    }
}
