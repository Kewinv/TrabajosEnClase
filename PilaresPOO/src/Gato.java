public class Gato extends Animal
{
    private String raza;

    public Gato(String animal ,int patas, int ojos, String color, double altura, String raza) 
    {
        super(animal ,patas, ojos, color, altura);
        this.raza = raza;
    }

    public String getRaza() 
    {
        return raza;
    }

    @Override
    public void hacerSonido()
    {
        System.out.println(getAnimal() + " Maulla: Miau");
    }
    
    
}
