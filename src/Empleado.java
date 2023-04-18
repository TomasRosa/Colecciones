import java.time.LocalDate;
import java.util.Objects;

public abstract class Empleado
{
    protected int legajo;
    protected long dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected long numero;
    protected LocalDate fechaIngreso = LocalDate.now();
    protected int salarioBase;

    public Empleado ()
    {

    }
    public Empleado (int legajo, long dni,String nombre, String apellido, String email, long numero, int salarioBase)
    {
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numero = numero;
        this.salarioBase = salarioBase;
    }

    public int getSalarioBase()
    {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase)
    {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString()
    {
        return "Empleado{" +
                "legajo=" + legajo +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", numero=" + numero +
                ", fechaIngreso=" + fechaIngreso +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return dni == empleado.dni;
    }
    public abstract double calcularSalario ();
}
