package entities;

public class LivroEuRoboPrototype extends LivroPrototype{


    public LivroEuRoboPrototype(LivroEuRoboPrototype livroEuRoboPrototype) {
        this.setDedicatoria(livroEuRoboPrototype.getDedicatoria());
    }

    public LivroEuRoboPrototype() {
    }

    @Override
    public String exibindoInfo() {
        return "Eu robô é demais. Eu robô top!";
    }

    @Override
    public LivroPrototype Clonar() {
        return new LivroEuRoboPrototype(this);
    }
}
