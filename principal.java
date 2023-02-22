import java.text.DecimalFormat;

import javax.swing.*;
public class principal {
	public static void main(String[] args) {	
		
		String[] array = new String[2];
		array[0] = "Ingresar";
		array[1] = "Salir";
		
		String[] listaConversion = new String[2];
		listaConversion[0] = "Conversor de monedas";
		listaConversion[1] = "Conversor de medidas";
		
		String[] arrayMonedas = new String[10];
		arrayMonedas[0] = "Convertir de COP a USD";
		arrayMonedas[1] = "Convertir de COP a EUR";
		arrayMonedas[2] = "Convertir de COP a GBP";
		arrayMonedas[3] = "Convertir de COP a JPY";
		arrayMonedas[4] = "Convertir de COP a KRW";
		arrayMonedas[5] = "Convertir de USD a COP";
		arrayMonedas[6] = "Convertir de EUR a COP";
		arrayMonedas[7] = "Convertir de GBP a COP";
		arrayMonedas[8] = "Convertir de JPY a COP";
		arrayMonedas[9] = "Convertir de KRW a COP";
		
		String[] arrayMedidas = new String[10];
		arrayMedidas[0] = "Convertir de KM a M";
		arrayMedidas[1] = "Convertir de HM a M";
		arrayMedidas[2] = "Convertir de DM a M";
		arrayMedidas[3] = "Convertir de CM a M";
		arrayMedidas[4] = "Convertir de MM a M";
		arrayMedidas[5] = "Convertir de M a KM";
		arrayMedidas[6] = "Convertir de M a HC";
		arrayMedidas[7] = "Convertir de M a DC";
		arrayMedidas[8] = "Convertir de M a CM";
		arrayMedidas[9] = "Convertir de M a MM";
		
		String[] opcionesFinales = new String[2];
		opcionesFinales[0] = "Convertir de nuevo";
		opcionesFinales[1] = "Salir";

		int ejecucion = 0;

		do {		
			ejecucion = JOptionPane.showOptionDialog(null, "Bienvenido al conversor. ", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
			if(ejecucion == 0) {
				
				try {
					String opcionConversion = (String)JOptionPane.showInputDialog(null, "Selecciona el tipo de conversion", "Menu", JOptionPane.INFORMATION_MESSAGE, null, listaConversion, "Conversos de monedas");
					switch(opcionConversion){
						case "Conversor de monedas":{
							convertidorDivisas convertidor = new convertidorDivisas();
							String opcionMoneda = (String)JOptionPane.showInputDialog(null, "¿Que conversion deseas ejecutar?. ", "Menu", JOptionPane.QUESTION_MESSAGE, null, arrayMonedas, "Convertir de COP a USD");
							if(opcionMoneda == null){
								break;
							}
							try {
								double moneda = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la cantidad a convertir"));
								double resultado=0;							

								switch(opcionMoneda) {
									case "Convertir de COP a USD": {
										resultado = Math.round(convertidor.convertidorCOPaUSD(moneda)*100)/100d; 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a dolares es de: \n$"+resultado+" USD",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de COP a EUR" : {
										resultado = Math.round(convertidor.convertidorCOPaEUR(moneda)*100)/100d; 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a euros es de: \n$"+resultado+" EUR",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de COP a GBP" : {
										resultado = Math.round(convertidor.convertidorCOPaGBP(moneda)*100)/100d; 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a libras esterlinas es de: \n$"+resultado+" GBP",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de COP a JPY" : {
										resultado = Math.round(convertidor.convertidorCOPaJPY(moneda)*100)/100d; 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a yenes es de: \n$"+resultado+" JPY",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de COP a KRW" : {
										resultado = Math.round(convertidor.convertidorCOPaKRW(moneda)*100)/100d; 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a won Sul es de: \n$"+resultado+" KRW",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de USD a COP" : {
										resultado = Math.round(convertidor.convertidorUSDaCop(moneda)*100)/100d; 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a pesos colombianos es de: \n$"+resultado+" COP",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de EUR a COP" : {
										resultado = Math.round(convertidor.convertidorEURaCOP(moneda)*100)/100d; 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a pesos colombianos es de: \n$"+resultado+" COP",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de GBP a COP" : {
										resultado = Math.round(convertidor.convertidorGBPaCOP(moneda)*100)/100d; 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a pesos colombianos es de: \n$"+resultado+" COP",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de JPY a COP" : {
										resultado = Math.round(convertidor.convertidorJPYaCop(moneda)*100)/100d; 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a pesos colombianos es de: \n$"+resultado+" COP",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de KRW a COP" :{
										resultado = Math.round(convertidor.convertidorKRWaCOP(moneda)*100)/100d; 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a pesos colombianos es de: \n$"+resultado+" COP",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}default:
										break;
								}
							}catch(NumberFormatException e) {			
								JOptionPane.showMessageDialog(null, "¡Error! Debes introducir un valor numerico");
							}catch(NullPointerException e) {
								break;
							}
							break;
						}case "Conversor de medidas":{
							convertidorMedidas medidas = new convertidorMedidas();
							String opcionMedida = (String)JOptionPane.showInputDialog(null, "¿Que conversion deseas ejecutar?. ", "Menu", JOptionPane.QUESTION_MESSAGE, null, arrayMedidas, "Convertir de KM a M");
							if(opcionMedida == null){
								break;
							}
							try {
								double medida = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la cantidad a convertir"));
								double resultado=0;							

							
								switch(opcionMedida) {
									case "Convertir de KM a M": {
										resultado = medidas.convertirKilometrosAMetros(medida); 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a metros es de: \n"+resultado+" M",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de HM a M" : {
										resultado = medidas.convertirHectometrosAMetros(medida); 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a metros es de: \n"+resultado+" M",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de DM a M" : {
										resultado = medidas.convertirDecametrosAMetros(medida); 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a metros es de: \n"+resultado+" M",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de CM a M" : {
										resultado = medidas.convertirCentimetrosAMetros(medida); 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a metros es de: \n"+resultado+" M",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de MM a M" : {
										resultado = medidas.convertirMilimetrosAMetros(medida); 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a metros es de: \n"+resultado+" M",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de M a KM" : {
										resultado = medidas.convertirMetrosAKilometros(medida); 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a kilometros es de: \n"+resultado+" km",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de M a HC" : {
										resultado = medidas.convertirMetrosAHectometros(medida); 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a hectometros es de: \n"+resultado+" Hm",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de M a DC" : {
										resultado = medidas.convertirMetrosADecametros(medida); 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a decametros es de: \n"+resultado+" Dm",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de M a CM" : {
										resultado = medidas.convertirMetrosACentimetros(medida); 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a centimetros es de: \n"+resultado+" Cm",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}case "Convertir de M a MM" :{
										resultado = medidas.convertirMetrosAMilimetros(medida); 
										ejecucion=JOptionPane.showOptionDialog(null, "El total del valor ingresado convertido a milimetros es de: \n"+resultado+" Mm",
												"Resultado", 0, JOptionPane.INFORMATION_MESSAGE, null, opcionesFinales, null);
										break;
									}default:
										break;
								}
							}catch(NumberFormatException e) {			
								// Alerta en caso de que se ingresen datos alfabeticos al introducir datos a convertir
								// Alert us in case the user types an alphabetic value 
								JOptionPane.showMessageDialog(null, "¡Error! Debes introducir un valor numerico");
							}catch(NullPointerException e) {
								break;
							}
							break;
						}
					}
				}catch(NullPointerException e) {		
					
				}	
			}
		}while(ejecucion==0);		
	}	
}
