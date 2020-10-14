package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	public Fabula(String origen, String titulo, String autor, int paginas,String ens,String inter) {
		super(origen, titulo, autor, paginas);
		this.ensenanza=ens;
		this.interpretacion=inter;
	}
	@Override
	public int palabrasTotales(int i) {
		return this.getPaginas()*i;
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
		r += this.ensenanza;
		return  r;
	}
	public String getEnsenanza() {
		return this.ensenanza;
	}
}
