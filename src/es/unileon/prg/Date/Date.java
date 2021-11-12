package es.unileon.prg.Date;

import java.time.DayOfWeek;

import javax.sql.rowset.spi.SyncResolver;

public class Date {

	private int day;
	private int month;
	private int year;
	
	
	public int getDay(){
		return this.day;
	}
	public int getMonth(){
		return this.month;
	}
	public int getYear(){
		return this.year;
	}


	public Date(int day,int month, int year) throws DateException{
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
		
	}
	
	
	public int getDayOfMonth(int monthdays) {
		int numdias = 0;
		switch(monthdays) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numdias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numdias = 30;
			break;
		case 2:
			numdias = 28;
			break;	
		}
		return numdias;
	}
	
	
	public void setDay(int day) throws DateException{
		if (day>1 && day<this.getDayOfMonth(this.month)) {
			this.day=day;
		}
		else{
			throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");
		}
	}
	boolean isSameDay(Date otrodia) {
		boolean issameday= false;
		if (this.day==otrodia.day){
			issameday = true;
		}
		return issameday;
	}

	
	public void setMonth(int month) throws DateException{
		if(month>0 && month<13) {
			this.month = month;
		}
		else {
			throw new DateException("Date error: Month " + month + " not valid");
		}
	}
	boolean isSameMonth(Date otromes) {
		boolean issamemonth= false;
		if (this.month==otromes.month){
			issamemonth = true;
		}
		return issamemonth;
	}


	public void setYear(int year) {
		this.year= year;
	}
	boolean isSameYear(Date otroano) {
		boolean issameyear= false;
		if (this.year==otroano.year){
			issameyear = true;
		}
		return issameyear;
	}
	

	boolean isSame( Date igualdia,Date igualmes, Date igualano){
		boolean issame=false;
		if ((this.day == igualdia.day)&&(this.month == igualmes.month)&&(this.year == igualdia.year)){
		 issame=true;	
		}
		return issame;
	}
	
	public String nombreMes(int nombremes){
		String mes= "";
		
		switch(nombremes){
			case 1:
			mes = "Enero";
			break;
			case 2:
			mes = "Febrero";
			break;
			case 3:
			mes = "Marzo";
			break;
			case 4:
			mes = "Abril";
			break;
			case 5:
			mes = "Mayo";
			break;
			case 6:
			mes = "Junio";
			break;
			case 7:
			mes = "Julio";
			break;
			case 8:
			mes = "Agosto";
			break;
			case 9:
			mes = "Septiembre";
			break;
			case 10:
			mes = "Octubre";
			break;
			case 11:
			mes = "Noviembre";
			break;
			case 12:
			mes = "Diciembre";
			break;
		}
			return mes;
	}

	public boolean comprobarDia(){
		boolean diacorrecto = true;
		if(day<1||day>this.getDayOfMonth(this.month)){
			diacorrecto = false;
		}
		return diacorrecto;
	}
	public String nombreEstacion (Date nombreestacion) {
		String estacion = "";
		this.month = nombreestacion.month;

		switch (nombreestacion.month){ 
			case 1:
			case 2:
				estacion="Invierno";
				break;
			case 3:
			if (day<21){
				estacion="Invierno";
			}
			else {
				estacion="Primavera";
			}
			break;
			case 4:
			case 5:
				estacion ="Primavera";
				break;
			case 6:
			if (day<21){
				estacion="Primavera";
			}
			else {
				estacion="Verano";
			}
			break;
			case 7:
			case 8:
				estacion = "Verano";
				break;
			case 9:
			if (day<21){
				estacion="Verano";
			}
			else {
				estacion="Otono";
			}
			break;
			case 10:
			case 11:
				estacion = "Otono";
				break;
			case 12:
			if (day<21){
				estacion="Otono";
			}
			else {
				estacion="Invierno";
			}
			break;
		}
		return estacion;
	}

	public int mesesfaltan(Date mesesfaltan){
		int mesesrestantes= 12 - mesesfaltan.month;
		return mesesrestantes;
	}	
	
	public String toStringLet(){
		return day +" de "+ this.nombreMes(this.month) +" del año "+ year;
	}

	public String toStringNum(){
		return day +"/"+ month +"/"+ year;
	}

	public String datesUntilEnd(){
		StringBuilder cadena = new StringBuilder();
		for (int i=day;i <= this.getDayOfMonth(this.month);i++){
		cadena.append(i+"/"+this.month +"/"+ this.year + ", " );
		}
	return cadena.toString();
	}

	public String monthsSameNumber(Date diasmes){
		
		StringBuilder cadena = new StringBuilder();
		for(int i = 1; i<=12;i++){
			if(getDayOfMonth(i) == getDayOfMonth(diasmes.month)){
				cadena.append(String.valueOf(this.nombreMes(i)) + " ");
			}
		}
		return cadena.toString();
	
	}

	public int daysSinceStart(){
		int sumadias = 0;
		for (int i=1;i < this.month;i++){
			sumadias= sumadias + getDayOfMonth(i)+ this.day;
		}
		return sumadias;
	}


	//Esta bien solo que tarda en hacerla coincidir
	/*
	public int dateTry(){
		int cont=0;	
		double dayrandom = 0;
		double monthrandom = 0;
		do{
			dayrandom = Math.random()*getDayOfMonth(this.month)+1;
			monthrandom = Math.random()*12 + 1;
			cont++;
			i++;
			System.out.println("Intento "+ i);
		}while ((dayrandom!=this.day)||(monthrandom!=this.month));
		return cont;
	}
	*/
	public String nameDayOfWeek(int weekday){
		String weekdayname = "";
		switch(weekday){
			case 0:
				weekdayname = "Lunes";
				break;
			case 1:
				weekdayname = "Martes";
				break;
			case 2:
				weekdayname = "Miercoles";
				break;
			case 3:
				weekdayname = "Jueves";
				break;
			case 4:
				weekdayname = "Viernes";
				break;
			case 5:
				weekdayname = "Sabado";
				break;
			case 6:
				weekdayname = "Domingo";
				break;
		}
		return weekdayname;
	}

	public String dayOfWeek(int firstday){
		int aux = 0;
		String cadena = "";
		aux = (firstday%7 + this.daysSinceStart())%7;
		cadena = this.nameDayOfWeek(aux);

		return cadena;
	}
}
