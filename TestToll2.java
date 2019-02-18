interface Tolls
{
	public void display();
	public void calToll(Truck T);
}
	class Tollbooth implements Tolls {
    int receipt;
    int truckcount;
	Tollbooth() 
	{
        truckcount = 0;
        receipt = 0;
    }
    public void display() 
	{
        System.out.print("Total amount on Receipts: " +receipt+"\n");
       
        System.out.print(" Trucks: " +truckcount+"\n");
        
    }
	public void calToll(Truck T) 
	{
        int axles = T.printAxles();
        int Weight = T.printWeight();
        int tollDue = 5*axles + 10*(Weight/2);
        System.out.print("axles are: " +axles);
        
        System.out.print("weight =: " +Weight);
        
        System.out.print(" Amount due: " +tollDue);
        
       truckcount = truckcount + 1;
       receipt= receipt + tollDue;
    }
    }
interface Truck
{
	public int printAxles();
	public int printWeight();
}
class Trucks extends Tollbooth implements Truck {
    int axles;
    int Weight;
    Trucks(int axles, int Weight) 
	{
        this.axles = axles;
        this.Weight = Weight;
    }
    public int printAxles() 
	{
		return axles;
	}
    public int printWeight() 
	{
		return Weight;
	}
}
class TestToll2 {
    public static void main(String [] args) 
	{
        Tollbooth t = new Tollbooth();		
        Trucks t1 = new Trucks(9, 55000);
        Trucks t2 = new Trucks(2, 1550);
        Trucks t3 = new Trucks(5, 17000);
        t.calToll(t1);
        t.display();
        t.calToll(t2);
        t.display();
        t.calToll(t3);
        t.display();
    }
}