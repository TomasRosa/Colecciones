import java.util.ArrayList;
import java.util.UUID;

public class DepartamentoComercial
{
    private UUID codigoDepto = UUID.randomUUID();
    ArrayList<Empleado> empleados;

    public DepartamentoComercial()
    {
        this.empleados = new ArrayList<Empleado>();
    }
    public void mostrarToString()
    {
        System.out.println("Codigo Departamento: " + this.codigoDepto);
        for(Empleado empleadito: empleados)
        {
            System.out.println(empleadito.toString());
        }
    }
    public void aplicarAumentos (int aumento)
    {
        System.out.println("Aplicando aumento a empleados.");
        for(Empleado empleadito: empleados)
        {
            empleadito.setSalarioBase(empleadito.getSalarioBase()+aumento);
        }
    }
    public int obtenerCantidadVendedores ()
    {
        int contarVendedores = 0;
        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Vendedor)
            {
                contarVendedores++;
            }
        }
        return contarVendedores;
    }
    public int obtenerCantidadComisionistas ()
    {
        int contarComisionistas = 0;
        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Comisionista)
            {
                contarComisionistas++;
            }
        }
        return contarComisionistas;
    }
    public int obtenerCantidadRepartidores ()
    {
        int contarRepartidores = 0;
        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Repartidor)
            {
                contarRepartidores++;
            }
        }
        return contarRepartidores;
    }
    public int contarMas5SalidasDiariasRepartidores ()
    {
        int salidasDiarias = 0;
        int contadorRetornar = 0;

        for (Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Repartidor)
            {
                salidasDiarias = ((Repartidor) empleadito).getSalidasPorDia();
                if(salidasDiarias > 5)
                {
                    contadorRetornar++;
                }
            }
        }
        return contadorRetornar;
    }
    public int contarVendedoresPorcentajeMenorAl5 ()
    {
        float menorA5 = 0;
        int contadorRetornar = 0;

        for (Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof  Vendedor)
            {
                menorA5 = ((Vendedor) empleadito).getPorcentajeComision();
                if(menorA5 < 5)
                {
                    contadorRetornar++;
                }
            }
        }
        return contadorRetornar;
    }
    public int contarCuantosComisionistasLlegaronA20Entregas ()
    {
        float llegaron = 0;
        int contadorRetornar = 0;

        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof  Comisionista)
            {
                llegaron = ((Comisionista) empleadito).getCantidadEntregas();
                if(llegaron >= 20)
                {
                    contadorRetornar++;
                }
            }
        }
        return contadorRetornar;
    }
    public int cuantosVendedoresTienenCelularesSamsung ()
    {
        int contadorRetornar = 0;

        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Vendedor)
            {
                if(((Vendedor) empleadito).getCelularAsignado().getMarca().equals("Samsung"))
                {
                    contadorRetornar++;
                }
            }
        }
        return contadorRetornar;
    }
    public Vendedor vendedorConMayorPorcentajeDeVenta ()
    {
        Vendedor vendedorAux;
        Vendedor vendedorMayor = new Vendedor();

        for (Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Vendedor)
            {
                vendedorAux = new Vendedor(empleadito.legajo,empleadito.dni,empleadito.nombre,empleadito.apellido,empleadito.email,empleadito.numero,empleadito.salarioBase,((Vendedor) empleadito).getPorcentajeComision(),((Vendedor) empleadito).getCelularAsignado());
                if(((Vendedor) empleadito).getPorcentajeComision() > vendedorAux.getPorcentajeComision())
                {
                    vendedorMayor = new Vendedor(empleadito.legajo,empleadito.dni,empleadito.nombre,empleadito.apellido,empleadito.email,empleadito.numero,empleadito.salarioBase,((Vendedor) empleadito).getPorcentajeComision(),((Vendedor) empleadito).getCelularAsignado());
                }
            }
        }
        return vendedorMayor;
    }
    public int cuantosVendedoresTienen223EnElCelu ()
    {
        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Vendedor)
            {

            }
        }
    }
}
