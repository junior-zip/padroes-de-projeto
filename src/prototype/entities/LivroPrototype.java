package entities;

public abstract class LivroPrototype {

    private String dedicatoria;
    private String titulo;
    private String assunto;

    public abstract String exibindoInfo();

    public abstract LivroPrototype Clonar();


    public String getDedicatoria() {
        return dedicatoria;
    }

    public void setDedicatoria(String dedicatoria) {
        this.dedicatoria = dedicatoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }


}
