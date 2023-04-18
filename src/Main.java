public class Main
{
    public static void main(String[] args)
    {
        Comisionista comi1 = new Comisionista(101, 40567890, "Juan", "Pérez", "jperez@email.com", 2234567890L, 20000, 10);
        Comisionista comi2 = new Comisionista(102, 40987654, "María", "González", "maria.gonzalez@email.com", 2212345678L, 20000, 10);
        Comisionista comi3 = new Comisionista(103, 40876543, "Pedro", "Martínez", "pedro.martinez@email.com", 2245678901L, 20000, 20);
        Comisionista comi4 = new Comisionista(104, 40456789, "Ana", "López", "ana.lopez@email.com", 2276543210L, 20000, 22);
        Comisionista comi5 = new Comisionista(105, 40345678, "Diego", "Fernández", "diego.fernandez@email.com", 2256789012L, 20000, 25);

        Celular celu1 = new Celular("Samsung", 2234567890L, "Samsung");
        Celular celu2 = new Celular("iPhone", 2235678901L, "Apple");
        Celular celu3 = new Celular("Motorola", 3456789012L, "Samsung");
        Celular celu4 = new Celular("Samsung", 2237890123L, "Google");
        Celular celu5 = new Celular("Samsung", 5678901234L, "Samsung");
        Celular celu6 = new Celular("Xiaomi", 2239012345L, "Samsung");
        Celular celu7 = new Celular("Iphone", 7890123456L, "OnePlus");
        Celular celu8 = new Celular("Samsung", 2231234567L, "Motorola");
        Celular celu9 = new Celular("Samsung", 2232345678L, "Asus");
        Celular celu10 = new Celular("Nokia", 1234567890L, "Nokia");

        Vendedor vendedor1 = new Vendedor(100, 30500123, "María", "Juncales", "mgonzalez@example.com", 1144556677, 25000, 10,celu1 );
        Vendedor vendedor2 = new Vendedor(101, 40500234, "Pedro", "Trigueros", "pmartinez@example.com", 1155667788, 25000, 12,celu2 );
        Vendedor vendedor3 = new Vendedor(102, 30500123, "Benjamin", "Pérez", "jperez@example.com", 1133445566, 25000, 4,celu3 );
        Vendedor vendedor4 = new Vendedor(103, 40500234, "Lucía", "García", "lgarcia@example.com", 1155778899, 25000, 3,celu4 );
        Vendedor vendedor5 = new Vendedor(104, 40500234, "Lucas", "Fernández", "lfernandez@example.com", 1166889900, 25000, 8,celu5);

        Repartidor repartidor1 = new Repartidor(1001, 37123456, "Juan", "Iturraspe", "jperez@example.com", 1165879854, 20000, 2,celu6);
        Repartidor repartidor2 = new Repartidor(1002, 40123456, "María", "De Los Angeles", "mgonzalez@example.com", 1145678901, 20000, 3,celu7);
        Repartidor repartidor3 = new Repartidor(1003, 42123456, "Pedro", "Rodríguez", "prodriguez@example.com", 1167890123, 20000, 6,celu8);
        Repartidor repartidor4 = new Repartidor(1004, 45123456, "Carla", "Giménez", "cgimenez@example.com", 1145678901, 20000, 8,celu9);
        Repartidor repartidor5 = new Repartidor(1005, 48123456, "Luis", "López", "llopez@example.com", 1167890123, 20000, 3,celu10);

        DepartamentoComercial oficina = new DepartamentoComercial();
        oficina.empleados.add(comi1);
        oficina.empleados.add(vendedor1);
        oficina.empleados.add(repartidor1);
        oficina.empleados.add(comi2);
        oficina.empleados.add(vendedor2);
        oficina.empleados.add(repartidor2);
        oficina.empleados.add(comi3);
        oficina.empleados.add(vendedor3);
        oficina.empleados.add(repartidor3);
        oficina.empleados.add(comi4);
        oficina.empleados.add(vendedor4);
        oficina.empleados.add(repartidor4);
        oficina.empleados.add(comi5);
        oficina.empleados.add(vendedor5);
        oficina.empleados.add(repartidor5);

        int cuantosRepartidoresSuperan5SalidasDiarias = oficina.contarMas5SalidasDiariasRepartidores();
        ///Tiene que retornar 2.
        System.out.println("Cant repartidores con mas de 5 salidas diarias: " + cuantosRepartidoresSuperan5SalidasDiarias);
        int cuantosVendedoresTienenPorcentajeDeVentaMenorAl5 = oficina.contarVendedoresPorcentajeMenorAl5();
        ///Tiene que retornar 2
        System.out.println("Cant vendedores con menos de 5% de porcentaje de venta: " + cuantosVendedoresTienenPorcentajeDeVentaMenorAl5);
        ///Tiene que retornar 3
        int cuantosComisionistasAlcanzaronVeinteEntregas = oficina.contarCuantosComisionistasLlegaronA20Entregas();
        System.out.println("Cant comisionistas con al menos 20 entregas: " + cuantosComisionistasAlcanzaronVeinteEntregas);
        ///Tiene que retornar 4
        int cuantosCelularesSonSamsung = oficina.cuantosVendedoresTienenCelularesSamsung();
        System.out.println("Cant vendedores con celulares samsung: " + cuantosCelularesSonSamsung);
        ///Tiene que decir Pedro Trigueros
        Vendedor mayor = oficina.vendedorConMayorPorcentajeDeVenta();
        System.out.println("Vendedor con mayor porcentaje de venta: " + mayor.nombre + " " + mayor.apellido);
        ///Tiene que decir Carla Gimenez
        Repartidor masSalidas = oficina.repartidorConMasSalidasPorDia();
        System.out.println("Repartidor con mas salidas por dia: " + masSalidas.nombre + " " + masSalidas.apellido);
        ///Juan Perez o Maria Gonzalez, seguro el primero.
        Comisionista menosEntregas = oficina.comisionistaConMenosEntregasRealizadas();
        System.out.println("El comisionista con menos entregas realizadas por dia: " + menosEntregas.nombre + " " + menosEntregas.apellido);
        ///Tiene que retornar 3.
        int cantVendedores223 = oficina.cuantosVendedoresTienen223EnElCelu();
        System.out.println("Cant vendedores con caracteristica 223: " + cantVendedores223);
    }
}