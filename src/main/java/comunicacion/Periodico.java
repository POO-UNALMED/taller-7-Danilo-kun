package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	public Periodico(String origen,String titulo,String autor,int paginas) {
		super(origen,titulo,autor,paginas);
	}
	@Override
	int palabrasTotales(int palabrasPagina) {
		return this.getPaginas()*10;
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
		r += this.fecha + "\n";
		r += this.primicia;
		return  r;
	}

}
