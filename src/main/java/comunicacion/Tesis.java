package comunicacion;
import java.util.*;
public class Tesis extends Escrito {
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	public Tesis(String origen,String titulo,String autor,int paginas, String idea,String[] arg,String conclusion,String ref,String inter) {
		super(origen,titulo,autor,paginas);
		this.idea=idea;
		this.argumentos=arg;
		this.conclusion=conclusion;
		this.referencias=ref;
		this.interpretacion=inter;
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas()*5;
	}

	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas() + "\n";
		r += this.idea + "\n";
		r += this.argumentos.length + "\n";
		r += this.conclusion + "\n";
		r += this.referencias;
		return  r;
	}
	public String getIdea() {
		return this.idea;
	}
	public String[] getArgumentos() {
		return this.argumentos;
	}
	public String getConclusion() {
		return this.conclusion;
	}
	public String getReferencias() {
		return this.referencias;
	}
}
