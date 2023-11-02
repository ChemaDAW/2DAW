
public class Gerente extends Empleado{
    protected String departamento;

    public Gerente(){
        super();
        this.departamento="marketing";
    }

    public Gerente(String nombre,int edad,int salario,String departamento){
        super(nombre, edad, salario);
        this.departamento=departamento;
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }  
}
