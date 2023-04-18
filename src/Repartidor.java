public class Repartidor extends Empleado implements Tonos
{
    private int salidasPorDia;
    Celular celularAsignado;

    public Repartidor ()
    {

    }

    public Repartidor(int legajo, long dni, String nombre, String apellido, String email, long numero, int salarioBase, int salidasPorDia, Celular celularAsignado)
    {
        super(legajo, dni, nombre, apellido, email, numero, salarioBase);
        this.salidasPorDia = salidasPorDia;
        this.celularAsignado = celularAsignado;
    }

    @Override
    public String toString()
    {
        return "Repartidor{" +
                "salidasPorDia=" + salidasPorDia +
                ", celularAsignado=" + celularAsignado +
                '}';
    }

    @Override
    public double calcularSalario()
    {
        ///Ademas de su salario base, se lleva 100 pesos por cada salidaPorDia.
        return this.salarioBase + 100 * this.salidasPorDia;
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

    public int getSalidasPorDia() {
        return salidasPorDia;
    }
}
