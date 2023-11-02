public class Libro {
    private String titulo;
    public Libro(){
        this.titulo="picasso";
    }
    public Libro(String titulo){
        this.titulo=titulo;
    }

    @Override
    public String toString(){
        return "titulo: "+this.titulo+"\n";
    }
}
