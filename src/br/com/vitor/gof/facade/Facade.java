package br.com.vitor.gof.facade;

import subsistema1.crm.crmService;
import subsistema2.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarCidade(nome);

		
		crmService.gravarCliente("s", "s", estado, cidade);
	}
}
