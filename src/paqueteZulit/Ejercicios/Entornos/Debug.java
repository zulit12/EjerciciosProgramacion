package paqueteZulit.Ejercicios.Entornos;

public class Debug {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

            // TODO Auto-generated method stub
            //declaramos array a invertir y la variable que nos va a servir para
            //intercambiar los valores del array/

            int array[] = {1,2,3,4,5,6,7,8,9};
            int aux=0;
            // imprimimos array para comprobar
            int longitud=array.length;
            for (int i = 0; i < longitud; i++)
             System.out.print(array[i] + " ");
            // invertimos array recorriéndolo hasta la mitad e intercambiando valores
            for(int i = 0; i <= longitud/2; i++){

            aux = array[i];

            array[i] = array[array.length-1-i];

            array[longitud-1-i] = aux;

             }
            // comprobamos que se ha invertido el array
            System.out.println();
            for (int i = 0; i < longitud; i++)
             System.out.print(array[i] + " ");
            }
            
}
