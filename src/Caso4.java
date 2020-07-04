import java.util.Scanner;
import java.util.Arrays;

public class Caso4 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero[];
		numero = new int[5];
		float acum=0, prom=0,npares=0,nimpares=0;
		for (int i=0;i<numero.length;i++) {
			System.out.println("Ingrese numero "+(i+1)+": ");
			numero[i]= sc.nextInt();
			
			acum=acum+numero[i];
			if (numero[i]%2==0) {
				npares+=1;
			}else {
				nimpares+=1;
			}
			
		}
		prom=acum/5;
		System.out.println("--------------------------");
		System.out.println("--------RESULTADOS--------");
		System.out.println("--------------------------");
		System.out.println("Cantidad de numeros pares......: "+npares);
		System.out.println("Cantidad de numeros impares....: "+nimpares);
		System.out.println("Promedio de los numeros........: "+prom);
}
}
