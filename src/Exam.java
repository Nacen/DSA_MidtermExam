import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menu = false;
        do {
            System.out.println("Welcome to MIDTERM Practical Exam, please choose a lesson to start an exercise: ");
            System.out.println("    A. Basic Display of Hello World");
            System.out.println("    B. Using Arithmetic Operation");
            System.out.println("    C. Using Decision Control Structures");
            System.out.println("    D. Using Single Array");
            System.out.println("    E. Using Stack and Queue");
            System.out.println("    F. Exit the program");
            System.out.print("Enter your choice here =>");
            String choice = input.nextLine();

            if (!(choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B")
                    || choice.equalsIgnoreCase("C") || choice.equalsIgnoreCase("D")
                    || choice.equalsIgnoreCase("D") || choice.equalsIgnoreCase("E")
                    || choice.equalsIgnoreCase("F"))) {
                System.out.println("Wrong input, please try again");
                System.out.println("Welcome to MIDTERM Practical Exam, please choose a lesson to start an exercise: ");
                System.out.println("    A. Basic Display of Hello World");
                System.out.println("    B. Using Arithmetic Operation");
                System.out.println("    C. Using Decision Control Structures");
                System.out.println("    D. Using Single Array");
                System.out.println("    E. Using Stack and Queue");
                System.out.println("    F. Exit the program");
                System.out.print("Enter your choice here =>");
                choice = input.nextLine();
            }

            if (choice.equalsIgnoreCase("A")) {
                System.out.println("Basic Display of Hello World");
                System.out.println("This is the basic structure of displaying a String:");
                System.out.println("public class hello {");
                System.out.println("    public static void main (String[] args) {");
                System.out.println("    System.out.println(\"Hello World\");");
                System.out.println("}}");
                System.out.print("Do you want to try again[Y] to return to Basic Display " +
                        "of Hello World menu and [N] to return to the main Menu. =>");
                String tryChoice = input.nextLine();
                while (tryChoice.equalsIgnoreCase("Y")) {
                    System.out.println("Basic Display of Hello World");
                    System.out.println("This is the basic structure of displaying a String:");
                    System.out.println("public class hello {");
                    System.out.println("    public static void main (String[] args) {");
                    System.out.println("    System.out.println(\"Hello World\");");
                    System.out.println("}}");
                    System.out.print("Do you want to try again[Y] to return to Basic Display " +
                            "of Hello World menu and [N] to return to the main Menu. =>");
                    tryChoice = input.nextLine();
                }
                if (tryChoice.equalsIgnoreCase("N")) {
                    menu = true;
                }
            }

            if (choice.equalsIgnoreCase("B")) {
                System.out.println("Using Arithmetic Operation");
                System.out.println("Enter two integers:");
                System.out.print("Enter the first integer=>");
                int firstInt = input.nextInt();
                System.out.print("Enter the second integer=>");
                int secondInt = input.nextInt();
                input.nextLine();
                System.out.println("a. Sum =>" + (firstInt + secondInt));
                System.out.println("b. Difference=>" + (firstInt - secondInt));
                System.out.println("c. Product=>" + (firstInt * secondInt));
                double quotient = (double) firstInt / (double) secondInt;
                System.out.println("d. Quotient=>" + quotient);
                System.out.print("Do you want to try again[Y] to return to Using Arithmetic Operation" +
                        " menu and [N] to return to the main Menu. =>");
                String tryChoice = input.nextLine();
                while (tryChoice.equalsIgnoreCase("Y")) {
                    System.out.println("Using Arithmetic Operation");
                    System.out.println("Enter two integers:");
                    System.out.print("Enter the first integer=>");
                    firstInt = input.nextInt();
                    System.out.print("Enter the second integer=>");
                    secondInt = input.nextInt();
                    input.nextLine();
                    System.out.println("a. Sum =>" + (firstInt + secondInt));
                    System.out.println("b. Difference=>" + (firstInt - secondInt));
                    System.out.println("c. Product=>" + (firstInt * secondInt));
                    quotient = (double) firstInt / (double) secondInt;
                    System.out.println("d. Quotient=>" + quotient);
                    System.out.print("Do you want to try again[Y] to return to Using Arithmetic Operation " +
                            "menu and [N] to return to the main Menu. =>");
                    tryChoice = input.nextLine();
                }
                if (tryChoice.equalsIgnoreCase("N")) {
                    menu = true;
                }
            }

            if (choice.equalsIgnoreCase("C")) {
                System.out.println("Using Decision Control Structures");
                System.out.println("    Determine an Integer it is ODD or EVEN");
                System.out.println("        A. IF Statement");
                System.out.println("        B. IF ELSE STATEMENT");
                System.out.println("        C. IF ELSE IF STATEMENT");
                System.out.print("      Enter your choice here =>");
                String option = input.nextLine();
                System.out.print("      Enter an Integer=>");
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
                System.out.print("Do you want to try again[Y] to return to Using Decision Control Structures menu " +
                        "and [N] to return to the main Menu. =>");
                String tryChoice = input.nextLine();

                while (tryChoice.equalsIgnoreCase("Y")) {
                    System.out.println("Using Decision Control Structures");
                    System.out.println("    Determine an Integer it is ODD or EVEN");
                    System.out.println("        A. IF Statement");
                    System.out.println("        B. IF ELSE STATEMENT");
                    System.out.println("        C. IF ELSE IF STATEMENT");
                    System.out.print("      Enter your choice here =>");
                    option = input.nextLine();
                    System.out.print("      Enter an Integer=>");
                    number = input.nextInt();
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
                    System.out.print("Do you want to try again[Y] to return to Using Decision Control Structures menu" +
                            " and [N] to return to the main Menu. =>");
                    tryChoice = input.nextLine();
                }
                if (tryChoice.equalsIgnoreCase("N")) {
                    menu = true;
                }
            }

            if (choice.equalsIgnoreCase("D")) {
                int[] numbers = new int[2];
                String[] names = new String[2];
                System.out.println("D. Using Single Array");
                System.out.print("Enter the Start number: ");
                numbers[0] = input.nextInt();
                System.out.print("Enter the Last number: ");
                numbers[1] = input.nextInt();
                input.nextLine();
                System.out.print("Enter First name: ");
                names[0] = input.nextLine();
                System.out.print("Enter Last name: ");
                names[1] = input.nextLine();
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
                System.out.print("Do you want to try again[Y] to return to Single Array menu " +
                        "and [N] to return to the main Menu. =>");
                String tryChoice = input.nextLine();
                while (tryChoice.equalsIgnoreCase("Y")) {
                    System.out.println("D. Using Single Array");
                    System.out.print("Enter the Start number: ");
                    numbers[0] = input.nextInt();
                    System.out.print("Enter the Last number: ");
                    numbers[1] = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter First name: ");
                    names[0] = input.nextLine();
                    System.out.print("Enter Last name: ");
                    names[1] = input.nextLine();
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
                    System.out.print("Do you want to try again[Y] to return to Single Array menu " +
                            "and [N] to return to the main Menu. =>");
                    tryChoice = input.nextLine();
                }
                if (tryChoice.equalsIgnoreCase("N")) {
                    menu = true;
                }
            }

            if (choice.equalsIgnoreCase("E")) {
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
                        System.out.print("Enter Name#"+(i+1)+":");
                        String name = input.nextLine();
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
                        System.out.print("Enter Name#"+(i+1)+":");
                        String name = input.nextLine();
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
                System.out.print("Do you want to try again[Y] to return to Using Stack and Queue Menu " +
                        "and [N] to return to the main Menu. =>");
                String tryChoice = input.nextLine();
                while (tryChoice.equalsIgnoreCase("Y")) {
                    System.out.println("Using Stack and Queue");
                    System.out.println("Stack");
                    System.out.println("Queue");
                    System.out.print("Enter your choice here=>");
                    methodChoice = input.nextLine();
                    if (methodChoice.equalsIgnoreCase("Stack")) {
                        Stack<String> stack = new Stack<>();
                        System.out.println("You choose Stack Method!");
                        System.out.println("Enter Five Names: ");
                        for (int i = 0; i < 5; i++) {
                            System.out.print("Enter Name#"+(i+1)+":");
                            String name = input.nextLine();
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
                            System.out.print("Enter Name#"+(i+1)+":");
                            String name = input.nextLine();
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
                    System.out.print("Do you want to try again[Y] to return to Using Stack and Queue Menu " +
                            "and [N] to return to the main Menu. =>");
                    tryChoice = input.nextLine();
                }
                if (tryChoice.equalsIgnoreCase("N")) {
                    menu = true;
                }
            }

            if (choice.equalsIgnoreCase("F")) {
                System.out.println("Exiting Program...");
                System.exit(0);
            }
        }
        while (menu);
    }
}
