public class Leon extends Animal implements Salvaje
{
    private double peso;

    public Leon(String nombre, int edad, TipoAnimal tipo, double peso) 
    {
        super(nombre, edad, tipo);
        this.peso = peso;
    }

    public double getPeso() 
    {
        return peso;
    }

    @Override
    public void hacerSonido()
    {
        System.out.println(getNombre() + " hace sonido: Bombardeen israel");
    }

    @Override
    public void atacar()
    {
        System.out.println(getNombre() + "¡Ataca!");
    }
    

    
}
