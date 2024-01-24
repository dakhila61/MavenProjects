package loops;

public class AgeClassifier {
    public static void main(String[] args) {
        int personAge = 16;
        classifyPerson(personAge);
    }

    static void classifyPerson(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}

