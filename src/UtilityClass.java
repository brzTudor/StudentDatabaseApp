import java.util.Random;

public class UtilityClass {
    public static String[] names = {"Mihai", "George", "Tudor", "Adrian", "Vasile", "Catalin", "Maria", "Ana", "Alexandra", "Angela", "Cristina", "Diana"};

    static String generateName(){
        Random rand = new Random();

        return names[rand.nextInt(11)];
    }

    static int generateAge(){
        Random rand = new Random();

        return rand.nextInt(26-20)+20;
    }

    static int generateYear(){
        Random rand = new Random();

        return rand.nextInt(5-1)+1;
    }

    static String generateId(){
        Random rand = new Random();

        return String.valueOf(rand.nextInt(9999-1000)+1000);
    }

}
