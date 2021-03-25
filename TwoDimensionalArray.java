class TwoDimensionalArray {
	
	public static void main(String args[]){
		//System.out.println("Pierwszym parametrem, jest: "+args[0]);
		
		int[][] multiTable = new int[3][3];
		
		System.out.println("--------- tabliczka mnożenia ----------");
		System.out.println(multiTable[0][0]+""+multiTable[0][1]+""+multiTable[0][2]);
		System.out.println(multiTable[1][0]+""+multiTable[1][1]+""+multiTable[1][2]);
		System.out.println(multiTable[2][0]+""+multiTable[2][1]+""+multiTable[2][2]);
		
		multiTable[0][0] = 1;
		multiTable[0][1] = 50;
		multiTable[0][2] = -5;
		
		multiTable[1][0] = 2;
		multiTable[2][0] = 3;
		
		multiTable[1][1] = multiTable[1][0] * multiTable[0][1];
		multiTable[1][2] = multiTable[1][0] * multiTable[0][2];
		
		multiTable[2][1] = multiTable[2][0] * multiTable[0][1];
		multiTable[2][2] = multiTable[2][0] * multiTable[0][2];
		
		System.out.println("--------- tabliczka mnożenia ----------");
		System.out.println(multiTable[0][0]+""+multiTable[0][1]+""+multiTable[0][2]);
		System.out.println(multiTable[1][0]+""+multiTable[1][1]+""+multiTable[1][2]);
		System.out.println(multiTable[2][0]+""+multiTable[2][1]+""+multiTable[2][2]);
		
		
		// przechowaj 5 imion trzyliterowe
		char[][] names = new char[5][3];
		
		System.out.println("------------ imiona -------------");
		System.out.println(names[0][0]+""+names[0][1]+""+names[0][2]+"");
		System.out.println(names[1][0]+""+names[1][1]+""+names[1][2]+"");
		System.out.println(names[2][0]+""+names[2][1]+""+names[2][2]+"");
		System.out.println(names[3][0]+""+names[3][1]+""+names[3][2]+"");
		System.out.println(names[4][0]+""+names[4][1]+""+names[4][2]+"");
				
		
		// ola
		names[0][0] = 'o';
		names[0][1] = 'l';
		names[0][2] = 'a';
		
		// ala
		names[1][0] = 'a';
		names[1][1] = 'l';
		names[1][2] = 'a';
		
		// iga
		names[4][0] = 'i';
		names[4][1] = 'g';
		names[4][2] = 'a';
		
		// aga
		names[2][0] = 'a';
		names[2][1] = 'g';
		names[2][2] = 'a';
		
		
		System.out.println("------------ imiona -------------");
		System.out.println(names[0][0]+""+names[0][1]+""+names[0][2]+"");
		System.out.println(names[1][0]+""+names[1][1]+""+names[1][2]+"");
		System.out.println(names[2][0]+""+names[2][1]+""+names[2][2]+"");
		System.out.println(names[3][0]+""+names[3][1]+""+names[3][2]+"");
		System.out.println(names[4][0]+""+names[4][1]+""+names[4][2]+"");
		
		
		
		/*************  names2 ***********/
		char[][] names2 = {{'o','l','a'}, {'a','l','a'}, {'a','g','a'}, {' ',' ',' '}, {'i','g','a'}};
		System.out.println("------------ imiona -------------");
		System.out.println(names2[0][0]+""+names2[0][1]+""+names2[0][2]+"");
		System.out.println(names2[1][0]+""+names2[1][1]+""+names2[1][2]+"");
		System.out.println(names2[2][0]+""+names2[2][1]+""+names2[2][2]+"");
		System.out.println(names2[3][0]+""+names2[3][1]+""+names2[3][2]+"");
		System.out.println(names2[4][0]+""+names2[4][1]+""+names2[4][2]+"");
		
		
		/********** tablica nieregularna *************/
		// zapisz imiona pracowników Marek, Krzysztof, Anna, Kasia.
		char[][] employees = new char[4][];
		employees[0] = new char[5];
		employees[1] = new char[9];
		employees[2] = new char[4];
		employees[3] = new char[5];
		
		System.out.println("------------ pracownicy -------------");
		System.out.println(employees[0][0]+""+employees[0][1]+""+employees[0][2]+""+employees[0][3]+""+employees[0][4]);
		System.out.println(employees[1][0]+""+employees[1][1]+""+employees[1][2]+""+employees[1][3]+""+employees[1][4]+""+employees[1][5]+""+employees[1][6]+""+employees[1][7]+""+employees[1][8]);
		System.out.println(employees[2][0]+""+employees[2][1]+""+employees[2][2]+""+employees[2][3]);
		System.out.println(employees[3][0]+""+employees[3][1]+""+employees[3][2]+""+employees[3][3]+""+employees[3][4]);
		
		employees[0][0] = 'M';
		employees[0][1] = 'a';
		employees[0][2] = 'r';
		employees[0][3] = 'e';
		employees[0][4] = 'k';
		
		employees[1][0] = 'K';
		employees[1][1] = 'r';
		employees[1][2] = 'z';
		employees[1][3] = 'y';
		employees[1][4] = 's';
		employees[1][5] = 'z';
		employees[1][6] = 't';
		employees[1][7] = 'o';
		employees[1][8] = 'f';
		
		System.out.println("------------ pracownicy -------------");
		System.out.println(employees[0][0]+""+employees[0][1]+""+employees[0][2]+""+employees[0][3]+""+employees[0][4]);
		System.out.println(employees[1][0]+""+employees[1][1]+""+employees[1][2]+""+employees[1][3]+""+employees[1][4]+""+employees[1][5]+""+employees[1][6]+""+employees[1][7]+""+employees[1][8]);
		System.out.println(employees[2][0]+""+employees[2][1]+""+employees[2][2]+""+employees[2][3]);
		System.out.println(employees[3][0]+""+employees[3][1]+""+employees[3][2]+""+employees[3][3]+""+employees[3][4]);

		
		System.out.println("Liczba pracowników: "+employees.length);
		System.out.println("Imię pracownika drugiego ma długość: "+employees[1].length);
		
	}
}