package peoplePackgae;

public class People {
/////////////Attributes////////////////////
	private String Name;
	private int Age;
	private String JobTitle;
	
	
////////////Constructors////////////////
	public People(String VName, int VAge, String VJobTitle) {
		this.Name = VName;
		this.Age = VAge;
		this.JobTitle = VJobTitle;
	}
	
	
	/////Methods/////////////
	
	public String getName() {
		return this.Name;
	}
	
	public int getAge() {
		return this.Age;
	}
	
	public String getJobTitle() {
		return this.JobTitle;
	}
	
	public String toString() {
		return getName() + " " +
	           getAge() + " " +
			   getJobTitle();
	}
}
