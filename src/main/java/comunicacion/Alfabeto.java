package comunicacion;
import java.util.*;
public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	public Alfabeto(String origen,String[] le,String inter) {
		super(origen);
		this.letras=le;
		this.interpretacion=inter;
	}
	public int cantidadLetras() {
		return letras.length;
	}
	@Override
	
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		String aux="";
		for(int i=0;i<letras.length;i++) {
			if(i!=letras.length-1) {
				aux+=letras[i];
				aux+=", ";
			}
			else {
				aux+=letras[i];
			}
		}
		return aux;	
	}

}
