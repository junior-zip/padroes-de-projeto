package entities;

import org.w3c.dom.ls.LSOutput;

public class  CadeiraVitoriana extends MovelFactory implements Cadeira{



    @Override
    public void TamUmaPessoa() {
        System.out.println("Normal Vitoriana");
    }
    @Override
    public void Sentado() {
        System.out.println("Normal sentado");
    }

    @Override
    public void estilo() {
        System.out.println("Cadeira Vitoriana");

    }
}
