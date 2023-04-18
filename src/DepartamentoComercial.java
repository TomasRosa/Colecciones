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
                System.out.println("Marca: " + ((Vendedor) empleadito).getCelularAsignado().getMarca());
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
        ///Creo un vendedorMayor nulo, por que al principio no sabemos cual es el mayor.
        Vendedor vendedorMayor = null;
        ///Recorremos el arrayList de empleados
        for (Empleado empleadito: this.empleados)
        {
            ///Si encontramos un vendedor en el arraylist de empleados
            if(empleadito instanceof Vendedor)
            {
                ///Creamos un vendedor auxiliar con ese vendedor.
                Vendedor vendedorAux = (Vendedor) empleadito;
                ///Si el vendedorMayor es null (Es la primera vuelta), el auxiliar pasa a ser el mayor para tener un vendedor con el que comparar.
                ///O si el vendedorAux tiene mayor porcentaje de comsiion que el mayor, el vendedor aux pasa a ser el mayor.
                if(vendedorMayor == null || vendedorAux.getPorcentajeComision() > vendedorMayor.getPorcentajeComision())
                {
                    vendedorMayor = vendedorAux;
                }
            }
        }
        return vendedorMayor;
    }
    public Repartidor repartidorConMasSalidasPorDia ()
    {
        Repartidor repartidorMasSalidas = null;
        ///Recorro arraylist de empleados
        for(Empleado empleadito: this.empleados)
        {
            ///Si encuentro un repartidor lo pongo en repartidorAux para tener con que comparar
            if(empleadito instanceof Repartidor)
            {
                Repartidor repartidorAux = (Repartidor) empleadito;
                if(repartidorMasSalidas == null || repartidorAux.getSalidasPorDia() > repartidorMasSalidas.getSalidasPorDia())
                {
                    repartidorMasSalidas = repartidorAux;
                }
            }
        }
        return repartidorMasSalidas;
    }
    public Comisionista comisionistaConMenosEntregasRealizadas ()
    {
        Comisionista comisionistaMenorEntregas = null;
        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Comisionista)
            {
                Comisionista comisionistaAux = (Comisionista) empleadito;
                if(comisionistaMenorEntregas == null ||comisionistaAux.getCantidadEntregas() < comisionistaMenorEntregas.getCantidadEntregas())
                {
                    comisionistaMenorEntregas = comisionistaAux;
                }
            }
        }
        return comisionistaMenorEntregas;
    }
    public int cuantosVendedoresTienen223EnElCelu ()
    {
        int contador = 0;
        for(Empleado empleadito: this.empleados)
        {
            if(empleadito instanceof Vendedor)
            {
                String numeroString = String.valueOf(((Vendedor) empleadito).getCelularAsignado().getNumero());
                if(numeroString.startsWith("223"))
                {
                    contador++;
                }
            }
        }
        return contador;
    }
}
