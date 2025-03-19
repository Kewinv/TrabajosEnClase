public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Animal perro = new Perro("Princesa", 4, 2, "Blanco y cafe", 40, "Pinche");

        perro.mostrarInfo();
        perro.hacerSonido();
    }
}
