public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Perro perro = new Perro("Princesa", 8,  "Chihuaha");

        perro.mostarInfo();
        perro.hacerSonido();
        perro.jugar();
    }
}
