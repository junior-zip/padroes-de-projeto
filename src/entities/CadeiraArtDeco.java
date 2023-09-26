package entities;

public class CadeiraArtDeco extends MovelFactory implements Cadeira {



    @Override
    public void TamUmaPessoa() {
        System.out.println("Normal Artdeco");
    }
    @Override
    public void Sentado() {
        System.out.println("Normal sentado");
    }

    @Override
    public void estilo() {
        System.out.println("Cadeira Art Deco");

    }
}
