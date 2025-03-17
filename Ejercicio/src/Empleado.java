public class Empleado 
{
    private String nom;
    private int nht;
    private double costoHora;
    //Constructor vacio
    public Empleado() 
    {

    }
    //Constructor sobrecargado
    public Empleado(String x, int y, double z) 
    {
        nom = x;
        nht = y;
        costoHora = z;
    }
   //Metodos de carga 

    public void setNom(String nom) 
    {
        this.nom = nom;
    }

    public void setNht(int nht) 
    {
        this.nht = nht;
    }

    public void setCostoHora(double costoHora) 
    {
        this.costoHora = costoHora;
    }
     //Metodos de acceso 

    public String getNom() 
    {
        return nom;
    }

    public int getNht() 
    {
        return nht;
    }

    public double getCostoHora() 
    {
        return costoHora;
    }
    //Metodo analizador
    public double calcularSalario()
    {
        double salario = nht*costoHora;
        return salario;
    }    
}


