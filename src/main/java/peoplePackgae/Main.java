package peoplePackgae;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		People personOne = new People("Savage Sonia", 23 , "Software Engineer");
		People personTwo = new People("Chantelle", 21 , "Retail Assistant");
		People personThree = new People("Tony", 30 , "Professional Catfisher");
		
		ArrayList<People> workers = new ArrayList<People>();
		workers.add(personOne);
		workers.add(personTwo);
		workers.add(personThree);
		
		System.out.println(showEmployees(workers));
		//searchByName(workers,"Savage Sonia");
		
		
	}
	
	public static String showEmployees(ArrayList<People> W) {
		String employees = "";
		for(int i = 0; i < W.size() ; i++) {
			//Fix so that it prinrts out each employee.
			employees = W.get(i).toString();
		}
		return employees;
	}
	
	public static String searchByName(ArrayList<People> W, String name) {
		String employee = "";
		for(int i = 0; i < W.size() ; i++) {
			if(name.equals(W.get(i).getName())) {
				System.out.println(W.get(i).toString());
				break;
			}
			else {
				System.out.println("The person " + name + " doesnt exist");
			}
		}
		
		return employee;
	}
}
