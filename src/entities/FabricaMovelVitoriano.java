package entities;

public class FabricaMovelVitoriano extends MovelFactory{

    public Cadeira createCadeira() {
        return (Cadeira) new CadeiraVitoriana();
    }

    public Mesa createMesa() {
        return (Mesa) new MesaVitoriana();
    }

    public Sofa createSofa() {
        return (Sofa) new SofaVitoriano();
    }


}
