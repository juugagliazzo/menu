import javax.swing.JOptionPane;

public class menu {
	
	public static void main(String[] args) {
	
		char myChar = 'N';
	      String charToString = String.valueOf(myChar);
			String cadastro = JOptionPane.showInputDialog("Já possui cadastro? (Digite apenas S PARA SIM E N PARA NÃO)");
		    if ( charToString.equalsIgnoreCase(cadastro)) {
		
		 int opcoes = Integer.valueOf( JOptionPane.showInputDialog("Digite qual opção de cadastro deseja escolher, se for candidato, digite [1], se for empresa, digite [2], se for avaliador, digite [3]:"));
	    switch (opcoes) {
	    case 1: 
		  JOptionPane.showInputDialog("Digite seu nome completo: ");
		  JOptionPane.showInputDialog("Digite sua idade: ");
		  JOptionPane.showInputDialog("Digite seu telefone para contato: ");
		  JOptionPane.showInputDialog("Digite seu endereço: ");
	    JOptionPane.showInputDialog("Digite sua área de interesse: ");
	    JOptionPane.showInputDialog("Digite seu Email: ");
	    JOptionPane.showInputDialog("Digite sua senha: ");
	    JOptionPane.showInputDialog("Confirme sua senha: ");
	    
	    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
	    
		break;
	
			
	case 2:
		    JOptionPane.showInputDialog("Digite o nome da empresa: ");
		    JOptionPane.showInputDialog("Digite o CNPJ: ");
		    JOptionPane.showInputDialog("Digite o telefone para contato: ");
		    JOptionPane.showInputDialog("Digite o endereço da empresa: ");
		    JOptionPane.showInputDialog("Digite o nome do responsável: ");
		    JOptionPane.showInputDialog("CDigite o email para contato: ");
		    JOptionPane.showInputDialog("Digite o porte da empresa: ");
		    JOptionPane.showInputDialog("Digite o seguimento que a empresa é: ");
		    JOptionPane.showInputDialog("Digite sua senha: ");
		    JOptionPane.showInputDialog("Confirme sua senha: ");
			
		    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		break;
		
	case 3:
		    JOptionPane.showInputDialog("Digite seu nome completo: ");
		    JOptionPane.showInputDialog("Digite sua idade: ");
	      JOptionPane.showInputDialog("Digite seu Email: ");
	      JOptionPane.showInputDialog("Digite sua senha: ");
	      JOptionPane.showInputDialog("Confirme sua senha: ");
	    
	      JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
	   
		break;
		
default: {
		System.out.println("Opção inválida");
	}}}
		 else  {
		       JOptionPane.showMessageDialog(null, "Vá para a aba de login!");
		}	
			
}}
