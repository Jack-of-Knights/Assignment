package java_lab_3a;

public class Java_Lab_3a {

    public static void main(String[] args) {
        
        int size = args.length;
        
        if (size < 3) {
           System.out.println("Error: Too few arguments.");            
        }
            
        else {
            double operand1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double operand2 = Double.parseDouble(args[2]);
            
            switch (operator) {
            case "+":
                System.out.println(operand1 + " " + operator + " " + operand2 + " = " + (operand1 + operand2));
                break;
            
            case "-":
                System.out.println(operand1 + " " + operator + " " + operand2 + " = " + (operand1 - operand2));
                break;
            
            case "X":
                System.out.println(operand1 + " " + operator + " " + operand2 + " = " + (operand1 * operand2));
                break;
                
            case "/":
                if (operand2 == 0) {
                    System.out.println("Error: Cannot divide by 0.");
                }
                else {
                    System.out.println(operand1 + " " + operator + " " + operand2 + " = " + (operand1 / operand2));
                    break;
                }   
        }
            
        }
        
    }
    
}
