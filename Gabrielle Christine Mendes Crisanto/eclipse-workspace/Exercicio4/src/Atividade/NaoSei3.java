package Atividade;

public class NaoSei3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vetor de vetores do tipo INT
		//linhas e coluna x.y
		
		
		int[][] matriz = new int[3][3];
//vetor de vetores INT ja com os valores:
		int[][] matrizNumeros = { 
				                { 1, 2, 3 }, 
				                { 4, 5, 6 }, 
				                { 7, 8, 3 } 
			                 	};

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}

	}
}