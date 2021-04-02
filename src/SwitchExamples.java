public class SwitchExamples {
    public static void main(String[] args) {
        // zadanie, dodawanie dwóch wartości
        double a = 453333;
        double b = 11;
        char option = '/';

        double result;
        switch (option){
            case '-':
                result = a-b;
                System.out.println(a+"-"+b+"="+result);
                break;
            case '+':
                result = a+b;
                System.out.println(a+"+"+b+"="+result);
                break;
            case '*':
                result = a*b;
                System.out.println(a+"*"+b+"="+result);
                break;
            case '/':
                result = a/b;
                System.out.println(a+"/"+b+"="+result);
                break;
        }
    }
}
