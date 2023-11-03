import claseEmisora.Emisora;

public class MarcaPagina {

    int pagina;

    MarcaPagina() {  //Construcctor por defecto, inicializa a la primera pag.
        this.pagina = 1;
    }

    MarcaPagina(int pagina) {  //constructor sobrecargado, inicializa a una pag. en concreto
        this.pagina = pagina;
    }

    void otraPagina() {
        this.pagina++;  //Los libros se leen de pag. en pag..No tiene sentido otro incremento
        }

    void mostrar() {
        System.out.println("Tu lectura es por la página " + this.pagina + ".");
    }

    void empezar() {
        this.pagina = 1;
    }

    void rango(){
        if(this.pagina==100){
            empezar();
        }
    }

   void compararLibro(MarcaPagina libro2) {
        if (this.pagina==libro2.pagina) {
                        System.out.println("Estan por la misma pagina");
                    } else {
                        System.out.println("Estan en distintas paginas");
                    }
    }
}
