import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Integer[] num;
		num = new Integer[5];
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("Ingrese numero "+(i+1)+": ");
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);//Ascendente
		System.out.println("En orden ascendente");	
		for (int i = 0; i <= 4; i++) {
			System.out.println("Numero "+(i+1)+": "+num[i]);
		}
		Arrays.sort(num, Collections.reverseOrder());//Descendente
		System.out.println("En orden descendente");
		for (int i = 0; i <= 4; i++) {
			System.out.println("Numero "+(i+1)+": "+num[i]);
		}
}
}
