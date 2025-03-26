public abstract class Animal 
{
    private String nombre;
    private int edad;
    private TipoAnimal tipo;

    public Animal(String nombre, int edad, TipoAnimal tipo) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public int getEdad() 
    {
        return edad;
    }

    public TipoAnimal getTipo() 
    {
        return tipo;
    }

    public abstract void hacerSonido();

    public void mostarInfo()
    {
        System.out.println(nombre + " tiene " + edad + " años y es un " + tipo);
    }
    
    

}
