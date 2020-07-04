import java.util.Scanner;

public class Caso6 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		//Declaracion de matriz
		String datos[][];
		datos = new String[2][3];
		
		datos[0][0] = "Joe Castillo";
		datos[0][1] = "Flor Vargas";
		datos[0][2] = "Carla Flores";
		
		datos[1][0] = "Callao";
		datos[1][1] = "Los Olivos";
		datos[1][2] = "Puente Piedra";
		
		for (int f = 0; f <= 1; f++) {
			System.out.println("Fila "+(f+1));
			System.out.println("========");
			for (int c = 0; c <= 2; c++) {
				System.out.println("columna "+(c+1)+": "+datos[f][c]);
			}
		}
		
		
}
}
