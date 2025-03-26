public class Perro extends Animal implements Domestico
{
    private String raza;

    public Perro(String nombre, int edad, String raza) 
    {
        super(nombre, edad, TipoAnimal.MAMIFERO);
        this.raza = raza;
    }

    public String getRaza() 
    {
        return raza;
    }
    
    @Override
    public void hacerSonido()
    {
        System.out.println(getNombre() + " ladra: ¡Woof!");
    }

    @Override
    public void jugar()
    {
        System.out.println(getNombre() + " Juega con mis pelotas");
    }
}


