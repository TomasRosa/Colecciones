import java.util.Objects;
import java.util.UUID;

public class Celular
{
    private UUID id;
    private String modelo;
    private long numero;
    private String marca;


    public Celular()
    {
        this.id = UUID.randomUUID();
    }
    public Celular (String modelo, long numero, String marca)
    {
        this.id = UUID.randomUUID();
        this.modelo = modelo;
        this.numero = numero;
        this.marca = marca;
    }
    public UUID getId()
    {
        return id;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public long getNumero()
    {
        return numero;
    }

    public void setNumero(long numero)
    {
        this.numero = numero;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    @Override
    public String toString()
    {
        return "Celular{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", numero=" + numero +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Celular celular = (Celular) o;

        return Objects.equals(id, celular.id);
    }

}
