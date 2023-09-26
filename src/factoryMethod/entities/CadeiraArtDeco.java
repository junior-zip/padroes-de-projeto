package entities;

public class CadeiraArtDeco implements Movel {

    public CadeiraArtDeco(){
        create();
    }

    @Override
    public void create() {
        System.out.println("Cadeira ArtDeco criada!");
    }
}
