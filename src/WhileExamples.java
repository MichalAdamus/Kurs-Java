public class WhileExamples {

    public static void main(String[] args) {
        // sumowanie liczb (bez pętli)
        int[] numbers = {4,4,5,3,2,5,5,2,2,2,5,5,5,6,7,7,8,8,8,9};
        int sum = 0;
        sum+=numbers[0];
        sum+=numbers[1];
        sum+=numbers[2];
        sum+=numbers[3];
        System.out.println("Sum: "+sum);


        // przy pomocy pęli
        sum = 0;
        int f = 0;
        while(f < numbers.length){
            sum+=numbers[f];
            f++;
        }
        System.out.println("Sum: "+sum);
    }
}
