package entities;

public class CadeiraModerna extends MovelFactory implements Cadeira  {



    @Override
    public void TamUmaPessoa() {
        System.out.println("Normal Moderna");
    }
    @Override
    public void Sentado() {
        System.out.println("Normal sentado");
    }

    @Override
    public void estilo() {
        System.out.println("Cadeira Moderna");

    }
}
