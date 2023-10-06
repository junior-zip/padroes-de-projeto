package entities;

public class SofaModerno extends MovelFactory implements Sofa{

    @Override
    public void lugares() {
        System.out.println("Três");

    }

    @Override
    public void tamanho() {
        System.out.println("2,5m");

    }

    @Override
    public void estilo() {
        System.out.println("Sofa Moderno");

    }
}
