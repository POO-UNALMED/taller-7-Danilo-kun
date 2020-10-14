package comunicacion;

public class Libro extends Escrito {
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	public Libro(String origen,String titulo,String autor,int paginas,String co,String edito,String edi,String inter) {
		super(origen,titulo,autor,paginas);
		this.co_autor=co;
		this.editorial=edito;
		this.edicion=edi;
		this.interpretacion=inter;
	}
	@Override
	public int palabrasTotales(int i) {
		return this.getPaginas()*i*2;
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
		r += this.co_autor + "\n";
		r += this.editorial + "\n";
		r += this.edicion;
		return  r;
	}
	public String getCo_autor() {
		return this.co_autor;
	}
	public String getEditorial() {
		return this.editorial;
	}
	public String getEdicion() {
		return this.edicion;
	}
}
