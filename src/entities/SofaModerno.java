package entities;

public class SofaModerno implements Movel{
    public SofaModerno(){
        create();

    }

    @Override
    public void create() {
        System.out.println("Sofa Moderno criada!");
    }
}
