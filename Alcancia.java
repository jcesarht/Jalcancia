package clases;
import clases.Moneda;
import java.util.ArrayList;
public class Alcancia{
	private Moneda moneda;
	private Moneda[] arrayMoneda;
	private ArrayList<Moneda> monedas;
	public Alcancia(){
		this.monedas = new ArrayList<Moneda>();
	}
	public Alcancia(Moneda[] m){
		this.arrayMoneda = m;
		this.insertarMoneda(arrayMoneda);
	}
	
	public boolean insertarMoneda(Moneda m){
		boolean check = true;
		try{
			this.monedas.add(m);	
		}catch(Exception e){
			check = false;
		}
		return check;
	}
	public boolean insertarMoneda(Moneda[] m){
		int numero_monedas = m.length;
		boolean check = true;
		try{
			for(int x=0;x<numero_monedas;x++){
				this.monedas.add(m[x]);	
			}
		}catch(Exception e){
				check = false;
		}
		return check;
		
	}
	public boolean retirarMoneda(int valor){
		boolean check = true;
		if(!this.monedas.isEmpty()){
			int numero_monedas = this.monedas.size();
			for(int x=0;x<numero_monedas;x++){
				//falta algo aquí
			}
		}else{
			check = false;
		}
		return check;
	}
	public int obtenerCantidadMonedas(){
		return this.monedas.size();		
	}
	public int obtenerCantidadMonedas(int valor){
		int cantidad_monedas = 0;
		int cantidadTotalMonedas = this.obtenerCantidadMonedas();
		for(int x = 0; x < cantidadTotalMonedas; x++){
			Moneda m = this.monedas.get(x);
			if(m.getValor() == valor){
				cantidad_monedas++;
			}
		}
		return cantidad_monedas; 	
	}
	public int obtenerValorTotalMonedas(){
		int valor_total_monedas = 0;
		int cantidadTotalMonedas = this.obtenerCantidadMonedas();
		for(int x = 0; x < cantidadTotalMonedas; x++){
			Moneda m = this.monedas.get(x);
			valor_total_monedas = valor_total_monedas + m.getValor();
		}
		return valor_total_monedas;		
	}
	public int obtenerValorTotalMonedas(int valor){
		int valor_total_monedas = 0;
		int cantidadTotalMonedas = this.obtenerCantidadMonedas();
		for(int x = 0; x < cantidadTotalMonedas; x++){
			Moneda m = this.monedas.get(x);
			if(m.getValor() == valor){
				valor_total_monedas = valor_total_monedas + m.getValor();
			}
		}
		return valor_total_monedas; 	
	}
	public boolean romperAlcancia(){
		boolean check = true;
		try{
			this.monedas.clear();
		}catch(Exception e){
			check = false;
		}
		return check;
	}
}