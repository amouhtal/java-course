class DataTypes{
    public static void main(String[] args){
       
    // integer types
    byte aSingleByte = 100; //-128 to 127
    short aSmallNumber = 2000; // -32,768 to 32,767
    int anInteger = 2147483647; // -2147483648 to 2147483647
    long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807

    // decimal types 
    double aDouble = 1.79769313; // 4.9E-324 to 1.7976931348623157E308
    float aFloat = 3.4028F; //1.4E-45 tp 3.4028235E38

    //booleans 
    boolean isWeekend = false;
    boolean isWorkday = true;

    // characters 
    char copyrightSmbol = '\u00A9';

    System.out.println("This is the copyright symbol: " + copyrightSmbol);


    int number1 = 5;
    double number2 = number1; // implicit cast

    System.out.println(number2);

    double number3 = 5.8;
    int number4 = (int)number3; // need explicit cast

    System.out.println(number4);
    }
}