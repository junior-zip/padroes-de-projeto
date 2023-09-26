package entities;

public class FabricaMovelArtDeco extends MovelFactory{



    public Cadeira createCadeira() {

        return (Cadeira) new CadeiraArtDeco();
    }

    public Mesa createMesa() {
        return (Mesa) new MesaArtDeco();
    }

    public Sofa createSofa() {
        return (Sofa) new SofaArtDeco();
    }



}
