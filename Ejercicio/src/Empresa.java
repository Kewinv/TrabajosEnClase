
public class Empresa
{

    private static Empleado vecEmp[];
    private static int n; 
    public static void main(String[] args) throws Exception 
    {
       //Invocar todos los metodos estaticos para solucionar el problema

       ingresarEmpleado();
       nomina();
       Consola.imprimir("\nEl salario promedio es: $" + salarioProm());
       Consola.imprimir("\nEl porcentaje de empleados que trabajaron mas de 40 horas es: " + porcEM40h() + "%");
       
       
    }

    public static void ingresarEmpleado()
    {  
        Consola.imprimir("Ingrese la cantidad de empleados: ");
        n = Consola.leerEntero();
        //Reservar memoria (Dimensionar el vector)
        vecEmp = new Empleado[n];
        //Llenar el vector (Ingresar datos)
        for (int i = 0; i <n; i++)
        {
            vecEmp[i] = new Empleado();
            Consola.imprimir("\nEmpleado #" + (i + 1));
            Consola.imprimir("\n\tDigite el nombre del empleado: ");
            vecEmp[i].setNom(Consola.leerTexto());

            Consola.imprimir("\tDigite el numero de horas trabajadas: ");
            vecEmp[i].setNht(Consola.leerEntero());

            Consola.imprimir("\tDigite el costo de la hora: ");
            vecEmp[i].setCostoHora(Consola.leerReal());
        }
        
    }

    public static void nomina()
    {
        Consola.imprimir("NOMBRE DEL EMPLEADO\t\t\t\t\t\t SALARIO\n");
        for (int i = 0; i <n; i++)
        {
            Consola.imprimirLn(vecEmp[i].getNom() + "\t\t\t\t\t\t\t" + vecEmp[i].calcularSalario());
        }

    }

    public static double salarioProm()
    {
        double sueldoProm , sumaSalarios = 0;
        for (int i = 0; i <n; i++)
        {
            sumaSalarios += vecEmp[i].calcularSalario();
        }
        sueldoProm = (sumaSalarios / n);
        return sueldoProm;
    }

    public static double porcEM40h()
    {
        double porc , contadorEm40 = 0;
        for (int i = 0; i <n; i++)
        {
            if(vecEmp[i].getNht()>40)
            {
                contadorEm40++;
            }
        }
        porc = (contadorEm40 / n * 100);
        return porc;
       
    }

    public static void empleadosConMayorSalario()
    {
        //Primer recorrido del vector: hallar el mayor salario
        double mayor = -1;

        for(int i = 0 ; i<n ; i= i+1)
        {
            if(vecEmp[i].calcularSalario() > mayor)
            {
                mayor = vecEmp[i].calcularSalario();
            }
        }

        //Segundo recorrido: Mostrar los nombres
        Consola.imprimir("El mayor es: $ " + mayor + " Y lo devengan los siguientes empleados");

        int i =0;
        while(i <n )
        {
            if(vecEmp[i].calcularSalario() == mayor)
            {
                Consola.imprimirLn(vecEmp[i].getNom());
            }
            i=i+1;
        }


        
    }
}
