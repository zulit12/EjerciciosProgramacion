package paqueteZulit.Ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JOptionPane;

public class DateCalendar {
	
	
	private static void formateoFecha () {
		
		String fecha = JOptionPane.showInputDialog("Inserte la decha con el siguiente formato: dd/MM/yyyy HH:mm:ss");
		Date fechaParseada = null;
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
		
		try {
			fechaParseada = sdf.parse(fecha);
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		System.out.println("Fecha que el usuario ha introducido: " + fecha);
		System.out.println("Fecha parseada: " + fechaParseada);

	}
	
	private static void obtencionDeCampos() {
		
		String fecha = JOptionPane.showInputDialog("Inserte la fecha con el siguiente formato: dd/MM/yyyy HH:mm:ss");
		Date fechaParseada = null;
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		
		
		try {		
			fechaParseada = sdf.parse(fecha);
			calendar.setTime(fechaParseada);
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		System.out.println("Fecha que el usuario ha introducido: " + fecha);

		//Año
		System.out.println("(Calendar)Año: " + calendar.get(Calendar.YEAR));
		System.out.println("(Date)Año: " + new SimpleDateFormat("yyyy").format(fechaParseada));
		
		//Mes
		System.out.println("(Calendar)Mes: " + calendar.get(Calendar.MONTH + 1));
		System.out.println("(Date)Mes: " + new SimpleDateFormat("MM").format(fechaParseada));
		
		//Dia
		System.out.println("(Calendar)Dia: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("(Date)Dia: " + new SimpleDateFormat("dd").format(fechaParseada));
		
		//Hora
		System.out.println("(Calendar)Hora: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("(Date)Hora: " + new SimpleDateFormat("HH").format(fechaParseada));
		
		//Minutos
		System.out.println("(Calendar)Minutos: " + calendar.get(Calendar.MINUTE));
		System.out.println("(Date)Minutos: " + new SimpleDateFormat("mm").format(fechaParseada));
		
		//Segundos
		System.out.println("(Calendar)Segundos: " + calendar.get(Calendar.SECOND));
		System.out.println("(Date)Año: " + new SimpleDateFormat("ss").format(fechaParseada));
		
	}
	
	
	private static void nuevasFechas() {
		
		String fecha = JOptionPane.showInputDialog("Inserte la decha con el siguiente formato: dd/MM/yyyy HH:mm:ss");
		Date fechaParseada = null;
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		
		
		try {
			fechaParseada = sdf.parse(fecha);
			calendar.setTime(fechaParseada);
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		System.out.println("Fecha que el usuario ha introducido: " + fecha);
		System.out.println("Fecha parseada: " + fechaParseada);

		//Añadir tres dias
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Ahora mas 3 dias : " + calendar.getTime());
		
		//Restar 2 semanas
		calendar.add(Calendar.WEEK_OF_MONTH, 2);
		System.out.println("Ahora menos 2 semanas : " + calendar.getTime());
		
		//Suñar 300 dias
		calendar.add(Calendar.DAY_OF_MONTH, 300);
		System.out.println("Ahora mas 300 dias : " + calendar.getTime());
		
		//Sumar 4 años
		calendar.add(Calendar.YEAR, 4);
		System.out.println("Ahora mas 4 años : " + calendar.getTime());
		
	}
	
	private static void restarZonaHorarias () {
	
		Calendar ahoraEnRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		Calendar ahoraEnSidney = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
		
		System.out.println("Hora Roma: " + ahoraEnRoma.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora Sidney: " + ahoraEnSidney.get(Calendar.HOUR_OF_DAY));
		
		int diferenciaRomaSidney = ahoraEnSidney.get(Calendar.HOUR_OF_DAY) - ahoraEnRoma.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("Diferencia Horaria Entre Roma y Sydney: " + diferenciaRomaSidney);
	}
	
	public static void main(String[] args) {
		
		//formateoFecha();
		//restarZonaHorarias();	
		//obtencionDeCampos();
		nuevasFechas();
		
	}

}
