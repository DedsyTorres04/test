package Numeros_primos;
	import java.util.Scanner;
	public class primos{
		public static void main (String[]args){
		  Scanner dt= new Scanner(System.in);
          // iniciamos variables
		  int num;
		  System.out.println("Digite un numero");
		  num=dt.nextInt();
          //se crea un if para determinar el numero primo
		  if(num%3==2) {
              // se verifica si el numero que ingreso es par 
		  	System.out.println("el numero es primo");
              // se verifica si el njmero no es primo
		  	}else {
		  		System.out.println("el numero no es primo");
		  }

		}
}