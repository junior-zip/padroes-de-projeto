package entities;

public class SofaVitoriano extends MovelFactory implements Sofa{
    @Override
    public void lugares() {
        System.out.println("3");
    }

    @Override
    public void tamanho() {
        System.out.println("4m");

    }

    @Override
    public void estilo() {
        System.out.println("Sofa Vitoriano");

    }
}
