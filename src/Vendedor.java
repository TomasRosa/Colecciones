public class Vendedor extends Empleado implements Tonos
{
    private float porcentajeComision;
    Celular celularAsignado;

    public Vendedor ()
    {
        super();
    }

    public Vendedor(int legajo, long dni, String nombre, String apellido, String email, long numero, int salarioBase, float porcentajeComision, Celular celularAsignado)
    {
        super(legajo, dni, nombre, apellido, email, numero, salarioBase);
        this.porcentajeComision = porcentajeComision;
        this.celularAsignado = celularAsignado;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public Celular getCelularAsignado() {
        return celularAsignado;
    }

    public void setCelularAsignado(Celular celularAsignado) {
        this.celularAsignado = celularAsignado;
    }

    @Override
    public String toString()
    {
        return "Vendedor{" +
                "porcentajeComision=" + porcentajeComision +
                ", celularAsignado=" + celularAsignado +
                '}';
    }

    @Override
    public double calcularSalario()
    {
        float comision = this.porcentajeComision / 100;
        return this.salarioBase * (1+comision);
    }

    @Override
    public void llamar()
    {
        System.out.println("PiPiPiPi llamando PiPiPiPi... Vendedor");
    }

    @Override
    public void atender()
    {
            System.out.println("Atendiendo...Atendiendo...Atendiendo...Vendedor");
    }
}
