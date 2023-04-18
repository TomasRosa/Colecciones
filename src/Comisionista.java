public class Comisionista extends Empleado
{
    private int cantidadEntregas;

    public Comisionista ()
    {

    }

    public Comisionista(int legajo, long dni, String nombre, String apellido, String email, long numero, int salarioBase, int cantidadEntregas)
    {
        super(legajo, dni, nombre, apellido, email, numero, salarioBase);
        this.cantidadEntregas = cantidadEntregas;
    }

    public int getCantidadEntregas()
    {
        return cantidadEntregas;
    }

    public void setCantidadEntregas(int cantidadEntregas)
    {
        this.cantidadEntregas = cantidadEntregas;
    }

    @Override
    public String toString()
    {
        super.toString();
        return "Comisionista{" +
                "cantidadEntregas=" + cantidadEntregas +
                '}';
    }

    @Override
    public double calcularSalario()
    {
        return this.salarioBase + 75 * this.cantidadEntregas;
    }
}
