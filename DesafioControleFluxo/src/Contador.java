import java.util.Scanner;

public class Contador {


    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);


        System.out.println("Insert the first value");
        int firstValue = terminal.nextInt();

        System.out.println("Insert the second value");
        int secondValue = terminal.nextInt();

        try {
            count (firstValue, secondValue);
            for (int i = 1; i <= (secondValue - firstValue); i++){
                System.out.println("Impressing the number " + i);
            }
        } catch (Exception e) {
            System.out.println("The first value needs to be smaller than second value");
        }        

    }
    static void count(int firstValue, int secondValue) throws InvalidParametersException{
        if (firstValue > secondValue)
            throw new InvalidParametersException();
    }
}
