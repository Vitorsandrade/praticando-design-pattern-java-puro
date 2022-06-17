package subsistema1.crm;

public class crmService {

	private crmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String estado, String cidade) {
		System.out.println("Cliente salvo no sistema de CRM.");
	}
}
