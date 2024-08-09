package view;
import controller.ControllerMostrarNegativos;
public class PrincipalMostrarNegativos {
	public static void main (String[]args) {
		
		ControllerMostrarNegativos m = new ControllerMostrarNegativos();
		int[] vet = {-4, 2, 6, -10, 12, -100, 89, -7, -11};
		int tamanho = vet.length;
		int quant = m.Negativos(vet, tamanho, 0);
		System.out.println ("Existem " + quant + " valores negativos!");
	}

}
