import java.util.Scanner;

public class SciCalculator {

    public static void main(String[] args) {

        //A change for Lab11
        double currentValue = 0.0;
        System.out.println("Current Result: " + currentValue);
        double sumOfCalculations = 0;
        double numOfCalculations = 0;
        double result = 0;
        boolean menuSwitch = true;
        while (menuSwitch == true){
            System.out.print("\nCalculator Menu" +
                    "\n--------------- " +
                    "\n0. Exit Program" +
                    "\n1. Addition" +
                    "\n2. Subtraction" +
                    "\n3. Multiplication" +
                    "\n4. Division" +
                    "\n5. Exponentiation" +
                    "\n6. Logarithm" +
                    "\n7. Display Average" +
                    "\nEnter Menu Selection: ");
            Scanner myInput = new Scanner(System.in);
            menuSwitch = false;
            int userInput = myInput.nextInt();

            if(userInput ==0){
                System.out.println("Thanks for using this calculator. Goodbye! ");
            }

            else if (userInput >7 || userInput < 0) {
                System.out.println("Error: Invalid selection!" +
                        "\nEnter Menu Selection: ");
                userInput = myInput.nextInt();

            }
            else if(userInput == 7) {
                if (numOfCalculations >0){
                    System.out.print("Sum of calculations: " );
                    System.out.printf("%.2f",sumOfCalculations);
                    System.out.println( "\nNumber of calculations: " + numOfCalculations +  "\nAverage of calculations: " );
                    System.out.printf("%.2f",(sumOfCalculations/numOfCalculations));
                    menuSwitch = true;}
                else {System.out.println("Error: No calculations yet to average!" +"\nEnter Menu Selection: ");
                    userInput = myInput.nextInt();
                    function(userInput, menuSwitch, numOfCalculations, sumOfCalculations, currentValue, myInput);
                }}

            else if ((userInput <= 6 && userInput >= 1) || !myInput.hasNextInt()){
                System.out.print("Enter first operand: ");
                Double firstOperand = myInput.nextDouble();

                System.out.print("Enter second operand: ");
                Double secondOperand = myInput.nextDouble();
                switch (userInput){
                    case 1:
                        currentValue = firstOperand + secondOperand;
                        result = currentValue;
                        sumOfCalculations += currentValue;
                        numOfCalculations+=1;
                        break;
                    case 2:
                        currentValue = firstOperand - secondOperand;
                        result = currentValue;
                        sumOfCalculations += currentValue;
                        numOfCalculations+=1;
                        break;
                    case 3:
                        currentValue = firstOperand * secondOperand;
                        result = currentValue;
                        sumOfCalculations += currentValue;
                        numOfCalculations+=1;
                        break;
                    case 4:
                        currentValue = firstOperand / secondOperand;
                        result = currentValue;
                        sumOfCalculations += currentValue;
                        numOfCalculations+=1;
                        break;
                    case 5:
                        currentValue = Math.pow(firstOperand,secondOperand);
                        result = currentValue;
                        sumOfCalculations += currentValue;
                        numOfCalculations +=1;
                        break;
                    case 6:
                        currentValue = Math.log(secondOperand)/Math.log(firstOperand);
                        result = currentValue;
                        sumOfCalculations += currentValue;
                        numOfCalculations +=1;
                        break;
                }
                System.out.println("Current Result: " + currentValue);
                menuSwitch = true;
            }
                       }
        }

        public static void function(int userInput, boolean menuSwitch, double numOfCalculations, double sumOfCalculations, double currentValue, Scanner myInput){if(userInput ==0){
            System.out.println("Thanks for using this calculator. Goodbye! ");
        }

        else if (userInput >7 || userInput < 0) {
            System.out.println("Error: Invalid selection!" +
                    "\nEnter Menu Selection: ");
            userInput = myInput.nextInt();

        }
        else if(userInput == 7) {
            if (numOfCalculations >0){
                System.out.print("Sum of calculations: " );
                System.out.printf("%.2f",sumOfCalculations);
                System.out.println( "\nNumber of calculations: " + numOfCalculations +  "\nAverage of calculations: " );
                System.out.printf("%.2f",(sumOfCalculations/numOfCalculations));
                menuSwitch = true;}
            else {System.out.println("Error: No calculations yet to average!" +"\nEnter Menu Selection: ");
                userInput = myInput.nextInt();
            }}

        else if ((userInput <= 6 && userInput >= 1) || !myInput.hasNextInt()){
            System.out.print("Enter first operand: ");
            Double firstOperand = myInput.nextDouble();

            System.out.print("Enter second operand: ");
            Double secondOperand = myInput.nextDouble();
            switch (userInput){
                case 1:
                    currentValue = firstOperand + secondOperand;
                    sumOfCalculations += currentValue;
                    numOfCalculations+=1;
                    break;
                case 2:
                    currentValue = firstOperand - secondOperand;
                    sumOfCalculations += currentValue;
                    numOfCalculations+=1;
                    break;
                case 3:
                    currentValue = firstOperand * secondOperand;
                    sumOfCalculations += currentValue;
                    numOfCalculations+=1;
                    break;
                case 4:
                    currentValue = firstOperand / secondOperand;
                    sumOfCalculations += currentValue;
                    numOfCalculations+=1;
                    break;
                case 5:
                    currentValue = Math.pow(firstOperand,secondOperand);
                    sumOfCalculations += currentValue;
                    numOfCalculations +=1;
                    break;
                case 6:
                    currentValue = Math.log(secondOperand)/Math.log(firstOperand);
                    sumOfCalculations += currentValue;
                    numOfCalculations +=1;
                    break;
            }}
    }}




