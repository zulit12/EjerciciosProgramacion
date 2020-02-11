package Tema6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.JOptionPane;

public class EjercicioFechas {


	public void pedirFecha () {
		String str = JOptionPane.showInputDialog("Introduzca una fecha : dd/MM/yyyy HH:mm:ss");

		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		Date fechaParseada = null;

		try {
			fechaParseada = sdf.parse(str);
		}
		 catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
			
		Calendar fechaCalendar = Calendar.getInstance();
		fechaCalendar.set(Calendar.YEAR, fechaParseada.getYear());
		fechaCalendar.set(Calendar.MONTH, fechaParseada.getMonth());
		fechaCalendar.set(Calendar.DAY_OF_MONTH, fechaParseada.getDay());
		fechaCalendar.set(Calendar.HOUR, fechaParseada.getHours());
		fechaCalendar.set(Calendar.MINUTE, fechaParseada.getMinutes());
		fechaCalendar.set(Calendar.SECOND, fechaParseada.getSeconds());


		System.out.println("Dia del mes :" + fechaCalendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mes :" + (fechaCalendar.get(Calendar.MONTH)+1));
		System.out.println("Año :" + fechaCalendar.get(Calendar.YEAR));
		System.out.println("Hora del dia :" + fechaCalendar.get(Calendar.HOUR));
		System.out.println("Minutos de las horas :" + fechaCalendar.get(Calendar.MINUTE));
		System.out.println("Segundos de los minutos :" + fechaCalendar.get(Calendar.SECOND));
		
		Calendar fechaModificada = Calendar.getInstance();
		
		fechaModificada.set(Calendar.YEAR, fechaParseada.getYear());
		fechaModificada.set(Calendar.MONTH, fechaParseada.getMonth());
		fechaModificada.set(Calendar.DAY_OF_MONTH, fechaParseada.getDay());
		fechaModificada.set(Calendar.HOUR, fechaParseada.getHours());
		fechaModificada.set(Calendar.MINUTE, fechaParseada.getMinutes());
		fechaModificada.set(Calendar.SECOND, fechaParseada.getSeconds());
		
		System.out.println("Sumando 3 dias a tu fecha");
		fechaModificada.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Fecha antes de sumar 3 dias :" + fechaCalendar.getTime());
		System.out.println("Fecha tras sumar 3 dias :" + fechaModificada.getTime() + "\n");
		

		
		System.out.println("Restando 2 semanas a tu fecha"  );
		
		fechaModificada.set(Calendar.YEAR, fechaParseada.getYear());
		fechaModificada.set(Calendar.MONTH, fechaParseada.getMonth());
		fechaModificada.set(Calendar.DAY_OF_MONTH, fechaParseada.getDay());
		fechaModificada.set(Calendar.HOUR, fechaParseada.getHours());
		fechaModificada.set(Calendar.MINUTE, fechaParseada.getMinutes());
		fechaModificada.set(Calendar.SECOND, fechaParseada.getSeconds());
		
		fechaModificada.add(Calendar.DAY_OF_MONTH, -14);
		System.out.println("Fecha antes de restar 2 semanas :" + fechaCalendar.getTime());
		System.out.println("Fecha tras tras restar 2 semanas :" + fechaModificada.getTime() + "\n");
		
		
		
		System.out.println("Sumando 300 dias a tu fecha"  );
		
		fechaModificada.set(Calendar.YEAR, fechaParseada.getYear());
		fechaModificada.set(Calendar.MONTH, fechaParseada.getMonth());
		fechaModificada.set(Calendar.DAY_OF_MONTH, fechaParseada.getDay());
		fechaModificada.set(Calendar.HOUR, fechaParseada.getHours());
		fechaModificada.set(Calendar.MINUTE, fechaParseada.getMinutes());
		fechaModificada.set(Calendar.SECOND, fechaParseada.getSeconds());
		
		fechaModificada.add(Calendar.DAY_OF_MONTH, 300);
		System.out.println("Fecha antes sumar 300 dias :" + fechaCalendar.getTime());
		System.out.println("Fecha tras sumar 300 dias :" + fechaModificada.getTime() + "\n");
		

		
		
		System.out.println("Sumando 4 años a tu fecha"  );
		
		fechaModificada.set(Calendar.YEAR, fechaParseada.getYear());
		fechaModificada.set(Calendar.MONTH, fechaParseada.getMonth());
		fechaModificada.set(Calendar.DAY_OF_MONTH, fechaParseada.getDay());
		fechaModificada.set(Calendar.HOUR, fechaParseada.getHours());
		fechaModificada.set(Calendar.MINUTE, fechaParseada.getMinutes());
		fechaModificada.set(Calendar.SECOND, fechaParseada.getSeconds());
		
		fechaModificada.add(Calendar.YEAR, 4);
		System.out.println("Fecha antes de sumar 4 años :" + fechaCalendar.getTime());
		System.out.println("Fecha tras sumar 4 años :" + fechaModificada.getTime() + "\n");

		
		
}
	
	
	private void zonasHorarias() {
		Calendar ahoraEnItalia = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		Calendar ahoraEnSydney = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
		int diferenciaHoraria = 0;
		System.out.println("Hora en Italia :" + ahoraEnItalia.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora Sydney :" + ahoraEnSydney.get(Calendar.HOUR_OF_DAY));
		diferenciaHoraria = ahoraEnItalia.get(Calendar.HOUR_OF_DAY) - ahoraEnSydney.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("diferencia horaria entre italia y sydney : " + diferenciaHoraria);
	}







public static void main(String[] args) {


	EjercicioFechas f = new EjercicioFechas();
	//f.pedirFecha();
	f.zonasHorarias();
}



}
