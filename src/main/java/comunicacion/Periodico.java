package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	public Periodico(String origen,String titulo,String autor,int paginas,String fecha,String primicia,String inter) {
		super(origen,titulo,autor,paginas);
		this.fecha=fecha;
		this.primicia=primicia;
		this.interpretacion=inter;
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas()*10;
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
		r += this.fecha + "\n";
		r += this.primicia;
		return  r;
	}
	public String getFecha() {
		return this.fecha;
	}
	public String getPrimicia() {
		return this.primicia;
	}

}
