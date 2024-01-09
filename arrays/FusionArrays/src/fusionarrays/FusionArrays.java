package fusionarrays;

/**
 *
 * @author Fernando Cuatro
 */
public class FusionArrays {

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) {
  int[] a = {1,2,3,4,5};
  int[] b = {6,7,8,9,10};
  
  int[] c = new int[a.length + b.length];
  
  for(int i = 0; i < a.length; i++)
  {
   c[i] = a[i];
  }
  
  for(int i = a.length, j = 0; i < c.length; i++, j++)
  {
   c[i] = b[j];
  }
  
  mostrarArray(c);
 }

 public static void mostrarArray(int[] array){
  for (int i : array)
  {
   System.out.println(i);
  }
 }
 
}