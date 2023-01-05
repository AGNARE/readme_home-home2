import java.util.Random;
public class Main {
    public static void main(String[] args) {
        school(20, 29);
        school(18, 25);
        school(54, -6);
        school(55, 41);
        school(20, -25);
        school(generateRandomAge(), -35);
    }
    public static String school(int age, int temperature) {
        generateRandomAge();
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно итди гулять!";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Оставайтесь дома";
        } else {
            return "Оставайтесь дома!";
        }

    }

        public static int generateRandomAge(){
            Random random1 = new Random();
            int age = random1.nextInt(0, 100);
            return age;
    }


}


