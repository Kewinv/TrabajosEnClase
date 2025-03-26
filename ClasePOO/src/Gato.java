public class Gato extends Animal implements Domestico
{
    private String pelaje;

    public Gato(String nombre, int edad, TipoAnimal tipo, String pelaje) 
    {
        super(nombre, edad, tipo);
        this.pelaje = pelaje;
    }

    public String getPelaje() 
    {
        return pelaje;
    }

    @Override
    public void hacerSonido()
    {
        System.out.println(getNombre() + " Maulla: Miau");
    }

    @Override
    public void jugar()
    {
        System.out.println(getNombre() + " Juega con mi palo");
    }

    

}
