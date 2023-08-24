public class FlowControl {
    public static void main(String[] args) throws Exception {
        int variableA = 10;
        int variableB = 7;

        //simple
        if (variableA < variableB)
            System.out.println("Variable B is bigger");

        // compost
        if (variableA > variableB)
            System.out.println("Variable B is minor");
        
        else 
            System.out.println("Variblae A is minor");


        //chained
        if (variableA < variableA)
            System.out.println("Variable A is minor");
        else if (variableA == variableB)
            System.out.println("Equal");
        else
            System.out.println("Variable B is minor");


        //ternary 
        String result = (variableA == variableB) ? "Equal" : "Different";
        System.out.println(result);

        
    }
}
