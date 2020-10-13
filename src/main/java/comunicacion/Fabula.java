package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	public Fabula(String origen, String titulo, String autor, int paginas) {
		super(origen, titulo, autor, paginas);
	}
	@Override
	int palabrasTotales(int palabrasPagina) {
		return this.getPaginas();
	}

	@Override
	String interpretacion() {
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

}
