class TypeString{
    public static void main(String args[]){

        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objectString1 == objectString2);


        {
            String name = "Abderrahmane Mouhtal"; // %s
            String country = "Morocco"; 
            int age = 26; // %d
            String company = "freeCodeCamp";
            double gpa = 3.8; // %f
            char percentSign = '%'; // %c
            boolean amITellingTheTruth = false; // %b
            String formattedString = String.format(
                "My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f. I have attended 100%c of my university classes. These are all %b claims.",
                name,
                country,
                age,
                company,
                gpa,
                percentSign,
                amITellingTheTruth
            );

            String literalString3 = "abc";
            String literalString4 = "ABC";

            System.out.println(formattedString);
            System.out.println(formattedString.length());
            System.out.println(literalString2.isEmpty());
            System.out.println(literalString2.toUpperCase());
            System.out.println(literalString3.equalsIgnoreCase(literalString4));

            System.out.println(literalString3.replace("b", "2"));

            System.out.println(formattedString.contains("Mouhtal"));


        }

    }
}