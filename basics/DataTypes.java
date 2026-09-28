public class DataTypes {
    public static void main(String args[]) {
    // Stores small whole numbers (-128 to 127)
        byte temperature = 25;
        System.out.println("Temperature = " + temperature);
    // Stores true or false values
        boolean isRaining = false;
        System.out.println("Is it raining? = " + isRaining);
    // Stores whole numbers from -32,768 to 32,767
        short year = 2026;
        System.out.println("Year = " + year);
    // Stores whole numbers    
        int population = 50000;
        System.out.println("Population = " + population);
    // Stores very large whole numbers    
        long distance = 9876543210L;
        System.out.println("Distance = " + distance);
    // Stores decimal numbers with single precision    
        float height = 5.6f;
        System.out.println("Height = " + height);
    // Stores decimal numbers with higher precision    
        double pi = 3.1415926535;
        System.out.println("Value of Pi = " + pi);
    // Stores a single character    
        char grade = 'A';
        System.out.println("Grade = " + grade);
    // Stores a sequence of characters (text)    
        String city = "Pune";
        System.out.println("City = " + city);
    }
}