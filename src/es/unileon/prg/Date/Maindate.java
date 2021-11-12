package es.unileon.prg.Date;

public class Maindate {

	public static void main (String [] args) {
		Date today = null, tomorrow = null;
		try{	
		today= new Date(24,3,2022);
		tomorrow = new Date (12,1,2020);
		}
		catch(DateException exception){
			System.err.println("Los datos introducidos son incorrectos");
		}

		System.out.println("El dia es igual: " + today.isSameDay(tomorrow));
		System.out.println("Dia today: " + today.getDay() +"   Dia tomorrow: "+ tomorrow.getDay());
		System.out.println("El mes es igual: " + today.isSameMonth(tomorrow));
		System.out.println("Mes today: " + today.getMonth() +"   Mes tomorrow: "+ tomorrow.getMonth());
		System.out.println("El ano es igual: " + today.isSameYear(tomorrow));
		System.out.println("Año today: " + today.getYear() +"   Año tomorrow: "+ tomorrow.getYear());
		System.out.println("El dia mes y año son iguales:  " + today.isSame(tomorrow,tomorrow,tomorrow));
		System.out.println("Mes today: " + today.nombreMes(today.getMonth()));
		System.out.println("Mes tomorow: " + tomorrow.nombreMes(tomorrow.getMonth()));
		System.out.println("La fecha es: " + today.getDay() +"/"+ today.getMonth() +"/"+ today.getYear()+"    "+ today.getDay()+ " de "+ today.nombreMes(today.getMonth()) + " del año "+ today.getYear());
		System.out.println("La fecha es: " + tomorrow.getDay() +"/"+ tomorrow.getMonth() +"/"+ tomorrow.getYear()+"    "+ tomorrow.getDay()+ " de "+ tomorrow.nombreMes(tomorrow.getMonth()) + " del año "+ tomorrow.getYear());
		System.out.println("La estación de today es: " + today.nombreEstacion(today));
		System.out.println("La estación de tomorrow es: " + tomorrow.nombreEstacion(tomorrow));
		System.out.println("El dia del mes de today es correcto: " + today.comprobarDia());
		System.out.println("El dia del mes de tomorrow es correcto: " + tomorrow.comprobarDia());
		System.out.println("Faltan " + today.mesesfaltan(today) + " meses para que se acabe el año");
		System.out.println("Faltan " + tomorrow.mesesfaltan(tomorrow) + " meses para que se acabe el año");
		System.out.println(today.toStringLet()+"   "+today.toStringNum());
		System.out.println(tomorrow.toStringLet()+"   "+tomorrow.toStringNum());
		System.out.println(today.datesUntilEnd() + " fechas hasta el final de mes");
		System.out.println(tomorrow.monthsSameNumber(tomorrow));
		System.out.println(today.daysSinceStart() + " dias desde el principio de año");
	//	System.out.println(today.dateTry());
		System.out.println(today.dayOfWeek(5));


	}
}
