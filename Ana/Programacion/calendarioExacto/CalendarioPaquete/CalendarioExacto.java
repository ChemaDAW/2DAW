/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalendarioPaquete;

import java.util.*;

public class CalendarioExacto extends CalendarioChema {
    // Atributos
    private int hora;
    private int minuto;

    // Constructores
    CalendarioExacto() {
        this.hora = 2;
        this.minuto = 5;
    }

    CalendarioExacto(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public CalendarioExacto(int hora, int minuto, int dia, int mes, int anno) {
        super(dia, mes, anno);
        this.hora = hora;
        this.minuto = minuto;
    }

    // Metodos de la clase
    @Override
    public void incrementarDia() {
        super.dia++;
        rango();
        mostrarInformacion();
    }

    @Override
    public void incrementarMes() {
        super.mes++;
        rango();
        mostrarInformacion();
    }

    @Override
    public void incrementarAnno(int cantidad) {
        super.anno += cantidad;
        rango();
        mostrarInformacion();
    }

    public void incrementarHora() {
        this.hora++;
        rango();
        mostrarInformacion();
    }

    public void incrementarMinuto(int incrementoMinutos) {
        this.minuto += incrementoMinutos;
        rango();
        mostrarInformacion();
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.anno + " " + this.hora + ":" + this.minuto;
    }

    public void mostrarInformacion() {
        System.out.println(toString());
    }

    public boolean comprobarBisiesto() {
        if (this.anno % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
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
        if (this.hora >= 24 || this.hora < 0) {
            this.hora = 00;
        }
        if (this.minuto >= 61 || this.minuto <= 0) {
            this.minuto = 1;
        }
    }

    public boolean iguales(CalendarioExacto calendario1) {
        return (this.dia == calendario1.dia && this.mes == calendario1.mes && this.anno == calendario1.anno
                && this.hora == calendario1.hora && this.minuto == calendario1.minuto);

    }
}
