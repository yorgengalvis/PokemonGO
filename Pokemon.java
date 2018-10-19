
public class Pokemon
{
    String nombre;
    tipoPokemon tipo;
    String descripcion;

    void Pokemon(){
    }
    void Pokemon(String nombre,tipoPokemon tipo,String descripcion){
        this.nombre=nombre;
        this.tipo=tipo;
        this.descripcion=descripcion;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public tipoPokemon getTipo(){
        return this.tipo;
    }
    public void setTipo(tipoPokemon tipo){
        this.tipo = tipo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
