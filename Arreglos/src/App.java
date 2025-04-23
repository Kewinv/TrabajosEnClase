public class App 
{
    private static int vec[]; //Declaración del arreglo
    public static void main(String[] args) throws Exception 
    {
     final String CYAN = "\u001B[36m";
     final String GREEN="\033[32m";
     final String RED="\033[31m";
     final String RESET = "\u001B[0m";
        boolean sw = false; //Indica que el vector esta vacio
        int opcion = 0;
        do
        {
            Consola.imprimirLn("\n--------------------------------------------------------------------------------------------------------------------------------");
            Consola.imprimirLn(GREEN+ " \t\t\tMENU" + RESET);
            Consola.imprimirLn("1. Llenar el vector con numeros aleatorios\n2. Mostrar el vector\n3. Buscar un elemento\n4. Mostrar la cantidad de veces que se repite un numero\n5. Finalizar");
            System.out.println("¿Cual es su opción?");
            opcion = Consola.leerEntero();
            if(opcion <=0 || opcion >5) //El "or" en java es con " || "
            {
                System.out.println(RED + "Numero no permitido, ingresa de nuevo" + RESET);
            }else{
                switch (opcion) 
                {
                    case 1:
                        llenarVector();
                        Consola.imprimirLn("El vector se ha llenado");
                        sw = true;
                        break;
                        

                    case 2:
                    if(!sw)
                    { 
                        System.out.println(CYAN+ "No hay datos para mostrar" + RESET);
                        break;
                    }
                    else
                    {
                        mostrarVector();
                    }
                        
                        
                    case 3:
                    if(!sw){System.out.println(CYAN + "No hay datos para mostrar" + RESET); break;}
                    else
                    {
                        Consola.imprimirLn("Ingrese el dato a buscar");
                        int dato = Consola.leerEntero();
                        int pos = busquedaSecuencial(dato);
                        if(pos == -1){System.out.println(RED+"El dato no existe"+RESET);}
                        else{System.out.println("El dato fue hallado por primera vez en la posicion " + pos);}
                        break;
                    }
                        
                        
                
                    default:
                        break;
                }
            }
            
           
            

        }while(opcion != 5);
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
            System.out.print(vec[i]+" ");
        }
    }

    static int busquedaSecuencial(int x)
    {
        int posicion = -1; //Para indicar que el dato no existe
        int i = 0; // Para recorrer el vector
        while (i < vec.length && posicion == -1)
        {
            if(vec[i] == x){posicion = i;}
            else{i++;}    
        }
        return posicion;
    }

}
