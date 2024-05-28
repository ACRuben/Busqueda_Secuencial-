package busquedasecuencial;
import java.util.*;
public class Busquedas
{
    int i,buscar,cot;
    int vec[];
    Scanner cp=new Scanner(System.in);
    Random ran=new Random();
    
    public int vector()
    {
       vec=new int[80]; 
       for(i=1;i<79;i++)
       {
       vec[i]=ran.nextInt(100)+1;
       }
        for(i=1;i<79;i++)
        {
            System.out.println("\t"+vec[i]);
        }
        return 0;
    } 
    public void busqueda()
    {
        cot=0;
        System.out.print("Ingrese el numero a buscar=>");
        buscar=cp.nextInt();
        for(i=0;i<vec.length;i++)
        {
        if(buscar==vec[i])
        {
            System.out.println("El numero que busca esta en la pocision=>"+i);
            cot=1;
        }
      }
        if(buscar!=vec[i])
        {
            System.out.println("El numero que busca no esta en el vector");
        }
    }
   
}
