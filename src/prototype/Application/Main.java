package Application;

import entities.LivroEuRoboPrototype;
import entities.LivroPrototype;

public class Main {
    public static void main(String[] args) {


        LivroEuRoboPrototype livroEuRoboPrototype = new LivroEuRoboPrototype();



        livroEuRoboPrototype.setTitulo("Eu robo");
        livroEuRoboPrototype.setAssunto("Ficção Científca");
        System.out.println("Titulo: "+ livroEuRoboPrototype.getTitulo());
        System.out.println("Assunto: " + livroEuRoboPrototype.getAssunto());
        System.out.println("Exibição: " + livroEuRoboPrototype.exibindoInfo());
        System.out.println();
        LivroPrototype livroEurobo = livroEuRoboPrototype.Clonar();
        livroEurobo.setDedicatoria("Com muito amor, Azimov");
        System.out.println(livroEurobo.getDedicatoria());
        LivroPrototype livroEurobo2 = livroEuRoboPrototype.Clonar();
        livroEurobo2.setDedicatoria("Obrigado por comprar meu livro, De Azimov");
        System.out.println();
        LivroPrototype livroEurobo3 = livroEuRoboPrototype.Clonar();
        livroEurobo3.setDedicatoria("UIUI comprou o meu livro ein, Azimov");
        System.out.println(livroEurobo3.getDedicatoria());
        System.out.println();
        LivroPrototype livroEurobo4 = livroEuRoboPrototype.Clonar();
        livroEurobo4.setDedicatoria("valeu man, Azimov");
        System.out.println(livroEurobo4.getDedicatoria());






    }
}