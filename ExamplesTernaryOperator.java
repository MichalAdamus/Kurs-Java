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
		
	}
}