import javax.swing.JOptionPane;

/*
	* Prova DB1 Start. Desafio de Geografia.
	* Ler nome da cidade e informar:
	* A qual estado a cidade pertence
	* Se é capital ou não
	* O conjunto de cidades permitidas deve ser: Curitiba, Maringá, Londrina, 
	* Pinhais, Chapecó, Joinvile, Blumenau, Florianópolis, Porto Alegre, Gramado.
	* @author Kátia Marina Silva
	*/

public class Desafio3 {

	public static void main(String[] args) {
		
		String nomeCidade = JOptionPane.showInputDialog("Informe o nome da cidade: \nObs: apenas Curitiba, Maringá, Londrina, Pinhais, Chapecó, Joinvile, Blumenau, Florianópolis, Porto Alegre e Gramado são reconhecidas.");
					
		String estado;  
		String capital;
		String mensagem;
		
	// Verificar a qual estado pertence.
		
		if (  "Maringá".equalsIgnoreCase(nomeCidade) || "Curitiba".equalsIgnoreCase(nomeCidade)||"Londrina".equalsIgnoreCase(nomeCidade) || "Pinhais".equalsIgnoreCase(nomeCidade)) {
			estado = "Pertence ao Paraná (PR).";		
		}
		else if ( "Chapecó".equalsIgnoreCase(nomeCidade) || "Joinvile".equalsIgnoreCase(nomeCidade) || "Blumenau".equalsIgnoreCase(nomeCidade) || "Florianópolis".equalsIgnoreCase(nomeCidade) ) {
			estado = "Pertence à Santa Catarina (SC).";
		}
		else if ("Porto Alegre".equalsIgnoreCase(nomeCidade) || "Gramado".equalsIgnoreCase(nomeCidade)) {
			estado = "Pertence ao Rio Grande do Sul (RS).";
		}
		else {
			estado = "Cidade não reconhecida.";
		}
		
	// Verificar se é ou não uma capital.
		
		if ("Curitiba".equalsIgnoreCase(nomeCidade) || "Florianópolis".equalsIgnoreCase(nomeCidade) || "Porto Alegre".equalsIgnoreCase(nomeCidade)) {
			capital = "É capital.";
		}
		else {
			capital = "Não é capital.";
		}

		mensagem = estado + "\n" + capital;
		JOptionPane.showMessageDialog(null, mensagem);

	}		
}
