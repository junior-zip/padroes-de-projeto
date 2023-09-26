package Aplication;

import entities.FabricaMovelArtDeco;
import entities.FabricaMovelModerno;
import entities.FabricaMovelVitoriano;

public class Main {
    public static  void main(String[] args) {


        FabricaMovelVitoriano fabricaMovelVitoriano = new FabricaMovelVitoriano();
        FabricaMovelModerno fabricaMovelModerno = new FabricaMovelModerno();
        FabricaMovelArtDeco fabricaMovelArtDeco = new FabricaMovelArtDeco();

        fabricaMovelModerno.createCadeira().estilo();
        fabricaMovelVitoriano.createSofa().estilo();
        fabricaMovelArtDeco.createMesa().estilo();


    }
}
