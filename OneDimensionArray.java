class OneDimensionArray{
	public static void main(String args[]){
		// deklaracja i alokacja
		char[] name = new char[5];
		char[] surname = new char[11];
		int age;
		
		// inicjalizację
		name[0] = 'K';
		name[1] = 'a';
		name[2] = 'r';
		name[3] = 'o';
		name[4] = 'l';
		
		surname[0] = 'M'; 
		surname[1] = 'i';
		surname[2] = 'c';
		surname[3] = 'h';
		surname[4] = 'n';
		surname[5] = 'i';
		surname[6] = 'e';
		surname[7] = 'w';
		surname[8] = 'i';
		surname[9] = 'c';
		surname[10] = 'z';
		
		age = 22;
		
		
		// wyświetlenie
		System.out.println("----------------------------");
		System.out.print("\tName: ");
		System.out.print(name[0]);
		System.out.print(name[1]);
		System.out.print(name[2]);
		System.out.print(name[3]);
		System.out.print(name[4]);
		System.out.println();
		
		System.out.print("\tSurname: "+surname[0]+""+surname[1]+""+surname[2]);
		System.out.print(surname[3]);
		System.out.print(surname[4]);
		System.out.print(surname[5]);
		System.out.print(surname[6]);
		System.out.print(surname[7]);
		System.out.print(surname[8]);
		System.out.print(surname[9]);
		System.out.print(surname[10]);
		System.out.print("["+surname.length+"]");
		System.out.println();
		
		System.out.println("\tAge: "+age);
		
		System.out.println("----------------------------");
		
		// surname = M i c h n i e w i c z 
		// 3 index z 10
		// surname[3] = surname[10];
		// surname = M i c z n i e w i c z 
		// surname[10] = surname[3];
		// surname = M i c z n i e w i c z 
		
		/* zamiana x i y
		z = x;
		x = y;
		y = z;
		*/
		
		// surname = M i c h n i e w i c z 
		// 3 index z 10
		char tmp = surname[3];
		// surname = M i c h n i e w i c z |  tmp = h
		surname[3] = surname[10];
		// surname = M i c z n i e w i c z |  tmp = h
		surname[10] = tmp;
		// surname = M i c z n i e w i c h |  tmp = h
		
		
		
		// 1, 5, 2, 4  =>   1, 4, 2, 5  (zamiana 5 i 4)
		// 1, 4, 2, 5  =>  1, 2, 4, 5  (zamiana 4 i 2)

		System.out.print("\tSurname: "+surname[0]+""+surname[1]+""+surname[2]);
		System.out.print(surname[3]);
		System.out.print(surname[4]);
		System.out.print(surname[5]);
		System.out.print(surname[6]);
		System.out.print(surname[7]);
		System.out.print(surname[8]);
		System.out.print(surname[9]);
		System.out.print(surname[10]);
		System.out.print("["+surname.length+"]");
		System.out.println();
	}
}