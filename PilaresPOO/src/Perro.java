public class Perro extends Animal
{
    private String raza;

    public Perro(String animal, int patas, int ojos, String color, double altura, String raza) 
    {
        super(animal, patas, ojos, color, altura);
        this.raza = raza;
    }

    public String getRaza() 
    {
        return raza;
    }
    
    //Implementamos metodo abstracto
    @Override
    public void hacerSonido()
    {
        System.out.println(getAnimal() + " Ladra: ¡Woof!");
    }

    
}
