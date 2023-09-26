package entities;

public class MesaModerna extends MovelFactory implements Mesa{


    @Override
    public void pernas() {
        System.out.println("Quatro");

    }

    @Override
    public void pessoas() {
        System.out.println("6");

    }

    @Override
    public void estilo() {
        System.out.println("Mesa Moderna");

    }
}
