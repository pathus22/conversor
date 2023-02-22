
public class convertidorDivisas {
	
	//Clase que contiene como atributos el precio actual de las divisas segun el precio colombiano
	
	private double dolar = 4883.08;
	private double euro = 5232.96;
	private double libraEsterlina = 5881.19;
	private double yen = 36.41;
	private double wonSul = 3.77;

	
	public convertidorDivisas() {
	}
	
	//Metodos de conversion para cada tipo de moneda
	
	public double convertidorCOPaUSD(double COP){
		
		double conversion = (COP*1)/dolar;
		
		return conversion;
	}
	
	public double convertidorCOPaEUR(double COP){
		
		double conversion = (COP*1)/euro;
		
		return conversion;
	}

	public double convertidorCOPaGBP(double COP){
	
		double conversion = (COP*1)/libraEsterlina;
	
		return conversion;
	}
	
	public double convertidorCOPaJPY(double COP){
	
		double conversion = (COP*1)/yen;
	
		return conversion;
	}

	public double convertidorCOPaKRW(double COP){
	
		double conversion = (COP*1)/wonSul;
	
		return conversion;
	}
	
	public double convertidorUSDaCop(double USD){
	
		double conversion = USD*dolar;
		
		return conversion;
	}
	
	public double convertidorEURaCOP(double EUR){
		
		double conversion = EUR*euro;
		
		return conversion;
	}

	public double convertidorGBPaCOP(double GBP){
	
		double conversion = GBP*libraEsterlina;
	
		return conversion;
	}
	
	public double convertidorJPYaCop(double JPY){
	
		double conversion = JPY*yen;
	
		return conversion;
	}

	public double convertidorKRWaCOP(double KRW){
	
		double conversion = KRW*wonSul;
	
		return conversion;
	}
	
}
