public class School {
    public static void main(String[] args) {
        String students[] = {"Gustav", "Erick", "Dylan", "Gabriel", "William", "John"};
        int n = 0;

        for (int x = 0; x < students.length ; x++)
        {
            System.out.println("The student in index x  = " + x + " is "+ students[x]);
        }


        while (n != 9)
        {
            n++;
            System.out.println(n);
        }
    }
}
