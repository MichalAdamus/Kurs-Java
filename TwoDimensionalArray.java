class TwoDimensionalArray {
	
	public static void main(String args[]){
		//System.out.println("Pierwszym parametrem, jest: "+args[0]);
		
		int[][] multiTable = new int[3][3];
		
		System.out.println("--------- tabliczka mnożenia ----------");
		System.out.println(multiTable[0][0]+"\t"+multiTable[0][1]+"\t"+multiTable[0][2]);
		System.out.println(multiTable[1][0]+"\t"+multiTable[1][1]+"\t"+multiTable[1][2]);
		System.out.println(multiTable[2][0]+"\t"+multiTable[2][1]+"\t"+multiTable[2][2]);
		
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
		System.out.println(multiTable[0][0]+"\t"+multiTable[0][1]+"\t"+multiTable[0][2]);
		System.out.println(multiTable[1][0]+"\t"+multiTable[1][1]+"\t"+multiTable[1][2]);
		System.out.println(multiTable[2][0]+"\t"+multiTable[2][1]+"\t"+multiTable[2][2]);
	}
}