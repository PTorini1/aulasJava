import java.util.Scanner;

public class LampadaMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// 	criando variaveis
		int criar = 0;
		int estado = 0;

		// Interacao com o cliente
		System.out.println("Ol� seja bem-vindo ao nosso sistema de cria��o de l�mpadas \n");
		System.out.println("Pressione 1 para criar uma l�mpada");
		criar = entrada.nextInt();
		// Se quiser ele digitar algo nada a ver o sistema encerra
		if (criar != 1) {
			System.out.println("Obrigado por usar nosso sistema");

		} else {
			// Instanciando o objeto do tipo lampada e passando como para parametro sua booloean como true
			Lampada lampada = new Lampada(true);

			System.out.println("Quando a l�mpada � criada, ela j� vem acesa");
			System.out.println("Deseja mudar o estado da l�mpada? 1- Sim  2-N�o\n");
			estado = entrada.nextInt();
			// if para imprimir o estado da lampada ou desligar de acordo com o que o usuario quiser
			if (estado != 1) {
				lampada.imprimir();
			} else {
				lampada.desligar();
				lampada.imprimir();
			}
		}
	}
}
