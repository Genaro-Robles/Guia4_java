import java.util.Scanner;

public class Caso7 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		//Declaracion de matriz
		int[][] lista = new int[3][4];

		int num_mayor=0, num_menor=0;
		float prom=0, acum=0;
				
		for (int f = 0; f <= 2; f++) {
			System.out.println("Fila "+(f+1));
			System.out.println("========");
			for (int c = 0; c <= 3; c++) {
				System.out.println("Fil.: "+(f+1)+", Col.: "+(c+1)+": ");
				lista[f][c] = sc.nextInt();
				acum=acum+lista[f][c];
				
				if (f == 0 && c == 0) {
					num_mayor = lista [0][0];
					num_menor = lista [0][0];
				}
				if (lista[f][c]> num_mayor)
					num_mayor = lista [f][c];
				if (lista[f][c]< num_menor)
					num_menor = lista [f][c];
			}
		}
		prom=acum/12;
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("El numero mayor es.......: "+num_mayor);
		System.out.println("El numero menor es.......: "+num_menor);
		System.out.println("Las sumatoria es.........: "+acum);
		System.out.println("El promedio es...........: "+prom);
}
}
