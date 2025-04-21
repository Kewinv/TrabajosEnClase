public class App 
{
    private static int vec[]; //Declaración del arreglo
    public static void main(String[] args) throws Exception 
    {
        llenarVector();
        mostrarVector();
        int pos = busquedaSecuencial(0);
    }



    static void llenarVector()
    {
        //Dimensionar el vector
        vec = new int[100];
        //Ciclo para dimensionar el vector
        for (int i = 0; i<100;i++)
        {
            vec[i] = (int)(Math.random() * 10 + 1);
        }
    }

    static void mostrarVector()
    {  
        for(int i = 0; i < vec.length; i++)
        {
            System.out.println(vec[i]);
        }
    }

    static int busquedaSecuencial(int x)
    {
        int posicion = 0;
        return posicion;
    }

}
