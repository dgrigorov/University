/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;


class Building{
     protected String address;
     protected double buildedArea;
     protected int floors;
     protected double pricePerMeter;
     
     public Building(){
         this.address = "";
         this.buildedArea = 0;
         this.floors = 0;
         this.pricePerMeter = 0;
     }
     
     public Building(String address, double buildedArea,int floors,double pricePerMeter){
         this.address = address;
         this.buildedArea = buildedArea;
         this.floors = floors;
         this.pricePerMeter = pricePerMeter;
     }
    
     public double CalculateBuildingPrice(){
         double floorPrice = this.pricePerMeter*buildedArea;
         return floorPrice*this.floors;
     }
     
     public double CalculateArea(){ //capacity
         return floors*buildedArea;
     }
     
     public void PrintFullArea(){
         System.out.println(this.CalculateArea());
     }
     
     public void PrintData(){
         System.out.format("Address = %s\nBuildedArea = %f\nFloors = %d\nPricePerMeter = %f\n"
                 , this.address
                 ,this.buildedArea
                 ,this.floors
                 ,this.pricePerMeter);
     }
}

class Pomeshtenie {
    protected double area;
    protected double pricePerMeter;
    protected int floor;
    protected int number;
    
    public Pomeshtenie(){
         this.area = 0.;
         this.pricePerMeter = 0.;
         this.floor = 0;
         this.number = 0;
     }
    
    public double CalculatePomeshteniePrice() {
        return area*pricePerMeter;
    }
    
    public double CapacityPomeshtenie() {
        return area;
    }
    
    public void PrintData(){
         System.out.format("Area = %f\nPrice per meter = %f\nFloors = %d\nNumber = %d\n"
                 , this.area
                 ,this.pricePerMeter
                 ,this.floor
                 ,this.number);
     }
}

class OfficeBuilding extends Building{
    protected int numberOffices;
    
}



public class Inheritance {
   public static void main(String[] args) {
        Building b = new Building("Ovcha Kupel 2",143.33,7,23.50);
        
        
    }
    
}
