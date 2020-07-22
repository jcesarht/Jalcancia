package clases;
 public class Moneda{
	private int valor;
	public Moneda(){
		this.valor = 0;
	}
	public Moneda (int valor){
		this.valor = valor;
	}
	public void setValor(int valor){
		this.valor = valor;		
	}
	public int getValor(){
		return this.valor;
	}
}