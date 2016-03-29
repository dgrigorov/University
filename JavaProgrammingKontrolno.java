package javaprogrammingkontrolno;

class Firm {

    protected String firmName;
    protected String firmAddress;
    protected double startedCapital;
    protected double tax;

    //Default constructor
    public Firm() {
        this.firmName = "No name";
        this.firmAddress = "No address";
        this.startedCapital = 0.;
        this.tax = 0.;
    }
    //Construction with parameters
    public Firm(String firmName, String firmAddress, double startedCapital, double tax) {
        this.firmName = firmName;
        this.firmAddress = firmAddress;
        this.startedCapital = startedCapital;
        this.tax = tax;
    }
    //Increase capital method
    public void increaseCapital(double number) {
        this.startedCapital += number;
    }
    //Increase tax method
    public void increaseTax(double number) {
        this.tax += number;
    }
    //Decrease tax method
    public void decreaseTax(double number) {
        this.tax -= number;
    }
    //Print all info method
    public void printData() {
        System.out.format("Firm name: %s\nFirm address: %s\nStarted capital: %d\nTax: %f",
                this.firmName, this.firmAddress, this.startedCapital, this.tax);
    }
}

class SweeatmeatWorkshop extends Firm {

    protected int workshopCapacity;
    protected int sweetmeatNumber;
    protected double sweetmeatPrice;
    protected double sweetmeatMarketPrice;

    //Default constructor
    public SweeatmeatWorkshop() {
        this.workshopCapacity = 0;
        this.sweetmeatNumber = 0;
        this.sweetmeatPrice = 0.;
        this.sweetmeatMarketPrice = 0.;
    }
    //Construction with parameters
    public SweeatmeatWorkshop(int workshopCapacity, int sweetmeatNumber, double sweetmeatPrice, double sweetmeatMarketPrice) {
        this.workshopCapacity = workshopCapacity;
        this.sweetmeatNumber = sweetmeatNumber;
        this.sweetmeatPrice = sweetmeatPrice;
        this.sweetmeatMarketPrice = sweetmeatMarketPrice;
    }
    
    public void SweetmeatManifacturing(int number){
        this.sweetmeatNumber += number;
        if (this.sweetmeatNumber < workshopCapacity) {
            this.startedCapital -= sweetmeatMarketPrice - sweetmeatPrice;
        }
        else {
            System.out.println("Overflow sweety workshop capacity.");
        }
    }
    
    public void SellSweemeat(int number) {
        this.sweetmeatNumber -= number;
        this.startedCapital += sweetmeatMarketPrice - sweetmeatPrice;
    }
    
    public void CalculateProfit() {
    //TODO
    }
}

class Pharmacy extends Firm {

    protected short pharmacyCategories;
    //Default constructor
    public Pharmacy() {
        this.pharmacyCategories = 0;
    }
    //Construction with parameters
    public Pharmacy(short categories) {
        this.pharmacyCategories = categories;
    }
    //Print all info method
    @Override
    public void printData() {
        System.out.format("Firm name: %s\nFirm address: %s\nPharmacy categories: %d\n",
                this.firmName, this.firmAddress, this.startedCapital);
    }
}

public class JavaProgrammingKontrolno {
    public static void main(String[] args) {
        
    }
}
