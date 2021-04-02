public class WhileExamples {

    public static void main(String[] args) {
        /***************************************** sumowanie liczb ***********************/
        // bez pętli
        int[] numbers = {4, 4, 5, 3, 2, 5, 5, 2, 2, 2, 5, 5, 5, 6, 7, 7, 8, 8, 8, 9};
        int sum = 0;
        sum += numbers[0];
        sum += numbers[1];
        sum += numbers[2];
        sum += numbers[3];
        System.out.println("Sum: " + sum);


        // przy pomocy pęli
        sum = 0;
        int f = 0;
        while (f < numbers.length) {
            sum += numbers[f];
            f++;
        }
        System.out.println("Sum: " + sum);

        /********** wyświetlanie imienia ***********************/
        char[] name = {'K', 'r', 'z', 'y', 's', 'z', 't', 'o', 'f'};
//        char[] name = {'A','n','n','a'};
        int i = 0;
        while (i < name.length) {
            System.out.print(name[i]);
            i++;
        }
        System.out.println();
        /************ wyświetlanie tablicy dwuwymiarowej *************/
        int[][] numbers2 = {{1, 2, 3, 5, 3, 1}, {4, 5}, {6}, {2,5,2,1}, {1,4,41,1}};

        int row = 0;
        while(row < numbers2.length) {
            int x = 0;
            while (x < numbers2[row].length) {
                System.out.print(numbers2[row][x] + "\t"); // x = 0
                x++;
            }
            System.out.println();
            row++;
        }



    }
}
