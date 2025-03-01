import javax.swing.JOptionPane;

public class B225 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;
        String result;
        strNum1 = JOptionPane.showInputDialog(null, "Enter the first number:", "Input", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Enter the second number:", "Input", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String quotient;
        if (num2 != 0) {
            quotient = String.valueOf(num1 / num2);
        } else {
            quotient = "Undefined (cannot divide by zero)";
        }
        result = "Sum: " + sum +
                 "\nDifference: " + difference +
                 "\nProduct: " + product +
                 "\nQuotient: " + quotient;
        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
