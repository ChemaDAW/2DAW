package CalendarioPaquete;

public abstract class CalendarioChema {
    protected int anno;
    protected int mes;
    protected int dia;

    // metodos de la clase
    abstract public void incrementarDia();

    abstract public void incrementarMes();

    abstract public void incrementarAnno(int cantidad);

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.anno;
    }

    public void rango() {
        if (this.mes <= 12 || this.mes >= 1) {
            if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
                    || this.mes == 12) {
                if (this.dia == 32) {
                    this.dia = 1;
                }
            } else if (this.mes == 2) {
                if (this.dia == 29) {
                    this.dia = 1;
                }
            } else {
                if (this.dia == 31) {
                    this.dia = 1;
                }
            }
        }
        if (this.mes == 13) {
            this.mes = 1;
        }
        if (this.anno < 0) {
            this.anno = 1;
        }
    }

    // constructores de la clase
    CalendarioChema() {
        this.dia = 21;
        this.anno = 2023;
        this.mes = 04;
    }

    CalendarioChema(int dia, int mes, int anno) {
        this.anno = anno;
        this.mes = mes;
        this.dia = dia;
    }
    // Getters y Setters
}
