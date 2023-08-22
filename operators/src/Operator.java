public class Operator {
    public static void main(String[] args) throws Exception {
        //attribution operator "="

        int age = 23;

        //arithmetical operators + - * / % ()

        int numberOne = 20;
        int numberTwo = 5;

        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne / numberTwo);
        System.out.println(numberOne % numberTwo);

        

        //unitary operators ++ -- + - !
        int year = 2023;

        year++;
        year--;

        if (!(year == 2023))
            System.out.println("Correct year");
        else
            System.out.println("Incorrect year");


        //ternary operator
        int yearternary = 2023;

        String updated = (yearternary == 2023) ? "Updated" : "Need update";
        System.out.println(updated);


        //logical operator
        boolean aLogical, bLogical;

        aLogical = true;
        bLogical = false;

        System.out.println(aLogical && bLogical); //and
        System.out.println(aLogical || bLogical); //or


        //relational operators
        int a, b;

        a = 2;
        b = 1;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);



    }


    
    
}
