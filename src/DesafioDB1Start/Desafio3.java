import javax.swing.JOptionPane;

/*
	* Prova DB1 Start. Desafio de Geografia.
	* Ler nome da cidade e informar:
	* A qual estado a cidade pertence
	* Se � capital ou n�o
	* O conjunto de cidades permitidas deve ser: Curitiba, Maring�, Londrina, 
	* Pinhais, Chapec�, Joinvile, Blumenau, Florian�polis, Porto Alegre, Gramado.
	* @author K�tia Marina Silva
	*/

public class Desafio3 {

	public static void main(String[] args) {
		
		String nomeCidade = JOptionPane.showInputDialog("Informe o nome da cidade: \nObs: apenas Curitiba, Maring�, Londrina, Pinhais, Chapec�, Joinvile, Blumenau, Florian�polis, Porto Alegre e Gramado s�o reconhecidas.");
					
		String estado;  
		String capital;
		String mensagem;
		
	// Verificar a qual estado pertence.
		
		if (  "Maring�".equalsIgnoreCase(nomeCidade) || "Curitiba".equalsIgnoreCase(nomeCidade)||"Londrina".equalsIgnoreCase(nomeCidade) || "Pinhais".equalsIgnoreCase(nomeCidade)) {
			estado = "Pertence ao Paran� (PR).";		
		}
		else if ( "Chapec�".equalsIgnoreCase(nomeCidade) || "Joinvile".equalsIgnoreCase(nomeCidade) || "Blumenau".equalsIgnoreCase(nomeCidade) || "Florian�polis".equalsIgnoreCase(nomeCidade) ) {
			estado = "Pertence � Santa Catarina (SC).";
		}
		else if ("Porto Alegre".equalsIgnoreCase(nomeCidade) || "Gramado".equalsIgnoreCase(nomeCidade)) {
			estado = "Pertence ao Rio Grande do Sul (RS).";
		}
		else {
			estado = "Cidade n�o reconhecida.";
		}
		
	// Verificar se � ou n�o uma capital.
		
		if ("Curitiba".equalsIgnoreCase(nomeCidade) || "Florian�polis".equalsIgnoreCase(nomeCidade) || "Porto Alegre".equalsIgnoreCase(nomeCidade)) {
			capital = "� capital.";
		}
		else {
			capital = "N�o � capital.";
		}

		mensagem = estado + "\n" + capital;
		JOptionPane.showMessageDialog(null, mensagem);

	}		
}
