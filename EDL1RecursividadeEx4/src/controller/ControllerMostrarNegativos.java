package controller;

public class ControllerMostrarNegativos {
	public ControllerMostrarNegativos() {
		super();
	}
	
	public int Negativos (int[] vet, int tamanho, int quant) {
		if (tamanho == 0) { // CONDIÇÃO DE PARADA: QUANDO TAMANHO FOR ZERO QUER DIZER QUE JA PERCORREMOS TODO O VETOR, A RECURSIVA ACABA E DEVE RETORNAR A QUANTIDADE DE ELEMENTOS NEGATIVOS ENCONTRADOS.
			return quant;
		}
		else 
			if (vet[tamanho-1] < 0) {
				quant = quant + 1;
			}
		return Negativos (vet, tamanho-1, quant);
		}
	}

// COMO ESCREVER A FUNÇÃO PARA O TERMO N EM FUNÇÃO DO TERMNO ANTERIOR? 
//UTILIZAMOS O .LENGTH PARA DESCOBRIR O TAMANHO DO VETOR, ENTÃO COMEÇAMOS PELO ENÉSIMO ELEMENTO UTILIZANDO [TAMANHO-1], JÁ QUE OS VETORES COMEÇAM COM ÍNDICE 0, ASSIM VAMOS DIMINUINDO O VALOR DO ÍNDICE COM [TAMANHO-1], ATÉ CHEGAR NO ELEMENTO INICIAL DE ÍNDICE ZERO.
