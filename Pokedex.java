class Pokedex{
String nombre;
Integer contAgua=0,contFuego=0,contDragon=0,contPlanta=0,contElectrico=0,contRoca=0,contVolador=0;
static Integer cpokede=0;
Integer cpokcap=0;
public void Pokedex(){
Pokedex.cpokede+=1;
}
void Pokedex(String nombre){
this.nombre=nombre;
Pokedex.cpokede+=1;
}
Double mediaPokemon(){
    return Double.parseDouble(String.valueOf(this.cpokcap/Pokedex.cpokede));
}
void IntercambiarPokemon(Pokemon liberar,Pokemon cambio){
    this.liberarPokemon(liberar);
    this.capturarPokemon(cambio);
}


void reiniciarPokedex(){
this.contAgua=0;
this.contFuego=0;
this.contDragon=0;
this.contPlanta=0;
this.contElectrico=0;
this.contRoca=0;
this.contVolador=0;
this.cpokcap=0;
}
void mostrarPokedex(){
System.out.println("======POKEDEX "+this.nombre+" =====");
System.out.println("Pokemons Agua: "+this.contAgua+"\nPokemons Fuego: "+this.contFuego+"\nPokemons Dragon: "+this.contDragon+"\nPokemons Planta: "+this.contPlanta+"\nPokemons Electrico: "+this.contElectrico+"\nPokemons Roca: "+this.contRoca+"\nPokemons Volador: "+this.contVolador+"\nTotal: "+this.cpokcap);
System.out.println("======POKEDEX "+this.nombre+" =====");
}
void capturarPokemon(Pokemon p){
    if(p.getTipo()==tipoPokemon.agua){
this.contAgua+=1;
}else if(p.getTipo()==tipoPokemon.fuego){
    this.contFuego+=1;
}else if(p.getTipo()==tipoPokemon.dragon){
    this.contDragon+=1;
}else if(p.getTipo()==tipoPokemon.planta){
    this.contPlanta+=1;
}else if(p.getTipo()==tipoPokemon.electrico){
    this.contElectrico+=1;
}else if(p.getTipo()==tipoPokemon.roca){
    this.contRoca+=1;
}else if(p.getTipo()==tipoPokemon.volador){
    this.contVolador+=1;
}else{
    System.out.print("No se puede capturar pokemon sin tipo");
}
this.cpokcap+=1;
}
void liberarPokemon(Pokemon p){
if(p.getTipo()==tipoPokemon.agua){
this.contAgua--;
}else if(p.getTipo()==tipoPokemon.fuego){
    this.contFuego--;
}else if(p.getTipo()==tipoPokemon.dragon){
    this.contDragon--;
}else if(p.getTipo()==tipoPokemon.planta){
    this.contPlanta--;
}else if(p.getTipo()==tipoPokemon.electrico){
    this.contElectrico--;
}else if(p.getTipo()==tipoPokemon.roca){
    this.contRoca--;
}else if(p.getTipo()==tipoPokemon.volador){
    this.contVolador--;
}else{
    System.out.print("No se puede capturar pokemon sin tipo");
}
this.cpokcap--;
}

    //Start GetterSetterExtension Code
    /**Getter method cpokede*/
    public Integer getCpokede(){
        return this.cpokede;
    }//end method getCpokede

    //End GetterSetterExtension Code
//!
}