package entities;

public class FabricaMovelModerno extends MovelFactory {

    public Cadeira createCadeira() {
        return new CadeiraModerna();
    }

    public Mesa createMesa() {
        return new MesaModerna();
    }

    public  Sofa createSofa() {
        return new SofaModerno();
    }







}
