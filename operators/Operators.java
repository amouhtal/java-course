class Operators{
    public static void main(String[] args){

        // assignment operators
        int number1 = 12;
        int number2 = 6;

        // arithmetic operators
        System.out.println(number1 + number2); // addition
        System.out.println(number2 - number1); // subtraction
        System.out.println(number1 * number2); // multiplication
        System.out.println(number1 / number2); // division //NOTE - use double data type to get a result more precist
        System.out.println(number1 % number2); // remainder (modulo/modulus)

        {
            int number = 12;
            number += 5;
            System.out.println(number);
        }

        {
            int number = 12;
            number -= 5;
            System.out.println(number);
        }

        {
            int number = 12;
            number %= 5;
            System.out.println(number);
        }


        // logical operators
        {
            System.out.println(number1 == number2); // is equal to
            System.out.println(number1 != number2);// is not equal to
            System.out.println(number1 > number2);// is greater than
            System.out.println(number1 < number2);// is less  than
            System.out.println(number1 >= number2);// is equal to
            System.out.println(number1 <= number2);// is equal to
        }

        {
            int age = 18;
            age--;
            System.out.println(age >= 18 && age <= 40);
            age++;
            System.out.println(age >= 18 && age <= 40);

            System.out.println(age++);// 18 same behavior for --
            System.out.println(++age); // 20 same behavior for --


        }
    }
}