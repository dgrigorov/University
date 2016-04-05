package StockERP;

public abstract class Machine implements Stock{
	private final long idNumber;
	private final String brand;
	private final String model;
	
	public Machine(long idNumber, String brand, String model) {
		this.idNumber = idNumber;
		this.brand = brand;
		this.model = model;
	}
	
	public double getPriceOfManifacturing() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getMarketPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getManifacturingPriceAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getMarketPriceAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void printData() {
		// TODO Auto-generated method stub
		
	}
	
}
