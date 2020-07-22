// importar los paquetes necesarios
import java.util.Scanner;
import clases.Moneda;
import clases.Alcancia;
//inicio programa principal
public class Main{
	public static void main(String[] args){
		int captura = 0;
		Alcancia pork = new Alcancia();
		System.out.println("Bienvenido a la alcancia pork");
		System.out.println("Este es el menú de opciones:");
		do{
			System.out.println("1) Insertar Monedas. \n2) Conocer saldos y cantidades de las Monedas insertadas.\n3) Romper la alcancia.\n4) Salir");
			System.out.println("Escoga una opción. ¿Que desea hacer.?");
			try{
				Scanner in = new Scanner(System.in);
				captura = in.nextInt();	
				System.out.println("Has escogido "+captura);
				String menu = "";
				int captura2 = 0;
				switch(captura){
					case 1: 
							do{
								menu = "Elige una opción \n1)Insertar moneda\n2)Regresa al menú anterior";
								System.out.println(menu);
								captura2 = in.nextInt();
								int captura3=0;
								switch(captura2){
									case 1: do{
												menu = "Escoge una denominación:\n1)50\n2)100\n3)200\n4)500\n5)1000\n6)Regresar al menú anterior"; 
												System.out.println(menu);
												captura3 = in.nextInt();
												switch(captura3){
													case 1: Moneda m = new Moneda(50); 
															if(pork.insertarMoneda(m)){
																System.out.println("Moneda insertado correctamente");
															}else{
																System.out.println("Moneda no instertada");
															}
															break;
													case 2: Moneda m2 = new Moneda(100); 
															if(pork.insertarMoneda(m2)){
																System.out.println("Moneda insertado correctamente");
															}else{
																System.out.println("Moneda no instertada");
															}
															break;
													case 3: Moneda m3 = new Moneda(200); 
															if(pork.insertarMoneda(m3)){
																System.out.println("Moneda insertado correctamente");
															}else{
																System.out.println("Moneda no instertada");
															}
															break;
													case 4: Moneda m4 = new Moneda(500); 
															if(pork.insertarMoneda(m4)){
																System.out.println("Moneda insertado correctamente");
															}else{
																System.out.println("Moneda no instertada");
															}
															break;
													case 5: Moneda m5 = new Moneda(1000); 
															if(pork.insertarMoneda(m5)){
																System.out.println("Moneda insertado correctamente");
															}else{
																System.out.println("Moneda no instertada");
															}
															break;
													default: break;
												}
											}while(captura3 > 0 && captura3 < 6);
											break;									
								}								
							}while(captura2 > 0 && captura2 < 2);
							break;
					case 2: 
							do{
								menu = "¿Que quieres saber?\n1)Cantidad de Monedas de una denominación\n2)Valor Total de una denominación\n3)Cantidad Total de Monedas\n4)Valor total en mi alcancia\n5)Regresa al menú anterior";
								System.out.println(menu);
								captura2 = in.nextInt();
								int captura3 = 0;
								switch(captura2){
									case 1:
											do{
												menu = "Escoge una denominación:\n1)50\n2)100\n3)200\n4)500\n5)1000\n6)Regresar al menú anterior";
												System.out.println(menu);
												captura3 = in.nextInt();
												int denominacion =0;	
												switch(captura3){
													case 1: denominacion = 50;
															System.out.println("Usted tiene "+pork.obtenerCantidadMonedas(denominacion)+" Monedas de "+denominacion);
															break;
													case 2: denominacion = 100;
															System.out.println("Usted tiene "+pork.obtenerCantidadMonedas(denominacion)+" Monedas de "+denominacion);
															break;
													case 3: denominacion = 200;
															System.out.println("Usted tiene "+pork.obtenerCantidadMonedas(denominacion)+" Monedas de "+denominacion);
															break;
													case 4: denominacion = 500;
															System.out.println("Usted tiene "+pork.obtenerCantidadMonedas(denominacion)+" Monedas de "+denominacion);
															break;
													case 5: denominacion = 1000;
															System.out.println("Usted tiene "+pork.obtenerCantidadMonedas(denominacion)+" Monedas de "+denominacion);
															break;
													default:break;
												}							
											}while(captura3 > 0 && captura3 < 6);
											break;
									case 2: do{
												menu = "Escoge una denominación:\n1)50\n2)100\n3)200\n4)500\n5)1000\n6)Regresar al menú anterior";
												System.out.println(menu);
												captura3 = in.nextInt();
												int denominacion =0;	
												switch(captura3){
													case 1: denominacion = 50;
															System.out.println("Usted tiene $"+pork.obtenerValorTotalMonedas(denominacion)+" Pesos en Monedas de "+denominacion);
															break;
													case 2: denominacion = 100;
															System.out.println("Usted tiene $"+pork.obtenerValorTotalMonedas(denominacion)+" Pesos en Monedas de "+denominacion);
															break;
													case 3: denominacion = 200;
															System.out.println("Usted tiene $"+pork.obtenerValorTotalMonedas(denominacion)+" Pesos en Monedas de "+denominacion);
															break;
													case 4: denominacion = 500;
															System.out.println("Usted tiene $"+pork.obtenerValorTotalMonedas(denominacion)+" Pesos en Monedas de "+denominacion);
															break;
													case 5: denominacion = 1000;
															System.out.println("Usted tiene $"+pork.obtenerValorTotalMonedas(denominacion)+" Pesos en Monedas de "+denominacion);
															break;
													default:break;
												}							
											}while(captura3 > 0 && captura3 < 6);
											break;
									case 3: System.out.println("Usted tiene "+pork.obtenerCantidadMonedas()+" Monedas en su alcancia");
											break;
									case 4: System.out.println("Usted tiene $"+pork.obtenerValorTotalMonedas()+" pesos en su alcancia");
											break;
									default:break; 									
								}								
							}while(captura2 > 0 && captura2 < 5);
							break;
					case 3: if(pork.romperAlcancia()){
								System.out.println("La alcancia ha sido vaciada con exito");
							}else{
								System.out.println("Ups. Problemas para romper la alcancia");
							};
					default:break;
				}
			}catch(Exception e){
				System.out.println("Opción no valida, intente nuevamente ");
				captura = 0;
			} 	
		}while(captura < 4);
		System.out.println("Fin del programa");		
  	}
}
