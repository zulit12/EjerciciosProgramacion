package paqueteZulit.Ejercicios.Primeros_Objetos;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		CromoBaloncesto cb1 = new CromoBaloncesto(" Stech", 210, 150, 900);
        CromoBaloncesto cb2 = new CromoBaloncesto(" Er Pepe", 200, 120, 800);
        CromoBaloncesto cb3 = new CromoBaloncesto(" Delaossa", 189, 90, 1900);
        CromoBaloncesto cb4 = new CromoBaloncesto(" Zatu", 195, 110, 1500);
        CromoBaloncesto cb5 = new CromoBaloncesto(" Manzanita", 170, 85, 1700);


        List<CromoBaloncesto>lista = new ArrayList <CromoBaloncesto>();
        lista.add(cb1); lista.add(cb2); lista.add(cb3); lista.add(cb4); lista.add(cb5);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
        
        BurbujaColObj(lista);
        System.out.println("\n" + "Ahora la lista ordenada" + "\n");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
       
	}
	
	
	public static void BurbujaColObj(List<CromoBaloncesto> lista) {
	    CromoBaloncesto aux;
	    for(int i = 0;i < lista.size()-1;i++){
	        for(int j = 0;j < lista.size()-i-1;j++){
	            // El if de abajo va a determinar si el primero es menor que el segundo
	            // y si es true, se va a realizar el swap con una variable aux para
	            // mover los objetos del array
	            if(lista.get(j+1).getPuntosMediosPorpartido() <  lista.get(j).getPuntosMediosPorpartido()){
	                aux = lista.get(j+1);
	                lista.set(j+1,lista.get(j));
	                lista.set(j,aux);
	            }
	        }
	    }
	}
	
	

}
