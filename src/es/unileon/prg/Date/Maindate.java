package es.unileon.prg.Date;

public class Maindate {

	public static void main (String [] args) {
		Date today, tomorrow;
		
		today= new Date(10,10,2020);
		tomorrow = new Date (12,12,2020);

		System.out.println("El dia es (igual.true  distinto-false)" + today.isSameDay(tomorrow));
		System.out.println("Dia today: " + today.getDay() +" Dia tomorrow: "+ tomorrow.getDay());
		System.out.println("El mes es (igual.true  distinto-false)" + today.isSameMonth(tomorrow));
		System.out.println("Mes today: " + today.getMonth() +" Mes tomorrow: "+ tomorrow.getMonth());
		System.out.println("El ano es (igual.true  distinto-false)" + today.isSameYear(tomorrow));
		System.out.println("Año today: " + today.getYear() +" Año tomorrow: "+ tomorrow.getYear());

	}
}
