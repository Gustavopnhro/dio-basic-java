public class CPFFormater {
    public static void main(String[] args) {
        try {
            String formatedCPF = formatCPF("1234567891");
            System.out.println(formatedCPF);
        } catch (InvalidCPFException e) {
            System.out.println("I need 10 digits, please write them again.");
        }
    }

    static String formatCPF(String cpf) throws InvalidCPFException {
        if (cpf.length() != 10)
            throw new InvalidCPFException();
            return "CPF Válido";
    }
}
