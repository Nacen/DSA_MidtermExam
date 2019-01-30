import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Midterm {
    static Scanner input = new Scanner(System.in);

    public static boolean ValidName(String name) {
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s+]+$");
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

    public static boolean RepeatValidator(String word) {
        return word.equalsIgnoreCase("Y") || word.equalsIgnoreCase("N");
    }

    public static boolean ChoiceValidator(String choice) {
        return choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B")
                || choice.equalsIgnoreCase("C") || choice.equalsIgnoreCase("D")
                || choice.equalsIgnoreCase("E") || choice.equalsIgnoreCase("F");
    }

    public static void BasicDisplay() {
        System.out.println("Basic Display of Hello World");
        System.out.println("This is the basic structure of displaying a String:");
        System.out.println("public class hello {");
        System.out.println("    public static void main (String[] args) {");
        System.out.println("    System.out.println(\"Hello World\");");
        System.out.println("}}");
    }

    public static void ArithmeticOperation() {
        System.out.println("Using Arithmetic Operation");
        System.out.println("Enter two integers:");
        System.out.print("Enter the first integer=>");
        while (!input.hasNextInt()) {
            System.out.println("Wrong input please enter an integer");
            System.out.print("Enter the first integer=>");
            input.next();
        }
        int firstInt = input.nextInt();
        System.out.print("Enter the second integer=>");
        while (!input.hasNextInt()) {
            System.out.println("Wrong input please enter an integer");
            System.out.print("Enter the second integer=>");
            input.next();
        }
        int secondInt = input.nextInt();
        input.nextLine();
        System.out.println("a. Sum =>" + (firstInt + secondInt));
        System.out.println("b. Difference=>" + (firstInt - secondInt));
        System.out.println("c. Product=>" + (firstInt * secondInt));
        double quotient = (double) firstInt / (double) secondInt;
        System.out.println("d. Quotient=>" + quotient);
    }

    public static void DecisionControl() {
        System.out.println("Using Decision Control Structures");
        System.out.println("    Determine an Integer it is ODD or EVEN");
        System.out.println("        A. IF Statement");
        System.out.println("        B. IF ELSE STATEMENT");
        System.out.println("        C. IF ELSE IF STATEMENT");
        String option;
        do {
            System.out.print("      Enter your choice here =>");
            option = input.nextLine();
            if (!(option.equalsIgnoreCase("A") || option.equalsIgnoreCase("B") || option.equalsIgnoreCase("C")))
                System.out.println("Wrong input please try again.");
        }
        while (!(option.equalsIgnoreCase("A") || option.equalsIgnoreCase("B") || option.equalsIgnoreCase("C")));
        System.out.print("      Enter an Integer=>");
        while (!input.hasNextInt()) {
            System.out.println("Wrong input please enter an integer");
            System.out.print("      Enter an Integer=>");
            input.next();
        }
        int number = input.nextInt();
        input.nextLine();
        if (option.equalsIgnoreCase("A")) {
            if (number % 2 == 0)
                System.out.println("The integer " + number + " is an " + "EVEN number.");
            if (number % 2 != 0)
                System.out.println("The integer " + number + " is an " + "ODD number.");
        } else if (option.equalsIgnoreCase("B")) {
            if (number % 2 == 0)
                System.out.println("The integer " + number + " is an " + "EVEN number.");
            else
                System.out.println("The integer " + number + " is an " + "ODD number.");
        } else if (option.equalsIgnoreCase("C")) {
            if (number % 2 == 0)
                System.out.println("The integer " + number + " is an " + "EVEN number.");
            else if (number % 2 != 0)
                System.out.println("The integer " + number + " is an " + "ODD number.");
        }
    }

    public static void SingleArray() {
        int[] numbers = new int[2];
        String[] names = new String[2];
        System.out.println("D. Using Single Array");
        System.out.print("Enter the Start number: ");
        while (!input.hasNextInt()) {
            System.out.println("Wrong input please enter an integer");
            System.out.print("  Enter the Start number=>");
            input.next();
        }
        numbers[0] = input.nextInt();
        System.out.print("Enter the Last number: ");
        while (!input.hasNextInt()) {
            System.out.println("Wrong input please enter an integer");
            System.out.print("  Enter the Last number=>");
            input.next();
        }
        numbers[1] = input.nextInt();
        input.nextLine();
        do {
            System.out.print("Enter First name: ");
            names[0] = input.nextLine();
            if (!ValidName(names[0]))
                System.out.println("Invalid input please try again.");
        }
        while (!ValidName(names[0]));
        do {
            System.out.print("Enter Last name: ");
            names[1] = input.nextLine();
            if (!ValidName(names[1]))
                System.out.println("Invalid input please try again.");
        }
        while (!ValidName(names[1]));
        System.out.println("Display Result: ");
        if (numbers[0] < numbers[1]) {
            for (int i = numbers[0]; i <= numbers[1]; i++) {
                System.out.println(names[0] + "_" + i + "_" + names[1]);
            }
        } else {
            for (int i = numbers[0]; i >= numbers[1]; i--) {
                System.out.println(names[0] + "_" + i + "_" + names[1]);
            }
        }
    }

    public static boolean RepeatMenu(String menu) {
        String repeatMenu;
        do {
            System.out.print("Do you want to try again[Y] to return to " + menu +
                    " menu [N] to return to the main Menu. =>");
            repeatMenu = input.nextLine();
        }
        while (!RepeatValidator(repeatMenu));
        return repeatMenu.equalsIgnoreCase("Y");
    }

    public static void StackQueue() {
        System.out.println("Using Stack and Queue");
        System.out.println("Stack");
        System.out.println("Queue");
        System.out.print("Enter your choice here=>");
        String methodChoice = input.nextLine();
        if (methodChoice.equalsIgnoreCase("Stack")) {
            Stack<String> stack = new Stack<>();
            System.out.println("You choose Stack Method!");
            System.out.println("Enter Five Names: ");
            for (int i = 0; i < 5; i++) {
                String name;
                do {
                    System.out.print("Enter Name#" + (i + 1) + ":");
                    name = input.nextLine();
                    if (!ValidName(name)) {
                        System.out.println("Invalid name please try again");
                    }
                }
                while (!ValidName(name));
                stack.push(name);
            }
            System.out.println("Stack=>" + stack);
            System.out.println("Stack.peek()=>" + stack.peek());
            System.out.println("Stack.size()=>" + stack.size());
            System.out.println("Stack.pop()=>" + stack.pop());
            System.out.println();
            System.out.println("Stack=>" + stack);
            System.out.println("Is Stack Empty =>" + stack.isEmpty());
        } else if (methodChoice.equalsIgnoreCase("Queue")) {
            Queue<String> queue = new LinkedList<>();
            System.out.println("You choose Queue Method!");
            System.out.println("Enter Five Names: ");
            for (int i = 0; i < 5; i++) {
                String name;
                do {
                    System.out.print("Enter Name#" + (i + 1) + ":");
                    name = input.nextLine();
                    if (!ValidName(name)) {
                        System.out.println("Invalid name please try again");
                    }
                }
                while (!ValidName(name));
                queue.add(name);
            }
            System.out.println("Queue=>" + queue);
            System.out.println("Queue.peek()=>" + queue.peek());
            System.out.println("Queue.size()=>" + queue.size());
            System.out.println("Queue.remove()=>" + queue.remove());
            System.out.println();
            System.out.println("Queue=>" + queue);
            System.out.println("Is Queue Empty =>" + queue.isEmpty());
        }
    }

    public static void MainMenu() {
        do {
            String choice = Menu();
            while (!ChoiceValidator(choice)) {
                System.out.println("Wrong input, please try again");
                choice = Menu();
            }
            if (choice.equalsIgnoreCase("A")) {
                boolean repeat;
                do {
                    BasicDisplay();
                    repeat = RepeatMenu("Basic Display of Hello World");
                }
                while (repeat);
            } else if (choice.equalsIgnoreCase("B")) {
                boolean repeat;
                do {
                    ArithmeticOperation();
                    repeat = RepeatMenu("Using Arithmetic Operation");
                }
                while (repeat);
            } else if (choice.equalsIgnoreCase("C")) {
                boolean repeat;
                do {
                    DecisionControl();
                    repeat = RepeatMenu("Using Decision Control Structures");
                }
                while (repeat);
            } else if (choice.equalsIgnoreCase("D")) {
                boolean repeat;
                do {
                    SingleArray();
                    repeat = RepeatMenu("Using Single Array");
                }
                while (repeat);
            } else if (choice.equalsIgnoreCase("E")) {
                boolean repeat;
                do {
                    StackQueue();
                    repeat = RepeatMenu("Using Stack and Queue");
                }
                while (repeat);
            } else if (choice.equalsIgnoreCase("F")) {
                System.out.println("Exiting program.....");
                System.exit(0);
            }
        }
        while (true);
    }

    public static String Menu() {
        System.out.println("Welcome to MIDTERM Practical Exam, please choose a lesson to start an exercise: ");
        System.out.println("    A. Basic Display of Hello World");
        System.out.println("    B. Using Arithmetic Operation");
        System.out.println("    C. Using Decision Control Structures");
        System.out.println("    D. Using Single Array");
        System.out.println("    E. Using Stack and Queue");
        System.out.println("    F. Exit the program");
        System.out.print("Enter your choice here =>");
        return input.nextLine();
    }

    public static void main(String[] args) {
        MainMenu();
    }
}
