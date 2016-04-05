package StockERP;

import java.util.ArrayList;

class Automobile extends Machine{
	public Automobile(long idNumber, String brand, String model) {
		super(idNumber, brand, model);
		// TODO Auto-generated constructor stub
	}
	
	private int numberManifacturedCars;
	private double change;
	private Material numberOfMaterial[];
	private ArrayList<Material> materials;
}
