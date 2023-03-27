import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();

			
			
			try {
				//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			
			}catch (ArithmeticException exception) {
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			}
		}
		
	}
	static void contar(int parametroUm, int parametroDois) throws ArithmeticException  {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm>parametroDois)
			throw new ArithmeticException("O segundo parâmetro deve ser maior que o primeiro");
				
			int contagem = parametroDois - parametroUm;

			String resultFinal = "O resultado é: ";

			//realizar o for para imprimir os números com base na variável contagem
			for(int i = 0; i<=contagem; i++){
				resultFinal =  resultFinal + (parametroUm+i)+", ";
			}
			
			System.out.println(resultFinal);
	}
}