class ExamplesTernaryOperator{

	public static void main(String args[]){
		
		// warunek ? co jeśli prawda : co jeśli fałsz
		
		
		// zad1. na podstawie zmiennej znakowej dodawaj lub odejmuj dwie liczby
		int a, b, result;
		char operator;
		
		a = 3;
		b = 512;
				
		operator = 'x';
		result = (operator == '-') ? (a-b) : (a+b);
		
		System.out.println(result);
		
		// zad2
		double salary = 1569.33;
		double newSalary = salary > 3000 ? salary+400 : salary+800;
		
		System.out.println("Salary: "+salary);
		System.out.println("New salary: "+newSalary);
		
		/*
		-10
		10
		
		10
		*/
		
		// zad3.
		// samochód 1 - 200000.00
		// samochód 2- 55000.121
		double value = 89000.12;
		int option = value < 200000 ? 2 : 1;
		
		System.out.println(option);
				
		
	}
}