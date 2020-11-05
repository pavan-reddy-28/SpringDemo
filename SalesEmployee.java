
public class SalesEmployee extends Employee {
	private int sales;
	private double netSalary;
	private double commision;
	public SalesEmployee(Address address,int sales,int empId, String name, double salary ) {
		super(empId,name,salary,address);
		this.sales = sales;
		calculateSalary();
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	public double getCommision() {
		return commision;
	}
	public void setCommision(double commision) {
		this.commision = commision;
	}
	void calculateSalary()
	{
		
		if(sales<5000)
		{
			commision=getSalary()*(.02);
			netSalary=commision+getSalary();
		}
		else if(sales<10000)
		{
			commision=getSalary()*(.05);
			netSalary=commision+getSalary();
		}
		else if(sales<15000)
		{
			commision=getSalary()*(.07);
			netSalary=commision+getSalary();
		}
		else
		{
			commision=getSalary()*(.15);
			netSalary=commision+getSalary();
		}
	}
	@Override
	public String toString() {
		return super.getName() + " ::  [sales=" + this.sales + ", netSalary=" + this.netSalary + ", commision=" + this.commision + "]";
	}
	
}