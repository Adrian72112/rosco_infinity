package logic;

public class Palabra {

	 char letra ;
	 String definicion;
	 int codigo, cantidadRespondida, cantidadRespondidaCrrectamente; 
	 boolean empiezaPor, estadoUso;
	 
	 public Palabra(char letra, String definicion, int codigo, int cantidadRespondida, int cantidadRespondidaCrrectamente,
	        boolean empiezaPor, boolean estadoUso) {
	    super();
	    this.letra = letra;
	    this.definicion = definicion;
	    this.codigo = codigo;
	    this.cantidadRespondida = cantidadRespondida;
	    this.cantidadRespondidaCrrectamente = cantidadRespondidaCrrectamente;
	    this.empiezaPor = empiezaPor;
	    this.estadoUso = estadoUso;
	}

	public char getLetra() {
	    return letra;
	}

	public void setLetra(char letra) {
	    this.letra = letra;
	}

	public String getDefinicion() {
	    return definicion;
	}

	public void setDefinicion(String definicion) {
	    this.definicion = definicion;
	}

	public int getCodigo() {
	    return codigo;
	}

	public void setCodigo(int codigo) {
	    this.codigo = codigo;
	}

	public int getCantidadRespondida() {
	    return cantidadRespondida;
	}

	public void setCantidadRespondida(int cantidadRespondida) {
	    this.cantidadRespondida = cantidadRespondida;
	}

	public int getCantidadRespondidaCrrectamente() {
	    return cantidadRespondidaCrrectamente;
	}

	public void setCantidadRespondidaCrrectamente(int cantidadRespondidaCrrectamente) {
	    this.cantidadRespondidaCrrectamente = cantidadRespondidaCrrectamente;
	}

	public boolean isEmpiezaPor() {
	    return empiezaPor;
	}

	public void setEmpiezaPor(boolean empiezaPor) {
	    this.empiezaPor = empiezaPor;
	}

	public boolean isEstadoUso() {
	    return estadoUso;
	}

	public void setEstadoUso(boolean estadoUso) {
	    this.estadoUso = estadoUso;
	}
	 
	 
	 
	}
