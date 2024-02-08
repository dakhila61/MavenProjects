package threads;

public class SingletonPattern {

    // Private constructor to prevent instantiation from outside
    private SingletonPattern() {
    }

    // Static member holds only one instance of the SingletonPattern class
    private static SingletonPattern instance;

    // Static method that returns the singleton instance
    public static SingletonPattern getInstance() {
        // Lazy initialization: Create the instance if it doesn't exist
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

    // Other methods of the singleton class can be added here
}
