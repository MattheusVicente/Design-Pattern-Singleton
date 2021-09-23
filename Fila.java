package Singleton;

public class Fila {
	
	private static Fila instancia;
	public String valor;
	
	private Fila(String valor){
		this.valor = valor;
	}
	
	public static Fila getInstancia(String valor) {
		if(instancia == null) {
			instancia = new Fila(valor);
		}
		return instancia;
	}
	
	public void ImprimeDocumento(){}
	
	public void RemoveDocumento(){}
	
	public void RemoveTodosDocumentos(){}

}