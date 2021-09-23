package Singleton;

public class Impressora {
	public static void main(String[] args) {
		Fila Singleton = Fila.getInstancia("Fila 1");
        Fila outroSingleton = Fila.getInstancia("Fila 2");
        System.out.println(Singleton.valor);
        System.out.println(outroSingleton.valor);
	}
}
