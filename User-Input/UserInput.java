import java.util.Scanner;

class UserInput{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("What is your name? ");
            String name = scanner.nextLine();
        }


        {            
            System.out.printf("Hello %s, What is your age ? ", name);
            int age = scanner.nextInt();
            System.out.printf("Your age is : %d\n" , age);
        }

        scanner.close();

    }
}