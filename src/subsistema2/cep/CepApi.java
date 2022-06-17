package subsistema2.cep;

import br.com.vitor.gof.singleton.SingletonEager;

public class CepApi {

	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Araracuara";
	}
	public String recuperarEstado(String cep) {
		return "SP";
	}
	
}
