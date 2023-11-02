
public class Director extends Empleado {
    protected String departamento;
    protected double bonificacion;

    public Director(){
        super();
        this.departamento="informatica";
        this.bonificacion=313.13;
    }

    public Director(String nombre,int edad,int salario,double bonificacion,String departamento){
        super(nombre, edad, salario);
        this.departamento=departamento;
        this.bonificacion=bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }
    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
     public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
