import java.util.ArrayList;

public class Biblioteca {
    ArrayList <Libro> arrayBiblioteca;
    public Biblioteca(){
        this.arrayBiblioteca=new ArrayList<>();
    }
    public Biblioteca(ArrayList arrayBiblioteca){
        
    }

    @Override
    public String toString(){
        return "Biblioteca: "+arrayBiblioteca.toString();
    }
}
