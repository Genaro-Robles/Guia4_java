import java.util.Scanner;

public class Caso2 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] num = new int[5];
		
		for (int i = 0; i <=4; i++) {
			System.out.println("Ingrese numero "+(i+1)+": ");
			num[i]=sc.nextInt();
		}
		int num_mayor = 0, num_menor = num[0], suma = 0;
		
		for(int x = 0; x <= 4; x++) {
			if (num[x] > num_mayor)
				num_mayor = num[x];
			if (num[x] < num_menor)
				num_menor = num[x];
			
			suma += num[x];
			
		}
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("Numero Mayor......: "+ num_mayor);
		System.out.println("Numero Menor......: "+ num_menor);
		System.out.println("Suma..............: "+ suma);
	}
}
