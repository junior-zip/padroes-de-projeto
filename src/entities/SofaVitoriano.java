package entities;

public class SofaVitoriano implements Movel{
    public SofaVitoriano(){
        create();

    }

    @Override
    public void create() {
        System.out.println("Sofa Vitoriano criado!");
    }
}
