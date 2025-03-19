public abstract class Animal 
{
    private String animal;
    private int patas;
    private int ojos;
    private String color;
    private double altura;

    public Animal(String animal, int patas, int ojos, String color, double altura)
    {
        this.animal = animal;
        this.patas = patas;
        this.ojos = ojos;
        this.color = color;
        this.altura = altura;
    }

    //Metodos getters and setters

    public String getAnimal() 
    {
        return animal;
    }

    public int getPatas() 
    {
        return patas;
    }

    public int getOjos() {
        return ojos;
    }

    public String getColor() 
    {
        return color;
    }

    public double getAltura() 
    {
        return altura;
    }
    
    //Acciones

    public void mostrarInfo()
    {
        System.out.println("Animal: " + animal + "\nnumero de patas: " + patas + "\nEl animal tiene " + ojos + " Ojos\nEs de color " + color + " Y mide " + altura + " cm");
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               

    public void correr()
    {
        System.out.println("El animal esta avanzando");
    }

    public void frenar()
    {
        System.out.println("El animal esta frenando");
    }

    public void atacar()
    {
        System.out.println("El animal esta atacando");
    }

    //Metodo abstracto que cada animal implementará
    public abstract void hacerSonido();


}
