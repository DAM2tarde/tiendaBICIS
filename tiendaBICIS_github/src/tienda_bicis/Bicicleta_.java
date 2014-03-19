package tienda_bicis;

public class Bicicleta_ {

	int tamanioRueda;	
	public String medida;	
	static final int valorFijo=10;
	int tamanioBici;
	
	public Bicicleta_() {
		tamanioRueda = 26;
		medida = "XL"; 		
	}
	
	void ver(){
		System.out.println("Hola" + 10);
	}
	
	void pruebaMetodo(){
		ver();
	}

	public void modificar(int tam, String med){
		tamanioRueda = valorFijo;
		medida = med;
	}
	
}
