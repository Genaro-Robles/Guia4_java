import java.util.Scanner;

public class Caso5 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String[] codigo = {"A001","A018","A123","A555","A357"};
		String[] nombre = {"Joe Castillo","Rosa Flores","Maria Perez","Fernando Casas","Ericka Villa",""};
		int[] nota= {8,15,14,10,18};
		
		System.out.println("Ingrese codigo a buscar: ");
		String valor_codigo = sc.nextLine();
		
		int posicion = -1;
		
		
		for (int x = 0; x <=4; x++) {
			if (valor_codigo.contentEquals(codigo[x])) {
				posicion = x;
				break;
			}
		}
		String estado="";
		if(nota[posicion]>=11) {
			estado="Aprobado";
		}else {
			estado="Desaprobado";
		}
		if (posicion ==-1) {
			System.out.println("Codigo no encontrado");
		}else {
			System.out.println("Codigo encontrado");
			System.out.println("Nombre....: "+ nombre[posicion]);
			System.out.println("Nota......: "+ nota[posicion]);
			System.out.println("Estado....: "+ estado);
		}
}
}

