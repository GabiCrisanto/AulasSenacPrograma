package Atividade;

import java.util.Arrays;
import java.util.Scanner;

public class NaoSei2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// declando novo scanner com o nome teclado 
		Scanner teclado = new Scanner(System.in);
		
		//saida na tela  "texto"
		System.out.println("Insira o tamanho do vetor:");
		
		//declarando variavel do tipo INT com o nome ORDEM
		//que RECEBE o valor que o usuario inserir
		int ordem = teclado.nextInt();
		
		//declarando uma variavel VETOR do tipo INT
		//com o nome vetorNumerosInteiros
		//                           que RECEBE uma nova instancia
		//                           "novo vetor" de tamanho ORDEM
		int[] vetorNumerosInteiros = new int[ordem];
		
		// saida na tela   "texto"         CONCATENA  com a VARIAVEL ordem
		System.out.println("Ordem do vetor: "+ ordem); 
		
		//mostrar um vetor inteiro na tela:
		// import Arrays lá em cima 
		System.out.println(Arrays.toString(vetorNumerosInteiros));
		
		//usuario inserir cada valor do vetor
		Scanner arroz = new Scanner (System.in);
		// for pro usuario inserir cada valor
		for(int posicao = 0; posicao  < vetorNumerosInteiros.length; posicao++ ) {
			//elemento atual pede pro usuario uma int 
			
			System.out.println("Insira o elemento" + posicao);
			vetorNumerosInteiros[posicao] = arroz.nextInt();
			;
			
			
			
		}
		//mostar a soma de todos valor do vetor
		
		//declara varaiavel soma recebe o
		int soma = 0;
		for (int i = 0; i < vetorNumerosInteiros.length; i++) {
			//
			soma += vetorNumerosInteiros[i];
			//variavel recebe valor novo = valor antigo + elemente atual
			int[] vetorNumeroInteiro;
			soma = soma + vetorNumerosInteiros[i];
		
		}
		System.out.print(" A soma do vetor é:" + soma);
	}

}
