package br.com.vitor.gof;

/**
 * Singleton "apressado".
 * 
 * @author Vitor Santos
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
	
}
