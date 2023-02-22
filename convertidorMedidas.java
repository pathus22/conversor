
public class convertidorMedidas {
	
	private double kilometro = 1000;
	private double hectometro = 100;
	private double decametro = 10;
	private double metro = 1;
	private double centimetro = 0.01;
	private double milimetro = 0.001;
	
	public convertidorMedidas() {
		
	}
	public double convertirMetrosAKilometros(double metros) {
		
		double conversion = (metros*1)/kilometro;
		return conversion;
	}
	public double convertirMetrosAHectometros(double metros) {
			
			double conversion = (metros*1)/hectometro;
			return conversion;
	}
	public double convertirMetrosADecametros(double metros) {
		
		double conversion = (metros*1)/decametro;
		return conversion;
	}
	public double convertirMetrosACentimetros(double metros) {

		
		double conversion =(metros*(0.01*10000))/metro;
							
		return conversion;
	}
	public double convertirMetrosAMilimetros(double metros) {
		
		double conversion = (metros*(0.01*1000000))/metro;
		return conversion;
	}
	public double convertirKilometrosAMetros(double kilometros) {

		double conversion = kilometros*kilometro;
		return conversion;
	}
	public double convertirHectometrosAMetros(double hectometros) {
			
			double conversion = hectometros*hectometro;
			return conversion;
	}
	public double convertirDecametrosAMetros(double decametros) {
		
		double conversion = decametros*decametro;
		return conversion;
	}
	public double convertirCentimetrosAMetros(double centimetros) {
		
		double conversion = centimetros/100;
		return conversion;
	}
	public double convertirMilimetrosAMetros(double milimetros) {
			
			double conversion = milimetros/1000;
			return conversion;
	}
	
}
