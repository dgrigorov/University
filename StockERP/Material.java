package StockERP;

public class Material implements Stock {
	private long idNumber;
	private double manifacturedPrice;
	private double margin;
	private int manifacturedStocks;
	
	public Material(long idNumber, double manifacturedPrice, double change, int manifacturedStocks) {
		this.idNumber = idNumber;
		this.manifacturedPrice = manifacturedPrice;
		this.margin = margin;
		this.manifacturedStocks = manifacturedStocks;
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
