package Aplication;

import entities.FabricaCadeira;
import entities.Logistica;
import entities.MovelFactory;

public class Main {
    public static void main(String[] args) {

        Logistica logistica = new Logistica();

        MovelFactory movelc = logistica.create("cadeira");
        MovelFactory movelm  = logistica.create("mesa");
        MovelFactory movels  = logistica.create("sofa");

        movelc.createMovel("vitoriano");
        movelc.createMovel("artDeco");
        movelc.createMovel("moderno");

        movelm.createMovel("vitoriano");
        movelm.createMovel("artDeco");
        movelm.createMovel("moderno");

        movels.createMovel("vitoriano");
        movels.createMovel("artDeco");
        movels.createMovel("moderno");
    }
}
